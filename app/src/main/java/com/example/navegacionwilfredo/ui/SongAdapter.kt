package com.example.navegacionwilfredo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.navegacionwilfredo.R

class SongAdapter(private val lstSong: List<SongModel>):
    RecyclerView.Adapter<SongAdapter.ViewHolder>(){

        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

            val tvId : TextView = itemView.findViewById(R.id.tvId)
            val ivSong: ImageView = itemView.findViewById(R.id.ivSong)
            val tvSonAlbum : TextView = itemView.findViewById(R.id.tvAlbum)
            val tvSongArtist : TextView = itemView.findViewById(R.id.tvSongArtist)
            val tvSongName: TextView = itemView.findViewById(R.id.tvSongName)
            val tvSongTime: TextView = itemView.findViewById(R.id.tvSongTime)



        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layautInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layautInflater.inflate(R.layout.item_musica, parent, false))
    }

    override fun getItemCount(): Int {
        return lstSong.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemSong = lstSong[position]
        holder.tvId.text = itemSong.id.toString()
        holder.ivSong.setImageResource(itemSong.image)
        holder.tvSonAlbum.text = itemSong.sonAlbum
        holder.tvSongArtist.text = itemSong.sonArtist
        holder.tvSongName.text = itemSong.songName
        holder.tvSongTime.text = itemSong.sonTime
    }
}