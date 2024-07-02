package com.example.kotlin_assignment2

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.core.view.WindowInsetsCompat.Type
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ArticleAdapter(val articlesList: List<Article>): RecyclerView.Adapter<ArticlesViewHolder>(){
    override fun OnCreateViewHolder(parent: ViewGroup, viewType: Int): ArticlesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.article_list_item, parent, false)
        return ArticlesViewHolder((itemView))
    }

    override fun onBindingViewHolder(holder: ArticlesViewHolder, position: Int){
        val article = articlesList[position]
        holder.tvLink.text = article.link
        holder.tvDate.text = article.publishingDate
        holder.tvName.text = article.authorName
        holder.tvTitle.text = article.title
        holder.tvPreview.text = article.preview
    }

    override fun getItemCount(): Int{
        return articlesList.size
    }
}

class ArticlesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    var tvPreview = itemView.findViewById<TextView>(R.id.tvPreview)
    var tvLink = itemView.findViewById<TextView>(R.id.tvLink)

}