package org.example.utils;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

public class IniReader {

    private final Wini ini;

    public IniReader(String filePath)
    {
        try {
            ini = new Wini(new File(filePath));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readString(String section, String value)
    {
        return ini.get(section, value, String.class);
    }

    public int readInt(String section, String value)
    {
        return ini.get(section, value, int.class);
    }



}
