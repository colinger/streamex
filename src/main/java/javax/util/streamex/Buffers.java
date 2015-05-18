package javax.util.streamex;

import java.util.Arrays;

/* package */ final class Buffers {
    static final int INITIAL_SIZE = 128;
    
    static final class ByteBuffer {
        int size = 0;
        byte[] data;
        
        ByteBuffer() {
            data = new byte[INITIAL_SIZE];
        }
        
        ByteBuffer(int size) {
            data = new byte[size];
        }
        
        void add(int n) {
            if(data.length == size) {
                byte[] newData = new byte[data.length*2];
                System.arraycopy(data, 0, newData, 0, size);
                data = newData;
            }
            data[size++] = (byte) n;
        }
        
        void addUnsafe(int n) {
            data[size++] = (byte) n;
        }
        
        void addAll(ByteBuffer buf) {
            if(data.length < buf.size+size) {
                byte[] newData = new byte[buf.size+size];
                System.arraycopy(data, 0, newData, 0, size);
                data = newData;
            }
            System.arraycopy(buf.data, 0, data, size, buf.size);
            size += buf.size;
        }
        
        byte[] toArray() {
            return data.length == size ? data : Arrays.copyOfRange(data, 0, size);
        }
    }
    
    static final class CharBuffer {
        int size = 0;
        char[] data;
        
        CharBuffer() {
            data = new char[INITIAL_SIZE];
        }
        
        CharBuffer(int size) {
            data = new char[size];
        }
        
        void add(int n) {
            if(data.length == size) {
                char[] newData = new char[data.length*2];
                System.arraycopy(data, 0, newData, 0, size);
                data = newData;
            }
            data[size++] = (char) n;
        }
        
        void addUnsafe(int n) {
            data[size++] = (char) n;
        }
        
        void addAll(CharBuffer buf) {
            if(data.length < buf.size+size) {
                char[] newData = new char[buf.size+size];
                System.arraycopy(data, 0, newData, 0, size);
                data = newData;
            }
            System.arraycopy(buf.data, 0, data, size, buf.size);
            size += buf.size;
        }
        
        char[] toArray() {
            return data.length == size ? data : Arrays.copyOfRange(data, 0, size);
        }
        
        @Override
        public String toString() {
            return new String(data, 0, size);
        }
    }
    
    static final class ShortBuffer {
        int size = 0;
        short[] data;
        
        ShortBuffer() {
            data = new short[INITIAL_SIZE];
        }
        
        ShortBuffer(int size) {
            data = new short[size];
        }
        
        void add(int n) {
            if(data.length == size) {
                short[] newData = new short[data.length*2];
                System.arraycopy(data, 0, newData, 0, size);
                data = newData;
            }
            data[size++] = (short) n;
        }
        
        void addUnsafe(int n) {
            data[size++] = (short) n;
        }
        
        void addAll(ShortBuffer buf) {
            if(data.length < buf.size+size) {
                short[] newData = new short[buf.size+size];
                System.arraycopy(data, 0, newData, 0, size);
                data = newData;
            }
            System.arraycopy(buf.data, 0, data, size, buf.size);
            size += buf.size;
        }
        
        short[] toArray() {
            return data.length == size ? data : Arrays.copyOfRange(data, 0, size);
        }
    }
    
    static final class FloatBuffer {
        int size = 0;
        float[] data;
        
        FloatBuffer() {
            data = new float[INITIAL_SIZE];
        }
        
        FloatBuffer(int size) {
            data = new float[size];
        }
        
        void add(double n) {
            if(data.length == size) {
                float[] newData = new float[data.length*2];
                System.arraycopy(data, 0, newData, 0, size);
                data = newData;
            }
            data[size++] = (float) n;
        }
        
        void addUnsafe(double n) {
            data[size++] = (float) n;
        }
        
        void addAll(FloatBuffer buf) {
            if(data.length < buf.size+size) {
                float[] newData = new float[buf.size+size];
                System.arraycopy(data, 0, newData, 0, size);
                data = newData;
            }
            System.arraycopy(buf.data, 0, data, size, buf.size);
            size += buf.size;
        }
        
        float[] toArray() {
            return data.length == size ? data : Arrays.copyOfRange(data, 0, size);
        }
    }
}