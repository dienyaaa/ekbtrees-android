package ru.ekbtrees.treemap

data class ClusterTreesEntity(val count: Int, val coord: LatLonEntity)

data class TreeEntity(val id: String, val diameter: Float, val species: SpeciesEntity, val coord: LatLonEntity)

data class SpeciesEntity(val id: String, val color: String, val name: String)

data class LatLonEntity(val lat: Float, val lon: Float)

