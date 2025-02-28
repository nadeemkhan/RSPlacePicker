package com.vipani.lopicker

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LocationModel(
    val address: String,
    val latitude: Double,
    val longitude: Double,
    val mapImage: String
) : Parcelable