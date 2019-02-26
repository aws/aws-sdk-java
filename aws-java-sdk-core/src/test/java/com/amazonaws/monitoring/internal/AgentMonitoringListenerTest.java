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

import com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent;
import com.amazonaws.monitoring.internal.AgentMonitoringListener;
import com.amazonaws.monitoring.internal.AsynchronousAgentDispatcher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.nio.channels.DatagramChannel;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

/**
 * Tests for {@link AgentMonitoringListener}.
 */
@RunWith(MockitoJUnitRunner.class)
public class AgentMonitoringListenerTest {
    @Mock
    private AsynchronousAgentDispatcher dispatcher;

    @Mock
    private DatagramChannel channel;

    private AgentMonitoringListener monitoringListener;

    @Before
    public void methodSetup() {
        monitoringListener = new AgentMonitoringListener(channel, dispatcher, 8192);
    }

    @Test
    public void delegatesWriteToDispatcher() {
        ApiCallAttemptMonitoringEvent event = new ApiCallAttemptMonitoringEvent();
        monitoringListener.handleEvent(event);
        verify(dispatcher).addWriteTask(eq(event), eq(channel), eq(8192));
    }
}
