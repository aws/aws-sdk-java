/*
 * Copyright 2012-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

import com.amazonaws.AmazonClientException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult;
import com.amazonaws.services.sqs.model.DeleteMessageBatchRequest;
import com.amazonaws.services.sqs.model.DeleteMessageBatchRequestEntry;
import com.amazonaws.services.sqs.model.DeleteMessageBatchResult;
import com.amazonaws.services.sqs.model.DeleteMessageBatchResultEntry;
import com.amazonaws.services.sqs.model.DeleteMessageRequest;
import com.amazonaws.services.sqs.model.DeleteMessageResult;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * A buffer to operate on an SQS queue. The buffer batches outbound ( {@code SendMessage},
 * {@code DeleteMessage}, {@code ChangeMessageVisibility}) requests to the queue and pre-fetches
 * messages to receive. In practice, the buffer does almost no work itself, and delegates it to
 * SendQueueBufer and ReceiveQueueBuffer classes.
 * <p>
 * Any errors encountered are passed through to the callers, either as the appropriate Result
 * objects or as exceptions.
 * <p>
 * When the buffer is not used, all internal processing associated with the buffer stops when any
 * outstanding request to SQS completes. In that idle state, the buffer uses neither connections nor
 * threads.
 * <p>
 * Instances of {@code QueueBuffer} are thread-safe.
 */

class QueueBuffer {

    private static final Log log = LogFactory.getLog(QueueBuffer.class);

    private static final AsyncHandler<DeleteMessageRequest, DeleteMessageResult> DEFAULT_BACKGROUND_DELETE_ASYNC_HANDLER
        = new AsyncHandler<DeleteMessageRequest, DeleteMessageResult>() {

            @Override
            public void onSuccess(DeleteMessageRequest request, DeleteMessageResult deleteMessageResult) {
                // No-op
            }

            @Override
            public void onError(Exception exception) {
                log.warn("Failed to delete message in background (config.isDeleteInBackground() is true) - " +
                         "message will likely be redelivered", exception);
            }
        };

    private final SendQueueBuffer sendBuffer;
    private final ReceiveQueueBuffer receiveBuffer;
    private final AmazonSQSAsync realSqs;
    QueueBufferConfig config;

    private final AsyncHandler<DeleteMessageRequest, DeleteMessageResult> backgroundDeleteAsyncHandler;

    /**
     * This executor that will be shared among all queue buffers. Since a single JVM can access
     * hundreds of queues, it won't do to have hundreds of executors spinning up hundreds of threads
     * for each queue. The DaemonThreadFactory creates daemon threads, which means they won't block
     * the JVM from exiting if only they are still around.
     */
    static ExecutorService executor = Executors.newCachedThreadPool(new DaemonThreadFactory());;

    QueueBuffer(QueueBufferConfig paramConfig, String url, AmazonSQSAsync sqs) {
        this(paramConfig, url, sqs, DEFAULT_BACKGROUND_DELETE_ASYNC_HANDLER);
    }

    QueueBuffer(QueueBufferConfig paramConfig, String url, AmazonSQSAsync sqs,
                AsyncHandler<DeleteMessageRequest, DeleteMessageResult> backgroundDeleteAsyncHandler) {
        realSqs = sqs;
        config = paramConfig;
        sendBuffer = new SendQueueBuffer(sqs, executor, paramConfig, url);
        receiveBuffer = new ReceiveQueueBuffer(sqs, executor, paramConfig, url);
        this.backgroundDeleteAsyncHandler = backgroundDeleteAsyncHandler;
    }

    /**
     * asynchronously enqueues a message to SQS.
     *
     * @return a Future object that will be notified when the operation is completed; never null
     */
    public Future<SendMessageResult> sendMessage(SendMessageRequest request,
                                                 AsyncHandler<SendMessageRequest, SendMessageResult> handler) {
        QueueBufferCallback<SendMessageRequest, SendMessageResult> callback = null;
        if (handler != null) {
            callback = new QueueBufferCallback<SendMessageRequest, SendMessageResult>(handler, request);
        }
        QueueBufferFuture<SendMessageRequest, SendMessageResult> future = sendBuffer.sendMessage(request, callback);
        future.setBuffer(this);
        return future;
    }

    /**
     * Sends a message to SQS and returns the SQS reply.
     *
     * @return never null
     */
    public SendMessageResult sendMessageSync(SendMessageRequest request) {
        Future<SendMessageResult> future = sendMessage(request, null);
        return waitForFuture(future);
    }

    /**
     * Asynchronously deletes a message from SQS.
     *
     * @return a Future object that will be notified when the operation is completed; never null
     */

