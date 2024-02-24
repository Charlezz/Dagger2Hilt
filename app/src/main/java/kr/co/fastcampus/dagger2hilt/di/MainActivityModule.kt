package kr.co.fastcampus.dagger2hilt.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

/**
 * @author soohwan.ok
 */
@Module
@InstallIn(ActivityComponent::class)
class MainActivityModule {

    @Provides
    @ActivityScoped
    fun provideCurrentTime():Long{
        return System.currentTimeMillis()
    }
}