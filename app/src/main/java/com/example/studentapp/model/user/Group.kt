package com.example.studentapp.model.user

import com.example.studentapp.model.common.Identified
import com.google.gson.annotations.SerializedName

class Group: Identified {

    override lateinit var id: String
    var name: String = "11-603"

    constructor() {}

}