package com.leomillon.example.lazyfetchdemo.repository

import com.leomillon.example.lazyfetchdemo.model.Comment
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CommentRepository : CrudRepository<Comment, String>
