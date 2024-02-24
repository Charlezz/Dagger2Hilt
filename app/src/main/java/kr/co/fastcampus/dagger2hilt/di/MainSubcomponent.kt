package kr.co.fastcampus.dagger2hilt.di

import dagger.BindsInstance
import dagger.Subcomponent
import kr.co.fastcampus.dagger2hilt.MainActivity

/**
 * @author soohwan.ok
 */
@Subcomponent(modules = [MainActivityModule::class])
@ActivityScope
interface MainSubcomponent {

    @Subcomponent.Factory
    interface Factory{
        fun create(@BindsInstance activity:MainActivity):MainSubcomponent
    }

    fun inject(activity:MainActivity)
}