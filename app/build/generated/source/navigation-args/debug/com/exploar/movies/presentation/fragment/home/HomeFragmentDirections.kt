package com.exploar.movies.presentation.fragment.home

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.exploar.movies.R
import com.exploar.movies.domain.model.MovieData
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToDetailsFragment(
    public val selectedMovieData: MovieData
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_detailsFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(MovieData::class.java)) {
          result.putParcelable("selectedMovieData", this.selectedMovieData as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(MovieData::class.java)) {
          result.putSerializable("selectedMovieData", this.selectedMovieData as Serializable)
        } else {
          throw UnsupportedOperationException(MovieData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmentToDetailsFragment(selectedMovieData: MovieData): NavDirections =
        ActionHomeFragmentToDetailsFragment(selectedMovieData)
  }
}
