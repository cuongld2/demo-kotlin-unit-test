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
  // https://mvnrepository.com/artifact/org.mockito.kotlin/mockito-kotlin
  testImplementation ("org.mockito.kotlin:mockito-kotlin:4.0.0")
  // required if you want to use Mockito for unit tests
  // https://mvnrepository.com/artifact/org.mockito/mockito-android
  testImplementation ("org.mockito:mockito-android:4.3.1")
  implementation ("junit:junit:4.12")
  implementation ("org.mockito:mockito-core:4.3.1")

}
