package com.example.httploc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.shell.command.annotation.EnableCommand

@SpringBootApplication
@EnableCommand(RestRequestCommands::class)
class HttplocApplication

fun main(args: Array<String>) {
	runApplication<HttplocApplication>(*args)
}
