package com.example.landmarks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class AdapterCountry() :
    RecyclerView.Adapter<AdapterCountry.ViewHolder>(), RecyclerViewInterface {
    private lateinit var mlistener: RecyclerViewInterface

    fun setOnItemClickListener(listener: RecyclerViewInterface) {
        mlistener = listener
    }

    var countryList =
        arrayOf(
            "Turkey",
            "Azerbaijan",
            "Almanya",
            "Avusturya",
            "Belçika",
            "Bulgaristan",
            "Çek Cumhuriyeti",
            "Danimarka",
            "Estonya",
            "Finlandiya",
            "Fransa",
            "Hırvatistan",
            "Hollanda",
            "İrlanda",
            "İspanya",
            "İsveç",
            "İtalya",
            "Letonya"
        )

    var imageList =
        arrayOf(
            R.drawable.turkey,
            R.drawable.azerbaijan,
            R.drawable.germany,
            R.drawable.austria,
            R.drawable.belgium,
            R.drawable.bulgaria,
            R.drawable.czechsia,
            R.drawable.denmark,
            R.drawable.estonia,
            R.drawable.finland,
            R.drawable.france,
            R.drawable.croatia,
            R.drawable.holland,
            R.drawable.irland,
            R.drawable.spain,
            R.drawable.sweden,
            R.drawable.italy,
            R.drawable.latvia
        )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.country_layout, parent, false)
        return ViewHolder(v, mlistener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items = countryList[position]
        val images = imageList[position]
        holder.countryButton.setText(items)
        holder.countryImageViewId.setImageResource(images)

    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    class ViewHolder(view: View, listener: RecyclerViewInterface) : RecyclerView.ViewHolder(view) {
        var countryButton: Button = view.findViewById(R.id.countryButtonId)
        var countryImageViewId: ImageView = view.findViewById(R.id.countryImageViewId)

        init {
            countryButton.setOnClickListener {
                listener.onItemClick(bindingAdapterPosition)

            }
            countryImageViewId.setOnClickListener {
                listener.onItemClick(bindingAdapterPosition)

            }

        }

    }

    override fun onItemClick(position: Int) {

    }
}