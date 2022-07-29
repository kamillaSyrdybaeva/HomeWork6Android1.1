package com.example.homework6android11

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.homework6android11.databinding.ItemLessonBinding

class LessonAdapter(private val list: ArrayList<LessonModel>) : RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        return LessonViewHolder(ItemLessonBinding.inflate(LayoutInflater.from(parent.context), parent, false)) }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    class LessonViewHolder(private var binding: ItemLessonBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(lessonModel: LessonModel) {
            Glide.with(binding.ivLesson).load(lessonModel.imageLesson).into(binding.ivLesson)
            binding.tvNameLesson.text = lessonModel.nameLesson
            binding.lesson.setBackgroundResource(lessonModel.colorBackground)
        }
    }
}