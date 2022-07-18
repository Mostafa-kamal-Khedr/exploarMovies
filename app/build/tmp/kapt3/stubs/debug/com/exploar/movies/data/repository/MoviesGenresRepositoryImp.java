package com.exploar.movies.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/exploar/movies/data/repository/MoviesGenresRepositoryImp;", "Lcom/exploar/movies/domain/repository/MoviesGenresRepository;", "api", "Lcom/exploar/movies/data/remote/MoviesApi;", "movieGenreDataMapper", "Lcom/exploar/movies/data/mapper/DataModelMapper;", "(Lcom/exploar/movies/data/remote/MoviesApi;Lcom/exploar/movies/data/mapper/DataModelMapper;)V", "getMovieGenres", "Lkotlinx/coroutines/flow/Flow;", "Lcom/exploar/movies/core/wrapper/ResultWrapper;", "", "Lcom/exploar/movies/domain/model/MovieGenre;", "app_debug"})
public final class MoviesGenresRepositoryImp implements com.exploar.movies.domain.repository.MoviesGenresRepository {
    private final com.exploar.movies.data.remote.MoviesApi api = null;
    private final com.exploar.movies.data.mapper.DataModelMapper movieGenreDataMapper = null;
    
    @javax.inject.Inject()
    public MoviesGenresRepositoryImp(@org.jetbrains.annotations.NotNull()
    com.exploar.movies.data.remote.MoviesApi api, @org.jetbrains.annotations.NotNull()
    com.exploar.movies.data.mapper.DataModelMapper movieGenreDataMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.exploar.movies.core.wrapper.ResultWrapper<java.util.List<com.exploar.movies.domain.model.MovieGenre>>> getMovieGenres() {
        return null;
    }
}