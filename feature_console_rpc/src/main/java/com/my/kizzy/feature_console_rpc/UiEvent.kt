/*
 *
 *  ******************************************************************
 *  *  * Copyright (C) 2022
 *  *  * UiEvent.kt is part of Kizzy
 *  *  *****************************************************************
 *
 *
 */

package com.my.kizzy.feature_console_rpc

sealed interface UiEvent {
    object TryAgain: UiEvent
    object CloseSearchBar: UiEvent
    object OpenSearchBar: UiEvent
    class Search(val query: String): UiEvent
}