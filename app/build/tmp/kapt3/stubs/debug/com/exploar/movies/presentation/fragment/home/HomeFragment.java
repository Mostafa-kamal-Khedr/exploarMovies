package com.exploar.movies.presentation.fragment.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0016\u0010\u001e\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\u0016\u0010$\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010/\u001a\u00020\u0018H\u0002J\u0016\u00100\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/exploar/movies/presentation/fragment/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "binding", "Lcom/exploar/movies/databinding/FragmentHomeBinding;", "getBinding", "()Lcom/exploar/movies/databinding/FragmentHomeBinding;", "binding$delegate", "Lkotlin/Lazy;", "currentMovieList", "", "Lcom/exploar/movies/domain/model/MovieData;", "genreFilterId", "", "homeViewModel", "Lcom/exploar/movies/presentation/fragment/home/HomeViewModel;", "getHomeViewModel", "()Lcom/exploar/movies/presentation/fragment/home/HomeViewModel;", "homeViewModel$delegate", "recAdapter", "Lcom/exploar/movies/presentation/adapter/HomeMovieAdapter;", "createChip", "", "data", "", "Lcom/exploar/movies/domain/model/MovieGenre;", "chipView", "Lcom/google/android/material/chip/ChipGroup;", "handleChipClicks", "handleSearch", "hideLoading", "initMovieGenre", "initObservers", "initRecyclerView", "isFiltrationListIsEmpty", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showLoading", "showMovieList", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private final java.lang.String TAG = "HomeFragment";
    private final kotlin.Lazy binding$delegate = null;
    private com.exploar.movies.presentation.adapter.HomeMovieAdapter recAdapter;
    private final kotlin.Lazy homeViewModel$delegate = null;
    private int genreFilterId = 0;
    private java.util.List<com.exploar.movies.domain.model.MovieData> currentMovieList;
    
    public HomeFragment() {
        super();
    }
    
    private final com.exploar.movies.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    private final com.exploar.movies.presentation.fragment.home.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initMovieGenre() {
    }
    
    private final void initObservers() {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void createChip(java.util.List<com.exploar.movies.domain.model.MovieGenre> data, com.google.android.material.chip.ChipGroup chipView) {
    }
    
    private final void showMovieList(java.util.List<com.exploar.movies.domain.model.MovieData> data) {
    }
    
    private final void isFiltrationListIsEmpty(java.util.List<com.exploar.movies.domain.model.MovieData> data) {
    }
    
    private final void handleSearch() {
    }
    
    private final void handleChipClicks(java.util.List<com.exploar.movies.domain.model.MovieGenre> data) {
    }
    
    private final void showLoading() {
    }
    
    private final void hideLoading() {
    }
}