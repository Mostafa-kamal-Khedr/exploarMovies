package com.exploar.movies.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/exploar/movies/di/RepositoryModule;", "", "()V", "providesMovieGenreRepository", "Lcom/exploar/movies/domain/repository/MoviesGenresRepository;", "api", "Lcom/exploar/movies/data/remote/MoviesApi;", "dataModelMapper", "Lcom/exploar/movies/data/mapper/DataModelMapper;", "providesMovieImagesRepository", "Lcom/exploar/movies/domain/repository/MovieImagesRepository;", "providesSearchMoviesRepository", "Lcom/exploar/movies/domain/repository/SearchMovieRepository;", "providesTopRatedMovieRepository", "Lcom/exploar/movies/domain/repository/TopRatedMovieRepository;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.exploar.movies.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.exploar.movies.domain.repository.TopRatedMovieRepository providesTopRatedMovieRepository(@org.jetbrains.annotations.NotNull()
    com.exploar.movies.data.remote.MoviesApi api, @org.jetbrains.annotations.NotNull()
    com.exploar.movies.data.mapper.DataModelMapper dataModelMapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.exploar.movies.domain.repository.MoviesGenresRepository providesMovieGenreRepository(@org.jetbrains.annotations.NotNull()
    com.exploar.movies.data.remote.MoviesApi api, @org.jetbrains.annotations.NotNull()
    com.exploar.movies.data.mapper.DataModelMapper dataModelMapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.exploar.movies.domain.repository.MovieImagesRepository providesMovieImagesRepository(@org.jetbrains.annotations.NotNull()
    com.exploar.movies.data.remote.MoviesApi api, @org.jetbrains.annotations.NotNull()
    com.exploar.movies.data.mapper.DataModelMapper dataModelMapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.exploar.movies.domain.repository.SearchMovieRepository providesSearchMoviesRepository(@org.jetbrains.annotations.NotNull()
    com.exploar.movies.data.remote.MoviesApi api, @org.jetbrains.annotations.NotNull()
    com.exploar.movies.data.mapper.DataModelMapper dataModelMapper) {
        return null;
    }
}