package com.exploar.movies.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u001a\u0010\u0018\u001a\u00020\u000e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/exploar/movies/presentation/adapter/HomeMovieAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/exploar/movies/presentation/adapter/HomeMovieAdapter$MyViewHolder;", "()V", "_binding", "Lcom/exploar/movies/databinding/ItemMovieBinding;", "diffUtil", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/exploar/movies/domain/model/MovieData;", "kotlin.jvm.PlatformType", "getDiffUtil", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "onItemClickListener", "Lkotlin/Function1;", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemClicked", "listener", "MyViewHolder", "app_debug"})
public final class HomeMovieAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.exploar.movies.presentation.adapter.HomeMovieAdapter.MyViewHolder> {
    private com.exploar.movies.databinding.ItemMovieBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.exploar.movies.domain.model.MovieData> diffUtil = null;
    private kotlin.jvm.functions.Function1<? super com.exploar.movies.domain.model.MovieData, kotlin.Unit> onItemClickListener;
    
    public HomeMovieAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.AsyncListDiffer<com.exploar.movies.domain.model.MovieData> getDiffUtil() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.exploar.movies.presentation.adapter.HomeMovieAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.exploar.movies.presentation.adapter.HomeMovieAdapter.MyViewHolder holder, int position) {
    }
    
    public final void onItemClicked(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.exploar.movies.domain.model.MovieData, kotlin.Unit> listener) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/exploar/movies/presentation/adapter/HomeMovieAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/exploar/movies/databinding/ItemMovieBinding;", "(Lcom/exploar/movies/presentation/adapter/HomeMovieAdapter;Lcom/exploar/movies/databinding/ItemMovieBinding;)V", "getBinding", "()Lcom/exploar/movies/databinding/ItemMovieBinding;", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.exploar.movies.databinding.ItemMovieBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.exploar.movies.databinding.ItemMovieBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.exploar.movies.databinding.ItemMovieBinding getBinding() {
            return null;
        }
    }
}