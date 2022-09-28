plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-browser"))
    api(project(":kotlin-react-core"))

    api(npmv("react-virtual"))
}
