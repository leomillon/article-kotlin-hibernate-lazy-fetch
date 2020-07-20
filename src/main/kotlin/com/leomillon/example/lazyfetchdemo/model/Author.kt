package com.leomillon.example.lazyfetchdemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Author(

    @Id
    @GeneratedValue
    var id: String? = null,

    val name: String
)
