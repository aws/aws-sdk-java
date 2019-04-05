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
package com.amazonaws;

import com.amazonaws.internal.SdkThreadLocalsRegistry;

/**
 * Utility class to manage {@link ThreadLocal} storage within the AWS SDK.
 *
 * <p>
 * {@code ThreadLocal} removal is especially relevant when the AWS SDK is used
 * in an application server that manages a pool of threads across many
 * applications (for example Tomcat or Glassfish). If a {@code ThreadLocal} is
 * not cleared on application shutdown and the {@code ThreadLocal} value is a
 * class from the application classloader then the application classloader
 * cannot be garbage collected until the {@code ThreadLocal} is set again or the thread
 * is disposed of (Glassfish attempts thread renewal on occasion to help with
 * this).
 */
public final class SdkThreadLocals {

    private SdkThreadLocals() {
        // prevent instantiation
    }

    /**
     * Removes the current thread's values for all {@link ThreadLocal}s used by the
     * AWS SDK.
     */
    public static void remove() {
        SdkThreadLocalsRegistry.remove();
    }

}