package com.exploar.movies.data.model

data class MovieImagesResponse(
    val backdrops: List<Backdrop>,
    val id: Int,
    val posters: List<Poster>
)