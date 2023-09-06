package com.odukabdulbasit.dinsplayimagefrominternet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)

        // Replace 'image_url' with the actual URL of the image you want to display.
        val imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGEdz_G8Oj8B21oVav2u1C237PNnifZn68WQ&usqp=CAU"

        // Load and display the image using Picasso
        //Picasso.get().load(imageUrl).into(imageView)

        // Load and display the image using Glide
        Glide.with(this)
            .load(imageUrl)
            .centerCrop() // You can change the transformation as needed
            .placeholder(R.drawable.placeholder_image) // Placeholder image
            .into(imageView)
    }
}