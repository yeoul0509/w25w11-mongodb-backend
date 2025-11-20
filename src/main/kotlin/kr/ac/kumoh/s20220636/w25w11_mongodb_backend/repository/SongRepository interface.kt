package kr.ac.kumoh.s20220636.w25w11_mongodb_backend.repository

import kr.ac.kumoh.s20220636.w25w11_mongodb_backend.model.Song
import org.springframework.data.mongodb.repository.MongoRepository

interface SongRepository : MongoRepository<Song, String> {

    fun findBysinger(singer: String): List<Song>
}