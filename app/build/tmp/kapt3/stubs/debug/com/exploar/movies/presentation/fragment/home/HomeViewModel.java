package com.exploar.movies.presentation.fragment.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aR \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/exploar/movies/presentation/fragment/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "getTopRatedMoviesUseCase", "Lcom/exploar/movies/domain/usecase/GetTopRatedMoviesUseCase;", "getMovieGenreUseCase", "Lcom/exploar/movies/domain/usecase/GetMovieGenreUseCase;", "searchMoviesUseCase", "Lcom/exploar/movies/domain/usecase/SearchMoviesUseCase;", "(Lcom/exploar/movies/domain/usecase/GetTopRatedMoviesUseCase;Lcom/exploar/movies/domain/usecase/GetMovieGenreUseCase;Lcom/exploar/movies/domain/usecase/SearchMoviesUseCase;)V", "_movieDataList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/exploar/movies/core/wrapper/ResultWrapper;", "", "Lcom/exploar/movies/domain/model/MovieData;", "_movieGenreList", "Lcom/exploar/movies/domain/model/MovieGenre;", "movieDataList", "getMovieDataList", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "movieGenreList", "getMovieGenreList", "getMovieGenre", "Lkotlinx/coroutines/Job;", "getTopRatedMovies", "searchMovies", "searchQuery", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.exploar.movies.domain.usecase.GetTopRatedMoviesUseCase getTopRatedMoviesUseCase = null;
    private final com.exploar.movies.domain.usecase.GetMovieGenreUseCase getMovieGenreUseCase = null;
    private final com.exploar.movies.domain.usecase.SearchMoviesUseCase searchMoviesUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.exploar.movies.core.wrapper.ResultWrapper<java.util.List<com.exploar.movies.domain.model.MovieGenre>>> _movieGenreList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.exploar.movies.core.wrapper.ResultWrapper<java.util.List<com.exploar.movies.domain.model.MovieGenre>>> movieGenreList = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.exploar.movies.core.wrapper.ResultWrapper<java.util.List<com.exploar.movies.domain.model.MovieData>>> _movieDataList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.exploar.movies.core.wrapper.ResultWrapper<java.util.List<com.exploar.movies.domain.model.MovieData>>> movieDataList = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.exploar.movies.domain.usecase.GetTopRatedMoviesUseCase getTopRatedMoviesUseCase, @org.jetbrains.annotations.NotNull()
    com.exploar.movies.domain.usecase.GetMovieGenreUseCase getMovieGenreUseCase, @org.jetbrains.annotations.NotNull()
    com.exploar.movies.domain.usecase.SearchMoviesUseCase searchMoviesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.exploar.movies.core.wrapper.ResultWrapper<java.util.List<com.exploar.movies.domain.model.MovieGenre>>> getMovieGenreList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.exploar.movies.core.wrapper.ResultWrapper<java.util.List<com.exploar.movies.domain.model.MovieData>>> getMovieDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getTopRatedMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getMovieGenre() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job searchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery) {
        return null;
    }
}