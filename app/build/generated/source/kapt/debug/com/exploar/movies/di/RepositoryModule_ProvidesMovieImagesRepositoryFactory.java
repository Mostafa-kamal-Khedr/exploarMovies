// Generated by Dagger (https://dagger.dev).
package com.exploar.movies.di;

import com.exploar.movies.data.mapper.DataModelMapper;
import com.exploar.movies.data.remote.MoviesApi;
import com.exploar.movies.domain.repository.MovieImagesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvidesMovieImagesRepositoryFactory implements Factory<MovieImagesRepository> {
  private final Provider<MoviesApi> apiProvider;

  private final Provider<DataModelMapper> dataModelMapperProvider;

  public RepositoryModule_ProvidesMovieImagesRepositoryFactory(Provider<MoviesApi> apiProvider,
      Provider<DataModelMapper> dataModelMapperProvider) {
    this.apiProvider = apiProvider;
    this.dataModelMapperProvider = dataModelMapperProvider;
  }

  @Override
  public MovieImagesRepository get() {
    return providesMovieImagesRepository(apiProvider.get(), dataModelMapperProvider.get());
  }

  public static RepositoryModule_ProvidesMovieImagesRepositoryFactory create(
      Provider<MoviesApi> apiProvider, Provider<DataModelMapper> dataModelMapperProvider) {
    return new RepositoryModule_ProvidesMovieImagesRepositoryFactory(apiProvider, dataModelMapperProvider);
  }

  public static MovieImagesRepository providesMovieImagesRepository(MoviesApi api,
      DataModelMapper dataModelMapper) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.providesMovieImagesRepository(api, dataModelMapper));
  }
}
