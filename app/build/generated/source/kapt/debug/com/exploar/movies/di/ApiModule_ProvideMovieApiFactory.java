// Generated by Dagger (https://dagger.dev).
package com.exploar.movies.di;

import com.exploar.movies.data.remote.MoviesApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideMovieApiFactory implements Factory<MoviesApi> {
  private final Provider<Retrofit> retrofitProvider;

  public ApiModule_ProvideMovieApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public MoviesApi get() {
    return provideMovieApi(retrofitProvider.get());
  }

  public static ApiModule_ProvideMovieApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new ApiModule_ProvideMovieApiFactory(retrofitProvider);
  }

  public static MoviesApi provideMovieApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(ApiModule.INSTANCE.provideMovieApi(retrofit));
  }
}
