package br.com.helpcsistemas.core.usecase

import br.com.helpcsistemas.core.data.Note
import br.com.helpcsistemas.core.repository.NoteRepositoryImpl

class GetAllNotes(private val noteRepositoryImpl: NoteRepositoryImpl) {
    suspend operator fun invoke(): List<Note> {
        return noteRepositoryImpl.getAllNotes()
    }
}