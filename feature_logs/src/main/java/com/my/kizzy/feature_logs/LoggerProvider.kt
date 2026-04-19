/*
 *
 *  ******************************************************************
 *  *  * Copyright (C) 2022
 *  *  * LogProvider.kt is part of Kizzy
 *  *  *****************************************************************
 *
 *
 */

package com.my.kizzy.feature_logs

object LoggerProvider {
    var logger = KLogger.getInstance()!!
    fun init() {
        KLogger.init()
    }
}