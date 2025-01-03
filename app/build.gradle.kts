plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
//    id("kotlin-kapt")
//    id("kotlin-parcelize")
}

android {
    namespace = "com.oakil.weathercondition"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.oakil.weathercondition"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures{
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


//    // OkHttp
//    implementation("com.squareup.okhttp3:okhttp:4.10.0")
//    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")
//
//
//    // Lifecycle
//    val lifecycleVersion = "2.8.6"
//    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion")
//    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion")
//    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Gson
    implementation("com.google.code.gson:gson:2.10.1")

    // Other libraries
//    implementation("com.github.MatteoBattilana:WeatherView:3.0.0")
//    implementation("com.github.Dimezis:BlurView:version-2.0.5")
//    implementation("com.github.bumptech.glide:glide:4.16.0")

    implementation("com.airbnb.android:lottie:6.6.0")

}







