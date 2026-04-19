/*
 *
 *  ******************************************************************
 *  *  * Copyright (C) 2022
 *  *  * Qualifier.kt is part of Kizzy
 *  *  *****************************************************************
 *
 *
 */

package com.my.kizzy.data.remote

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Base

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Discord

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Github

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Imgur
