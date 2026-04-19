/*
 *
 *  ******************************************************************
 *  *  * Copyright (C) 2022
 *  *  * AppsState.kt is part of Kizzy
 *  *  *****************************************************************
 *
 *
 */

package com.my.kizzy.feature_apps_rpc

import androidx.compose.runtime.Immutable
import com.my.kizzy.data.utils.AppsInfo

@Immutable
data class AppsState(
    val apps: List<AppsInfo> = emptyList(),
    val enabledApps: Map<String, Boolean> = emptyMap(),
    val isLoading: Boolean = true,
)
