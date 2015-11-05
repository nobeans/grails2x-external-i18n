import org.springframework.context.support.ReloadableResourceBundleMessageSource
import grails.util.Environment

beans = {
    // 自前でi18nファイル用のMessageSourceビーンを上書き定義する場合
    //messageSource(ReloadableResourceBundleMessageSource) {
    //    fallbackToSystemLocale = false
    //    defaultEncoding = "UTF-8"
    //    basenames = grailsApplication.config.i18n.messages
    //
    //    // 開発環境のみ一定間隔ごとに読みなおす(自動リロード)
    //    // WARデプロイ時など開発環境以外ではメッセージの反映に再起動が必要。
    //    if (Environment.developmentMode) {
    //        cacheSeconds = 5 // sec
    //    }
    //}
}
