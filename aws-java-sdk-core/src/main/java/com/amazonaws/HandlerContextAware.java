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

package com.amazonaws;

import com.amazonaws.handlers.HandlerContextKey;

/**
 * An implementing object is capable of storing context that is visible to all {@link com.amazonaws.handlers.RequestHandler2}.
 *
 * <p>This interface is subject to change and should not be implemented by users of the SDK.</p>
 */
public interface HandlerContextAware {
    /**
     * Adds a context to that is visible to all {@link com.amazonaws.handlers.RequestHandler2}s.
     *
     * Note that, context added here will available only for the scope of
     * the request execution and will not be marshalled over the wire.
     * @param key the key for the property being set in the request.
     * @param value the value for the property being set in the request.
     */
    <X> void addHandlerContext(HandlerContextKey<X> key, X value);

    /**
     * Return the context for the given key if present; else return null.
     *
     * @param key the key for the context
     * @return the context if present else null.
     */
    <X> X getHandlerContext(HandlerContextKey<X> key);
}
