/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.monitoring.internal;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.monitoring.MonitoringEvent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Dispatches {@link MonitoringEvent}s to the local agent asynchronously.
 * <p />
 * The singleton instance of this class is meant to be used across multiple
 * {@link com.amazonaws.AmazonWebServiceClient}s that are producing monitoring
 * events meant to be sent to a local agent.  Each client that obtains a
 * reference to the instance must first call {@link #init()} before use, and
 * {@link #release()} when it is no longer needed.
 */
@SdkInternalApi
public class AsynchronousAgentDispatcher {
    private static final Log LOG = LogFactory.getLog(AsynchronousAgentDispatcher.class);
    private static final int QUEUE_SIZE = 4096;
    private static AsynchronousAgentDispatcher instance;

    private final ObjectWriter writer;
    private int refCount = 0;
    private volatile BlockingQueue<WriteTask> tasks;
    private ExecutorService exec;
    private volatile boolean initialized = false;

    private AsynchronousAgentDispatcher() {
        this.writer = new ObjectMapper()
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .setPropertyNamingStrategy(new PropertyNamingStrategy.PascalCaseStrategy())
                .writer();
    }

    @SdkTestInternalApi
    AsynchronousAgentDispatcher(ObjectWriter writer) {
        this.writer = writer;
    }

    /**
     * Add a task to asynchronously write {@code event} to the {@code channel}
     * if its serialized form does not exceed {@code maxSize}.
     *
     * @param event The event to write.
     * @param channel The channel to write to.
     * @param maxSize The maximum allowed size for the serialized {@code event}.
     *
     * @throws IllegalStateException If this dispatcher has not yet been
     * initialized via {@link #init()}.
     */
    public void addWriteTask(MonitoringEvent event, DatagramChannel channel, int maxSize) {
        if (!initialized) {
            throw new IllegalStateException("Dispatcher is not initialized!");
        }
        tasks.add(new WriteTask(event, channel, maxSize));
    }

    public synchronized void init() {
        if (!initialized) {
            tasks = new LinkedBlockingQueue<WriteTask>(QUEUE_SIZE);
            exec = Executors.newSingleThreadExecutor();
            exec.submit(new WriterRunnable());
            initialized = true;
        }
        ++refCount;
    }

    public synchronized void release() {
        if (refCount > 0) {
            --refCount;
        }

        if (refCount == 0 && initialized) {
            exec.shutdown();
            tasks.clear();
            exec = null;
            tasks = null;
            initialized = false;
        }
    }

    public synchronized static AsynchronousAgentDispatcher getInstance() {
        if (instance == null) {
            instance = new AsynchronousAgentDispatcher();
        }
        return instance;
    }

    private byte[] serialize(MonitoringEvent event) throws IOException {
        return writer.writeValueAsBytes(event);
    }

    private class WriterRunnable implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    WriteTask wt = tasks.take();
                    byte[] eventBytes = serialize(wt.event);
                    if (eventBytes.length > wt.maxSize) {
                        if (LOG.isDebugEnabled()) {
                            LOG.debug("Event exceeds the send maximum event size of " + wt.maxSize
                                    + ". Dropping event.");
                        }
                    } else {
                        wt.channel.write(ByteBuffer.wrap(eventBytes));
                    }
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    LOG.debug("Writer thread interrupted", ie);
                    break;
                } catch (Exception e) {
                    LOG.debug("Exception thrown while attempting to send event to agent", e);
                }
            }
        }
    }

    private static class WriteTask {
        private final MonitoringEvent event;
        private final DatagramChannel channel;
        private final int maxSize;

        public WriteTask(MonitoringEvent event, DatagramChannel channel, int maxSize) {
            this.event = event;
            this.channel = channel;
            this.maxSize = maxSize;
        }
    }
}
