package com.example.homework6android11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework6android11.databinding.FragmentLessonBinding

class LessonFragment() : Fragment() {

    lateinit var binding: FragmentLessonBinding
    private var list = arrayListOf<LessonModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLessonBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = LessonAdapter(list)
        binding.recyclerLesson.adapter = adapter
    }

    private fun loadData() {
        list.add(LessonModel("https://i.pinimg.com/originals/a0/d1/08/a0d1083176615fd0eea97cabc2a19655.jpg", "Химия", R.color.purple_500))
        list.add(LessonModel("https://media.wiley.com/product_data/coverImage300/0X/11196299/111962990X.jpg", "Физика", R.color.purple_200))
        list.add(LessonModel("https://images-na.ssl-images-amazon.com/images/I/A1eq4ZMjyxL.jpg", "Алгебра", R.color.purple_700))
        list.add(LessonModel("https://pictures.abebooks.com/isbn/9781405349321-us.jpg", "История", R.color.teal_700))
        list.add(LessonModel("https://images-na.ssl-images-amazon.com/images/I/41CXGK+gtrL._SX351_BO1,204,203,200_.jpg", "Литер\nатура", R.color.green))
        list.add(LessonModel("https://rabochaya-tetrad-uchebnik.com/russkiy_yazyk/russkiy_yazyk_3_klass_uchebnik_ramzaeva_chastj_1/1.jpg", "Русс яз", R.color.red))
        list.add(LessonModel("https://images-na.ssl-images-amazon.com/images/I/41sXJwfW48L._SX351_BO1,204,203,200_.jpg", "Геометрия", R.color.black))
        list.add(LessonModel("https://images-na.ssl-images-amazon.com/images/I/51GbFYrzGSL._SX351_BO1,204,203,200_.jpg", "Инфор\nматика", R.color.yellow))
        list.add(LessonModel("https://readrate.com/img/pictures/book/505/505114/505114/w240h400-0e44f5fd.jpg", "Биология", R.color.gray))
        list.add(LessonModel("https://st-1.akipress.org/st_all/bilim/2/25b490ab86fc099e3528f8d6d12895ea8cc21dd0.jpg", "Кыргыз \nтили", R.color.red))
        list.add(LessonModel("https://megaresheba.ru/attachments/images/covers/000/096/291/0000/angliyskiy-yazyk-10-klass-kuzovlev-v-p.jpg", "Англ яз", R.color.purple_700))
    }
}