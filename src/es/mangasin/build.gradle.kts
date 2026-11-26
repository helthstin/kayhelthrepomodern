import io.github.keiyoushi.gradle.api.ContentWarning

plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "M440"
    versionCode = 3
    contentWarning = ContentWarning.MIXED
    libVersion = "1.6"
    theme = "mmrcms"

    source {
        lang = "es"
        id = 1954354064815247113L
        baseUrl = "https://m440.in"
    }
}

dependencies {
    implementation(project(":lib:synchrony"))
}
