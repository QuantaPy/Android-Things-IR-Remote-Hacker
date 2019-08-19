/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Update this file with
 *   `$ ./gradlew buildSrcVersions` */
object Libs {
    /**
     * https://developer.android.com/topic/libraries/architecture/index.html */
    const val lifecycle_extensions: String = "androidx.lifecycle:lifecycle-extensions:" +
            Versions.androidx_lifecycle

    /**
     * http://developer.android.com/tools/extras/support-library.html */
    const val lifecycle_viewmodel_ktx: String = "androidx.lifecycle:lifecycle-viewmodel-ktx:" +
            Versions.androidx_lifecycle

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html */
    const val room_compiler: String = "androidx.room:room-compiler:" + Versions.androidx_room

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html */
    const val room_runtime: String = "androidx.room:room-runtime:" + Versions.androidx_room

    /**
     * https://developer.android.com/studio */
    const val com_android_tools_build_gradle: String = "com.android.tools.build:gradle:" +
            Versions.com_android_tools_build_gradle

    /**
     * https://developer.android.com/studio */
    const val lint_gradle: String = "com.android.tools.lint:lint-gradle:" + Versions.lint_gradle

    /**
     * https://github.com/felHR85/UsbSerial */
    const val usbserial: String = "com.github.felHR85:UsbSerial:" + Versions.usbserial

    const val play_services_nearby: String = "com.google.android.gms:play-services-nearby:" +
            Versions.play_services_nearby

    const val androidthings: String = "com.google.android.things:androidthings:" +
            Versions.androidthings

    /**
     * https://github.com/google/gson */
    const val gson: String = "com.google.code.gson:gson:" + Versions.gson

    /**
     * https://github.com/google/dagger */
    const val dagger_android_processor: String = "com.google.dagger:dagger-android-processor:" +
            Versions.com_google_dagger

    /**
     * https://github.com/google/dagger */
    const val dagger_android_support: String = "com.google.dagger:dagger-android-support:" +
            Versions.com_google_dagger

    /**
     * https://github.com/google/dagger */
    const val dagger_compiler: String = "com.google.dagger:dagger-compiler:" +
            Versions.com_google_dagger

    const val de_fayard_buildsrcversions_gradle_plugin: String =
        "de.fayard.buildSrcVersions:de.fayard.buildSrcVersions.gradle.plugin:" +
                Versions.de_fayard_buildsrcversions_gradle_plugin

    /**
     * https://kotlinlang.org/ */
    const val kotlin_android_extensions_runtime: String =
        "org.jetbrains.kotlin:kotlin-android-extensions-runtime:" +
                Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/ */
    const val kotlin_android_extensions: String =
        "org.jetbrains.kotlin:kotlin-android-extensions:" + Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/ */
    const val kotlin_annotation_processing_gradle: String =
        "org.jetbrains.kotlin:kotlin-annotation-processing-gradle:" +
                Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/ */
    const val kotlin_gradle_plugin: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/ */
    const val kotlin_stdlib_jdk7: String = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://github.com/Kotlin/kotlinx.coroutines */
    const val kotlinx_coroutines_android: String =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:" + Versions.org_jetbrains_kotlinx

    /**
     * https://github.com/Kotlin/kotlinx.coroutines */
    const val kotlinx_coroutines_core: String = "org.jetbrains.kotlinx:kotlinx-coroutines-core:" +
            Versions.org_jetbrains_kotlinx
}
