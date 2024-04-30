package com.example.zooapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import android.graphics.Color;

class AnimalDetailFg : Fragment() {

    val args: AnimalDetailFgArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name : String = args.animalName
        val continent : String = args.animalContinent

        view.findViewById<android.widget.TextView>(R.id.tvAnimalName).text = name
        view.findViewById<android.widget.TextView>(R.id.tvAnimalContinent).text = continent

        when (continent) {
            "Europe" -> view.setBackgroundColor(view.resources.getColor(R.color.green))

            "North America" -> view.setBackgroundColor(view.resources.getColor(R.color.brown))

            "South America" -> view.setBackgroundColor(view.resources.getColor(R.color.orange))

            "Australia" -> view.setBackgroundColor(view.resources.getColor(R.color.purple))

            "Antarctica" -> view.setBackgroundColor(view.resources.getColor(R.color.blue))

            "Africa" -> view.setBackgroundColor(view.resources.getColor(R.color.yellow))

            "Asia" -> view.setBackgroundColor(view.resources.getColor(R.color.red))

            else -> view.setBackgroundColor(view.resources.getColor(R.color.white))
        }
    }
}