yieldUnescaped '<!DOCTYPE html>'
html {
    head {
        title('Spring Boot App')
        link(rel: 'stylesheet', href: '/css/bootstrap.min.css')
    }
    body {
        form(action: "/comments/", method: "POST") {
            input(name: "input") {

            }
        }

        comments.each { comment ->
            div {
                h3(style: "border-bottom: 1px solid black;") {
                    yield "Comment by Anonymous"
                }
                div(style: "border-bottom: 1px solid black;") {
                    yieldUnescaped comment
                }
            }
        }
    }
}