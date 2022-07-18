package com.exploar.movies.data.mapper

import com.exploar.movies.data.model.MovieGenresResponse
import com.exploar.movies.data.model.MovieImagesResponse
import com.exploar.movies.data.model.MoviesResponse
import com.exploar.movies.domain.model.MovieData
import com.exploar.movies.domain.model.MovieGenre
import com.exploar.movies.domain.model.MovieImages

class DataModelMapper {

    fun movieGenreResponseToViewState(movieGenresResponse: MovieGenresResponse): List<MovieGenre> {
        val movieGenreList = mutableListOf<MovieGenre>()
        for (genre in movieGenresResponse.genres) {
            movieGenreList.add(
                MovieGenre(
                    id = genre.id,
                    name = genre.name
                )
            )
        }
        return movieGenreList.toList()
    }


    fun movieDataResponseToViewState(movieDataList: MoviesResponse): List<MovieData> {
        val movieList = mutableListOf<MovieData>()
        for (movie in movieDataList.results) {
            movieList.add(
                MovieData(
                    genre_ids = movie.genre_ids,
                    id = movie.id,
                    overview = movie.overview,
                    poster_path = movie.poster_path ?: "",
                    backdrop_path = movie.backdrop_path ?: "",
                    release_date = movie.release_date,
                    title = movie.title,
                    vote_average = movie.vote_average
                )
            )
        }
        return movieList.toList()
    }


    fun movieImagesResponseToViewState(movieImagesResponse: MovieImagesResponse): MovieImages {
        val imageLinks = mutableListOf<String>()
        for (image in movieImagesResponse.backdrops) {
            imageLinks.add(image.file_path)
        }
        return MovieImages(imageLinks)
    }
}