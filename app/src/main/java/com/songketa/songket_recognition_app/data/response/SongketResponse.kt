package com.songketa.songket_recognition_app.data.response

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
data class SongketResponse(

	@field:SerializedName("dataset")
	val dataset: List<DatasetItem>
) : Parcelable

@Parcelize
data class DatasetItem(

	@field:SerializedName("img_url")
	val imgUrl: String,

	@field:SerializedName("pattern")
	val pattern: String,

	@field:SerializedName("description")
	val description: String,

	@field:SerializedName("region")
	val region: String,

	@field:SerializedName("fabricname")
	val fabricname: String
) : Parcelable
