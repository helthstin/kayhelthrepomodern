import io.github.keiyoushi.gradle.api.ContentWarning

plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "Temple Scan"
    pkgName = "es.templescanesp"
    versionCode = 78
    contentWarning = ContentWarning.NSFW
    libVersion = "1.6"
    theme = "catharsis"

    source {
        lang = "es"
        versionId = 4
        baseUrl = "https://aedexnox.com"
    }

    deeplink {
        path("/comic/..*")
    }
}
