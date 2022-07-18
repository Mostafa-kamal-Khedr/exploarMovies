package com.exploar.movies.data.datasource

import androidx.paging.PagingConfig
import com.exploar.movies.core.util.PAGE_SIZE

val PAGE_CONFIG =
    PagingConfig(
        pageSize = PAGE_SIZE,
        enablePlaceholders = false
    )
