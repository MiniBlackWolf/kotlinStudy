package study.kotin.my.baselibrary.injection.module

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import study.kotin.my.baselibrary.common.BaseApplication
import javax.inject.Singleton

@Module
class AppModule(private val context:BaseApplication) {
    @Provides
    fun ProvideActivity(): Context =context
}