    public Future<DeleteMessageResult> deleteMessage(DeleteMessageRequest request,
            AsyncHandler<DeleteMessageRequest, DeleteMessageResult> handler) {
        QueueBufferCallback<DeleteMessageRequest, DeleteMessageResult> callback = null;
        if (handler != null) {
            callback = new QueueBufferCallback<DeleteMessageRequest, DeleteMessageResult>(handler, request);
        }

        QueueBufferFuture<DeleteMessageRequest, DeleteMessageResult> future = sendBuffer.deleteMessage(request, callback);
        future.setBuffer(this);
        return future;
    }

    /**
     * Deletes a message from SQS. If <tt>config.isDeleteInBackground()</tt> is false, does not return until a confirmation
     * from SQS has been received. If <tt>config.isDeleteInBackground()</tt> is true, immediately returns a successful result
     * and uses {@link #deleteMessage} to delete the message in the background. If the background call fails, the
     * error will be logged since there is no other way to communicate the failure.
     *
     * @return never null
     */
    public DeleteMessageResult deleteMessageSync(DeleteMessageRequest request) {
        if (config.isDeleteInBackground()) {
            deleteMessage(request, backgroundDeleteAsyncHandler);
            return new DeleteMessageResult();
        } else {
            Future<DeleteMessageResult> future = deleteMessage(request, null);
            return waitForFuture(future);
        }
    }

    /**
     * Deletes a batch of messages from SQS. If <tt>config.isDeleteInBackground()</tt> is false, does not return until a confirmation
     * from SQS has been received. If <tt>config.isDeleteInBackground()</tt> is true, immediately returns a successful result
     * and uses multiple calls to {@link #deleteMessage} to delete the message in the background.
     * If the background call fails, the error will be logged since there is no other way to communicate the failure.
     *
     * @return never null
     */
    public DeleteMessageBatchResult deleteMessageBatchSync(DeleteMessageBatchRequest request) {
        if (config.isDeleteInBackground()) {
            // Submit each entry as a DeleteMessageRequest, since the underlying buffer
            // doesn't support batch requests.
            String queueUrl = request.getQueueUrl();
            List<DeleteMessageBatchRequestEntry> requestEntries = request.getEntries();
            List<DeleteMessageBatchResultEntry> resultEntries =
                    new ArrayList<DeleteMessageBatchResultEntry>(requestEntries.size());
            for (DeleteMessageBatchRequestEntry entry : requestEntries) {
                deleteMessage(new DeleteMessageRequest().withQueueUrl(queueUrl)
                                                        .withReceiptHandle(entry.getReceiptHandle()),
                              backgroundDeleteAsyncHandler);
                resultEntries.add(new DeleteMessageBatchResultEntry().withId(entry.getId()));
            }
            return new DeleteMessageBatchResult().withSuccessful(resultEntries);
        } else {
            return realSqs.deleteMessageBatch(request);
        }
    }

    /**
     * asynchronously adjust a message's visibility timeout to SQS.
     *
     * @return a Future object that will be notified when the operation is completed; never null
     */

    public Future<ChangeMessageVisibilityResult> changeMessageVisibility(ChangeMessageVisibilityRequest request,
                                                AsyncHandler<ChangeMessageVisibilityRequest, ChangeMessageVisibilityResult> handler) {
        QueueBufferCallback<ChangeMessageVisibilityRequest, ChangeMessageVisibilityResult> callback = null;
        if (handler != null) {
            callback = new QueueBufferCallback<ChangeMessageVisibilityRequest, ChangeMessageVisibilityResult>(handler, request);
        }

        QueueBufferFuture<ChangeMessageVisibilityRequest, ChangeMessageVisibilityResult> future =
                sendBuffer.changeMessageVisibility(request, callback);
        future.setBuffer(this);
        return future;
    }

    /**
     * Changes visibility of a message in SQS. Does not return until a confirmation from SQS has
     * been received.
     * @return
     */
    public ChangeMessageVisibilityResult changeMessageVisibilitySync(ChangeMessageVisibilityRequest request) {
        Future<ChangeMessageVisibilityResult> future = sendBuffer.changeMessageVisibility(request, null);
        return waitForFuture(future);
    }

    /**
     * Submits a request to receive some messages from SQS.
     *
     * @return a Future object that will be notified when the operation is completed; never null;
     */

