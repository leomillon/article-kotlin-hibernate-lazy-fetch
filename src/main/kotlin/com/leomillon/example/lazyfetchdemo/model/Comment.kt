package com.leomillon.example.lazyfetchdemo.model

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Comment(

    @Id
    @GeneratedValue
    var id: String? = null,

    val content: String,

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    val article: Article,

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    val author: Author
)
