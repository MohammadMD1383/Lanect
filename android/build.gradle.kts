plugins {
	id("org.jetbrains.compose")
	id("com.android.application")
	kotlin("android")
}

group = "ir.mmd.apps"
version = "1.0-SNAPSHOT"

repositories {
	google()
	mavenCentral()
}

dependencies {
	implementation(project(":common"))
	implementation("androidx.activity:activity-compose:1.6.1")
}

android {
	compileSdk = 33
	defaultConfig {
		applicationId = "ir.mmd.apps.android"
		minSdk = 23
		targetSdk = 33
		versionCode = 1
		versionName = "1.0-SNAPSHOT"
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_11
		targetCompatibility = JavaVersion.VERSION_11
	}
	buildTypes {
		getByName("release") {
			isMinifyEnabled = false
		}
	}
}
