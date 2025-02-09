import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("stream.d.ts")) return null

    if (
        ts.isMethodDeclaration(node)
        && ts.isClassDeclaration(node.parent)
        && node.parent.name
        && (
            node.parent.name.text === "Readable"
            || node.parent.name.text === "Writable"
        )
        && ts.isIdentifier(node.name)
        && node.name.text === "destroy"
    ) {
        const name = karakum.escapeIdentifier(render(node.name))

        const typeParameters = node.typeParameters
            ?.map(typeParameter => render(typeParameter))
            ?.join(", ")

        const returnType = node.type && render(node.type)

        return karakum.convertParameterDeclarations(node, context, render, {
            strategy: "function",
            defaultValue: "", // remove default value to provide multiple inheritance in Duplex
            template: parameters => {
                return `open fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}`
            }
        })
    }
    return null
}
