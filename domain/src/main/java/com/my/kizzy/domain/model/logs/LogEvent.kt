/*
 *
 *  ******************************************************************
 *  *  * Copyright (C) 2022
 *  *  * LogEvent.kt is part of Kizzy
 *  *  *****************************************************************
 *
 *
 */

package com.my.kizzy.domain.model.logs

data class LogEvent(
    var level: LogLevel,
    var tag: String,
    var text: String,
    val createdAt: Long
)