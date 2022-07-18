package com.exploar.movies.presentation.fragment.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.exploar.movies.core.wrapper.ResultWrapper
import com.exploar.movies.domain.model.MovieImages
import com.exploar.movies.domain.usecase.GetMovieImagesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class DetailsFragmentViewModel @Inject constructor(
    private val getMovieImagesUseCase: GetMovieImagesUseCase
) : ViewModel() {

    private val _movieImageList: MutableStateFlow<ResultWrapper<MovieImages>> =
        MutableStateFlow(ResultWrapper.Loading)
    val movieImageList = _movieImageList


    fun getMovieImages(movieId: Int) =
        getMovieImagesUseCase.execute(movieId).flowOn(Dispatchers.IO)
            .onEach {
                _movieImageList.emit(it)
            }.launchIn(viewModelScope)


}