class BootStrap {

    def messageSource
    def grailsApplication

    def init = { servletContext ->
        //println messageSource.dump()
        // デフォルトの18nファイル用のMessageSourceビーンの設定を変更する
        //messageSource.basenames = grailsApplication.config.i18n.messages
        //messageSource.defaultEncoding = "UTF-8"

        println messageSource.dump() // for DEBUG
    }

    def destroy = {
    }
}
