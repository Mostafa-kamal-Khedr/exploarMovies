package com.exploar.movies.presentation.fragment.details;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/exploar/movies/presentation/fragment/details/DetailsFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "getMovieImagesUseCase", "Lcom/exploar/movies/domain/usecase/GetMovieImagesUseCase;", "(Lcom/exploar/movies/domain/usecase/GetMovieImagesUseCase;)V", "_movieImageList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/exploar/movies/core/wrapper/ResultWrapper;", "Lcom/exploar/movies/domain/model/MovieImages;", "movieImageList", "getMovieImageList", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getMovieImages", "Lkotlinx/coroutines/Job;", "movieId", "", "app_debug"})
public final class DetailsFragmentViewModel extends androidx.lifecycle.ViewModel {
    private final com.exploar.movies.domain.usecase.GetMovieImagesUseCase getMovieImagesUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.exploar.movies.core.wrapper.ResultWrapper<com.exploar.movies.domain.model.MovieImages>> _movieImageList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.exploar.movies.core.wrapper.ResultWrapper<com.exploar.movies.domain.model.MovieImages>> movieImageList = null;
    
    @javax.inject.Inject()
    public DetailsFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.exploar.movies.domain.usecase.GetMovieImagesUseCase getMovieImagesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.exploar.movies.core.wrapper.ResultWrapper<com.exploar.movies.domain.model.MovieImages>> getMovieImageList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getMovieImages(int movieId) {
        return null;
    }
}