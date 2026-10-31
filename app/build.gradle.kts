
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.taha.liquidos26"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.taha.liquidos26"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")

    // Liquid Glass Engine
    implementation("com.github.QWEA0:liquidglass:v2.0.11")
}
