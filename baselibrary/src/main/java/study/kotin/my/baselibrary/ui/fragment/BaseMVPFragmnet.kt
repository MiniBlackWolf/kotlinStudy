package study.kotin.my.baselibrary.ui.fragment

import study.kotin.my.baselibrary.presenter.Basepersenter
import study.kotin.my.baselibrary.presenter.view.BaseView
import javax.inject.Inject

open class BaseMVPFragmnet<T: Basepersenter<*>>:BaseFragment(),BaseView {
    override fun showLoading() {

    }

    override fun hideLoading() {
    }

    override fun onError() {
    }
    open fun onKeyBackPressed(): Boolean {
        return false
    }
    @Inject
    lateinit var mpersenter:T
}