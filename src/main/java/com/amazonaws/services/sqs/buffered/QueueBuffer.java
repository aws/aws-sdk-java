/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

import com.amazonaws.AmazonClientException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest;
import com.amazonaws.services.sqs.model.DeleteMessageRequest;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;


/**
 * A buffer to operate on an SQS queue. The buffer batches outbound ( {@code
 * SendMessage}, {@code DeleteMessage}, {@code ChangeMessageVisibility})
 * requests to the queue and pre-fetches messages to receive.  In practice,
 * the buffer does almost no work itself, and delegates it to SendQueueBufer
 * and ReceiveQueueBuffer classes. 
 * <p>
 * Any errors encountered are passed through to the callers, either as the
 * appropriate Result objects or as exceptions.  
 * <p>
 * When the buffer is not used, all internal processing associated with the
 * buffer stops when any outstanding request to SQS completes. In that idle
 * state, the buffer uses neither connections nor threads.  
 * <p>
 * Instances of {@code QueueBuffer} are thread-safe.
 */

class QueueBuffer {
    
    private final SendQueueBuffer sendBuffer;
    private final ReceiveQueueBuffer receiveBuffer;
    private final AmazonSQSAsync realSqs;
    QueueBufferConfig config;
    
    /** This executor that will be shared among all queue buffers. Since a single JVM can 
     * access hundreds of queues, it won't do to have hundreds of executors spinning up 
     * hundreds of threads for each queue.
     * 
     *  The DaemonThreadFactory creates daemon threads, which means they won't block the JVM 
     *  from exiting if only they are still around.
     *  */
    static ExecutorService executor = Executors.newCachedThreadPool(new DaemonThreadFactory());;
    
    QueueBuffer( QueueBufferConfig paramConfig, String url, AmazonSQSAsync sqs) {
        realSqs = sqs;
        config = paramConfig;
        sendBuffer = new SendQueueBuffer(sqs, executor, paramConfig, url);
        receiveBuffer =  new ReceiveQueueBuffer(sqs, executor, paramConfig, url);
        
    }


    /**
     * asynchronously enqueues a message to SQS.
     * 
     * @return a Future object that will be notified when the operation is
     *         completed; never null
     */
    public Future< SendMessageResult> sendMessage(SendMessageRequest request, AsyncHandler<SendMessageRequest, SendMessageResult> handler) {
        QueueBufferCallback<SendMessageRequest,SendMessageResult> callback = null;
        if ( handler != null ) {
            callback = new QueueBufferCallback<SendMessageRequest,SendMessageResult> (handler, request);
        }
        QueueBufferFuture<SendMessageRequest, SendMessageResult> future =  sendBuffer.sendMessage(request, callback);
        future.setBuffer(this);
        return future;
    }
    
    /**
     * Sends a message to SQS and returns the SQS reply.
     * 
     * @return never null
     */
    public SendMessageResult sendMessageSync(SendMessageRequest request) {
        Future<SendMessageResult> future = sendMessage( request, null );
        return waitForFuture(future);
    }

    /**
     * Asynchronously deletes a message from SQS.
     * 
     * @return a Future object that will be notified when the operation is
     *         completed; never null
     */

    public Future<Void> deleteMessage(DeleteMessageRequest request, AsyncHandler<DeleteMessageRequest, Void> handler) {
        QueueBufferCallback<DeleteMessageRequest,Void> callback = null;
        if ( handler != null ) {
            callback = new QueueBufferCallback<DeleteMessageRequest,Void> (handler, request);
        }

        QueueBufferFuture<DeleteMessageRequest,Void> future = sendBuffer.deleteMessage(request, callback);
        future.setBuffer(this);
        return future;
    }
    
    /**
     * Deletes a message from SQS. Does not return until a confirmation from SQS
     * has been received
     * 
     * @return never null
     */
    public void deleteMessageSync(DeleteMessageRequest request) {
        Future<Void> future = deleteMessage(request, null);
        waitForFuture(future);
    }

    /**
     * asynchronously adjust a message's visibility timeout to SQS.
     * 
     * @return a Future object that will be notified when the operation is
     *         completed; never null
     */

