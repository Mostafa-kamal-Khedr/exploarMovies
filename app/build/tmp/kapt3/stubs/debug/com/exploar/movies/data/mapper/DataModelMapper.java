package com.exploar.movies.data.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/exploar/movies/data/mapper/DataModelMapper;", "", "()V", "movieDataResponseToViewState", "", "Lcom/exploar/movies/domain/model/MovieData;", "movieDataList", "Lcom/exploar/movies/data/model/MoviesResponse;", "movieGenreResponseToViewState", "Lcom/exploar/movies/domain/model/MovieGenre;", "movieGenresResponse", "Lcom/exploar/movies/data/model/MovieGenresResponse;", "movieImagesResponseToViewState", "Lcom/exploar/movies/domain/model/MovieImages;", "movieImagesResponse", "Lcom/exploar/movies/data/model/MovieImagesResponse;", "app_debug"})
public final class DataModelMapper {
    
    public DataModelMapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.exploar.movies.domain.model.MovieGenre> movieGenreResponseToViewState(@org.jetbrains.annotations.NotNull()
    com.exploar.movies.data.model.MovieGenresResponse movieGenresResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.exploar.movies.domain.model.MovieData> movieDataResponseToViewState(@org.jetbrains.annotations.NotNull()
    com.exploar.movies.data.model.MoviesResponse movieDataList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.exploar.movies.domain.model.MovieImages movieImagesResponseToViewState(@org.jetbrains.annotations.NotNull()
    com.exploar.movies.data.model.MovieImagesResponse movieImagesResponse) {
        return null;
    }
}