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
package com.amazonaws.http.conn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ConnectionRequest;

import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.ServiceLatencyProvider;
import com.amazonaws.util.AWSServiceMetrics;

class ClientConnectionRequestFactory {
    private static final Log log = LogFactory.getLog(ClientConnectionRequestFactory.class);
    private static final Class<?>[] interfaces = {
            ConnectionRequest.class,
        Wrapped.class
    };

    /**
     * Returns a wrapped instance of {@link ConnectionRequest}
     * to capture the necessary performance metrics.
     * @param orig the target instance to be wrapped
     */
    static ConnectionRequest wrap(ConnectionRequest orig) {
        if (orig instanceof Wrapped)
            throw new IllegalArgumentException();
        return (ConnectionRequest) Proxy.newProxyInstance(
                // https://github.com/aws/aws-sdk-java/pull/48#issuecomment-29454423
                ClientConnectionRequestFactory.class.getClassLoader(),
                interfaces,
                new Handler(orig));
    }

    /**
     * The handler behind the dynamic proxy for {@link ConnectionRequest}
     * so that the latency of the
     * {@link ConnectionRequest#get(long, java.util.concurrent.TimeUnit)}
     * can be captured.
     */
    private static class Handler implements InvocationHandler {
        private final ConnectionRequest orig;
        Handler(ConnectionRequest orig) {
            this.orig = orig;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            try {
                if ("get".equals(method.getName())) {
                    ServiceLatencyProvider latencyProvider = new ServiceLatencyProvider(
                            AWSServiceMetrics.HttpClientGetConnectionTime);
                    try {
                        return method.invoke(orig, args);
                    } finally {
                        AwsSdkMetrics.getServiceMetricCollector()
                                .collectLatency(latencyProvider.endTiming());
                    }
                }
                return method.invoke(orig, args);
            } catch (InvocationTargetException e) {
                log.debug("", e);
                throw e.getCause();
            }
        }
    }
}
