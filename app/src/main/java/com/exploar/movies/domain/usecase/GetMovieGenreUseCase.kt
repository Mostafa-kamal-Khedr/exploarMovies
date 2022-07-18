package com.exploar.movies.domain.usecase

import com.exploar.movies.core.wrapper.ResultWrapper
import com.exploar.movies.domain.model.MovieGenre
import com.exploar.movies.domain.repository.MoviesGenresRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMovieGenreUseCase @Inject constructor(private val repo: MoviesGenresRepository) {
    fun execute(): Flow<ResultWrapper<List<MovieGenre>>> {
        return repo.getMovieGenres()
    }
}