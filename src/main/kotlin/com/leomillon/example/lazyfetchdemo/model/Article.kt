package com.leomillon.example.lazyfetchdemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Article(

    @Id
    @GeneratedValue
    var id: String? = null,

    val content: String
)
