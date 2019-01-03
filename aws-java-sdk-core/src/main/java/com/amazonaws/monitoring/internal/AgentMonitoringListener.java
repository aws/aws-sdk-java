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


import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.DatagramChannel;

import com.amazonaws.monitoring.MonitoringEvent;
import com.amazonaws.monitoring.MonitoringListener;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * An implementation of the Monitoring Listener Interface that streams monitoring events to a local agent.
 */
@SdkInternalApi
public final class AgentMonitoringListener extends MonitoringListener {

    private static final Log LOG = LogFactory.getLog(AgentMonitoringListener.class);
    private static final String SIMPLE_NAME = "AgentMonitoringListener";
    private static final int MAX_BUFFER_SIZE = 8192;

    private final AsynchronousAgentDispatcher dispatcher;
    private final DatagramChannel channel;
    private final int maxSize;

    /**
     * Initialize AgentMonitoringListener.
     *
     * @param port the port of the local agent
     * @throws SdkClientException
     */
    public AgentMonitoringListener(int port) throws SdkClientException {
        try {
            this.dispatcher = AsynchronousAgentDispatcher.getInstance();
            this.dispatcher.init();

            channel = DatagramChannel.open();
            channel.configureBlocking(false);

            if (channel.socket().getSendBufferSize() < MAX_BUFFER_SIZE) {
                channel.socket().setSendBufferSize(MAX_BUFFER_SIZE);
            }

            //SO_SNDBUF is just a hint and it is implementation specific if the packet is sent or discarded.
            maxSize = Math.min(MAX_BUFFER_SIZE, channel.socket().getSendBufferSize());

            if (maxSize < MAX_BUFFER_SIZE && LOG.isDebugEnabled()) {
                LOG.debug(String.format("System socket buffer size %d is less than 8K. Any events larger than the buffer size "
                                        + "will be dropped", maxSize));
            }
            channel.connect(new InetSocketAddress("localhost", port));
        } catch (Exception e) {
            throw new SdkClientException("Failed to initialize AgentMonitoringListener", e);
        }
    }

    /** Used for unit test */
    @SdkTestInternalApi
    AgentMonitoringListener(DatagramChannel channel, AsynchronousAgentDispatcher dispatcher, int maxSize) {
        this.channel = channel;
        this.dispatcher = dispatcher;
        this.maxSize = maxSize;
    }

    @Override
    public void handleEvent(MonitoringEvent event) {
        dispatcher.addWriteTask(event, channel, maxSize);
    }

    @Override
    public String toString() {
        return SIMPLE_NAME;
    }

    public void shutdown() {
        dispatcher.release();
        try {
            channel.close();
        } catch (IOException ioe) {
            LOG.error("Could not close datagram channel", ioe);
        }
    }
}
