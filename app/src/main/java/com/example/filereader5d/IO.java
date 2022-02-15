package com.example.filereader5d;

import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO
{
    public static String readFile(String s)
    {
        try
        {
            FileReader in = new FileReader(s);
        }
        catch (FileNotFoundException e)
        {
            Log.i("ReadOP", e.getMessage());
        }

        return s;
    }

    public static void writeToFile(String s, Context context)
    {
        try
        {
            FileWriter out = new FileWriter(new File(context.getFilesDir(), "backup"));
            Log.i("PathToFile", context.getFilesDir().getAbsolutePath());
            out.write(s);
            out.close();
        }
        catch (IOException e)
        {
            Log.i("WriteOP", e.getMessage());
        }
    }
}
