package com.roll.model;

import java.util.List;

import javax.swing.AbstractListModel;

public class DataModel extends AbstractListModel {
    private List<MusicModel> list;

    public DataModel(List<MusicModel> list) {
        this.list = list;
    }

    public MusicModel getElementAt(int index) {
        return list.get(index);
    }

    public int getSize() {
        return list.size();
    }
}