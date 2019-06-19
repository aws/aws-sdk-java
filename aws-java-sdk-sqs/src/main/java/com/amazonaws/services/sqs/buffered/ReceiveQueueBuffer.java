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
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequestEntry;
import com.amazonaws.services.sqs.model.GetQueueAttributesRequest;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;

/**
 * The ReceiveQueueBuffer class is responsible for dequeueing of messages from a single SQS queue.
 * It uses the provided executor to pre-fetch messages from the server and keeps them in a buffer
 * which it uses to satisfy incoming requests. The number of requests pre-fetched and kept in the
 * buffer, as well as the maximum number of threads used to retrieve the messages are configurable.
 * <p>
 * Synchronization strategy: - Threads must hold the TaskSpawnSyncPoint object monitor to spawn a
 * new task or modify the number of inflight tasks - Threads must hold the monitor of the "futures"
 * list to modify the list - Threads must hold the monitor of the "finishedTasks" list to modify the
 * list - If you need to lock both futures and finishedTasks, lock futures first and finishedTasks
 * second
 */
public class ReceiveQueueBuffer {

    /**
     * Simple interface to represent a condition
     * 
     * @param <T>
     */
    private interface Predicate<T> {
        /**
         * @param t
         *            Object being evaluated against the condition
         * @return True if t meets the condition, false if not
         */
        boolean test(T t);
    }

    private static Log log = LogFactory.getLog(ReceiveQueueBuffer.class);

    private final QueueBufferConfig config;

    private final String qUrl;

    private final Executor executor;

    private final AmazonSQS sqsClient;

    private long bufferCounter = 0;

    /**
     * This buffer's queue visibility timeout. Used to detect expired message that should not be
     * returned by the {@code receiveMessage} call. Synchronized by {@code receiveMessageLock}. -1
     * indicates that the time is uninitialized.
     */
    private volatile long visibilityTimeoutNanos = -1;

    /**
     * Used as permits controlling the number of in flight receive batches. Synchronized by
     * {@code taskSpawnSyncPoint}.
     */
    private volatile int inflightReceiveMessageBatches;

    /**
     * synchronize on this object to create new receive batches or modify inflight message count
     */
    private final Object taskSpawnSyncPoint = new Object();

    /** shutdown buffer does not retrieve any more messages from sqs */
    volatile boolean shutDown = false;

    /** message delivery futures we gave out */
    private final LinkedList<ReceiveMessageFuture> futures = new LinkedList<ReceiveMessageFuture>();

    /** finished batches are stored in this list. */
    private LinkedList<ReceiveMessageBatchTask> finishedTasks = new LinkedList<ReceiveMessageBatchTask>();

    ReceiveQueueBuffer(AmazonSQS paramSQS, Executor paramExecutor, QueueBufferConfig paramConfig, String url) {
        config = paramConfig;
        executor = paramExecutor;
        sqsClient = paramSQS;
        qUrl = url;

    }

