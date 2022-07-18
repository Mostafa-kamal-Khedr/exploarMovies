package com.exploar.movies.domain.usecase

import com.exploar.movies.core.wrapper.ResultWrapper
import com.exploar.movies.domain.model.MovieData
import com.exploar.movies.domain.repository.SearchMovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchMoviesUseCase @Inject constructor(private val repo: SearchMovieRepository) {
    fun execute(searchQuery: String): Flow<ResultWrapper<List<MovieData>>> {
        return repo.searchMovie(searchQuery)
    }
}