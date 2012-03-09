/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.transfer;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.model.ProgressListener;
import com.amazonaws.services.s3.transfer.internal.ProgressListenerChain;
import com.amazonaws.services.s3.transfer.internal.TransferMonitor;

/**
 * Represents an asynchronous upload to or download from Amazon S3.
 * Use this class to check a tranfer's progress,
 * add listeners for progress events,
 * check the state of a transfer,
 * or wait for the transfer to complete.
 * <p>
 * See {@link TransferManager} for more information about creating transfers.
 *
 * @see TransferManager#upload(String, String, java.io.File)
 * @see TransferManager#upload(com.amazonaws.services.s3.model.PutObjectRequest)
 */
public abstract class Transfer {

    /**
     * Enumeration of the possible transfer states.
     */
    public static enum TransferState {
        /** The transfer is waiting for resources to execute and has not started yet. */
        Waiting,

        /** The transfer is actively uploading or downloading and hasn't finished yet. */
        InProgress,

        /** The transfer completed successfully. */
        Completed,

        /** The transfer was canceled and did not complete successfully. */
        Canceled,

        /** The transfer failed. */
        Failed;
    }

    /** The current state of this transfer. */
    protected volatile TransferState state = TransferState.Waiting;

    protected TransferMonitor monitor;

    /** The progress of this transfer. */
    private final TransferProgress transferProgress;

    private final String description;

    /** Hook for adding/removing more progress listeners. */
    protected ProgressListenerChain progressListenerChain;

    Transfer(String description, TransferProgress transferProgress, ProgressListenerChain progressListenerChain) {
        this.description = description;
        this.progressListenerChain = progressListenerChain;
        this.transferProgress = transferProgress;
    }

    /**
     * Returns whether or not the transfer is finished (i.e. completed successfully,
     * failed, or was canceled).
     *
     * @return Returns <code>true</code> if this transfer is finished (i.e. completed successfully,
     *         failed, or was canceled).  Returns <code>false</code> if otherwise.
     */
    public synchronized boolean isDone() {
        return (state == TransferState.Failed ||
                state == TransferState.Completed ||
                state == TransferState.Canceled);
    }

    /**
     * Waits for this transfer to complete. This is a blocking call; the current
     * thread is suspended until this transfer completes.
     *
     * @throws AmazonClientException
     *             If any errors were encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     * @throws InterruptedException
     *             If this thread is interrupted while waiting for the transfer
     *             to complete.
     */
    public void waitForCompletion()
            throws AmazonClientException, AmazonServiceException, InterruptedException {
        try {
            Object result = null;
            while (!monitor.isDone() || result == null) {
                Future<?> f = monitor.getFuture();
                result = f.get();
            }
        } catch (ExecutionException e) {
            rethrowExecutionException(e);
        }
    }

    /**
     * Waits for this transfer to finish and returns any error that occurred, or
     * returns <code>null</code> if no errors occurred.
     * This is a blocking call; the current thread
     * will be suspended until this transfer either fails or completes
     * successfully.
     *
     * @return Any error that occurred while processing this transfer.
     * 		   Otherwise returns <code>null</code> if no errors occurred.
     *
     * @throws InterruptedException
     *             If this thread is interrupted while waiting for the transfer
     *             to complete.
     */
    public AmazonClientException waitForException() throws InterruptedException {
        try {

            while (!monitor.isDone()) {
                monitor.getFuture().get();
            }
            monitor.getFuture().get();
            return null;
        } catch (ExecutionException e) {
            return unwrapExecutionException(e);
        }
    }

    /**
     * Returns a human-readable description of this transfer.
     *
     * @return A human-readable description of this transfer.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the current state of this transfer.
     *
     * @return The current state of this transfer.
     */
    public synchronized TransferState getState() {
        return state;
    }

    /**
     * Adds the specified progress listener to the list of listeners
     * receiving updates about this transfer's progress.
     *
     * @param listener
     *            The progress listener to add.
     */
    public synchronized void addProgressListener(ProgressListener listener) {
        progressListenerChain.addProgressListener(listener);
    }

    /**
     * Removes the specified progress listener from the list of progress
     * listeners receiving updates about this transfer's progress.
     *
     * @param listener
     *            The progress listener to remove.
     */
    public synchronized void removeProgressListener(ProgressListener listener) {
        progressListenerChain.removeProgressListener(listener);
    }

    /**
     * Returns progress information about this transfer.
     *
     * @return The progress information about this transfer.
     */
    public TransferProgress getProgress() {
        return transferProgress;
    }


    /*
     * Non-Public Interface
     */

    /**
     * Examines the cause of the specified ExecutionException and either
     * rethrows it directly (if it's a type of AmazonClientException) or wraps
     * it in an AmazonClientException and rethrows it.
     *
     * @param e
     *            The execution exception to examine.
     */
    protected void rethrowExecutionException(ExecutionException e) {
        throw unwrapExecutionException(e);
    }

    /**
     * Unwraps the root exception that caused the specified ExecutionException
     * and returns it. If it was not an instance of AmazonClientException, it is
     * wrapped as an AmazonClientException.
     *
     * @param e
     *            The ExecutionException to unwrap.
     *
     * @return The root exception that caused the specified ExecutionException.
     */
    protected AmazonClientException unwrapExecutionException(ExecutionException e) {
        Throwable t = e.getCause();
        if (t instanceof AmazonClientException) return (AmazonClientException)t;
        return new AmazonClientException("Unable to complete transfer: " + t.getMessage(), t);
    }

}
