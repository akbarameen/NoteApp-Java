package com.example.note_app;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity( tableName = "tbl_note")
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String Title;
    private String Desc;

    public Note(String title, String desc) {
        Title = title;
        Desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
