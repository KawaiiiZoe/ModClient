package net.bytestudio.editor;

import javafx.scene.Node;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ModConfigReader {

    private final String resourcePath;
    private final String[] rawText;

    public ModConfigReader(String resourcePath) {
        this.resourcePath = resourcePath;
        this.rawText = createRawText();
    }

    private String[] createRawText() {
        try {
            File file;
            URL fileURI = ModConfigReader.class.getResource(resourcePath); //Todo: change this to get a file from extern file system!
            assert fileURI != null;
            file = new File(fileURI.toURI());
            System.out.println("file loaded -> " + file.getName());

            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = null;
                List<String> list = new ArrayList<>();
                while ((line = reader.readLine()) != null) {
                    list.add(line);
                }
                String[] result = new String[list.size()];
                for(int i = 0; i < list.size(); i++) {
                    result[i] = list.get(i);
                }
                reader.close();
                return result;
            } catch (IOException exception) {
                exception.printStackTrace();
                return null;
            }
        } catch (URISyntaxException exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public void printRawText() {
        if(rawText != null) {
            for (String s : rawText) {
                System.out.println(s);
            }
        } else {
            System.out.println("Nothing to print!");
        }
    }

    public void create(Node displayArea) {

    }

    public String[] getRawText() {
        return rawText;
    }
}
