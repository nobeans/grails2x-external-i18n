import org.springframework.context.support.ReloadableResourceBundleMessageSource
import grails.util.Environment

beans = {
    // 追加のi18nファイルを指定するためのMessageSourceビーン。
    messageSource(ReloadableResourceBundleMessageSource) {
        fallbackToSystemLocale = false
        fileEncodings = "UTF-8"
        defaultEncoding = "UTF-8"
        basenames = grailsApplication.config.additional.messages

        // 開発環境のみ一定間隔ごとに読みなおす(自動リロード)
        // WARデプロイ時など開発環境以外ではメッセージの反映に再起動が必要。
        if (Environment.developmentMode) {
            cacheSeconds = 5 // sec
        }
    }
}
