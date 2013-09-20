/*
 * Copyright 2012-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionManager;

/**
 * Daemon thread to periodically check connection pools for idle connections.
 * <p>
 * Connections sitting around idle in the HTTP connection pool for too long will
 * eventually be terminated by the AWS end of the connection, and will go into
 * CLOSE_WAIT. If this happens, sockets will sit around in CLOSE_WAIT, still
 * using resources on the client side to manage that socket. Many sockets stuck
 * in CLOSE_WAIT can prevent the OS from creating new connections.
 * <p>
 * This class closes idle connections before they can move into the CLOSE_WAIT
 * state.
 * <p>
 * This thread is important because by default, we disable Apache HttpClient's
 * stale connection checking, so without this thread running in the background,
 * cleaning up old/inactive HTTP connections, we'd see more IO exceptions when
 * stale connections (i.e. closed on the AWS side) are left in the connection
 * pool, and requests grab one of them to begin executing a request.
 */
public final class IdleConnectionReaper extends Thread {

    /** The period between invocations of the idle connection reaper. */
    private static final int PERIOD_MILLISECONDS = 1000 * 60 * 1;

    /**
     * The list of registered connection managers, whose connections
     * will be periodically checked and idle connections closed.
     */
    private static ArrayList<ClientConnectionManager> connectionManagers = new ArrayList<ClientConnectionManager>();

    /** Singleton instance of the connection reaper. */
    private static IdleConnectionReaper instance;

    /** Shared log for any errors during connection reaping. */
    static final Log log = LogFactory.getLog(IdleConnectionReaper.class);

    /** Private constructor - singleton pattern. */
    private IdleConnectionReaper() {
        super("java-sdk-http-connection-reaper");
        setDaemon(true);
        start();
    }

    public static synchronized void registerConnectionManager(ClientConnectionManager connectionManager) {
        if (instance == null) instance = new IdleConnectionReaper();
        connectionManagers.add(connectionManager);
    }

    public static synchronized void removeConnectionManager(ClientConnectionManager connectionManager) {
        connectionManagers.remove(connectionManager);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(PERIOD_MILLISECONDS);

                // Copy the list of managed ConnectionManagers to avoid possible
                // ConcurrentModificationExceptions if registerConnectionManager or
                // removeConnectionManager are called while we're iterating (rather
                // than block/lock while this loop executes).
                List<ClientConnectionManager> connectionManagers = null;
                synchronized (IdleConnectionReaper.class) {
                    connectionManagers = (List<ClientConnectionManager>)IdleConnectionReaper.connectionManagers.clone();
                }
                for (ClientConnectionManager connectionManager : connectionManagers) {
                    // When we release connections, the connection manager leaves them
                    // open so they can be reused.  We want to close out any idle
                    // connections so that they don't sit around in CLOSE_WAIT.
                    try {
                        connectionManager.closeIdleConnections(60, TimeUnit.SECONDS);
                    } catch (Throwable t) {
                        log.warn("Unable to close idle connections", t);
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    /**
     * Shuts down the thread, allowing the class and instance to be collected.
     * <p>
     * Since this is a daemon thread, its running will not prevent JVM shutdown.
     * It will, however, prevent this class from being unloaded or garbage
     * collected, in the context of a long-running application, until it is
     * interrupted. This method will stop the thread's execution and clear its
     * state. Any use of a service client will cause the thread to be restarted.
     */
    public static synchronized void shutdown() {
        if ( instance != null ) {
            instance.interrupt();
            connectionManagers.clear();
            instance = null;
        }
    }
}