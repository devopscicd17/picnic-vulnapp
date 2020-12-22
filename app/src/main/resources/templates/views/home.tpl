yieldUnescaped '<!DOCTYPE html>'
html {
    head {
        title('Spring Boot App - Home')
    }
    body {
        h1 {
            yield 'Hello and Welcome to the Spring Boot App!'
        }
        p ("Take a look around! We have a ${$a(href:'/books/', "catalogue")} of our favourite books which you can browse. If you like it, leave a comment in the ${ $a(href: '/comments/', "comment section")}!")

    }
}