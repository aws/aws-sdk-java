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
package com.amazonaws.http;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.HttpClientConnectionManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * Daemon thread to periodically check connection pools for idle connections.
 * <p/>
 * Connections sitting around idle in the HTTP connection pool for too long will
 * eventually be terminated by the AWS end of the connection, and will go into
 * CLOSE_WAIT. If this happens, sockets will sit around in CLOSE_WAIT, still
 * using resources on the client side to manage that socket. Many sockets stuck
 * in CLOSE_WAIT can prevent the OS from creating new connections.
 * <p/>
 * This class closes idle connections before they can move into the CLOSE_WAIT
 * state.
 * <p/>
 * This thread is important because by default, we disable Apache HttpClient's
 * stale connection checking, so without this thread running in the background,
 * cleaning up old/inactive HTTP connections, we'd see more IO exceptions when
 * stale connections (i.e. closed on the AWS side) are left in the connection
 * pool, and requests grab one of them to begin executing a request.
 */
@SdkInternalApi
public final class IdleConnectionReaper extends Thread {

    /**
     * Shared log for any errors during connection reaping.
     */
    private static final Log LOG = LogFactory.getLog(IdleConnectionReaper.class);
    /**
     * The period between invocations of the idle connection reaper.
     */
    private static final int PERIOD_MILLISECONDS = 1000 * 60;

    /**
     * Legacy constant used when {@link #registerConnectionManager(HttpClientConnectionManager)} is called. New code paths should
     * use {@link #registerConnectionManager(HttpClientConnectionManager, long)} and provide the max idle timeout for that
     * particular connection manager.
     */
    @Deprecated
    private static final int DEFAULT_MAX_IDLE_MILLIS = 1000 * 60;

    private static final Map<HttpClientConnectionManager, Long> connectionManagers = new ConcurrentHashMap<HttpClientConnectionManager, Long>();
    /**
     * Singleton instance of the connection reaper.
     */
    private static volatile IdleConnectionReaper instance;
    /**
     * Set to true when shutting down the reaper;  Once set to true, this
     * flag is never set back to false.
     */
    private volatile boolean shuttingDown;

    /**
     * Private constructor - singleton pattern.
     */
    private IdleConnectionReaper() {
        super("java-sdk-http-connection-reaper");
        setDaemon(true);
    }

    /**
     * Registers the given connection manager with this reaper.
     *
     * @return true if the connection manager has been successfully registered; false otherwise.
     * @deprecated By {@link #registerConnectionManager(HttpClientConnectionManager, long)}.
     */
    @Deprecated
    public static boolean registerConnectionManager(HttpClientConnectionManager connectionManager) {
        return registerConnectionManager(connectionManager, DEFAULT_MAX_IDLE_MILLIS);
    }

    /**
     * Registers the given connection manager with this reaper;
     *
     * @param connectionManager Connection manager to register
     * @param maxIdleInMs       Max idle connection timeout in milliseconds for this connection manager.
     * @return true if the connection manager has been successfully registered; false otherwise.
     */
    public static boolean registerConnectionManager(HttpClientConnectionManager connectionManager, long maxIdleInMs) {
        if (instance == null) {
            synchronized (IdleConnectionReaper.class) {
                if (instance == null) {
                    instance = new IdleConnectionReaper();
                    instance.start();
                }
            }
        }
        return connectionManagers.put(connectionManager, maxIdleInMs) == null;
    }

    /**
     * Removes the given connection manager from this reaper,
     * and shutting down the reaper if there is zero connection manager left.
     *
     * @return true if the connection manager has been successfully removed;
     * false otherwise.
     */
    public static boolean removeConnectionManager(HttpClientConnectionManager connectionManager) {
        boolean wasRemoved = connectionManagers.remove(connectionManager) != null;
        if (connectionManagers.isEmpty()) {
            shutdown();
        }
        return wasRemoved;
    }

    @SdkTestInternalApi
    public static List<HttpClientConnectionManager> getRegisteredConnectionManagers() {
        return new ArrayList<HttpClientConnectionManager>(connectionManagers.keySet());
    }

    /**
     * Shuts down the thread, allowing the class and instance to be collected.
     * <p/>
     * Since this is a daemon thread, its running will not prevent JVM shutdown.
     * It will, however, prevent this class from being unloaded or garbage
     * collected, in the context of a long-running application, until it is
     * interrupted. This method will stop the thread's execution and clear its
     * state. Any use of a service client will cause the thread to be restarted.
     *
     * @return true if an actual shutdown has been made; false otherwise.
     */
    public static synchronized boolean shutdown() {
        if (instance != null) {
            instance.markShuttingDown();
            instance.interrupt();
            connectionManagers.clear();
            instance = null;
            return true;
        }
        return false;
    }

    /**
     * For testing purposes.
     * Returns the number of connection managers currently monitored by this
     * reaper.
     */
    static int size() {
        return connectionManagers.size();
    }

    private void markShuttingDown() {
        shuttingDown = true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void run() {
        while (!shuttingDown) {
            try {
                for (Map.Entry<HttpClientConnectionManager, Long> entry : connectionManagers.entrySet()) {
                    // When we release connections, the connection manager leaves them
                    // open so they can be reused.  We want to close out any idle
                    // connections so that they don't sit around in CLOSE_WAIT.
                    try {
                        entry.getKey().closeIdleConnections(entry.getValue(), TimeUnit.MILLISECONDS);
                    } catch (Exception t) {
                        LOG.warn("Unable to close idle connections", t);
                    }
                }

                Thread.sleep(PERIOD_MILLISECONDS);
            } catch (Throwable t) {
                LOG.debug("Reaper thread: ", t);
            }
        }

        LOG.debug("Shutting down reaper thread.");
    }
}