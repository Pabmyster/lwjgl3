/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.odbc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct SQL_DAY_SECOND_STRUCT {
 *     SQLUINTEGER day;
 *     SQLUINTEGER hour;
 *     SQLUINTEGER minute;
 *     SQLUINTEGER second;
 *     SQLUINTEGER fraction;
 * }</code></pre>
 */
public class SQL_DAY_SECOND_STRUCT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DAY,
        HOUR,
        MINUTE,
        SECOND,
        FRACTION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DAY = layout.offsetof(0);
        HOUR = layout.offsetof(1);
        MINUTE = layout.offsetof(2);
        SECOND = layout.offsetof(3);
        FRACTION = layout.offsetof(4);
    }

    SQL_DAY_SECOND_STRUCT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link SQL_DAY_SECOND_STRUCT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SQL_DAY_SECOND_STRUCT(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code day} field. */
    @NativeType("SQLUINTEGER")
    public int day() { return nday(address()); }
    /** Returns the value of the {@code hour} field. */
    @NativeType("SQLUINTEGER")
    public int hour() { return nhour(address()); }
    /** Returns the value of the {@code minute} field. */
    @NativeType("SQLUINTEGER")
    public int minute() { return nminute(address()); }
    /** Returns the value of the {@code second} field. */
    @NativeType("SQLUINTEGER")
    public int second() { return nsecond(address()); }
    /** Returns the value of the {@code fraction} field. */
    @NativeType("SQLUINTEGER")
    public int fraction() { return nfraction(address()); }

    /** Sets the specified value to the {@code day} field. */
    public SQL_DAY_SECOND_STRUCT day(@NativeType("SQLUINTEGER") int value) { nday(address(), value); return this; }
    /** Sets the specified value to the {@code hour} field. */
    public SQL_DAY_SECOND_STRUCT hour(@NativeType("SQLUINTEGER") int value) { nhour(address(), value); return this; }
    /** Sets the specified value to the {@code minute} field. */
    public SQL_DAY_SECOND_STRUCT minute(@NativeType("SQLUINTEGER") int value) { nminute(address(), value); return this; }
    /** Sets the specified value to the {@code second} field. */
    public SQL_DAY_SECOND_STRUCT second(@NativeType("SQLUINTEGER") int value) { nsecond(address(), value); return this; }
    /** Sets the specified value to the {@code fraction} field. */
    public SQL_DAY_SECOND_STRUCT fraction(@NativeType("SQLUINTEGER") int value) { nfraction(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SQL_DAY_SECOND_STRUCT set(
        int day,
        int hour,
        int minute,
        int second,
        int fraction
    ) {
        day(day);
        hour(hour);
        minute(minute);
        second(second);
        fraction(fraction);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SQL_DAY_SECOND_STRUCT set(SQL_DAY_SECOND_STRUCT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link SQL_DAY_SECOND_STRUCT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SQL_DAY_SECOND_STRUCT malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link SQL_DAY_SECOND_STRUCT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SQL_DAY_SECOND_STRUCT calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link SQL_DAY_SECOND_STRUCT} instance allocated with {@link BufferUtils}. */
    public static SQL_DAY_SECOND_STRUCT create() {
        return new SQL_DAY_SECOND_STRUCT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link SQL_DAY_SECOND_STRUCT} instance for the specified memory address. */
    public static SQL_DAY_SECOND_STRUCT create(long address) {
        return new SQL_DAY_SECOND_STRUCT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SQL_DAY_SECOND_STRUCT createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link SQL_DAY_SECOND_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_DAY_SECOND_STRUCT.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_DAY_SECOND_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_DAY_SECOND_STRUCT.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_DAY_SECOND_STRUCT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_DAY_SECOND_STRUCT.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link SQL_DAY_SECOND_STRUCT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SQL_DAY_SECOND_STRUCT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SQL_DAY_SECOND_STRUCT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link SQL_DAY_SECOND_STRUCT} instance allocated on the thread-local {@link MemoryStack}. */
    public static SQL_DAY_SECOND_STRUCT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link SQL_DAY_SECOND_STRUCT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static SQL_DAY_SECOND_STRUCT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link SQL_DAY_SECOND_STRUCT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_DAY_SECOND_STRUCT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_DAY_SECOND_STRUCT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_DAY_SECOND_STRUCT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_DAY_SECOND_STRUCT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_DAY_SECOND_STRUCT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SQL_DAY_SECOND_STRUCT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_DAY_SECOND_STRUCT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link SQL_DAY_SECOND_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_DAY_SECOND_STRUCT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_DAY_SECOND_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_DAY_SECOND_STRUCT.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #day}. */
    public static int nday(long struct) { return memGetInt(struct + SQL_DAY_SECOND_STRUCT.DAY); }
    /** Unsafe version of {@link #hour}. */
    public static int nhour(long struct) { return memGetInt(struct + SQL_DAY_SECOND_STRUCT.HOUR); }
    /** Unsafe version of {@link #minute}. */
    public static int nminute(long struct) { return memGetInt(struct + SQL_DAY_SECOND_STRUCT.MINUTE); }
    /** Unsafe version of {@link #second}. */
    public static int nsecond(long struct) { return memGetInt(struct + SQL_DAY_SECOND_STRUCT.SECOND); }
    /** Unsafe version of {@link #fraction}. */
    public static int nfraction(long struct) { return memGetInt(struct + SQL_DAY_SECOND_STRUCT.FRACTION); }

    /** Unsafe version of {@link #day(int) day}. */
    public static void nday(long struct, int value) { memPutInt(struct + SQL_DAY_SECOND_STRUCT.DAY, value); }
    /** Unsafe version of {@link #hour(int) hour}. */
    public static void nhour(long struct, int value) { memPutInt(struct + SQL_DAY_SECOND_STRUCT.HOUR, value); }
    /** Unsafe version of {@link #minute(int) minute}. */
    public static void nminute(long struct, int value) { memPutInt(struct + SQL_DAY_SECOND_STRUCT.MINUTE, value); }
    /** Unsafe version of {@link #second(int) second}. */
    public static void nsecond(long struct, int value) { memPutInt(struct + SQL_DAY_SECOND_STRUCT.SECOND, value); }
    /** Unsafe version of {@link #fraction(int) fraction}. */
    public static void nfraction(long struct, int value) { memPutInt(struct + SQL_DAY_SECOND_STRUCT.FRACTION, value); }

    // -----------------------------------

    /** An array of {@link SQL_DAY_SECOND_STRUCT} structs. */
    public static class Buffer extends StructBuffer<SQL_DAY_SECOND_STRUCT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link SQL_DAY_SECOND_STRUCT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SQL_DAY_SECOND_STRUCT#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected SQL_DAY_SECOND_STRUCT newInstance(long address) {
            return new SQL_DAY_SECOND_STRUCT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code day} field. */
        @NativeType("SQLUINTEGER")
        public int day() { return SQL_DAY_SECOND_STRUCT.nday(address()); }
        /** Returns the value of the {@code hour} field. */
        @NativeType("SQLUINTEGER")
        public int hour() { return SQL_DAY_SECOND_STRUCT.nhour(address()); }
        /** Returns the value of the {@code minute} field. */
        @NativeType("SQLUINTEGER")
        public int minute() { return SQL_DAY_SECOND_STRUCT.nminute(address()); }
        /** Returns the value of the {@code second} field. */
        @NativeType("SQLUINTEGER")
        public int second() { return SQL_DAY_SECOND_STRUCT.nsecond(address()); }
        /** Returns the value of the {@code fraction} field. */
        @NativeType("SQLUINTEGER")
        public int fraction() { return SQL_DAY_SECOND_STRUCT.nfraction(address()); }

        /** Sets the specified value to the {@code day} field. */
        public SQL_DAY_SECOND_STRUCT.Buffer day(@NativeType("SQLUINTEGER") int value) { SQL_DAY_SECOND_STRUCT.nday(address(), value); return this; }
        /** Sets the specified value to the {@code hour} field. */
        public SQL_DAY_SECOND_STRUCT.Buffer hour(@NativeType("SQLUINTEGER") int value) { SQL_DAY_SECOND_STRUCT.nhour(address(), value); return this; }
        /** Sets the specified value to the {@code minute} field. */
        public SQL_DAY_SECOND_STRUCT.Buffer minute(@NativeType("SQLUINTEGER") int value) { SQL_DAY_SECOND_STRUCT.nminute(address(), value); return this; }
        /** Sets the specified value to the {@code second} field. */
        public SQL_DAY_SECOND_STRUCT.Buffer second(@NativeType("SQLUINTEGER") int value) { SQL_DAY_SECOND_STRUCT.nsecond(address(), value); return this; }
        /** Sets the specified value to the {@code fraction} field. */
        public SQL_DAY_SECOND_STRUCT.Buffer fraction(@NativeType("SQLUINTEGER") int value) { SQL_DAY_SECOND_STRUCT.nfraction(address(), value); return this; }

    }

}