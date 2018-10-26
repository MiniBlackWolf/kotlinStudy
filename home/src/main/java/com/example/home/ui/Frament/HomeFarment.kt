package com.example.home.ui.Frament

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.home.R
import com.example.home.persenter.HomePersenter
import study.kotin.my.baselibrary.ui.fragment.BaseMVPFragmnet


class HomeFarment: BaseMVPFragmnet<HomePersenter>() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.homemain_layout,container,false)
    }
}