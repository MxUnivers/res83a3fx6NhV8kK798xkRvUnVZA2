package com.example.imobilestylemain.application.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class DashboardController{

    @GetMapping("/")
    fun index(): String? {
        return "dash" // Ceci correspond au nom du fichier HTML sans l'extension
    }

}