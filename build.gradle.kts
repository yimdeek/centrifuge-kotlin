plugins {
    id("root.publication")
    //trick: for the same plugin versions in all sub-modules
    id("com.android.library").version(libs.versions.agp.get()).apply(false)
    kotlin("multiplatform").version(libs.versions.kotlin).apply(false)
}
