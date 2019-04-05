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
package com.amazonaws.handlers;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.ClassLoaderHelper;
import com.amazonaws.util.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/**
 * Factory for creating request/response handler chains.
 */
public class HandlerChainFactory {

    private static final String GLOBAL_HANDLER_PATH = "com/amazonaws/global/handlers/request.handler2s";

    /**
     * For backward compatibility, constructs a new request handler chain adapted to {@link RequestHandler2} by analyzing the
     * specified classpath resource.
     *
     * @param resource The resource to load from the classpath containing the list of request handlers to instantiate.
     * @return A list of request handlers based on the handlers referenced in the specified resource.
     */
    public List<RequestHandler2> newRequestHandlerChain(String resource) {
        return createRequestHandlerChain(resource, RequestHandler.class);
    }

    /**
     * Constructs a new request handler (v2) chain by analyzing the specified classpath resource.
     *
     * @param resource The resource to load from the classpath containing the list of request handlers to instantiate.
     * @return A list of request handlers based on the handlers referenced in the specified resource.
     */
    public List<RequestHandler2> newRequestHandler2Chain(String resource) {
        return createRequestHandlerChain(resource, RequestHandler2.class);
    }

    public List<RequestHandler2> getGlobalHandlers() {
        List<RequestHandler2> handlers = new ArrayList<RequestHandler2>();
        BufferedReader fileReader = null;

        try {
            List<URL> globalHandlerListLocations = Collections
                    .list(getGlobalHandlerResources());

            for (URL url : globalHandlerListLocations) {

                fileReader = new BufferedReader(new InputStreamReader(url.openStream(), StringUtils.UTF8));
                while (true) {
                    String requestHandlerClassName = fileReader.readLine();
                    if (requestHandlerClassName == null) {
                        break;
                    }
                    RequestHandler2 requestHandler = createRequestHandler(requestHandlerClassName, RequestHandler2.class);
                    if (requestHandler == null) {
                        continue;
                    }
                    handlers.add(requestHandler);
                }
            }

        } catch (Exception e) {
            throw new AmazonClientException("Unable to instantiate request handler chain for client: "
                                            + e.getMessage(), e);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
            }
        }
        return handlers;
    }

    private Enumeration<URL> getGlobalHandlerResources() throws IOException {
        // Classloader may be null if loaded by bootstrap classloader.
        if (HandlerChainFactory.class.getClassLoader() == null) {
            return ClassLoader.getSystemResources(GLOBAL_HANDLER_PATH);
        }
        return HandlerChainFactory.class.getClassLoader().getResources(GLOBAL_HANDLER_PATH);
    }

    private RequestHandler2 createRequestHandler(String handlerClassName, Class<?> handlerApiClass)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        handlerClassName = handlerClassName.trim();
        if (handlerClassName.equals("")) {
            return null;
        }
        Class<?> requestHandlerClass = ClassLoaderHelper.loadClass(
                handlerClassName,
                handlerApiClass, getClass());
        Object requestHandlerObject = requestHandlerClass.newInstance();
        if (handlerApiClass.isInstance(requestHandlerObject)) {
            if (handlerApiClass == RequestHandler2.class) {
                return (RequestHandler2) requestHandlerObject;

            } else if (handlerApiClass == RequestHandler.class) {
                return RequestHandler2.adapt((RequestHandler) requestHandlerObject);

            } else {
                throw new IllegalStateException();
            }
        } else {
            throw new AmazonClientException(
                    "Unable to instantiate request handler chain for client.  "
                    + "Listed request handler ('"
                    + handlerClassName + "') "
                    + "does not implement the "
                    + handlerApiClass + " API.");
        }
    }

    private List<RequestHandler2> createRequestHandlerChain(String resource, Class<?> handlerApiClass) {
        List<RequestHandler2> handlers = new ArrayList<RequestHandler2>();
        BufferedReader reader = null;

        try {
            InputStream input = getClass().getResourceAsStream(resource);
            if (input == null) {
                return handlers;
            }

            reader = new BufferedReader(new InputStreamReader(input, StringUtils.UTF8));
            while (true) {
                String requestHandlerClassName = reader.readLine();
                if (requestHandlerClassName == null) {
                    break;
                }
                RequestHandler2 requestHandler = createRequestHandler(requestHandlerClassName, handlerApiClass);
                if (requestHandler == null) {
                    continue;
                }
                handlers.add(requestHandler);
            }
        } catch (Exception e) {
            throw new AmazonClientException("Unable to instantiate request handler chain for client: "
                                            + e.getMessage(), e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
        return handlers;
    }
}
