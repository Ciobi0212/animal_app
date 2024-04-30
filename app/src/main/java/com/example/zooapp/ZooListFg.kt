package com.example.zooapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zooapp.adapters.AnimalAdapter
import com.example.zooapp.classes.Animal

class ZooListFg : Fragment() {
    private val itemList = ArrayList<Animal>()
    private val adapter = AnimalAdapter(itemList)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment1, container, false)

    override fun onViewCreated(view: android.view.View, savedInstanceState: android.os.Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAnimalList()
        getAnimalList()
    }

    private fun setupAnimalList() {
        // Call the API to get the list of animals
        val layoutManager = LinearLayoutManager(context)

        view?.findViewById<RecyclerView>(R.id.rvZooList)?.apply {
            this.layoutManager = layoutManager
            this.adapter = this@ZooListFg.adapter
        }
    }

    private fun getAnimalList() {
        itemList.apply {
            add(Animal("Lion", "Africa"))
            add(Animal("Tiger", "Asia"))
            add(Animal("Penguin", "Antarctica"))
            add(Animal("Kangaroo", "Australia"))
            add(Animal("Elephant", "Africa"))
            add(Animal("Grizzly Bear", "North America"))
            add(Animal("Panda", "Asia"))
            add(Animal("Zebra", "Africa"))
            add(Animal("Koala", "Australia"))
            add(Animal("Wolf", "Europe"))
            add(Animal("Polar Bear", "Antarctica"))
            add(Animal("Giraffe", "Africa"))
            add(Animal("Jaguar", "South America"))
            add(Animal("Sloth", "South America"))
            add(Animal("Hippo", "Africa"))
            add(Animal("Monkey", "Asia"))
            add(Animal("Emperor Penguin", "Antarctica"))
            add(Animal("Wallaby", "Australia"))
            add(Animal("Bear", "North America"))
            add(Animal("Red Panda", "Asia"))
            add(Animal("Elephant Seal", "Antarctica"))
            add(Animal("Cheetah", "Africa"))
            add(Animal("Gorilla", "Africa"))
            add(Animal("Red Fox", "Europe"))
            add(Animal("Arctic Fox", "North America"))
            add(Animal("Lemur", "Africa"))
            add(Animal("Koala", "Australia"))
            add(Animal("Polar Bear", "Antarctica"))
            add(Animal("Jaguar", "South America"))
            add(Animal("Sloth", "South America"))
            add(Animal("Giraffe", "Africa"))
            add(Animal("Lion", "Africa"))
            add(Animal("Tiger", "Asia"))
            add(Animal("Penguin", "Antarctica"))
            add(Animal("Kangaroo", "Australia"))
            add(Animal("Elephant", "Africa"))
            add(Animal("Grizzly Bear", "North America"))
            add(Animal("Panda", "Asia"))
            add(Animal("Zebra", "Africa"))
            add(Animal("Koala", "Australia"))
            add(Animal("Wolf", "Europe"))
            add(Animal("Polar Bear", "Antarctica"))
            add(Animal("Giraffe", "Africa"))
            add(Animal("Jaguar", "South America"))
            add(Animal("Sloth", "South America"))
            add(Animal("Hippo", "Africa"))
            add(Animal("Monkey", "Asia"))
            add(Animal("Emperor Penguin", "Antarctica"))
            add(Animal("Wallaby", "Australia"))
            add(Animal("Bear", "North America"))
            add(Animal("Red Panda", "Asia"))
            add(Animal("Elephant Seal", "Antarctica"))
            add(Animal("Cheetah", "Africa"))
            add(Animal("Gorilla", "Africa"))
            add(Animal("Red Fox", "Europe"))
            add(Animal("Arctic Fox", "North America"))
            add(Animal("Lemur", "Africa"))
            add(Animal("Koala", "Australia"))
            add(Animal("Polar Bear", "Antarctica"))
            add(Animal("Jaguar", "South America"))
            add(Animal("Sloth", "South America"))
            add(Animal("Giraffe", "Africa"))
        }


    }
}