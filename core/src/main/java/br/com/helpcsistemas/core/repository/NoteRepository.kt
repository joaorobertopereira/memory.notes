package br.com.helpcsistemas.core.repository

import br.com.helpcsistemas.core.data.Note

interface NoteRepository {
    suspend fun add(note: Note)
    suspend fun update(note: Note)
    suspend fun delete(note: Note)
    suspend fun getAll(): List<Note>
    suspend fun getById(id: Long): Note?
}