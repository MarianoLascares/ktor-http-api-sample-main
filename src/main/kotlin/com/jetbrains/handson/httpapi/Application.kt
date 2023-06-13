package com.jetbrains.handson.httpapi

import com.jetbrains.handson.httpapi.route.registerCustomerRoutes
import com.jetbrains.handson.httpapi.route.registerOrderRoutes
import io.ktor.server.application.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.plugins.contentnegotiation.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module(testing: Boolean = false) {
    install(ContentNegotiation) {
        json()
    }
    registerCustomerRoutes()
    registerOrderRoutes()
}