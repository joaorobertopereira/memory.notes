package br.com.helpcsistemas.core.repository

import br.com.helpcsistemas.core.data.Note

class NoteRepositoryImpl(private val repository: NoteRepository) {

    suspend fun addNote(note: Note) {
        repository.add(note)
    }

    suspend fun updateNote(note: Note) {
        repository.update(note)
    }

    suspend fun deleteNote(note: Note) {
        repository.delete(note)
    }

    suspend fun getAllNotes(): List<Note> {
        return repository.getAll()
    }

    suspend fun getNoteById(id: Long): Note? {
        return repository.getById(id)
    }
}