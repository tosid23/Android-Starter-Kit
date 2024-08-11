plugins {
    alias(libs.plugins.starter.android.library)
    alias(libs.plugins.starter.android.hilt)
}

android {
    namespace = "com.example.starter.core.datastore"
}

dependencies {
    implementation(libs.junit.ktx)
    testImplementation(libs.testng)
}
