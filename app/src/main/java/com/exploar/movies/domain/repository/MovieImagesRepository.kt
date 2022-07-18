package com.exploar.movies.domain.repository

import com.exploar.movies.core.wrapper.ResultWrapper
import com.exploar.movies.domain.model.MovieImages
import kotlinx.coroutines.flow.Flow


interface MovieImagesRepository {
    fun getMovieImages(id: Int): Flow<ResultWrapper<MovieImages>>
}