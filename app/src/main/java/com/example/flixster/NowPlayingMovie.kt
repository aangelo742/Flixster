package com.example.flixster

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class NowPlayingMovie {
    @JvmField
    @SerializedName("title")
    var title: String? = null

    //TODO bookImageUrl
    @SerializedName("poster_path")
    var posterPathUrl: String? = null

    //TODO description
    @SerializedName("overview")
    var overview: String? = null
}