    public Future<ReceiveMessageResult> receiveMessage(ReceiveMessageRequest rq,
                                                       AsyncHandler<ReceiveMessageRequest, ReceiveMessageResult> handler) {
        if (canBeRetrievedFromQueueBuffer(rq)) {
            QueueBufferCallback<ReceiveMessageRequest, ReceiveMessageResult> callback = null;
            if (handler != null) {
                callback = new QueueBufferCallback<ReceiveMessageRequest, ReceiveMessageResult>(handler, rq);
            }

            QueueBufferFuture<ReceiveMessageRequest, ReceiveMessageResult> future = receiveBuffer.receiveMessageAsync(
                    rq, callback);
            future.setBuffer(this);
            return future;
        } else if (handler != null) {
            return realSqs.receiveMessageAsync(rq, handler);
        } else {
            return realSqs.receiveMessageAsync(rq);
        }
    }

    /**
     * Retrieves messages from an SQS queue.
     *
     * @return never null
     */
    public ReceiveMessageResult receiveMessageSync(ReceiveMessageRequest rq) {
        Future<ReceiveMessageResult> future = receiveMessage(rq, null);
        return waitForFuture(future);
    }

    /**
     * Shuts down the queue buffer. Once this method has been called, the queue buffer is not
     * operational and all subsequent calls to it may fail.
     *
     * Enabling {@link QueueBufferConfig#flushOnShutdown} will wait for the pending tasks in
     * {@link SendQueueBuffer} to finish before shutting down.
     */
    public void shutdown() {
        if (config.isFlushOnShutdown()) {
            flush();
        }
        receiveBuffer.shutdown();
    }

    /**
     * Flushes all outstanding outbound requests in the {@link SendQueueBuffer}.
     */
    void flush() {
        sendBuffer.flush();
    }

    /**
     * We prefetch and load results in the buffer by making basic requests. I.E. we don't request
     * queue or message attributes and we have a default visibility timeout. If the user's request
     * deviates from the basic request we can't fulfill the request directly from the buffer, we
     * have to hit SQS directly (Note that when going to SQS directly messages currently in the
     * buffer may be unavailable due to the visibility timeout).
     *
     * @return True if the request can be fulfilled directly from the buffer, false if we have to go
     *         back to the service to fetch the results
     */
    private boolean canBeRetrievedFromQueueBuffer(ReceiveMessageRequest rq) {
        return requestedAttributesAreCompatible(rq) && requestedMessageAttributesAreCompatible(rq) && isBufferingEnabled()
                && (rq.getVisibilityTimeout() == null);
    }

    /**
     * @return True if request has been configured to return compatible attributes. False otherwise
     */
    private boolean requestedAttributesAreCompatible(ReceiveMessageRequest rq) {
        return rq.getAttributeNames().equals(config.getReceiveAttributeNames());
    }

    /**
     * @return True if request has been configured to return compatible message attributes. False otherwise.
     */
    private boolean requestedMessageAttributesAreCompatible(ReceiveMessageRequest rq) {
        return rq.getMessageAttributeNames().equals(config.getReceiveMessageAttributeNames());
    }

    /**
     * @return True if the client has been configured to prefetch batches of messages. False
     *         otherwise
     */
    private boolean isBufferingEnabled() {
        return (config.getMaxInflightReceiveBatches() > 0 && config.getMaxDoneReceiveBatches() > 0);
    }

    /**
     * this method carefully waits for futures. If waiting throws, it converts the exceptions to the
     * exceptions that SQS clients expect. This is what we use to turn asynchronous calls into
     * synchronous ones
     */
    private <ResultType> ResultType waitForFuture(Future<ResultType> future) {
        ResultType toReturn = null;
        try {
            toReturn = future.get();
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            AmazonClientException ce = new AmazonClientException(
                    "Thread interrupted while waiting for execution result");
            ce.initCause(ie);
            throw ce;
        } catch (ExecutionException ee) {
            // if the cause of the execution exception is an SQS exception, extract it
            // and throw the extracted exception to the clients
            // otherwise, wrap ee in an SQS exception and throw that.
            Throwable cause = ee.getCause();

            if (cause instanceof AmazonClientException) {
                throw (AmazonClientException) cause;
            }

            AmazonClientException ce = new AmazonClientException(
                    "Caught an exception while waiting for request to complete...");
            ce.initCause(ee);
            throw ce;
        }

        return toReturn;

    }

    /**
     * We need daemon threads in our executor so that we don't keep the process running if our
     * executor threads are the only ones left in the process.
     */
    private static class DaemonThreadFactory implements ThreadFactory {
        static AtomicInteger threadCount = new AtomicInteger(0);

        public Thread newThread(Runnable r) {
            int threadNumber = threadCount.addAndGet(1);
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            thread.setName("SQSQueueBufferWorkerThread-" + threadNumber);
            return thread;
        }

    }
}
