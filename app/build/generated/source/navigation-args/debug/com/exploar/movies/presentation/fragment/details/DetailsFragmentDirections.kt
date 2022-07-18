package com.exploar.movies.presentation.fragment.details

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.exploar.movies.R

public class DetailsFragmentDirections private constructor() {
  public companion object {
    public fun actionDetailsFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_detailsFragment_to_homeFragment)
  }
}
