plugins {
    alias(libs.plugins.android.application)
}

android {
    // Usamos el namespace que definiste
    namespace = "xyz.zt.motog24overlay"
    compileSdk = 34 // Android 14 es la versión 34. Evita usar la 36 (preview) para overlays de sistema.

    defaultConfig {
        applicationId = "xyz.zt.motog24overlay"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "0.0.1"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            // Eliminamos Proguard ya que no hay código que optimizar
        }
    }

    // Esto es vital para decirle a Android Studio que no incluya archivos Java
    bundle {
        language { enableSplit = false }
        density { enableSplit = false }
        abi { enableSplit = false }
    }
}

dependencies {
    // VACÍO: Un overlay no debe llevar librerías como appcompat o material.
    // Al borrar esto, el APK será de "Solo Recursos".
}