/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs.buffered;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.BatchResultErrorEntry;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequestEntry;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResultEntry;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult;
import com.amazonaws.services.sqs.model.DeleteMessageBatchRequest;
import com.amazonaws.services.sqs.model.DeleteMessageBatchRequestEntry;
import com.amazonaws.services.sqs.model.DeleteMessageBatchResult;
import com.amazonaws.services.sqs.model.DeleteMessageBatchResultEntry;
import com.amazonaws.services.sqs.model.DeleteMessageRequest;
import com.amazonaws.services.sqs.model.DeleteMessageResult;
import com.amazonaws.services.sqs.model.SendMessageBatchRequest;
import com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry;
import com.amazonaws.services.sqs.model.SendMessageBatchResult;
import com.amazonaws.services.sqs.model.SendMessageBatchResultEntry;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;
import com.amazonaws.services.sqs.internal.RequestCopyUtils;

/**
 * This class is responsible for buffering outgoing SQS requests, i.e. requests to send a message,
 * delete a message and change the visibility of the message. <br>
 * When a request arrives, the buffer adds the message to a message batch of an appropriate type
 * (creating such a batch if there currently isn't one outstanding). When the outstanding batch
 * becomes full, or when a configurable timeout expires, the buffer makes a call to SQS to execute
 * the current batch. <br>
 * Internally, the batch objects maintain a list of futures corresponding to the requests added to
 * them. When a batch completes, it loads the results into the futures and marks the futures as
 * complete.
 */
public class SendQueueBuffer {
    private static Log log = LogFactory.getLog(SendQueueBuffer.class);

    // Interface to support event notifications with a parameter.
    private interface Listener<T> {
        void invoke(T o);
    };

    /** Config settings for this buffer */
    private final QueueBufferConfig config;

    /** Url of our queue */
    private final String qUrl;

    /**
     * The {@code AmazonSQS} client to use for this buffer's operations.
     */
    private final AmazonSQS sqsClient;

    /**
     * The executor service for the batching tasks.
     */
    private final Executor executor;

    /**
     * Object used to serialize sendMessage calls.
     */
    private final Object sendMessageLock = new Object();

    /**
     * Object used to serialize deleteMessage calls.
     */
    private final Object deleteMessageLock = new Object();

    /**
     * Object used to serialize changeMessageVisibility calls.
     */
    private final Object changeMessageVisibilityLock = new Object();

    /**
     * Current batching task for sendMessage. Using a size 1 array to allow "passing by reference".
     * Synchronized by {@code sendMessageLock}.
     */
    private final SendMessageBatchTask[] openSendMessageBatchTask = new SendMessageBatchTask[1];

    /**
     * Current batching task for deleteMessage. Using a size 1 array to allow
     * "passing by reference". Synchronized by {@code deleteMessageLock}.
     */
    private final DeleteMessageBatchTask[] openDeleteMessageBatchTask = new DeleteMessageBatchTask[1];

    /**
     * Current batching task for changeMessageVisibility. Using a size 1 array to allow
     * "passing by reference". Synchronized by {@code changeMessageVisibilityLock}.
     */
    private final ChangeMessageVisibilityBatchTask[] openChangeMessageVisibilityBatchTask = new ChangeMessageVisibilityBatchTask[1];

    /**
     * Permits controlling the number of in flight SendMessage batches.
     */
    private final Semaphore inflightSendMessageBatches;

    /**
     * Permits controlling the number of in flight DeleteMessage batches.
     */
    private final Semaphore inflightDeleteMessageBatches;

    /**
     * Permits controlling the number of in flight ChangeMessageVisibility batches.
     */
    private final Semaphore inflightChangeMessageVisibilityBatches;

    SendQueueBuffer(AmazonSQS sqsClient, Executor executor, QueueBufferConfig paramConfig, String url) {
        this.sqsClient = sqsClient;
        this.executor = executor;
        this.config = paramConfig;
        qUrl = url;
        int maxBatch = config.getMaxInflightOutboundBatches();

        // must allow at least one outbound batch.
        maxBatch = maxBatch > 0 ? maxBatch : 1;
        this.inflightSendMessageBatches = new Semaphore(maxBatch);
        this.inflightDeleteMessageBatches = new Semaphore(maxBatch);
        this.inflightChangeMessageVisibilityBatches = new Semaphore(maxBatch);
    }

    public QueueBufferConfig getConfig() {
        return config;
    }

