plugins {
  `kotlin-dsl`
}

allprojects {
  repositories {
    google()
    jcenter()
  }
}

dependencies {
  implementation("com.android.tools.build:gradle:4.0.0")
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")

}
