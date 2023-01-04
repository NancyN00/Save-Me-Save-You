package com.example.authenticationapplication

data class ViewDocs(val title : String ,
                    val logo : Int,
                    val desc : String,
                    var isExpandable: Boolean = false)