    /**
     * @return never null
     */
    public QueueBufferFuture<SendMessageRequest, SendMessageResult> sendMessage(SendMessageRequest request,
                                                                                QueueBufferCallback<SendMessageRequest, SendMessageResult> callback) {
        QueueBufferFuture<SendMessageRequest, SendMessageResult> result = submitOutboundRequest(sendMessageLock,
                openSendMessageBatchTask, request, inflightSendMessageBatches, callback);
        return result;
    }

    /**
     * @return never null
     */
    public QueueBufferFuture<DeleteMessageRequest, DeleteMessageResult> deleteMessage(DeleteMessageRequest request,
                                                                       QueueBufferCallback<DeleteMessageRequest, DeleteMessageResult> callback) {
        return submitOutboundRequest(deleteMessageLock, openDeleteMessageBatchTask, request,
                inflightDeleteMessageBatches, callback);
    }

    /**
     * @return never null
     */
    public QueueBufferFuture<ChangeMessageVisibilityRequest, ChangeMessageVisibilityResult> changeMessageVisibility(ChangeMessageVisibilityRequest request,
                                                                                           QueueBufferCallback<ChangeMessageVisibilityRequest, ChangeMessageVisibilityResult> callback) {
        return submitOutboundRequest(changeMessageVisibilityLock, openChangeMessageVisibilityBatchTask, request,
                inflightChangeMessageVisibilityBatches, callback);
    }

    /**
     * @return new {@code OutboundBatchTask} of appropriate type, never null
     */
    @SuppressWarnings("unchecked")
    private <R extends AmazonWebServiceRequest, Result> OutboundBatchTask<R, Result> newOutboundBatchTask(R request) {

        if (request instanceof SendMessageRequest)
            return (OutboundBatchTask<R, Result>) new SendMessageBatchTask();
        else if (request instanceof DeleteMessageRequest)
            return (OutboundBatchTask<R, Result>) new DeleteMessageBatchTask();
        else if (request instanceof ChangeMessageVisibilityRequest)
            return (OutboundBatchTask<R, Result>) new ChangeMessageVisibilityBatchTask();
        else
            // this should never happen
            throw new IllegalArgumentException("Unsupported request type " + request.getClass().getName());
    }

