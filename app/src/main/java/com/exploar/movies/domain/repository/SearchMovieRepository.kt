package com.exploar.movies.domain.repository

import com.exploar.movies.core.wrapper.ResultWrapper
import com.exploar.movies.domain.model.MovieData
import kotlinx.coroutines.flow.Flow

interface SearchMovieRepository {
    fun searchMovie(searchQuery: String): Flow<ResultWrapper<List<MovieData>>>
}