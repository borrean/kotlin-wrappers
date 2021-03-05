package react.router.dom

import react.*
import kotlin.reflect.*

@Suppress("EnumEntryName")
enum class HashType {
    slash, noslash, hashbang
}

fun RBuilder.hashRouter(
    basename: String = "",
    hashType: HashType = HashType.slash,
    getUserConfirmation: GetUserConfirmation? = null,
    handler: RHandler<RProps>
) = child(HashRouterComponent::class) {
    attrs {
        this.basename = basename
        this.hashType = hashType.name
        this.getUserConfirmation = getUserConfirmation
    }

    handler.invoke(this)
}

fun RBuilder.browserRouter(
    basename: String = "",
    getUserConfirmation: GetUserConfirmation? = null,
    forceRefresh: Boolean = false,
    keyLength: Int = 6,
    handler: RHandler<RProps>
) = child(BrowserRouterComponent::class) {
    attrs {
        this.basename = basename
        this.getUserConfirmation = getUserConfirmation
        this.forceRefresh = forceRefresh
        this.keyLength = keyLength
    }

    handler.invoke(this)
}

fun RBuilder.switch(handler: RHandler<RProps>) = child(SwitchComponent::class, handler)

fun RBuilder.route(
    vararg path: String,
    component: KClass<out Component<RProps, *>>,
    exact: Boolean = false,
    strict: Boolean = false
): ReactElement {
    return child<RouteProps<RProps>, RouteComponent<RProps>> {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
            this.component = component.rClass
        }
    }
}

fun <T : RProps> RBuilder.route(
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    render: (props: RouteResultProps<T>) -> ReactElement?
): ReactElement {
    return child<RouteProps<T>, RouteComponent<T>> {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
            this.render = render
        }
    }
}

fun RBuilder.route(
    vararg path: String,
    exact: Boolean = false,
    strict: Boolean = false,
    render: () -> ReactElement?
): ReactElement {
    return child<RouteProps<RProps>, RouteComponent<RProps>> {
        attrs {
            this.path = path
            this.exact = exact
            this.strict = strict
            this.render = { render() }
        }
    }
}

fun RBuilder.routeLink(
    to: String,
    replace: Boolean = false,
    className: String? = null,
    handler: RHandler<RProps>?
) = child(LinkComponent::class) {
    attrs {
        this.to = to
        this.replace = replace
        this.className = className
    }
    handler?.invoke(this)
}

fun <T : RProps> RBuilder.navLink(
    to: String,
    replace: Boolean = false,
    className: String? = null,
    activeClassName: String = "active",
    exact: Boolean = false,
    strict: Boolean = false,
    isActive: ((match: RouteResultMatch<T>?, location: RouteResultLocation) -> Boolean)? = null,
    handler: RHandler<NavLinkProps<T>>?
) = child<NavLinkProps<T>, NavLinkComponent<T>> {
    attrs {
        this.to = to
        this.replace = replace
        this.className = className
        this.activeClassName = activeClassName
        this.exact = exact
        this.strict = strict
        this.isActive = isActive
    }
    handler?.invoke(this)
}

fun RBuilder.redirect(
    from: String? = null,
    to: String,
    push: Boolean = false,
    exact: Boolean = false,
    strict: Boolean = false
) = child(RedirectComponent::class) {
    attrs {
        this.from = from
        this.to = to
        this.push = push
        this.exact = exact
        this.strict = strict
    }
}
