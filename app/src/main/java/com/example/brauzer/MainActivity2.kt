package com.example.brauzer

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.widget.addTextChangedListener
import com.example.brauzer.databinding.ActivityMain2Binding
import com.example.brauzer.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private val binding by lazy { ActivityMain2Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.webView.webViewClient = object : WebViewClient(){
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
            }
        }
        binding.edt.addTextChangedListener {
            binding.webView.settings.javaScriptEnabled = true
            var url = "https://www.google.com/search?q="
            binding.webView.loadUrl("${url}${it.toString()}")

        }

    }
}

