package sk.project.thenoteapp.feature_note.presentation.notes

import sk.project.thenoteapp.feature_note.domain.model.Note
import sk.project.thenoteapp.feature_note.domain.util.NoteOrder
import sk.project.thenoteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSelectionVisible: Boolean = false
)
