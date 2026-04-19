/*
 *
 *  ******************************************************************
 *  *  * Copyright (C) 2022
 *  *  * Badge.kt is part of Kizzy
 *  *  *****************************************************************
 *
 *
 */

package com.my.kizzy.domain.model.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Badge(
    @SerialName("icon")
    val icon: String,
    @SerialName("name")
    val name: String
)