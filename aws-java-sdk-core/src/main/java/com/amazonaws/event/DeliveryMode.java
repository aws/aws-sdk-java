/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.event;

/**
 * Used to indicate whether it is safe to deliver progress events to the
 * listener synchronously. In general, a progress listener should never block,
 * which is a necessary condition for the safety for synchronous delivery.
 * 
 * @see SyncProgressListener
 */
public interface DeliveryMode {
    /**
     * Returns true if it is safe to make a synchronous callback to the
     * implementing listener without the risk of incurring undue latency; false
     * otherwise.
     */
    public boolean isSyncCallSafe();

    /**
     * Provides convenient method to check if a listener is safe to be invoked
     * synchronously.
     */
    public static class Check {
        public static boolean isSyncCallSafe(ProgressListener listener) {
            if (listener instanceof DeliveryMode) {
                DeliveryMode mode = (DeliveryMode) listener;
                return mode.isSyncCallSafe();
            }
            return listener == null;
        }
    }
}
