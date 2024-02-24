package kr.co.fastcampus.dagger2hilt.di

import dagger.Module
import dagger.Provides

/**
 * @author soohwan.ok
 */
@Module
class MainActivityModule {

    @Provides
    @ActivityScope
    fun provideCurrentTime():Long{
        return System.currentTimeMillis()
    }
}