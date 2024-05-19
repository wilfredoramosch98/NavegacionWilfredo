package com.example.navegacionwilfredo.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.navegacionwilfredo.R
import com.example.navegacionwilfredo.databinding.FragmentSlideshowBinding
import com.example.navegacionwilfredo.ui.SongAdapter
import com.example.navegacionwilfredo.ui.SongModel

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_slideshow,container,false)

        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)

        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = SongAdapter(PlayList())

        return view
    }


    private fun PlayList(): List<SongModel>{
        val lstSon: ArrayList<SongModel> = ArrayList()

        lstSon.add(
            SongModel( 1
                ,R.drawable.imagen1
                ,"In the End"
                ,"likin Park"
                , "Album 1"
                ,"0"
                ,"4.23" )
        )

        lstSon.add(
            SongModel( 2
                ,R.drawable.imagen2
                ,"Somos iglesia"
                ,"Un corazon"
                , "Album 3"
                ,"2"
                ,"2.45" )
        )

        lstSon.add(
            SongModel( 3
                ,R.drawable.imagen3
                ,"Solo en casa"
                ,"Tu mami"
                , "Album 1"
                ,"0"
                ,"4.12" )
        )

        lstSon.add(
            SongModel( 4
                ,R.drawable.imagen4
                ,"the battle"
                ,"likin Park"
                , "Album 5"
                ,"0"
                ,"4.00" )
        )

        lstSon.add(
            SongModel( 5
                ,R.drawable.imgen5
                ,"Tus hojos"
                ,"lasso"
                , "Album 5"
                ,"0"
                ,"2.23" )
        )






        return lstSon
    }



}
