/*
 *
 *  ******************************************************************
 *  *  * Copyright (C) 2022
 *  *  * LoginUiState.kt is part of Kizzy
 *  *  *****************************************************************
 *
 *
 */

package com.my.kizzy.feature_profile.ui.login

sealed interface LoginUiState {
    object InitialState: LoginUiState
    object OnLoginClicked: LoginUiState
    object OnLoginCompleted: LoginUiState
}