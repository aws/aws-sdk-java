/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.transfer.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

import com.amazonaws.services.s3.model.ProgressEvent;
import com.amazonaws.services.s3.model.ProgressListener;

public class ProgressListenerChain implements ProgressListener {
    private List<ProgressListener> listeners = new ArrayList<ProgressListener>();
    private final ExecutorService executor;

    public ProgressListenerChain(ExecutorService executor, ProgressListener... listeners) {
        this.executor = executor;
        for (ProgressListener listener : listeners) addProgressListener(listener);
    }
    
    public void addProgressListener(ProgressListener listener) {
        if (listener == null) return;
        this.listeners.add(listener);
    }
    
    public void removeProgressListener(ProgressListener listener) {
        if (listener == null) return;
        this.listeners.remove(listener);
    }

    public void progressChanged(final ProgressEvent progressEvent) {
        executor.submit(new Runnable() {
            public void run() {
                for (ProgressListener listener : listeners) {
                    try {
                        listener.progressChanged(progressEvent);
                    } catch (Throwable t) {}
                }
            }
        });
    }
}