/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.NotThreadSafe;

/**
 * A mark-and-resettable input stream that can be used on files or file input
 * streams.
 * 
 * In particular, a {@link ResettableInputStream} allows the close operation to
 * be disabled via {@link #disableClose()} (to avoid accidentally being closed).
 * This is necessary when such input stream needs to be marked-and-reset
 * multiple times but only as long as the stream has not been closed.
 * <p>
 * The creator of this input stream should therefore always call
 * {@link #release()} in a finally block to truly release the underlying
 * resources.
 * 
 * @see Releasable
 */
@NotThreadSafe
public class ResettableInputStream extends ReleasableInputStream {
    private static final Log log = LogFactory
            .getLog(ResettableInputStream.class);
    private final File file; // null if the file is not known
    private FileInputStream fis; // never null
    private FileChannel fileChannel; // never null
    /**
     * Marked position of the file; default to zero.
     */
    private long markPos;

    /**
     * @param file
     *            must not be null. Upon successful construction the the file
     *            will be opened with an input stream automatically marked at
     *            the starting position of the given file.
     *            <p>
     *            Note the creation of a {@link ResettableInputStream} would
     *            entail physically opening a file. If the opened file is meant
     *            to be closed only (in a finally block) by the very same code
     *            block that created it, then it is necessary that the release
     *            method must not be called while the execution is made in other
     *            stack frames.
     * 
     *            In such case, as other stack frames may inadvertently or
     *            indirectly call the close method of the stream, the creator of
     *            the stream would need to explicitly disable the accidental
     *            closing via {@link ResettableInputStream#disableClose()}, so
     *            that the release method becomes the only way to truly close
     *            the opened file.
     */
    public ResettableInputStream(File file) throws IOException {
        this(new FileInputStream(file), file);
    }

    /**
     * @param fis
     *            file input stream; must not be null. Upon successful
     *            construction the input stream will be automatically marked at
     *            the current position of the given file input stream.
     * <p>
     * Note the creation of a {@link ResettableInputStream} would entail
     * physically opening a file. If the opened file is meant to be closed only
     * (in a finally block) by the very same code block that created it, then it
     * is necessary that the release method must not be called while the
     * execution is made in other stack frames.
     * 
     * In such case, as other stack frames may inadvertently or indirectly call
     * the close method of the stream, the creator of the stream would need to
     * explicitly disable the accidental closing via
     * {@link ResettableInputStream#disableClose()}, so that the release method
     * becomes the only way to truly close the opened file.
     */
    public ResettableInputStream(FileInputStream fis) throws IOException {
        this(fis, null);
    }

    /**
     * @param file
     *            can be null if not known
     */
    private ResettableInputStream(FileInputStream fis, File file) throws IOException {
        super(fis);
        this.file = file;
        this.fis = fis;
        this.fileChannel = fis.getChannel();
        this.markPos = fileChannel.position();
    }

    @Override
    public final boolean markSupported() {
        return true;
    }

    /**
     * Marks the current position in this input stream. A subsequent call to
     * the <code>reset</code> method repositions this stream at the last marked
     * position so that subsequent reads re-read the same bytes.
     * This method works as long as the underlying file has not been closed.
     * <p>
     * Note the creation of a {@link ResettableInputStream} would entail
     * physically opening a file. If the opened file is meant to be closed only
     * (in a finally block) by the very same code block that created it, then it
     * is necessary that the release method must not be called while the
     * execution is made in other stack frames.
     * 
     * In such case, as other stack frames may inadvertently or indirectly call
     * the close method of the stream, the creator of the stream would need to
     * explicitly disable the accidental closing via
     * {@link ResettableInputStream#disableClose()}, so that the release method
     * becomes the only way to truly close the opened file.
     * 
     * @param _
     *            ignored
     */
    @Override
    public void mark(int _) {
        abortIfNeeded();
        try {
            markPos = fileChannel.position();
        } catch (IOException e) {
            throw new SdkClientException("Failed to mark the file position", e);
        }
        if (log.isTraceEnabled())
            log.trace("File input stream marked at position " + markPos);
    }

