package com.example.httploc

import org.springframework.shell.command.annotation.Command
import org.springframework.shell.command.annotation.Option
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

@Command
class RestRequestCommands {

    @Command(command = ["httploc"])
    fun get(
        @Option(shortNames = ['g'])
        get: String): String {

        val request = HttpRequest.newBuilder()
            .GET()
            .uri(URI("http://localhost:8080"))
            .build();

        var client = HttpClient.newHttpClient();

        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
            .join().toString()
    }
}