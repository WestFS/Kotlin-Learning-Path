package main.javacore.androiddev.introduction.challenger.intermediary.challenger2.model

import main.javacore.androiddev.introduction.challenger.intermediary.challenger2.enums.Environment
import main.javacore.androiddev.introduction.challenger.intermediary.challenger2.enums.TypeSecurity

data class MarineDetails(
    val security: TypeSecurity,
    val environment: Environment
) {
    lateinit var description: String

    override fun toString(): String {
        return "Security: $security, Environment: $environment, Description: $description"
    }
}
