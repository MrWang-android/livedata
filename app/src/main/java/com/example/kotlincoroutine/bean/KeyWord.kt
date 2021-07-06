package com.example.kotlincoroutine.bean

 data class KeyWord(
    val Reason: String,
    val Result: Result,
    val StateCode: Int
)

data class Result(
    val Ranks: List<Rank>,
    val SiteCount: Int
)

data class Rank(
    val RankStr: String,
    val Title: String,
    val Url: String,
    val XiongzhangID: String
)