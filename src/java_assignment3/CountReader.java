package java_assignment3;


import java.io.*;

public class CountReader extends FilterReader {

    private int count = 0;
    private char a = 0;

    public CountReader(Reader in, char a) {
        super(in);
        this.a = a;
    }
    public int read() throws IOException {
        int character = super.read();
        if ((char)character == a) {
            count++;
        }
	return character;
    }
    public int read(char[] cbuf) throws IOException {
        int numChars = super.read(cbuf);
        int length = cbuf.length;
        for (int i = 0; i < length; i++) {
            if (cbuf[i] == a) {
                count++;
            }
        }
	return numChars;
    }
    public int read(char[] cbuf, int off, int len) throws IOException {
        int numChars = super.read(cbuf, off, len);
        int length = cbuf.length;
        for (int i = 0; i < length; i++) {
            if (cbuf[i] == a) {
                count++;
            }
        }
	return numChars;
    }
    public void reset() throws IOException {
        super.reset();
        count = 0;
    }
    public boolean markSupported() {
        return false;
    }
    public void mark(int readAheadLimit) throws IOException {
        throw new IOException("CountReader does not support the mark() operation.");
    }
    public int getCount() {
        return count;
    }
}