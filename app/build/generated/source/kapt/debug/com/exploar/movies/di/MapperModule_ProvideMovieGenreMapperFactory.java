// Generated by Dagger (https://dagger.dev).
package com.exploar.movies.di;

import com.exploar.movies.data.mapper.DataModelMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MapperModule_ProvideMovieGenreMapperFactory implements Factory<DataModelMapper> {
  @Override
  public DataModelMapper get() {
    return provideMovieGenreMapper();
  }

  public static MapperModule_ProvideMovieGenreMapperFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DataModelMapper provideMovieGenreMapper() {
    return Preconditions.checkNotNullFromProvides(MapperModule.INSTANCE.provideMovieGenreMapper());
  }

  private static final class InstanceHolder {
    private static final MapperModule_ProvideMovieGenreMapperFactory INSTANCE = new MapperModule_ProvideMovieGenreMapperFactory();
  }
}
