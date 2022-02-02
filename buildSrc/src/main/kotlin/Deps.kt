object BuildPlugins {
    val android by lazy {
        "com.android.tools.build:gradle:${Versions.gradleVersion}"
    }
    val kotlin by lazy {
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.gradlePluginVersion}"
    }
}

object Deps {
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val ktx by lazy { "androidx.core:core-ktx:${Versions.kotlinVersion}" }
    val material by lazy { "com.google.android.material:material:${Versions.materialVersion}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}" }
    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}" }
    val junit by lazy { "junit:junit:${Versions.jUnit}" }
    val extJunit by lazy { "androidx.test.ext:junit:${Versions.extJUnit}" }
    val espressocore by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }
}

