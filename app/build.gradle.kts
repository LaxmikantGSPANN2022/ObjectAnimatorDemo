plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(ConfigData.compileSdk)

    defaultConfig {
        applicationId = ("com.example.objectanimatordemo")
        minSdk = (ConfigData.minimumSdk)
        targetSdk = (ConfigData.targetSdk)
        versionCode = (ConfigData.versionCode)
        versionName = (ConfigData.versionName)

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            signingConfig = signingConfigs.create("release")
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {
            isMinifyEnabled = false
        }
    }

    flavorDimensions(ProductFlavors.VERSION1.getValue(), ProductFlavors.VERSION2.getValue())
    productFlavors {
        create("china") {
            versionNameSuffix = ".china"
            dimension = ProductFlavors.VERSION2.getValue()
        }

        create("world") {
            versionNameSuffix = ".world"
            dimension = ProductFlavors.VERSION2.getValue()
        }

        create("MySNKRS") {
            applicationId = "com.example.objectanimatordemo"
            versionName = Versions.appVersion
            dimension = ProductFlavors.VERSION1.getValue()
            buildConfigField("boolean", "SNKRS", "true")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
    signingConfigs {
        getByName("release") {
            storeFile =
                file("../releaseKeyStore")
            storePassword = "qwerty"
            keyAlias = "aliasnew"
            keyPassword = "qwerty"
        }
    }
    sourceSets {
        getByName("main") {
            java.srcDirs("src/main/kotlin")
            jniLibs.srcDirs("src/main/jniLibs")
        }

        getByName("debug").java.srcDirs("src/debug/kotlin")
        getByName("release").java.srcDirs("src/release/kotlin")
    }
}

dependencies {
    implementation(Deps.ktx)
    implementation(Deps.appCompat)
    implementation(Deps.material)
    implementation(Deps.constraintLayout)
    "worldImplementation"(Deps.retrofit)

    testImplementation(Deps.junit)
    androidTestImplementation(Deps.extJunit)
    androidTestImplementation(Deps.espressocore)
}