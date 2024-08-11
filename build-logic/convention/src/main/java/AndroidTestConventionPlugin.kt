import com.example.starter.build_logic.convention.androidTestImplementation
import com.example.starter.build_logic.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidTestConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
//            with(pluginManager) {
//                apply("com.android.test")
//            }

            dependencies {
                androidTestImplementation(libs.findLibrary("androidx.test.espresso").get())
                androidTestImplementation(libs.findLibrary("androidx.test.ext").get())
            }
        }
    }
}