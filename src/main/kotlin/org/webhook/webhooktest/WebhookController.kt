package org.webhook.webhooktest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class WebhookController {



    @PostMapping("/webhook")
    fun getWebhook(@RequestBody webhookRequest: WebhookRequest) {

        println(webhookRequest)

    }



}