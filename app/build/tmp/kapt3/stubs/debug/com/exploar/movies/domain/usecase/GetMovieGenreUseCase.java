package com.exploar.movies.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/exploar/movies/domain/usecase/GetMovieGenreUseCase;", "", "repo", "Lcom/exploar/movies/domain/repository/MoviesGenresRepository;", "(Lcom/exploar/movies/domain/repository/MoviesGenresRepository;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/exploar/movies/core/wrapper/ResultWrapper;", "", "Lcom/exploar/movies/domain/model/MovieGenre;", "app_debug"})
public final class GetMovieGenreUseCase {
    private final com.exploar.movies.domain.repository.MoviesGenresRepository repo = null;
    
    @javax.inject.Inject()
    public GetMovieGenreUseCase(@org.jetbrains.annotations.NotNull()
    com.exploar.movies.domain.repository.MoviesGenresRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.exploar.movies.core.wrapper.ResultWrapper<java.util.List<com.exploar.movies.domain.model.MovieGenre>>> execute() {
        return null;
    }
}