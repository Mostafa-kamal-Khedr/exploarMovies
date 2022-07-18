package com.exploar.movies.data.repository

import com.exploar.movies.core.util.API_KEY
import com.exploar.movies.core.wrapper.ResultWrapper
import com.exploar.movies.data.mapper.DataModelMapper
import com.exploar.movies.data.remote.MoviesApi
import com.exploar.movies.domain.model.MovieData
import com.exploar.movies.domain.repository.TopRatedMovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class TopRatedMovieRepositoryImp @Inject constructor(
    private val api: MoviesApi,
    private val dataModelMapper: DataModelMapper
) : TopRatedMovieRepository {

    override fun getTopRatedMovies(): Flow<ResultWrapper<List<MovieData>>> {
        return flow {
            try {
                val response = api.getTopRatedMoves(API_KEY, 1)
                if (response.isSuccessful) {
                    response.body()?.let {
                        emit(ResultWrapper.Success(dataModelMapper.movieDataResponseToViewState(it)))
                    } ?: emit(ResultWrapper.Error("Something Happen Please Try Again!!"))
                } else {
                    emit(ResultWrapper.Error(response.errorBody().toString()))
                }
            } catch (e: Exception) {
                emit(ResultWrapper.Error(e.message.toString()))
            }
        }
    }

}