    /**
     * Repositions this stream to the position at the time the
     * <code>mark</code> method was last called on this input stream.
     * This method works as long as the underlying file has not been closed.
     * <p>
     * Note the creation of a {@link ResettableInputStream} would entail
     * physically opening a file. If the opened file is meant to be closed only
     * (in a finally block) by the very same code block that created it, then it
     * is necessary that the release method must not be called while the
     * execution is made in other stack frames.
     * 
     * In such case, as other stack frames may inadvertently or indirectly call
     * the close method of the stream, the creator of the stream would need to
     * explicitly disable the accidental closing via
     * {@link ResettableInputStream#disableClose()}, so that the release method
     * becomes the only way to truly close the opened file.
     */
    @Override
    public void reset() throws IOException {
        abortIfNeeded();
        fileChannel.position(markPos);
        if (log.isTraceEnabled())
            log.trace("Reset to position " + markPos);
    }

    @Override
    public int available() throws IOException {
        abortIfNeeded();
        return fis.available();
    }

    @Override
    public int read() throws IOException {
        abortIfNeeded();
        return fis.read();
    }

    @Override
    public long skip(long n) throws IOException {
        abortIfNeeded();
        return fis.skip(n);
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        abortIfNeeded();
        return fis.read(arg0, arg1, arg2);
    }

    /**
     * Returns the underlying file, if known; or null if not;
     */
    public File getFile() {
        return file;
    }

    /**
     * Convenient factory method to construct a new resettable input stream for
     * the given file, converting any IOException into SdkClientException.
     * <p>
     * Note the creation of a {@link ResettableInputStream} would entail
     * physically opening a file. If the opened file is meant to be closed only
     * (in a finally block) by the very same code block that created it, then it
     * is necessary that the release method must not be called while the
     * execution is made in other stack frames.
     * 
     * In such case, as other stack frames may inadvertently or indirectly call
     * the close method of the stream, the creator of the stream would need to
     * explicitly disable the accidental closing via
     * {@link ResettableInputStream#disableClose()}, so that the release method
     * becomes the only way to truly close the opened file.
     */
    public static ResettableInputStream newResettableInputStream(File file) {
        return newResettableInputStream(file, null);
    }

    /**
     * Convenient factory method to construct a new resettable input stream for
     * the given file, converting any IOException into SdkClientException
     * with the given error message.
     * <p>
     * Note the creation of a {@link ResettableInputStream} would entail
     * physically opening a file. If the opened file is meant to be closed only
     * (in a finally block) by the very same code block that created it, then it
     * is necessary that the release method must not be called while the
     * execution is made in other stack frames.
     * 
     * In such case, as other stack frames may inadvertently or indirectly call
     * the close method of the stream, the creator of the stream would need to
     * explicitly disable the accidental closing via
     * {@link ResettableInputStream#disableClose()}, so that the release method
     * becomes the only way to truly close the opened file.
     */
    public static ResettableInputStream newResettableInputStream(File file,
            String errmsg) {
        try {
            return new ResettableInputStream(file);
        } catch (IOException e) {
            throw errmsg == null
                ? new SdkClientException(e)
                : new SdkClientException(errmsg, e);
        }
    }

    /**
     * Convenient factory method to construct a new resettable input stream for
     * the given file input stream, converting any IOException into
     * SdkClientException.
     * <p>
     * Note the creation of a {@link ResettableInputStream} would entail
     * physically opening a file. If the opened file is meant to be closed only
     * (in a finally block) by the very same code block that created it, then it
     * is necessary that the release method must not be called while the
     * execution is made in other stack frames.
     * 
     * In such case, as other stack frames may inadvertently or indirectly call
     * the close method of the stream, the creator of the stream would need to
     * explicitly disable the accidental closing via
     * {@link ResettableInputStream#disableClose()}, so that the release method
     * becomes the only way to truly close the opened file.
     */
    public static ResettableInputStream newResettableInputStream(
            FileInputStream fis) {
        return newResettableInputStream(fis, null);
    }

    /**
     * Convenient factory method to construct a new resettable input stream for
     * the given file input stream, converting any IOException into
     * SdkClientException with the given error message.
     * <p>
     * Note the creation of a {@link ResettableInputStream} would entail
     * physically opening a file. If the opened file is meant to be closed only
     * (in a finally block) by the very same code block that created it, then it
     * is necessary that the release method must not be called while the
     * execution is made in other stack frames.
     * 
     * In such case, as other stack frames may inadvertently or indirectly call
     * the close method of the stream, the creator of the stream would need to
     * explicitly disable the accidental closing via
     * {@link ResettableInputStream#disableClose()}, so that the release method
     * becomes the only way to truly close the opened file.
     */
    public static ResettableInputStream newResettableInputStream(
            FileInputStream fis, String errmsg) {
        try {
            return new ResettableInputStream(fis);
        } catch (IOException e) {
            throw new SdkClientException(errmsg, e);
        }
    }
}
