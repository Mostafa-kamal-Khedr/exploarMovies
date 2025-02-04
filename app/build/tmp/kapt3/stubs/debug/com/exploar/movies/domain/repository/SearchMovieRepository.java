package com.exploar.movies.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/exploar/movies/domain/repository/SearchMovieRepository;", "", "searchMovie", "Lkotlinx/coroutines/flow/Flow;", "Lcom/exploar/movies/core/wrapper/ResultWrapper;", "", "Lcom/exploar/movies/domain/model/MovieData;", "searchQuery", "", "app_debug"})
public abstract interface SearchMovieRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.exploar.movies.core.wrapper.ResultWrapper<java.util.List<com.exploar.movies.domain.model.MovieData>>> searchMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery);
}