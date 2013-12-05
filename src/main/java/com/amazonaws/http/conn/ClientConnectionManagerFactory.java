/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;

public class ClientConnectionManagerFactory {
    private static final Log log = LogFactory.getLog(ClientConnectionManagerFactory.class);
    private static final Class<?>[] interfaces = {
        ClientConnectionManager.class,
        Wrapped.class
    };

    /**
     * Returns a wrapped instance of {@link ClientConnectionManager}
     * to capture the necessary performance metrics.
     * @param orig the target instance to be wrapped
     */
    public static ClientConnectionManager wrap(ClientConnectionManager orig) {
        if (orig instanceof Wrapped)
            throw new IllegalArgumentException();
        return (ClientConnectionManager) Proxy.newProxyInstance(
                // https://github.com/aws/aws-sdk-java/pull/48#issuecomment-29454423
                ClientConnectionManagerFactory.class.getClassLoader(),
                interfaces,
                new Handler(orig));
    }

    /**
     * The handler behind the dynamic proxy for {@link ClientConnectionManager}
     * so that the any returned instance of {@link ClientConnectionRequest} can
     * further wrapped for capturing performance metrics.
     */
    private static class Handler implements InvocationHandler {
        private final ClientConnectionManager orig;
        Handler(ClientConnectionManager real) {
            this.orig = real;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            try {
                Object ret = method.invoke(orig, args);
                return ret instanceof ClientConnectionRequest
                     ? ClientConnectionRequestFactory.wrap((ClientConnectionRequest) ret)
                     : ret
                     ;
            } catch (InvocationTargetException e) {
                log.debug("", e);
                throw e.getCause();
            }
        }
    }
}
