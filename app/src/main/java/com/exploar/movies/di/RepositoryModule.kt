package com.exploar.movies.di

import com.exploar.movies.data.mapper.DataModelMapper
import com.exploar.movies.data.remote.MoviesApi
import com.exploar.movies.data.repository.MovieImagesRepositoryImp
import com.exploar.movies.data.repository.MoviesGenresRepositoryImp
import com.exploar.movies.data.repository.SearchMovieRepositoryImp
import com.exploar.movies.data.repository.TopRatedMovieRepositoryImp
import com.exploar.movies.domain.repository.MovieImagesRepository
import com.exploar.movies.domain.repository.MoviesGenresRepository
import com.exploar.movies.domain.repository.SearchMovieRepository
import com.exploar.movies.domain.repository.TopRatedMovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun providesTopRatedMovieRepository(api: MoviesApi, dataModelMapper: DataModelMapper) =
        TopRatedMovieRepositoryImp(api, dataModelMapper) as TopRatedMovieRepository


    @Singleton
    @Provides
    fun providesMovieGenreRepository(api: MoviesApi, dataModelMapper: DataModelMapper) =
        MoviesGenresRepositoryImp(api, dataModelMapper) as MoviesGenresRepository


    @Singleton
    @Provides
    fun providesMovieImagesRepository(api: MoviesApi, dataModelMapper: DataModelMapper) =
        MovieImagesRepositoryImp(api, dataModelMapper) as MovieImagesRepository

    @Singleton
    @Provides
    fun providesSearchMoviesRepository(api: MoviesApi, dataModelMapper: DataModelMapper) =
        SearchMovieRepositoryImp(api, dataModelMapper) as SearchMovieRepository

}