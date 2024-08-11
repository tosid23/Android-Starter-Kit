plugins {
    alias(libs.plugins.starter.android.feature)
    alias(libs.plugins.starter.android.library.compose)
}

android {
    namespace = "com.example.starter.feature.home"

}

dependencies {
    implementation(libs.junit.ktx)
    testImplementation(libs.testng)
}