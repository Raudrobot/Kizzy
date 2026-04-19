/*
 *
 *  ******************************************************************
 *  *  * Copyright (C) 2022
 *  *  * Contributor.kt is part of Kizzy
 *  *  *****************************************************************
 *
 *
 */

package com.my.kizzy.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Contributor(
    @SerialName("avatar")
    val avatar: String = "",
    @SerialName("name")
    val name: String = "",
    @SerialName("url")
    val url: String = ""
)