class BootStrap {

    def messageSource

    def init = { servletContext ->
        println "messageSource: " + messageSource.dump() // for DEBUG
    }

    def destroy = {
    }
}
