package com.example.studentapp.model.user

import com.google.gson.annotations.SerializedName

class Student: User {

    @SerializedName("course_number")
    var course: Long = 1
    lateinit var group: Group

    constructor()

    constructor(email: String, username: String): super(email, username)
}