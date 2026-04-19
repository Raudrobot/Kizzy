/*
 *
 *  ******************************************************************
 *  *  * Copyright (C) 2022
 *  *  * HeartBeat.kt is part of Kizzy
 *  *  *****************************************************************
 *
 *
 */

package kizzy.gateway.entities

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Heartbeat(
    @SerialName("heartbeat_interval")
    val heartbeatInterval: Long,
)