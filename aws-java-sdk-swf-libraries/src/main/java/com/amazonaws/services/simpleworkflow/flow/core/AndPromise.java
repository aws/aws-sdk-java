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

import java.util.Collection;

/**
 * Promise that becomes ready when all its values are ready. <code>null</code>
 * value is considered ready.
 */
public class AndPromise extends Promise<Void> {

    private final class AndPromiseCallback implements Runnable {

        private int count;

        AndPromiseCallback(int count) {
            this.count = count;
        }

        @Override
        public void run() {
            if (--count == 0) {
                impl.set(null);
            }
        }
    }

    private static final Promise<?>[] EMPTY_VALUE_ARRAY = new Promise[0];

    private final Settable<Void> impl = new Settable<Void>();

    @SuppressWarnings("rawtypes")
    private final Promise[] values;

    public AndPromise(Promise<?>... values) {
        this.values = values;
        if (values.length == 0) {
            impl.set(null);
        }
        Runnable callback = new AndPromiseCallback(values.length);
        for (Promise<?> value : values) {
            if (value != null) {
                value.addCallback(callback);
            }
            else {
                callback.run();
            }
        }
    }

    @SuppressWarnings({ "rawtypes" })
    public AndPromise(Collection<Promise> collection) {
        this(collection.toArray(EMPTY_VALUE_ARRAY));
    }

    @SuppressWarnings("rawtypes")
    public Promise[] getValues() {
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
