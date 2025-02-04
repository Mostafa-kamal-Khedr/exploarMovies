// Generated by Dagger (https://dagger.dev).
package com.exploar.movies.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvidesHttpLoggingInterceptorFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return providesHttpLoggingInterceptor();
  }

  public static ApiModule_ProvidesHttpLoggingInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient providesHttpLoggingInterceptor() {
    return Preconditions.checkNotNullFromProvides(ApiModule.INSTANCE.providesHttpLoggingInterceptor());
  }

  private static final class InstanceHolder {
    private static final ApiModule_ProvidesHttpLoggingInterceptorFactory INSTANCE = new ApiModule_ProvidesHttpLoggingInterceptorFactory();
  }
}
