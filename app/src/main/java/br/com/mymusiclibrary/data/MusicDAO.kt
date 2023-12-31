package br.com.mymusiclibrary.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MusicDAO {

    @Query("SELECT * FROM musicTable")
    fun selectAll(): List<MusicModel>

    @Query("SELECT * FROM musicTable WHERE favorite == :isFavorite")
    fun selectBy(isFavorite: Boolean): List<MusicModel>

    @Insert
    fun insert(model: MusicModel)

}