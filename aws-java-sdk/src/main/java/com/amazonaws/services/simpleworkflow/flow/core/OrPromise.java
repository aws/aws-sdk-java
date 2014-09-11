/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.core;

/**
 * Promise that becomes ready when any of its values becomes ready.
 * <code>null</code> value is considered ready.
 */
public class OrPromise extends Promise<Void> {

    private final class OrPromiseCallback implements Runnable {

        @Override
        public void run() {
            if (!impl.isReady()) {
                impl.set(null);
            }
        }
    }

    private final Settable<Void> impl = new Settable<Void>();

    private final Promise<?>[] values;

    public OrPromise(Promise<?>... values) {
        this.values = values;
        Runnable callback = new OrPromiseCallback();
        for (Promise<?> value : values) {
            if (value != null) {
                value.addCallback(callback);
            }
            else {
                callback.run();
            }
        }
    }

    public Promise<?>[] getValues() {
        return values;
    }

    @Override
    protected void addCallback(Runnable callback) {
        impl.addCallback(callback);
    }

    @Override
    public Void get() {
        return impl.get();
    }

    @Override
    public boolean isReady() {
        return impl.isReady();
    }

    @Override
    protected void removeCallback(Runnable callback) {
        impl.removeCallback(callback);
    }

}
