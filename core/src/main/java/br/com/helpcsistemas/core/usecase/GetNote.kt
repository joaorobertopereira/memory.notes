package br.com.helpcsistemas.core.usecase

import br.com.helpcsistemas.core.data.Note
import br.com.helpcsistemas.core.repository.NoteRepositoryImpl

class GetNote(private val noteRepositoryImpl: NoteRepositoryImpl) {
    suspend operator fun invoke(id: Long): Note? {
        return noteRepositoryImpl.getNoteById(id)
    }
}