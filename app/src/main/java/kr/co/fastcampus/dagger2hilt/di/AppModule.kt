package kr.co.fastcampus.dagger2hilt.di

import dagger.Module
import dagger.Provides

/**
 * @author soohwan.ok
 */

@Module
class AppModule {

    @Provides
    fun provideHelloWorld():String{
        return "Hello World"
    }
}