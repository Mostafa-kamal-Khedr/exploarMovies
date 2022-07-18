// Generated by view binder compiler. Do not edit!
package com.exploar.movies.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.exploar.movies.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ItemImageBinding implements ViewBinding {
  @NonNull
  private final ImageView rootView;

  @NonNull
  public final ImageView movieImageView;

  private ItemImageBinding(@NonNull ImageView rootView, @NonNull ImageView movieImageView) {
    this.rootView = rootView;
    this.movieImageView = movieImageView;
  }

  @Override
  @NonNull
  public ImageView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemImageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_image, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemImageBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    ImageView movieImageView = (ImageView) rootView;

    return new ItemImageBinding((ImageView) rootView, movieImageView);
  }
}
