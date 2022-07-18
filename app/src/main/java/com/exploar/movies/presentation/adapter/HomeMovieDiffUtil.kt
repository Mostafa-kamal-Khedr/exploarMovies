package com.exploar.movies.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.exploar.movies.domain.model.MovieData

object HomeMovieDiffUtil : DiffUtil.ItemCallback<MovieData>() {
    override fun areItemsTheSame(oldItem: MovieData, newItem: MovieData): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: MovieData, newItem: MovieData): Boolean {
        return oldItem == newItem
    }
}