// Generated by Dagger (https://dagger.dev).
package com.exploar.movies.data.repository;

import com.exploar.movies.data.mapper.DataModelMapper;
import com.exploar.movies.data.remote.MoviesApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MoviesGenresRepositoryImp_Factory implements Factory<MoviesGenresRepositoryImp> {
  private final Provider<MoviesApi> apiProvider;

  private final Provider<DataModelMapper> movieGenreDataMapperProvider;

  public MoviesGenresRepositoryImp_Factory(Provider<MoviesApi> apiProvider,
      Provider<DataModelMapper> movieGenreDataMapperProvider) {
    this.apiProvider = apiProvider;
    this.movieGenreDataMapperProvider = movieGenreDataMapperProvider;
  }

  @Override
  public MoviesGenresRepositoryImp get() {
    return newInstance(apiProvider.get(), movieGenreDataMapperProvider.get());
  }

  public static MoviesGenresRepositoryImp_Factory create(Provider<MoviesApi> apiProvider,
      Provider<DataModelMapper> movieGenreDataMapperProvider) {
    return new MoviesGenresRepositoryImp_Factory(apiProvider, movieGenreDataMapperProvider);
  }

  public static MoviesGenresRepositoryImp newInstance(MoviesApi api,
      DataModelMapper movieGenreDataMapper) {
    return new MoviesGenresRepositoryImp(api, movieGenreDataMapper);
  }
}
