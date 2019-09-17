/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;
import java.util.concurrent.Semaphore;

import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import com.amazonaws.AbortedException;
import com.amazonaws.services.s3.OnFileDelete;
import com.amazonaws.services.s3.UploadObjectObserver;

/**
 * Used to split an output stream into multiple files for purposes such as
 * parallel uploads.
 */
public class MultiFileOutputStream extends OutputStream implements OnFileDelete {
    static final int DEFAULT_PART_SIZE = 5 << 20; // 5MB
    private final File root;
    private final String namePrefix;
    private int filesCreated;
    private long partSize = DEFAULT_PART_SIZE;
    private long diskLimit = Long.MAX_VALUE;
    private UploadObjectObserver observer;
    /**
     * Number of bytes that have been written to the current file.
     */
    private int currFileBytesWritten;
    /**
     * Total number of bytes written to all files so far.
     */
    private long totalBytesWritten;
    private FileOutputStream os;
    private boolean closed;

    /** null means no blocking necessary. */
    private Semaphore diskPermits;

    /**
     * Construct an instance to use the default temporary directory and temp
     * file naming convention. The
     * {@link #init(UploadObjectObserver, long, long)} must be called before
     * this stream is considered fully initialized.
     */
    public MultiFileOutputStream() {
        root = new File(System.getProperty("java.io.tmpdir"));
        namePrefix = yyMMdd_hhmmss() + "." + UUID.randomUUID();
    }

    /**
     * Construct an instance to use the specified directory for temp file
     * creations, and the specified prefix for temp file naming. The
     * {@link #init(UploadObjectObserver, long, long)} must be called before
     * this stream is considered fully initialized.
     */
    public MultiFileOutputStream(File root, String namePrefix) {
        if (root == null || !root.isDirectory() || !root.canWrite())
            throw new IllegalArgumentException(root
                    + " must be a writable directory");
        if (namePrefix == null || namePrefix.trim().length() == 0)
            throw new IllegalArgumentException(
                    "Please specify a non-empty name prefix");
        this.root = root;
        this.namePrefix = namePrefix;
    }

    /**
     * Used to initialized this stream. This method is an SPI (service provider
     * interface) that is called from <code>AmazonS3EncryptionClient</code>.
     * <p>
     * Implementation of this method should never block.
     * 
     * @param observer
     *            the upload object observer
     * @param partSize
     *            part size for multi-part upload
     * @param diskLimit
     *            the maximum disk space to be used for this multi-part upload
     * 
     * @return this object
     */
    public MultiFileOutputStream init(UploadObjectObserver observer,
            long partSize, long diskLimit) {
        if (observer == null)
            throw new IllegalArgumentException("Observer must be specified");
        this.observer = observer;
        if (diskLimit < partSize << 1) {
            throw new IllegalArgumentException(
                "Maximum temporary disk space must be at least twice as large as the part size: partSize="
                + partSize + ", diskSize=" + diskLimit);
        }
        this.partSize = partSize;
        this.diskLimit = diskLimit;
        final int max = (int)(diskLimit/partSize);
        this.diskPermits = max < 0 ? null : new Semaphore(max);
        return this;
    }

    /**
     * {@inheritDoc}
     * 
     * This method would block as necessary if running out of disk space.
     */
    @Override
    public void write(int b) throws IOException {
        fos().write(b);
        currFileBytesWritten++;
        totalBytesWritten++;
    }

    /**
     * {@inheritDoc}
     * 
     * This method would block as necessary if running out of disk space.
     */
    @Override
    public void write(byte[] b) throws IOException {
        if (b.length == 0)
            return;
        fos().write(b);
        currFileBytesWritten += b.length;
        totalBytesWritten += b.length;
    }

    /**
     * {@inheritDoc}
     * 
     * This method would block as necessary if running out of disk space.
     */
    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        if (b.length == 0)
            return;
        fos().write(b, off, len);
        currFileBytesWritten += len;
        totalBytesWritten += len;
    }

    /**
     * Returns the file output stream to be used for writing, blocking if
     * necessary if running out of disk space.
     * 
     * @throws InterruptedException if the running thread was interrupted
     */
    private FileOutputStream fos() throws IOException {
        if (closed)
            throw new IOException("Output stream is already closed");
        if (os == null || currFileBytesWritten >= partSize) {
            if (os != null) {
                os.close();
                // notify about the new file ready for processing
                observer.onPartCreate(new PartCreationEvent(
                        getFile(filesCreated), filesCreated, false, this));
            }
            currFileBytesWritten = 0;
            filesCreated++;
            blockIfNecessary();
            final File file = getFile(filesCreated);
            os = new FileOutputStream(file);
        }
        return os;
    }

    @Override
    public void onFileDelete(FileDeletionEvent event) {
        if (diskPermits != null)
            diskPermits.release();
    }

    /**
     * Blocks the running thread if running out of disk space.
     * 
     * @throws AbortedException
     *             if the running thread is interrupted while acquiring a
     *             semaphore
     */
    private void blockIfNecessary() {
        if (diskPermits == null || diskLimit == Long.MAX_VALUE)
            return;
        try {
            diskPermits.acquire();
        } catch (InterruptedException e) {
            // don't want to re-interrupt so it won't cause SDK stream to be
            // closed in case the thread is reused for a different request
            throw new AbortedException(e);
        }
    }

    @Override
    public void flush() throws IOException {
        if (os != null)
            os.flush();
    }

    @Override
    public void close() throws IOException {
        if (closed)
            return;
        closed = true;
        if (os != null) {
            os.close();
            File lastPart = getFile(filesCreated);
            if (lastPart.length() == 0) {
                if (!lastPart.delete()) {
                    LogFactory.getLog(getClass()).debug(
                            "Ignoring failure to delete empty file " + lastPart);
                }
            } else {
                // notify about the new file ready for processing
                observer.onPartCreate(new PartCreationEvent(
                        getFile(filesCreated), filesCreated, true, this));
            }
        }
    }

    public void cleanup() {
        for (int i=0; i < getNumFilesWritten(); i++) {
            File f = getFile(i);
            if (f.exists()) {
                if (!f.delete()) {
                    LogFactory.getLog(getClass()).debug(
                            "Ignoring failure to delete file " + f);
                }
            }
        }
    }

    /**
     * @return the number of files written with the specified prefix with the
     *         part number as the file extension.
     */
    public int getNumFilesWritten() {
        return filesCreated;
    }

    public File getFile(int partNumber) {
        return new File(root, namePrefix + "." + partNumber);
    }

    public long getPartSize() {
        return partSize;
    }

    public File getRoot() {
        return root;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public long getTotalBytesWritten() {
        return totalBytesWritten;
    }

    static String yyMMdd_hhmmss() {
        return DateTimeFormat.forPattern("yyMMdd-hhmmss").print(new DateTime());
    }

    public boolean isClosed() {
        return closed;
    }

    public long getDiskLimit() {
        return diskLimit;
    }
}
