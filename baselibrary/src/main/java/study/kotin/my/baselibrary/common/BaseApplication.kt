package study.kotin.my.baselibrary.common

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import study.kotin.my.baselibrary.injection.commponent.AppCommpoent
import study.kotin.my.baselibrary.injection.commponent.DaggerAppCommpoent
import study.kotin.my.baselibrary.injection.module.AppModule


class BaseApplication: Application() {
    lateinit var appCommpoen:AppCommpoent
    override fun onCreate() {
        super.onCreate()
        initjection()
        ARouter.openLog()    // 打印日志
        ARouter.openDebug()
        ARouter.init(this)
    }

    private fun initjection() {
        appCommpoen=DaggerAppCommpoent.builder().appModule(AppModule(this)).build()
    }

}