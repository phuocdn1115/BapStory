package luvnhi.luvbap.ui

import android.annotation.SuppressLint
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import luvnhi.luvbap.R
import luvnhi.luvbap.base.BaseActivity
import luvnhi.luvbap.databinding.ActivityMainBinding
import luvnhi.luvbap.utils.setStatusBarDarkOrLight

@SuppressLint("NewApi")
@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun getContentLayout(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        paddingStatusBar(binding.root)
        setStatusBarDarkOrLight()
    }

    override fun initListener() {
    }

    override fun observerLiveData() {

    }
}