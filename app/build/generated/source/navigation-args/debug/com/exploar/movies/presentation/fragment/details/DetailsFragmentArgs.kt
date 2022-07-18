package com.exploar.movies.presentation.fragment.details

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.exploar.movies.domain.model.MovieData
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetailsFragmentArgs(
  public val selectedMovieData: MovieData
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(MovieData::class.java)) {
      result.set("selectedMovieData", this.selectedMovieData as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(MovieData::class.java)) {
      result.set("selectedMovieData", this.selectedMovieData as Serializable)
    } else {
      throw UnsupportedOperationException(MovieData::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailsFragmentArgs {
      bundle.setClassLoader(DetailsFragmentArgs::class.java.classLoader)
      val __selectedMovieData : MovieData?
      if (bundle.containsKey("selectedMovieData")) {
        if (Parcelable::class.java.isAssignableFrom(MovieData::class.java) ||
            Serializable::class.java.isAssignableFrom(MovieData::class.java)) {
          __selectedMovieData = bundle.get("selectedMovieData") as MovieData?
        } else {
          throw UnsupportedOperationException(MovieData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__selectedMovieData == null) {
          throw IllegalArgumentException("Argument \"selectedMovieData\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"selectedMovieData\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__selectedMovieData)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): DetailsFragmentArgs {
      val __selectedMovieData : MovieData?
      if (savedStateHandle.contains("selectedMovieData")) {
        if (Parcelable::class.java.isAssignableFrom(MovieData::class.java) ||
            Serializable::class.java.isAssignableFrom(MovieData::class.java)) {
          __selectedMovieData = savedStateHandle.get<MovieData?>("selectedMovieData")
        } else {
          throw UnsupportedOperationException(MovieData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__selectedMovieData == null) {
          throw IllegalArgumentException("Argument \"selectedMovieData\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"selectedMovieData\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__selectedMovieData)
    }
  }
}
