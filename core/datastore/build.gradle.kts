plugins {
    alias(libs.plugins.starter.android.library)
    alias(libs.plugins.starter.android.hilt)
    alias(libs.plugins.starter.android.room)
}

android {
    namespace = "com.example.starter.core.datastore"
}

dependencies {
    implementation(libs.junit.ktx)
    testImplementation(libs.testng)
}
