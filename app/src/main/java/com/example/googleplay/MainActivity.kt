package com.example.googleplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = ArrayList<Category>();
        val apps1 = ArrayList<App>()
        val app11 = App("image1", "Math Genius", "4.7")
        val app12 = App("image2", "Blabla Master", "4.5")
        val app13 = App("image3", "Science Explorer", "4.8")
        val app14 = App("image4", "History Explorer", "4.6")
        apps1.add(app11)
        apps1.add(app12)
        apps1.add(app13)
        apps1.add(app14)
        val category1 = Category("Game 1", apps1)

        val apps2 = ArrayList<App>()
        val app21 = App("image5", "Racing Challenge", "4.2")
        val app22 = App("image6", "Adventure Quest", "4.1")
        val app23 = App("image7", "Puzzle Adventure", "4.0")
        val app24 = App("image8", "Strategy Battle", "4.3")
        apps2.add(app21)
        apps2.add(app22)
        apps2.add(app23)
        apps2.add(app24)
        val category2 = Category("Game 2", apps2)

        val apps3 = ArrayList<App>()
        val app31 = App("image9", "Healthy Living", "4.6")
        val app32 = App("image10", "Meditation Guide", "4.7")
        val app33 = App("image11", "Workout Trainer", "4.9")
        val app34 = App("image12", "Nutrition Tracker", "4.8")
        apps3.add(app31)
        apps3.add(app32)
        apps3.add(app33)
        apps3.add(app34)
        val category3 = Category("Game 3", apps3)


        data.add(category1);
        data.add(category2);
        data.add(category3);


        val categoryAdapter  = CategoryAdapter( data, this);
        val rvApp = findViewById<RecyclerView>(R.id.categories)
        val layoutManager = LinearLayoutManager( this, LinearLayoutManager.VERTICAL, false)
        rvApp.layoutManager = layoutManager
        rvApp.adapter = categoryAdapter
    }



}