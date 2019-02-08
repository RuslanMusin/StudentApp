package com.example.studentapp.model.user

import com.example.studentapp.model.common.Identified
import com.google.gson.annotations.SerializedName

abstract class User: Identified {

    override lateinit var id: String
    @SerializedName("username")
    lateinit var email: String
    lateinit var password: String
    lateinit var name: String
    @SerializedName("last_name")
    lateinit var lastname: String
    lateinit var patronymic: String
    var description: String = "standart description"
    @SerializedName("skills_id")
    var skillsIds: MutableList<String> = ArrayList()

    /* @Transient
     var skills: MutableList<Skill> = ArrayList()
     @Transient
     var suggestions: MutableList<Suggestion> = ArrayList()
     @Transient
     var themes: MutableList<Theme> = ArrayList()
     @Transient
     var works: MutableList<Work> = ArrayList()
 */

    constructor() {}

    constructor(email: String, password: String) {
        this.email = email
        this.password = password
    }

    fun getFullName(): String {
        return "$lastname $name $patronymic"
    }

    /*fun setSkillsIds() {
        for(skill in skills) {
            skillsIds.add(skill.id)
        }
    }*/
}