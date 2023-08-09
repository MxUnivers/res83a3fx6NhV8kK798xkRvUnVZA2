package com.example.imobilestylemain.application.controller.administrateur

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RequestMapping("/administrateurs")
@Controller
class AdministrateurController {

    @GetMapping("/")
    fun LinkUsers(): String? {
        return "administrateurs/admin-list" // Ceci correspond au nom du fichier HTML sans l'extension
    }

    @GetMapping("/add-adinistrateur")
    fun LinkAdd(): String? {
        return "administrateurs/admin-add" // Ceci correspond au nom du fichier HTML sans l'extension
    }

    @GetMapping("/edit-adinistrateur/{id}")
    fun LinkEdit(@PathVariable("id") id:String ): String? {
        var idGet = id;
        System.out.println(id);
        return "administrateurs/admin-edit" // Ceci correspond au nom du fichier HTML sans l'extension
    }




}