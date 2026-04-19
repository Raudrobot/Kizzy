/*
 *
 *  ******************************************************************
 *  *  * Copyright (C) 2022
 *  *  * UploadGalleryImageUseCase.kt is part of Kizzy
 *  *  *****************************************************************
 *
 *
 */

package com.my.kizzy.domain.use_case.upload_galleryImage

import com.my.kizzy.domain.repository.KizzyRepository
import java.io.File
import javax.inject.Inject

class UploadGalleryImageUseCase @Inject constructor(
    private val kizzyRepository: KizzyRepository
) {
    suspend operator fun invoke(file: File): String? {
        return try {
            file.deleteOnExit()
            kizzyRepository.uploadImage(file)
        } catch (ex: Exception) {
            null
        }
    }
}