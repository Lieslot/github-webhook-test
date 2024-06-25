package org.webhook.webhooktest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebhookTestApplication

fun main(args: Array<String>) {
    runApplication<WebhookTestApplication>(*args)
}
