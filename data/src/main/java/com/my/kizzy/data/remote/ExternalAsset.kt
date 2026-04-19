/*
 *
 *  ******************************************************************
 *  *  * Copyright (C) 2022
 *  *  * ExternalAsset.kt is part of Kizzy
 *  *  *****************************************************************
 *
 *
 */

package com.my.kizzy.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ExternalAsset(
    @SerialName("external_asset_path")
    val externalAssetPath: String,
    @SerialName("url")
    val url: String
)