package sk.project.thenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import sk.project.thenoteapp.ui.theme.BabyBlue
import sk.project.thenoteapp.ui.theme.LightGreen
import sk.project.thenoteapp.ui.theme.RedOrange
import sk.project.thenoteapp.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedOrange)
    }
}
