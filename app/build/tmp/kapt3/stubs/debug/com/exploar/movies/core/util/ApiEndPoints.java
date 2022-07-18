package com.exploar.movies.core.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/exploar/movies/core/util/ApiEndPoints;", "", "()V", "MOVIE_GENRES_ENDPOINT", "", "MOVIE_IMAGES_ENDPOINT", "MOVIE_SEARCH_ENDPOINT", "TOP_MOVIES_ENDPOINT", "app_debug"})
public final class ApiEndPoints {
    @org.jetbrains.annotations.NotNull()
    public static final com.exploar.movies.core.util.ApiEndPoints INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOP_MOVIES_ENDPOINT = "movie/top_rated";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_GENRES_ENDPOINT = "genre/movie/list";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_IMAGES_ENDPOINT = "movie/{movie_id}/images";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_SEARCH_ENDPOINT = "search/movie";
    
    private ApiEndPoints() {
        super();
    }
}