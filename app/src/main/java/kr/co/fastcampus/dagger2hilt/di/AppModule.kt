package kr.co.fastcampus.dagger2hilt.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * @author soohwan.ok
 */

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun provideHelloWorld():String{
        return "Hello World"
    }
}