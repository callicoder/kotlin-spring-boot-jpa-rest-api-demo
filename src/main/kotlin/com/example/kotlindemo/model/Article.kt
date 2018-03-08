package com.example.kotlindemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

/**
 * Created by rajeevkumarsingh on 05/10/17.
 */
@Entity
data class Article (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @get: NotBlank
    val title: String = "",

    @get: NotBlank
    val content: String = ""
)