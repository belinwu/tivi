// Copyright 2024, Christopher Banes and the Tivi project contributors
// SPDX-License-Identifier: Apache-2.0


plugins {
  id("app.tivi.kotlin.multiplatform")
}

kotlin {
  sourceSets {
    commonMain {
      dependencies {
        api(projects.data.models)
        implementation(projects.data.db)
        implementation(projects.data.legacy) // remove this eventually

        implementation(projects.api.trakt)

        api(libs.store)
        implementation(libs.kotlinx.atomicfu)

        implementation(libs.kotlininject.runtime)
      }
    }
  }
}