    /**
     * Flushes all outstanding outbound requests ({@code SendMessage}, {@code DeleteMessage},
     * {@code ChangeMessageVisibility}) in this buffer.
     * <p>
     * The call returns successfully when all outstanding outbound requests submitted before the
     * call are completed (i.e. processed by SQS).
     */
    public void flush() {

        try {
            synchronized (sendMessageLock) {
                inflightSendMessageBatches.acquire(config.getMaxInflightOutboundBatches());
                inflightSendMessageBatches.release(config.getMaxInflightOutboundBatches());
            }
            synchronized (deleteMessageLock) {
                inflightDeleteMessageBatches.acquire(config.getMaxInflightOutboundBatches());
                inflightDeleteMessageBatches.release(config.getMaxInflightOutboundBatches());
            }
            synchronized (changeMessageVisibilityLock) {
                inflightChangeMessageVisibilityBatches.acquire(config.getMaxInflightOutboundBatches());
                inflightChangeMessageVisibilityBatches.release(config.getMaxInflightOutboundBatches());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Submits an outbound request for delivery to the queue associated with this buffer.
     * <p>
     *
     * @param operationLock
     *            the lock synchronizing calls for the call type ( {@code sendMessage},
     *            {@code deleteMessage}, {@code changeMessageVisibility} )
     * @param openOutboundBatchTask
     *            the open batch task for this call type
     * @param request
     *            the request to submit
     * @param inflightOperationBatches
     *            the permits controlling the batches for this type of request
     * @return never null
     * @throws AmazonClientException
     *             (see the various outbound calls for details)
     */
    @SuppressWarnings("unchecked")
    <OBT extends OutboundBatchTask<R, Result>, R extends AmazonWebServiceRequest, Result> QueueBufferFuture<R, Result> submitOutboundRequest(Object operationLock,
                                                                                                                                             OBT[] openOutboundBatchTask,
                                                                                                                                             R request,
                                                                                                                                             final Semaphore inflightOperationBatches,
                                                                                                                                             QueueBufferCallback<R, Result> callback) {
        /*
         * Callers add requests to a single batch task (openOutboundBatchTask) until it is full or
         * maxBatchOpenMs elapses. The total number of batch task in flight is controlled by the
         * inflightOperationBatch semaphore capped at maxInflightOutboundBatches.
         */
        QueueBufferFuture<R, Result> theFuture = null;
        try {
            synchronized (operationLock) {
                if (openOutboundBatchTask[0] == null
                        || ((theFuture = openOutboundBatchTask[0].addRequest(request, callback))) == null) {

                    OBT obt = (OBT) newOutboundBatchTask(request);
                    inflightOperationBatches.acquire();
                    openOutboundBatchTask[0] = obt;

                    // Register a listener for the event signaling that the
                    // batch task has completed (successfully or not).
                    openOutboundBatchTask[0].setOnCompleted(new Listener<OutboundBatchTask<R, Result>>() {
                        @Override
                        public void invoke(OutboundBatchTask<R, Result> task) {
                            inflightOperationBatches.release();
                        }
                    });

                    if (log.isTraceEnabled()) {
                        log.trace("Queue " + qUrl + " created new batch for " + request.getClass().toString() + " "
                                + inflightOperationBatches.availablePermits() + " free slots remain");
                    }

                    theFuture = openOutboundBatchTask[0].addRequest(request, callback);
                    executor.execute(openOutboundBatchTask[0]);
                    if (null == theFuture) {
                        // this can happen only if the request itself is flawed,
                        // so that it can't be added to any batch, even a brand
                        // new one
                        throw new AmazonClientException("Failed to schedule request " + request + " for execution");
                    }
                }
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            AmazonClientException toThrow = new AmazonClientException("Interrupted while waiting for lock.");
            toThrow.initCause(e);
            throw toThrow;
        }

        return theFuture;
    }

    /**
     * Task to send a batch of outbound requests to SQS.
     * <p>
     * The batch task is constructed open and accepts requests until full, or until
     * {@code maxBatchOpenMs} elapses. At that point, the batch closes and the collected requests
     * are assembled into a single batch request to SQS. Specialized for each type of outbound
     * request.
     * <p>
     * Instances of this class (and subclasses) are thread-safe.
     *
     * @param <R>
     *            the type of the SQS request to batch
     * @param <Result>
     *            the type of result he futures issued by this task will return
     */
    private abstract class OutboundBatchTask<R extends AmazonWebServiceRequest, Result> implements Runnable {

        protected final List<R> requests;
        protected final ArrayList<QueueBufferFuture<R, Result>> futures;

        private boolean closed;

        private volatile Listener<OutboundBatchTask<R, Result>> onCompleted;

        public OutboundBatchTask() {
            this.requests = new ArrayList<R>(config.getMaxBatchSize());
            this.futures = new ArrayList<QueueBufferFuture<R, Result>>(config.getMaxBatchSize());
        }

        public void setOnCompleted(Listener<OutboundBatchTask<R, Result>> value) {
            onCompleted = value;
        }

        /**
         * Adds a request to the batch if it is still open and has capacity.
         *
         * @return the future that can be used to get the results of the execution, or null if the
         *         addition failed.
         */
        public synchronized QueueBufferFuture<R, Result> addRequest(R request, QueueBufferCallback<R, Result> callback) {

            if (closed) {
                return null;
            }

            QueueBufferFuture<R, Result> theFuture = addIfAllowed(request, callback);

            // if the addition did not work, or this addition made us full,
            // we can close the request.
            if ((null == theFuture) || isFull()) {
                closed = true;
                notify();
            }

            return theFuture;
        }

        /**
         * Adds the request to the batch if capacity allows it. Called by {@code addRequest} with a
         * lock on {@code this} held.
         *
         * @param request
         * @return the future that will be signaled when the request is completed and can be used to
         *         retrieve the result. Can be null if the addition could not be done
         */
        private QueueBufferFuture<R, Result> addIfAllowed(R request, QueueBufferCallback<R, Result> callback) {

            if (isOkToAdd(request)) {

                requests.add(request);

                QueueBufferFuture<R, Result> theFuture = new QueueBufferFuture<R, Result>(callback);

                futures.add(theFuture);
                onRequestAdded(request);
                return theFuture;

            } else {
                return null;
            }
        }

        /**
         * Checks whether it's okay to add the request to this buffer. Called by
         * {@code addIfAllowed} with a lock on {@code this} held.
         *
         * @param request
         *            the request to add
         * @return true if the request is okay to add, false otherwise
         */
        protected boolean isOkToAdd(R request) {
            return requests.size() < config.getMaxBatchSize();
        }

        /**
         * A hook to be run when a request is successfully added to this buffer. Called by
         * {@code addIfAllowed} with a lock on {@code this} held.
         *
         * @param request
         *            the request that was added
         */
        protected void onRequestAdded(R request) {
            // to be overridden by subclasses
        }

        /**
         * Checks whether the buffer is now full. Called by {@code addIfAllowed} with a lock on
         * {@code this} held.
         *
         * @return whether the buffer is filled to capacity
         */
        protected boolean isFull() {
            return requests.size() >= config.getMaxBatchSize();
        }

        /**
         * Processes the batch once closed. Is <em>NOT</em> called with a lock on {@code this}.
         * However, it's passed a local copy of both the {@code requests} and {@code futures} lists
         * made while holding the lock.
         */
        protected abstract void process(List<R> requests, List<QueueBufferFuture<R, Result>> futures);

        @Override
        public final void run() {
            try {

                long deadlineMs = TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS)
                        + config.getMaxBatchOpenMs() + 1;
                long t = TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);

                List<R> requests;
                List<QueueBufferFuture<R, Result>> futures;

                synchronized (this) {
                    while (!closed && (t < deadlineMs)) {
                        t = TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);

                        // zero means "wait forever", can't have that.
                        long toWait = Math.max(1, deadlineMs - t);
                        wait(toWait);
                    }

                    closed = true;

                    requests = new ArrayList<R>(this.requests);
                    futures = new ArrayList<QueueBufferFuture<R, Result>>(this.futures);
                }

                process(requests, futures);

            } catch (InterruptedException e) {
                failAll(e);
            } catch (AmazonClientException e) {
                failAll(e);
            } catch (RuntimeException e) {
                failAll(e);
                throw e;
            } catch (Error e) {
                failAll(new AmazonClientException("Error encountered", e));
                throw e;
            } finally {
                // make a copy of the listener since it (theoretically) can be
                // modified from the outside.
                Listener<OutboundBatchTask<R, Result>> listener = onCompleted;
                if (listener != null) {
                    listener.invoke(this);
                }
            }
        }

        private void failAll(Exception e) {
            for (QueueBufferFuture<R, Result> f : futures) {
                f.setFailure(e);
            }
        }
    }

    private class SendMessageBatchTask extends OutboundBatchTask<SendMessageRequest, SendMessageResult> {

        int batchSizeBytes = 0;

        @Override
        protected boolean isOkToAdd(SendMessageRequest request) {
            return (requests.size() < config.getMaxBatchSize())
                    && ((request.getMessageBody().getBytes().length + batchSizeBytes) <= config.getMaxBatchSizeBytes());
        }

        @Override
        protected void onRequestAdded(SendMessageRequest request) {
            batchSizeBytes += request.getMessageBody().getBytes().length;
        }

        @Override
        protected boolean isFull() {
            return (requests.size() >= config.getMaxBatchSize()) || (batchSizeBytes >= config.getMaxBatchSizeBytes());
        }

        @Override
        protected void process(List<SendMessageRequest> requests,
                               List<QueueBufferFuture<SendMessageRequest, SendMessageResult>> futures) {

            if (requests.isEmpty()) {
                return;
            }

            SendMessageBatchRequest batchRequest = new SendMessageBatchRequest().withQueueUrl(qUrl);
            ResultConverter.appendUserAgent(batchRequest, AmazonSQSBufferedAsyncClient.USER_AGENT);

            List<SendMessageBatchRequestEntry> entries = new ArrayList<SendMessageBatchRequestEntry>(requests.size());
            for (int i = 0, n = requests.size(); i < n; i++) {
                entries.add(RequestCopyUtils.createSendMessageBatchRequestEntryFrom(Integer.toString(i),
                        requests.get(i)));
            }
            batchRequest.setEntries(entries);

            SendMessageBatchResult batchResult = sqsClient.sendMessageBatch(batchRequest);

            for (SendMessageBatchResultEntry entry : batchResult.getSuccessful()) {
                int index = Integer.parseInt(entry.getId());
                futures.get(index).setSuccess(ResultConverter.convert(entry));
            }

            for (BatchResultErrorEntry errorEntry : batchResult.getFailed()) {
                int index = Integer.parseInt(errorEntry.getId());
                if (errorEntry.isSenderFault()) {
                    futures.get(index).setFailure(ResultConverter.convert(errorEntry));
                } else {
                    // retry.
                    try {
                        // this will retry internally up to 3 times.
                        futures.get(index).setSuccess(sqsClient.sendMessage(requests.get(index)));
                    } catch (AmazonClientException ace) {
                        futures.get(index).setFailure(ace);
                    }
                }
            }

        }

    }

    private class DeleteMessageBatchTask extends OutboundBatchTask<DeleteMessageRequest, DeleteMessageResult> {

        @Override
        protected void process(List<DeleteMessageRequest> requests,
                               List<QueueBufferFuture<DeleteMessageRequest, DeleteMessageResult>> futures) {

            if (requests.isEmpty()) {
                return;
            }

            DeleteMessageBatchRequest batchRequest = new DeleteMessageBatchRequest().withQueueUrl(qUrl);
            ResultConverter.appendUserAgent(batchRequest, AmazonSQSBufferedAsyncClient.USER_AGENT);

            List<DeleteMessageBatchRequestEntry> entries = new ArrayList<DeleteMessageBatchRequestEntry>(
                    requests.size());
            for (int i = 0, n = requests.size(); i < n; i++) {
                entries.add(new DeleteMessageBatchRequestEntry().withId(Integer.toString(i)).withReceiptHandle(
                        requests.get(i).getReceiptHandle()));
            }
            batchRequest.setEntries(entries);

            DeleteMessageBatchResult batchResult = sqsClient.deleteMessageBatch(batchRequest);

            for (DeleteMessageBatchResultEntry entry : batchResult.getSuccessful()) {
                int index = Integer.parseInt(entry.getId());
                futures.get(index).setSuccess(null);
            }

            for (BatchResultErrorEntry errorEntry : batchResult.getFailed()) {
                int index = Integer.parseInt(errorEntry.getId());
                if (errorEntry.isSenderFault()) {
                    futures.get(index).setFailure(ResultConverter.convert(errorEntry));
                } else {
                    try {
                        // retry.
                        sqsClient.deleteMessage(requests.get(index));
                        futures.get(index).setSuccess(null);
                    } catch (AmazonClientException ace) {
                        futures.get(index).setFailure(ace);
                    }
                }
            }
        }
    }

    private class ChangeMessageVisibilityBatchTask extends OutboundBatchTask<ChangeMessageVisibilityRequest, ChangeMessageVisibilityResult> {

        @Override
        protected void process(List<ChangeMessageVisibilityRequest> requests,
                               List<QueueBufferFuture<ChangeMessageVisibilityRequest, ChangeMessageVisibilityResult>> futures) {

            if (requests.isEmpty()) {
                return;
            }

            ChangeMessageVisibilityBatchRequest batchRequest = new ChangeMessageVisibilityBatchRequest()
                    .withQueueUrl(qUrl);
            ResultConverter.appendUserAgent(batchRequest, AmazonSQSBufferedAsyncClient.USER_AGENT);

            List<ChangeMessageVisibilityBatchRequestEntry> entries = new ArrayList<ChangeMessageVisibilityBatchRequestEntry>(
                    requests.size());
            for (int i = 0, n = requests.size(); i < n; i++) {
                entries.add(new ChangeMessageVisibilityBatchRequestEntry().withId(Integer.toString(i))
                        .withReceiptHandle(requests.get(i).getReceiptHandle())
                        .withVisibilityTimeout(requests.get(i).getVisibilityTimeout()));
            }
            batchRequest.setEntries(entries);

            ChangeMessageVisibilityBatchResult batchResult = sqsClient.changeMessageVisibilityBatch(batchRequest);

            for (ChangeMessageVisibilityBatchResultEntry entry : batchResult.getSuccessful()) {
                int index = Integer.parseInt(entry.getId());
                futures.get(index).setSuccess(null);
            }

            for (BatchResultErrorEntry errorEntry : batchResult.getFailed()) {
                int index = Integer.parseInt(errorEntry.getId());
                if (errorEntry.isSenderFault()) {
                    futures.get(index).setFailure(ResultConverter.convert(errorEntry));
                } else {
                    try {
                        // retry.
                        sqsClient.changeMessageVisibility(requests.get(index));
                        futures.get(index).setSuccess(null);
                    } catch (AmazonClientException ace) {
                        futures.get(index).setFailure(ace);
                    }
                }
            }

        }
    }

}
