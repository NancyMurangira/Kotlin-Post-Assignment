package com.example.kotlin_assignment2

import android.app.Activity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin_assignment2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.rvArticles.layoutManager = LinearLayoutManager(this)
    displayArticles()
}

fun displayArticles() {
    val article1 = Article("Nancy Shimwe", " Fashion","Published on: 29 April 2024", " Let us talk about health","View More","http")
    val article2 = Article("Nancy Shimwe", "Health", "Published on: 29 April 2024", " Let us talk about health", "View More","http")
    val article3 = Article("Nancy Shimwe", "Health", "Published on: 29 April 2024", " Let us talk about health", "View More","http")
    val article4 = Article("Nancy Shimwe", "Health", "Published on: 29 April 2024", " Let us talk about health", "View More","http")
    val article5 = Article("Nancy Shimwe", "Health", "Published on: 29 April 2024", " Let us talk about health", "View More","http")
    val article6 = Article("Nancy Shimwe", "Health", "Published on: 29 April 2024", " Let us talk about health", "View More","http")
    val article7 = Article("Nancy Shimwe", "Health", "Published on: 29 April 2024", " Let us talk about health", "View More","http")
    val article8 = Article("Nancy Shimwe", "Health", "Published on: 29 April 2024", " Let us talk about health", "View More","http")

    val articlesList =
        listOf(article1, article2, article3, article4, article5, article6, article7, article8)
    val articleAdapter = ArticleAdapter(articlesList)
    binding.rvArticles.adapter = articleAdapter
}


}