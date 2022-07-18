package com.exploar.movies.domain.usecase

import com.exploar.movies.core.wrapper.ResultWrapper
import com.exploar.movies.domain.model.MovieImages
import com.exploar.movies.domain.repository.MovieImagesRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMovieImagesUseCase @Inject constructor(private val repo: MovieImagesRepository) {
    fun execute(movieId: Int): Flow<ResultWrapper<MovieImages>> {
        return repo.getMovieImages(movieId)
    }
}