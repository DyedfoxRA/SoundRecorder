package com.dyedfox.soundrecorder.listeners;

public interface OnDatabaseChangedListener {
    void onNewDatabaseEntryAdded();
    void onDatabaseEntryRenamed();
}
