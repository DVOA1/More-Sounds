package dev.dvoa.moresounds.utils;

import dev.dvoa.moresounds.datagen.codecs.SoundAction;

public class SoundActionHolder{
    private final String fileName;
    private final SoundAction soundAction;
    private final String soundType;

    public SoundActionHolder(String fileName, SoundAction soundAction, String soundType){
        this.fileName = fileName;
        this.soundAction = soundAction;
        this.soundType = soundType;
    }

    public SoundAction getSoundAction() {
        return soundAction;
    }

    public String getFileName() {
        return fileName;
    }

    public String getSoundType() {
        return soundType;
    }

    public String toString() {
        return fileName + ":" + soundAction.toString();
    }
}
