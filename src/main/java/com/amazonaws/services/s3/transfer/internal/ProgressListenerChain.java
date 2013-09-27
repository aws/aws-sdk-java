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
package com.amazonaws.services.s3.transfer.internal;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.services.s3.model.LegacyS3ProgressListener;
import com.amazonaws.services.s3.model.ProgressEvent;
import com.amazonaws.services.s3.model.ProgressListener;

/**
 * @deprecated Replaced by {@link com.amazonaws.event.ProgressListenerChain}
 */
@Deprecated
public class ProgressListenerChain implements ProgressListener {
    private final List<ProgressListener> listeners = new CopyOnWriteArrayList<ProgressListener>();

    private static final Log log = LogFactory.getLog(ProgressListenerChain.class);
    
    public ProgressListenerChain(ProgressListener... listeners) {
        for (ProgressListener listener : listeners) addProgressListener(listener);
    }

    public synchronized void addProgressListener(ProgressListener listener) {
        if (listener == null) return;
        this.listeners.add(listener);
    }

    public synchronized void removeProgressListener(ProgressListener listener) {
        if (listener == null) return;
        this.listeners.remove(listener);
    }

    public void progressChanged(final ProgressEvent progressEvent) {
        for ( ProgressListener listener : listeners ) {
            try {
                listener.progressChanged(progressEvent);
            } catch ( Throwable t ) {
                log.warn("Couldn't update progress listener", t);
            }
        }
    }
    
    public com.amazonaws.event.ProgressListenerChain transformToGeneralProgressListenerChain() {
        com.amazonaws.event.ProgressListenerChain newProgressListenerChain = new com.amazonaws.event.ProgressListenerChain();
        for ( ProgressListener listener : listeners ) {
            newProgressListenerChain.addProgressListener(new LegacyS3ProgressListener(listener));
        }
        return newProgressListenerChain;
    }
}
