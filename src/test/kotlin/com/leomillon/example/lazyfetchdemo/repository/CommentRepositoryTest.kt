package com.leomillon.example.lazyfetchdemo.repository

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.data.repository.findByIdOrNull

@DataJpaTest
class CommentRepositoryTest {

    @Autowired
    private lateinit var commentRepository: CommentRepository

    @Test
    fun `should get comment author`() {

        // Given
        val commentId = "f9ae67e7-6064-4034-8fc6-462c127498df"

        """
        #############
        # Get comment
        #############
        """.trimIndent()
            .also(::println)
        val comment = commentRepository.findByIdOrNull(commentId)!!

        """
        #############
        # Get comment author's ID
        #############
        """.trimIndent()
            .also(::println)
        println("=> author.id is = ${comment.author.id}")

        """
        #############
        # Get comment author's name
        #############
        """.trimIndent()
            .also(::println)
        println("=> author.name is = ${comment.author.name}")
    }
}
