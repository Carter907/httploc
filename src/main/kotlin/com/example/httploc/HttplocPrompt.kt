package com.example.httploc

import org.jline.utils.AttributedString
import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.shell.jline.PromptProvider
import org.springframework.stereotype.Component

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
class HttplocPrompt : PromptProvider {
    override fun getPrompt(): AttributedString {
        return AttributedString("httploc~ ")
    }
}