    public Future<Void> changeMessageVisibility(ChangeMessageVisibilityRequest request, AsyncHandler<ChangeMessageVisibilityRequest,Void> handler) {
        QueueBufferCallback<ChangeMessageVisibilityRequest,Void> callback = null;
        if ( handler != null ) {
            callback = new QueueBufferCallback<ChangeMessageVisibilityRequest,Void> (handler, request);
        }

        QueueBufferFuture<ChangeMessageVisibilityRequest,Void> future =  sendBuffer.changeMessageVisibility(request, callback);
        future.setBuffer(this);
        return future;
    }
    
    /**
     * Changes visibility of a message in SQS. Does not return until a
     * confirmation from SQS has been received.
     */
    public void changeMessageVisibilitySync(ChangeMessageVisibilityRequest request) {
        Future<Void> future = sendBuffer.changeMessageVisibility(request, null);
        waitForFuture(future);
    }
    
    /**
     * Submits a request to receive some messages from SQS.
     * 
     * @return a Future object that will be notified when the operation is
     *         completed; never null; 
     */

    public Future<ReceiveMessageResult> receiveMessage(ReceiveMessageRequest rq, AsyncHandler<ReceiveMessageRequest, ReceiveMessageResult> handler) {
        //only handle simple requests, because these are the settings we pre-fetch with
        boolean noAttributes = (rq.getAttributeNames() == null) || rq.getAttributeNames().isEmpty();   
        boolean bufferngEnabled = (config.getMaxInflightReceiveBatches() > 0) && (config.getMaxDoneReceiveBatches() > 0);
        if (  noAttributes && bufferngEnabled && ( rq.getVisibilityTimeout() == null ) ) {
            QueueBufferCallback<ReceiveMessageRequest,ReceiveMessageResult> callback = null;
            if ( handler != null ) {
                callback = new QueueBufferCallback<ReceiveMessageRequest,ReceiveMessageResult> (handler, rq);
            }

            QueueBufferFuture<ReceiveMessageRequest, ReceiveMessageResult> future = receiveBuffer.receiveMessageAsync(rq, callback);
            future.setBuffer(this);
            return future;
        } else {
            return realSqs.receiveMessageAsync(rq); 
        }
    }
    
    /**
     * Retrieves messages from an SQS queue.
     * 
     * @return never null
     */
    public ReceiveMessageResult receiveMessageSync( ReceiveMessageRequest rq ) {
        Future<ReceiveMessageResult> future = receiveMessage(rq, null);
        return waitForFuture(future);
    }
    
    /**
     * Shuts down the queue buffer.  Once this method has been called, the 
     * queue buffer is not operational and all subsequent calls to it may fail
     * */
    public void shutdown() {
        //send buffer does not require shutdown, only
        //shut down receive buffer
        receiveBuffer.shutdown();
    }
    
    /**
     * this method carefully waits for futures. If waiting throws, it converts
     * the exceptions to the exceptions that SQS clients expect. This is what we
     * use to turn asynchronous calls into synchronous ones
     */
    private <ResultType>  ResultType waitForFuture( Future<ResultType> future ) {
        ResultType toReturn = null;
        try {
            toReturn = future.get();
        } catch ( InterruptedException ie ) {
            Thread.currentThread().interrupt();
            AmazonClientException ce = new AmazonClientException("Thread interrupted while waiting for execution result");
            ce.initCause(ie);
            throw ce;
        } catch (ExecutionException ee ) {
            //if the cause of the execution exception is an SQS exception, extract it 
            //and throw the extracted exception to the clients
            //otherwise, wrap ee in an SQS exception and throw that.
            Throwable cause = ee.getCause();

            if (cause instanceof AmazonClientException) {
                throw ( AmazonClientException ) cause;
            }
            
            AmazonClientException ce = new AmazonClientException("Caught an exception while waiting for request to complete...");
            ce.initCause(ee);
            throw ce;
        }
        
        return toReturn;
        
    }
    
    /**
     * We need daemon threads in our executor so that we don't keep the process
     * running if our executor threads are the only ones left in the process.
     * */
    private static class DaemonThreadFactory implements ThreadFactory {
        static AtomicInteger threadCount = new AtomicInteger( 0 );
        public Thread newThread( Runnable r) {
            int threadNumber = threadCount.addAndGet(1);
            Thread thread = new Thread( r );
            thread.setDaemon(true);
            thread.setName("SQSQueueBufferWorkerThread-" + threadNumber );
            return thread;
        }
        
    }
}

