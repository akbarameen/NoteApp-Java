package com.example.note_app;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import java.util.List;

public class NoteViewModel extends AndroidViewModel {
    LiveData<List<Note>> noteList;
    NoteRepo noteRepo;
    public NoteViewModel(@NonNull Application application) {
        super(application);
        noteRepo = new NoteRepo(application);
        noteList = noteRepo.getAllNotes();
    }

    public void insert(Note note){
        noteRepo.insertData(note);
    }
    public void update(Note note){
        noteRepo.updateData(note);
    }
    public void delete(Note note){
        noteRepo.deleteData(note);
    }

    public LiveData<List<Note>> getAllNotes(){
        return noteList;
    }



}
