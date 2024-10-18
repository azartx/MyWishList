package com.solo4.mywishlist

interface Destination<MODEL> {

    fun navigate(destinationModel: MODEL?)
}