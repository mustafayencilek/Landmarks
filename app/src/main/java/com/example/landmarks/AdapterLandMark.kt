package com.example.landmarks

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.reflect.Array

class AdapterLandMark(position: Int) :
    RecyclerView.Adapter<AdapterLandMark.ViewHolderMark>(), RecyclerViewInterface {
    private lateinit var mlistener: RecyclerViewInterface
    private  var positiony: Int
    fun setOnItemClickListener(listener: RecyclerViewInterface) {
        mlistener = listener
    }

    init {
        positiony = position

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
    var turkeyMark = arrayOf(
        R.drawable.izmirsaatkulesi,
        R.drawable.kizkulesi
    )
    var azerbaijanMark = arrayOf(
        R.drawable.azerbaijan,
        R.drawable.austria
    )
    var germanyMark = arrayOf(
        R.drawable.germanybasteibridge,
        R.drawable.germanyberlintower
    )
    var austriaMark = arrayOf(
        R.drawable.austriaschonbrunnpalace,
        R.drawable.austriawachauvalley
    )
    var belgiumMark = arrayOf(
        R.drawable.belgiumgrandplace,
        R.drawable.belgiummeusevalley
    )
    var bulgariaMark = arrayOf(
        R.drawable.bulgariaboyanachurch,
        R.drawable.bulgariadevetashkacave
    )
    var czechsiaMark = arrayOf(
        R.drawable.izmirsaatkulesi,
        R.drawable.kizkulesi
    )
    var denmarkMark = arrayOf(
        R.drawable.izmirsaatkulesi,
        R.drawable.kizkulesi
    )
    var estoniaMark = arrayOf(
        R.drawable.izmirsaatkulesi,
        R.drawable.kizkulesi
    )
    var finlandMark = arrayOf(
        R.drawable.izmirsaatkulesi,
        R.drawable.kizkulesi
    )
    var franceMark = arrayOf(
        R.drawable.izmirsaatkulesi,
        R.drawable.kizkulesi
    )
    var croatiaMark = arrayOf(
        R.drawable.izmirsaatkulesi,
        R.drawable.kizkulesi
    )
    var hollandMark = arrayOf(
        R.drawable.izmirsaatkulesi,
        R.drawable.kizkulesi
    )
    var irlandMark = arrayOf(
        R.drawable.izmirsaatkulesi,
        R.drawable.kizkulesi
    )
    var spainMark = arrayOf(
        R.drawable.izmirsaatkulesi,
        R.drawable.kizkulesi
    )
    var swedenMark = arrayOf(
        R.drawable.izmirsaatkulesi,
        R.drawable.kizkulesi
    )
    var italyMark = arrayOf(
        R.drawable.izmirsaatkulesi,
        R.drawable.kizkulesi
    )
    var latviaMark = arrayOf(
        R.drawable.izmirsaatkulesi,
        R.drawable.kizkulesi
    )
    var wrapperMarkList = arrayOf(
        turkeyMark,
        azerbaijanMark,
        germanyMark,
        austriaMark,
        belgiumMark,
        bulgariaMark,
        czechsiaMark,
        denmarkMark,
        estoniaMark,
        finlandMark,
        franceMark,
        croatiaMark,
        hollandMark,
        irlandMark,
        spainMark,
        swedenMark,
        italyMark,
        latviaMark,
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMark {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolderMark(v, mlistener)
    }

    override fun onBindViewHolder(holder: ViewHolderMark, position: Int) {
        var markOfCountry = wrapperMarkList[positiony]
        val mark = markOfCountry[position]
        holder.markImageId.setBackgroundResource(mark)

    }

    override fun getItemCount(): Int {
        return wrapperMarkList.get(positiony).size
    }

    class ViewHolderMark(view: View, listener: RecyclerViewInterface) :
        RecyclerView.ViewHolder(view) {
        var markImageId: TextView = view.findViewById(R.id.markImageIdLayout)

        init {
            view.setOnClickListener {
                listener.onItemClick(bindingAdapterPosition)

            }
        }

    }

    override fun onItemClick(position: Int) {

    }
}