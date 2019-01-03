/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal;

import com.amazonaws.annotation.SdkProtectedApi;
import java.util.ArrayList;
import java.util.List;

@SdkProtectedApi
public final class SdkThreadLocalsRegistry {

    private static final List<ThreadLocal<?>> threadLocals = new ArrayList<ThreadLocal<?>>();

    private SdkThreadLocalsRegistry() {
        // prevent instantiation
    }

    /**
     * Registers {@link ThreadLocal} objects in use by the AWS SDK so that their values can 
     * be removed via the {@link #remove()} method.
     *
     * <p>To avoid memory leaks and reduce contention this method should only be called when 
     * setting static final locations (for example finals in enums or static final fields).
     *
     * @param threadLocal ThreadLocal to register
     * @return the input ThreadLocal
     */
    public static synchronized <T> ThreadLocal<T> register(ThreadLocal<T> threadLocal) {
        threadLocals.add(threadLocal);
        return threadLocal;
    }

    public synchronized static void remove() {
        for (ThreadLocal<?> t: threadLocals) {
            t.remove();
        }
    }

}