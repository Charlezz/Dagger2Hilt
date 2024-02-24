package kr.co.fastcampus.dagger2hilt.di

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import kr.co.fastcampus.dagger2hilt.MainActivity

/**
 * @author soohwan.ok
 */
@Module
abstract class AppSubcomponents {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    @ActivityScope
    abstract fun mainActivity():MainActivity
}