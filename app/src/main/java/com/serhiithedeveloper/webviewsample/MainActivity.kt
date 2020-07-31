package com.serhiithedeveloper.webviewsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

const val KEY_URL = "url"
private const val TOS_URL = "https://www.life360.com/terms_of_use/"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnWebView.setOnClickListener {
            startActivity(Intent(this, WebViewActivity::class.java)
                .apply { putExtra(KEY_URL, TOS_URL) })
        }
    }
}
