package study.kotin.my.baselibrary.injection.module

import android.app.Activity
import dagger.Module
import dagger.Provides


@Module
class ActivityModule(private val activity: Activity) {
    @Provides
    fun ProvideContext():Activity=activity
}