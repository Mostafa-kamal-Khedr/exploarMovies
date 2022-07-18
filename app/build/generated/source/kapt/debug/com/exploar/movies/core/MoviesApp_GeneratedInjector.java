package com.exploar.movies.core;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = MoviesApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface MoviesApp_GeneratedInjector {
  void injectMoviesApp(MoviesApp moviesApp);
}
