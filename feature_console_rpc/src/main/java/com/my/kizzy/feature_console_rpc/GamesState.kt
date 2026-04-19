/*
 *
 *  ******************************************************************
 *  *  * Copyright (C) 2022
 *  *  * GamesState.kt is part of Kizzy
 *  *  *****************************************************************
 *
 *
 */

package com.my.kizzy.feature_console_rpc

import com.my.kizzy.domain.model.Game

sealed interface GamesState {
    object Loading: GamesState
    class Success(val games: List<Game>): GamesState
    class Error(val error: String): GamesState
}