package com.example.note_app;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity( tableName = "tbl_note")
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String desc;

    public Note(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
