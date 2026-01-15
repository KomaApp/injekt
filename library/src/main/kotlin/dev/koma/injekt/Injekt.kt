package dev.koma.injekt

import uy.kohesive.injekt.Injekt
import uy.kohesive.injekt.api.InjektScope

/**
 * Initializes the Injekt dependency injection system with thread-safe implementation.
 *
 * This function should be called once at application startup, before any dependency
 * registration or resolution occurs. It replaces the default Injekt scope with a
 * thread-safe implementation that uses concurrent data structures.
 */
@Suppress("UNUSED")
fun patchInjekt() {
    Injekt = InjektScope(PatchedDefaultRegister())
}
