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
import com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent;
import com.amazonaws.monitoring.MonitoringEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
    private static final ExecutorService EXEC = Executors.newSingleThreadExecutor();
    private static final CsmPortListener AGENT_LISTENER = new CsmPortListener();
    @Mock
    private AsynchronousAgentDispatcher dispatcher;

    @Mock
    private DatagramChannel channel;

    private AgentMonitoringListener monitoringListener;

    @BeforeClass
    public static void setup() {
        EXEC.submit(new Runnable() {
            @Override
            public void run() {
                AGENT_LISTENER.run();
            }
        });
    }

    @AfterClass
    public static void teardown() throws IOException {
        AGENT_LISTENER.shutdown();
        EXEC.shutdown();
    }

    @Before
    public void methodSetup() {
        monitoringListener = new AgentMonitoringListener(channel, dispatcher, 8192);
        AGENT_LISTENER.resetCount();
    }

    @Test(expected = SdkClientException.class)
    public void invalidHostName_throwsException() {
        new AgentMonitoringListener("foo-bar-baz-1234", 1234);
    }

    @Test
    public void respectsHostConfig_localhost() throws InterruptedException {
        dispatchToHostTest("localhost");
    }

    @Test
    public void respectsHostConfig_hostname() throws UnknownHostException, InterruptedException {
        String hostname = InetAddress.getLocalHost().getHostName();
        dispatchToHostTest(hostname);
    }

    @Test
    public void respectsHostConfig_ipv6Loopback() throws InterruptedException {
        dispatchToHostTest("::1");
    }

    private void dispatchToHostTest(String host) throws InterruptedException {
        AgentMonitoringListener listener = null;
        try {
            listener = new AgentMonitoringListener(host, AGENT_LISTENER.getPort());
            listener.handleEvent(new TestEvent("foo1"));
            Thread.sleep(1000);
        } finally {
            if (listener != null) {
                listener.shutdown();
            }
        }
    }

    @Test
    public void delegatesWriteToDispatcher() {
        ApiCallAttemptMonitoringEvent event = new ApiCallAttemptMonitoringEvent();
        monitoringListener.handleEvent(event);
        verify(dispatcher).addWriteTask(eq(event), eq(channel), eq(8192));
    }

    public static class TestEvent implements MonitoringEvent {
        private String foo;

        public TestEvent(String foo) {
            this.foo = foo;
        }

        public void setFoo(String foo) {
            this.foo = foo;
        }

        public String getFoo() {
            return foo;
        }
    }

    private static class CsmPortListener {
        private final AtomicLong receivedMessages = new AtomicLong(0);
        private final DatagramSocket ds;

        private CsmPortListener() {
            try {
                ds = new DatagramSocket();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void resetCount() {
            receivedMessages.set(0);
        }

        public long getCount() {
            return receivedMessages.get();
        }

        public void shutdown() throws IOException {
            ds.close();
        }

        public int getPort() {
            return ds.getLocalPort();
        }

        public void run() {
            try {
                while (!ds.isClosed()) {
                    DatagramPacket p = new DatagramPacket(new byte[1024], 1024);
                    ds.receive(p);
                    receivedMessages.incrementAndGet();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
