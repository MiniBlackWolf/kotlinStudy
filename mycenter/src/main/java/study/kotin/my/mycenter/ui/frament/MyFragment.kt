package study.kotin.my.mycenter.ui.frament

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import study.kotin.my.baselibrary.ui.fragment.BaseMVPFragmnet
import study.kotin.my.mycenter.R
import study.kotin.my.mycenter.persenter.Mypersenter

class MyFragment:BaseMVPFragmnet<Mypersenter>() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.mylayout,container,false)
    }
}