    /**
     * Prevents spawning of new retrieval batches and waits for all in-flight retrieval batches to
     * finish
     */
    public void shutdown() {
        shutDown = true;
        try {
            while (inflightReceiveMessageBatches > 0)
                Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Submits the request for retrieval of messages from the queue and returns a future that will
     * be signalled when the request is satisfied. The future may already be signalled by the time
     * it is returned.
     * 
     * @return never null
     */
    public QueueBufferFuture<ReceiveMessageRequest, ReceiveMessageResult> receiveMessageAsync(ReceiveMessageRequest rq,
                                                                                              QueueBufferCallback<ReceiveMessageRequest, ReceiveMessageResult> callback) {
        if (shutDown) {
            throw new AmazonClientException("The client has been shut down.");
        }

        // issue the future...
        int numMessages = 10;
        if (rq.getMaxNumberOfMessages() != null) {
            numMessages = rq.getMaxNumberOfMessages();
        }
        QueueBufferFuture<ReceiveMessageRequest, ReceiveMessageResult> toReturn = issueFuture(numMessages, callback);

        // attempt to satisfy it right away...
        satisfyFuturesFromBuffer();

        // spawn more receive tasks if we need them...
        spawnMoreReceiveTasks();

        return toReturn;
    }

    /**
     * Creates and returns a new future object. Sleeps if the list of already-issued but as yet
     * unsatisfied futures is over a throttle limit.
     * 
     * @return never null
     */
    private ReceiveMessageFuture issueFuture(int size,
                                             QueueBufferCallback<ReceiveMessageRequest, ReceiveMessageResult> callback) {
        synchronized (futures) {
            ReceiveMessageFuture theFuture = new ReceiveMessageFuture(callback, size);
            futures.addLast(theFuture);
            return theFuture;
        }
    }

    /**
     * Attempts to satisfy some or all of the already-issued futures from the local buffer. If the
     * buffer is empty or there are no futures, this method won't do anything.
     */
    private void satisfyFuturesFromBuffer() {
        synchronized (futures) {
            synchronized (finishedTasks) {
                // attempt to satisfy futures until we run out of either futures or
                // finished tasks
                while ((!futures.isEmpty()) && (!finishedTasks.isEmpty())) {
                    // Remove any expired tasks before attempting to fufill the future
                    pruneExpiredTasks();
                    // Fufill the future from a non expired task if there is one. There is still a
                    // slight chance that the first task could have expired between the time we
                    // pruned and the time we fufill the future
                    if (!finishedTasks.isEmpty()) {
                        fufillFuture(futures.poll());
                    }
                }
            }
        }
    }

    /**
     * Fills the future with whatever results were received by the full batch currently at the head
     * of the completed batch queue. Those results may be retrieved messages, or an exception. This
     * method assumes that you are holding the finished tasks lock locks when invoking it. violate
     * this assumption at your own peril
     */
    private void fufillFuture(ReceiveMessageFuture future) {
        ReceiveMessageBatchTask task = finishedTasks.getFirst();
        ReceiveMessageResult result = new ReceiveMessageResult();
        LinkedList<Message> messages = new LinkedList<Message>();
        result.setMessages(messages);
        Exception exception = task.getException();
        int numRetrieved = 0;
        boolean batchDone = false;
        while (numRetrieved < future.getRequestedSize()) {
            Message msg = task.removeMessage();
            // a non-empty batch can still give back a null
            // message if the message expired.
            if (msg != null) {
                messages.add(msg);
                ++numRetrieved;
            } else {
                batchDone = true;
                break;
            }
        }
        // we may have just drained the batch.
        batchDone = batchDone || task.isEmpty() || (exception != null);
        if (batchDone) {
            finishedTasks.removeFirst();
        }
        result.setMessages(messages);

        // if after the above runs the exception is not null,
        // the finished batch has encountered an error, and we will
        // report that in the Future. Otherwise, we will fill
        // the future with the receive result
        if (exception != null) {
            future.setFailure(exception);
        } else {
            future.setSuccess(result);
        }
    }

    /**
     * Prune any expired tasks that do not have an exception associated with them. This method
     * assumes that you are holding the finishedTasks lock when invoking it
     */
    private void pruneExpiredTasks() {
        int numberExpiredTasksPruned = pruneHeadTasks(new Predicate<ReceiveQueueBuffer.ReceiveMessageBatchTask>() {
            @Override
            public boolean test(ReceiveMessageBatchTask t) {
                return t.isExpired() && t.getException() == null;
            }
        });
        // If we pruned any tasks because they are expired we also want to prune any empty tasks
        // afterwards so we have a chance to receive those expired messages again.
        if (numberExpiredTasksPruned > 0) {
            pruneHeadTasks(new Predicate<ReceiveQueueBuffer.ReceiveMessageBatchTask>() {
                @Override
                public boolean test(ReceiveMessageBatchTask t) {
                    return t.isEmpty() && t.getException() == null;
                }
            });
        }
    }

    /**
     * Prune all tasks at the beginning of the finishedTasks list that meet the given condition.
     * Once a task is found that does not meet the given condition the pruning stops. This method
     * assumes that you are holding the finishedTasks lock when invoking it.
     * 
     * @param pruneCondition
     *            Condition on whether a task is eligible to be pruned
     * @return Number of total tasks pruned from finishedTasks
     */
    private int pruneHeadTasks(Predicate<ReceiveMessageBatchTask> pruneCondition) {
        int numberPruned = 0;
        while (!finishedTasks.isEmpty()) {
            if (pruneCondition.test(finishedTasks.getFirst())) {
                finishedTasks.removeFirst();
                numberPruned++;
            } else {
                break;
            }
        }
        return numberPruned;
    }

    /**
     * maybe create more receive tasks. extra receive tasks won't be created if we are already at
     * the maximum number of receive tasks, or if we are at the maximum number of prefetched buffers
     */
    private void spawnMoreReceiveTasks() {
        if (shutDown) {
            return;
        }

        int desiredBatches = config.getMaxDoneReceiveBatches();
        desiredBatches = desiredBatches < 1 ? 1 : desiredBatches;

        synchronized (finishedTasks) {
            if (finishedTasks.size() >= desiredBatches)
                return;

            // if we have some finished batches already, and
            // existing inflight batches will bring us to the limit,
            // don't spawn more. if our finished tasks cache is empty, we will
            // always spawn a thread.
            if (finishedTasks.size() > 0 && (finishedTasks.size() + inflightReceiveMessageBatches) >= desiredBatches) {
                return;
            }
        }

        synchronized (taskSpawnSyncPoint) {
            if (visibilityTimeoutNanos == -1) {
                GetQueueAttributesRequest request = new GetQueueAttributesRequest().withQueueUrl(qUrl)
                        .withAttributeNames("VisibilityTimeout");
                ResultConverter.appendUserAgent(request, AmazonSQSBufferedAsyncClient.USER_AGENT);
                long visibilityTimeoutSeconds = Long.parseLong(sqsClient.getQueueAttributes(request).getAttributes()
                        .get("VisibilityTimeout"));
                visibilityTimeoutNanos = TimeUnit.NANOSECONDS.convert(visibilityTimeoutSeconds, TimeUnit.SECONDS);
            }

            int max = config.getMaxInflightReceiveBatches();
            // must allow at least one inflight receive task, or receive won't
            // work at all.
            max = max > 0 ? max : 1;
            int toSpawn = max - inflightReceiveMessageBatches;
            if (toSpawn > 0) {
                ReceiveMessageBatchTask task = new ReceiveMessageBatchTask(this);
                ++inflightReceiveMessageBatches;
                ++bufferCounter;
                if (log.isTraceEnabled()) {
                    log.trace("Spawned receive batch #" + bufferCounter + " (" + inflightReceiveMessageBatches + " of "
                            + max + " inflight) for queue " + qUrl);
                }
                executor.execute(task);
            }
        }
    }

    /**
     * This method is called by the batches after they have finished retrieving the messages.
     */
    void reportBatchFinished(ReceiveMessageBatchTask batch) {
        synchronized (finishedTasks) {
            finishedTasks.addLast(batch);
            if (log.isTraceEnabled()) {
                log.info("Queue " + qUrl + " now has " + finishedTasks.size() + " receive results cached ");
            }
        }
        synchronized (taskSpawnSyncPoint) {
            --inflightReceiveMessageBatches;
        }
        satisfyFuturesFromBuffer();
        spawnMoreReceiveTasks();
    }

    /**
     * Clears and nacks any pre-fetched messages in this buffer.
     */
    public void clear() {
        boolean done = false;
        while (!done) {
            ReceiveMessageBatchTask currentBatch = null;
            synchronized (finishedTasks) {
                currentBatch = finishedTasks.poll();
            }

            if (currentBatch != null) {
                currentBatch.clear();
            } else {
                // ran out of batches to clear
                done = true;
            }
        }
    }

    private class ReceiveMessageFuture extends QueueBufferFuture<ReceiveMessageRequest, ReceiveMessageResult> {
        /* how many messages did the request ask for */
        private int requestedSize;

        ReceiveMessageFuture(QueueBufferCallback<ReceiveMessageRequest, ReceiveMessageResult> cb, int paramSize) {
            super(cb);
            requestedSize = paramSize;
        }

        public int getRequestedSize() {
            return requestedSize;
        }

    }

    /**
     * Task to receive messages from SQS.
     * <p>
     * The batch task is constructed {@code !open} until the {@code ReceiveMessage} completes. At
     * that point, the batch opens and its messages (if any) become available to read.
     */
    private class ReceiveMessageBatchTask implements Runnable {
        private Exception exception = null;
        private List<Message> messages;
        private long visibilityDeadlineNano;
        private boolean open = false;
        private ReceiveQueueBuffer parentBuffer;

        /**
         * Constructs a receive task waiting the specified time before calling SQS.
         * 
         * @param waitTimeMs
         *            the time to wait before calling SQS
         */
        ReceiveMessageBatchTask(ReceiveQueueBuffer paramParentBuffer) {
            parentBuffer = paramParentBuffer;
            messages = Collections.emptyList();
        }

        synchronized boolean isEmpty() {
            if (!open) {
                throw new IllegalStateException("batch is not open");
            }

            return messages.isEmpty();
        }

        /**
         * @return the exception that was thrown during execution, or null if there was no exception
         */
        synchronized Exception getException() {
            if (!open) {
                throw new IllegalStateException("batch is not open");
            }

            return exception;
        }

        /**
         * Returns a message if one is available.
         * <p>
         * The call adjusts the message count.
         * 
         * @return a message or {@code null} if none is available
         */
        synchronized Message removeMessage() {
            if (!open) {
                throw new IllegalStateException("batch is not open");
            }

            // our messages expired.
            if (isExpired()) {
                messages.clear();
                return null;
            }

            if (messages.isEmpty())
                return null;
            else
                return messages.remove(messages.size() - 1);
        }

        boolean isExpired() {
            return System.nanoTime() > visibilityDeadlineNano;
        }

        /**
         * Nacks and clears all messages remaining in the batch.
         */
        synchronized void clear() {
            if (!open) {
                throw new IllegalStateException("batch is not open");
            }

            if (!isExpired()) {
                ChangeMessageVisibilityBatchRequest batchRequest = new ChangeMessageVisibilityBatchRequest()
                        .withQueueUrl(qUrl);
                ResultConverter.appendUserAgent(batchRequest, AmazonSQSBufferedAsyncClient.USER_AGENT);

                List<ChangeMessageVisibilityBatchRequestEntry> entries = new ArrayList<ChangeMessageVisibilityBatchRequestEntry>(
                        messages.size());

                int i = 0;
                for (Message m : messages) {

                    entries.add(new ChangeMessageVisibilityBatchRequestEntry().withId(Integer.toString(i))
                            .withReceiptHandle(m.getReceiptHandle()).withVisibilityTimeout(0));
                    ++i;
                }

                try {
                    batchRequest.setEntries(entries);
                    sqsClient.changeMessageVisibilityBatch(batchRequest);
                } catch (AmazonClientException e) {
                    // Log and ignore.
                    log.warn("ReceiveMessageBatchTask: changeMessageVisibility failed " + e);
                }
            }
            messages.clear();
        }

        /**
         * Attempts to retrieve messages from SQS and upon completion (successful or unsuccessful)
         * reports the batch as complete and open
         */
        public void run() {

            try {
                visibilityDeadlineNano = System.nanoTime() + visibilityTimeoutNanos;
                ReceiveMessageRequest request = new ReceiveMessageRequest(qUrl)
                        .withMaxNumberOfMessages(config.getMaxBatchSize())
                        .withMessageAttributeNames(config.getReceiveMessageAttributeNames());
                ResultConverter.appendUserAgent(request, AmazonSQSBufferedAsyncClient.USER_AGENT);

                if (config.getVisibilityTimeoutSeconds() > 0) {
                    request.setVisibilityTimeout(config.getVisibilityTimeoutSeconds());
                    visibilityDeadlineNano = System.nanoTime()
                            + TimeUnit.NANOSECONDS.convert(config.getVisibilityTimeoutSeconds(), TimeUnit.SECONDS);
                }

                if (config.isLongPoll()) {
                    request.withWaitTimeSeconds(config.getLongPollWaitTimeoutSeconds());
                }

                messages = sqsClient.receiveMessage(request).getMessages();
            } catch (AmazonClientException e) {
                exception = e;
            } finally {
                // whatever happened, we are done and can be considered open
                open = true;
                parentBuffer.reportBatchFinished(this);
            }

        }
    }
}
