package com.example.imobilestylemain.domain.administrateurs.entity
import jakarta.persistence.*


@Entity
class Admin {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0;
    val firstname:String = "";
    val lastname:String = "";



}