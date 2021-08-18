package com.softsquared.template.kotlin.src.main.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.config.BaseActivity
import com.softsquared.template.kotlin.databinding.ActivityLoginSettingBinding

class LoginSettingActivity : BaseActivity<ActivityLoginSettingBinding>(ActivityLoginSettingBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 뒤로가기 버튼
        binding.settingLoginIbtnBack.setOnClickListener {
            finish()
        }
    }
}