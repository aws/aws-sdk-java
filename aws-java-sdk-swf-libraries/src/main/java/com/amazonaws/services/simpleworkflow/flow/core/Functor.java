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

public abstract class Functor<T> extends Promise<T> {

    private final Settable<T> result = new Settable<T>();

    public Functor(Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                result.chain(Functor.this.doExecute());
            }
        };
    }

    protected abstract Promise<T> doExecute() throws Throwable;

    @Override
    public T get() {
        return result.get();
    }

    @Override
    public boolean isReady() {
        return result.isReady();
    }

    @Override
    protected void addCallback(Runnable callback) {
        result.addCallback(callback);
    }

    @Override
    protected void removeCallback(Runnable callback) {
        result.removeCallback(callback);
    }
}
