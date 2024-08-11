plugins {
    alias(libs.plugins.starter.android.library)
}

android {
    namespace = "com.example.starter.core.model"
}

dependencies {
    implementation(libs.junit.ktx)
    testImplementation(libs.testng)
}
