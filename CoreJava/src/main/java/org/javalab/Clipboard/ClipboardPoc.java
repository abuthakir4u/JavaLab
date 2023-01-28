package org.javalab.Clipboard;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class ClipboardPoc {
    public static void main(String args[]) throws IOException, UnsupportedFlavorException {
        Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
        //Reading clipboard data as text
        String test = (String) c.getContents(null).getTransferData(DataFlavor.stringFlavor);
        System.out.println(test);

        //Reading clipboard data as html
        String test1 = (String) c.getContents(null).getTransferData(DataFlavor.allHtmlFlavor);
        System.out.println(test1);

    }
}
