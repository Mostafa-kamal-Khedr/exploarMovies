package com.exploar.movies.presentation.fragment.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/exploar/movies/presentation/fragment/home/HomeFragmentDirections;", "", "()V", "ActionHomeFragmentToDetailsFragment", "Companion", "app_debug"})
public final class HomeFragmentDirections {
    @org.jetbrains.annotations.NotNull()
    public static final com.exploar.movies.presentation.fragment.home.HomeFragmentDirections.Companion Companion = null;
    
    private HomeFragmentDirections() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/exploar/movies/presentation/fragment/home/HomeFragmentDirections$ActionHomeFragmentToDetailsFragment;", "Landroidx/navigation/NavDirections;", "selectedMovieData", "Lcom/exploar/movies/domain/model/MovieData;", "(Lcom/exploar/movies/domain/model/MovieData;)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getSelectedMovieData", "()Lcom/exploar/movies/domain/model/MovieData;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    static final class ActionHomeFragmentToDetailsFragment implements androidx.navigation.NavDirections {
        @org.jetbrains.annotations.NotNull()
        private final com.exploar.movies.domain.model.MovieData selectedMovieData = null;
        private final int actionId = com.exploar.movies.R.id.action_homeFragment_to_detailsFragment;
        
        @org.jetbrains.annotations.NotNull()
        public final com.exploar.movies.presentation.fragment.home.HomeFragmentDirections.ActionHomeFragmentToDetailsFragment copy(@org.jetbrains.annotations.NotNull()
        com.exploar.movies.domain.model.MovieData selectedMovieData) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ActionHomeFragmentToDetailsFragment(@org.jetbrains.annotations.NotNull()
        com.exploar.movies.domain.model.MovieData selectedMovieData) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.exploar.movies.domain.model.MovieData component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.exploar.movies.domain.model.MovieData getSelectedMovieData() {
            return null;
        }
        
        @java.lang.Override()
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
        @java.lang.Override()
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/exploar/movies/presentation/fragment/home/HomeFragmentDirections$Companion;", "", "()V", "actionHomeFragmentToDetailsFragment", "Landroidx/navigation/NavDirections;", "selectedMovieData", "Lcom/exploar/movies/domain/model/MovieData;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.navigation.NavDirections actionHomeFragmentToDetailsFragment(@org.jetbrains.annotations.NotNull()
        com.exploar.movies.domain.model.MovieData selectedMovieData) {
            return null;
        }
    }
}