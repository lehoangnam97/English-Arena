package com.example.a15520.newdictionary_ver2;


import android.support.annotation.NonNull;

/**
 * Created by LÊHOÀNGNAM on 30-12-17.
 */


public  class Endpoint {
    @NonNull
    private final String id;
    @NonNull private final String name;

    public Endpoint(@NonNull String id, @NonNull String name) {
        this.id = id;
        this.name = name;
    }

    @NonNull
    public String getId() {
        return id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Endpoint) {
            Endpoint other = (Endpoint) obj;
            return id.equals(other.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return String.format(" Endpoint: id=%s - name=%s .", id, name);
    }
}

