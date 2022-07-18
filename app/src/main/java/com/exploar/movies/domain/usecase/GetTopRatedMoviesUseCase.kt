package com.exploar.movies.domain.usecase

import com.exploar.movies.core.wrapper.ResultWrapper
import com.exploar.movies.domain.model.MovieData
import com.exploar.movies.domain.repository.TopRatedMovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTopRatedMoviesUseCase @Inject constructor(private val repo: TopRatedMovieRepository) {
    fun execute(): Flow<ResultWrapper<List<MovieData>>> {
        return repo.getTopRatedMovies()
    }
}