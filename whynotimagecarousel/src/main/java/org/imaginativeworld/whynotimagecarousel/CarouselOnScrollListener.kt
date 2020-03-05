package org.imaginativeworld.whynotimagecarousel

import androidx.recyclerview.widget.RecyclerView

interface CarouselOnScrollListener {

    fun onScrollStateChanged(
        recyclerView: RecyclerView,
        newState: Int,
        position: Int
    )

    fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int)

}