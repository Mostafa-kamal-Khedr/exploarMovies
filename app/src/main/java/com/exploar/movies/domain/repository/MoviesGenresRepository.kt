package com.exploar.movies.domain.repository

import com.exploar.movies.core.wrapper.ResultWrapper
import com.exploar.movies.domain.model.MovieGenre
import kotlinx.coroutines.flow.Flow

interface MoviesGenresRepository {
    fun getMovieGenres(): Flow<ResultWrapper<List<MovieGenre>>>
}