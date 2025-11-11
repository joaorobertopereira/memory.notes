package br.com.helpcsistemas.core.usecase

import br.com.helpcsistemas.core.data.Note
import br.com.helpcsistemas.core.repository.NoteRepositoryImpl

class RemoveNote(private val noteRepositoryImpl: NoteRepositoryImpl) {
    suspend operator fun invoke(note: Note) {
        noteRepositoryImpl.deleteNote(note)
    }
}