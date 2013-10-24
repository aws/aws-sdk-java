/*
 * Copyright 2012-2013 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.transfer.internal;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListenerChain;
import com.amazonaws.services.s3.transfer.Transfer;
import com.amazonaws.services.s3.transfer.TransferProgress;

/**
 * Interface for multiple file transfers
 */
public abstract class MultipleFileTransfer extends AbstractTransfer {

    protected final Collection<? extends Transfer> subTransfers;
    
    /** Whether any of the sub-transfers has started. **/
    private AtomicBoolean subTransferStarted = new AtomicBoolean(false);
    
    MultipleFileTransfer(String description, TransferProgress transferProgress,
            ProgressListenerChain progressListenerChain, Collection<? extends Transfer> subTransfers) {
        super(description, transferProgress, progressListenerChain);
        this.subTransfers = subTransfers;
    }
    
    /**
     * @deprecated Replaced by {@link #MultipleFileTransfer(String, TransferProgress, ProgressListenerChain, Collection)}
     */
    @Deprecated
    MultipleFileTransfer(String description, TransferProgress transferProgress,
            com.amazonaws.services.s3.transfer.internal.ProgressListenerChain progressListenerChain, Collection<? extends Transfer> subTransfers) {
        this(description, transferProgress, progressListenerChain.transformToGeneralProgressListenerChain(), subTransfers);
    }

    /**
     * Set the state based on the states of all file downloads. Assumes all file
     * downloads are done.
     * <p>
     * A single failed sub-transfer makes the entire transfer failed. If there
     * are no failed sub-transfers, a single canceled sub-transfer makes the
     * entire transfer canceled. Otherwise, we consider ourselves Completed.
     */
    public void collateFinalState() {
        boolean seenCanceled = false;
        for ( Transfer download : subTransfers ) {
            if ( download.getState() == TransferState.Failed ) {
                setState(TransferState.Failed);
                return;
            } else if ( download.getState() == TransferState.Canceled ) {
                seenCanceled = true;
            }
        }
        if ( seenCanceled )
            setState(TransferState.Canceled);
        else
            setState(TransferState.Completed);
    }
    
    /**
     * Override this method so that TransferState updates are also sent out to the
     * progress listener chain in forms of ProgressEvent.
     */
    @Override
    public void setState(TransferState state) {
        super.setState(state);
        
        switch (state) {
        case Waiting:
            fireProgressEvent(ProgressEvent.PREPARING_EVENT_CODE);
            break;
        case InProgress:
            if ( subTransferStarted.compareAndSet(false, true) ) {
                /* The first InProgress signal */
                fireProgressEvent(ProgressEvent.STARTED_EVENT_CODE);
            }
            /* Don't need any event code update for subsequent InProgress signals */
            break;
        case Completed:
            fireProgressEvent(ProgressEvent.COMPLETED_EVENT_CODE);
            break;
        case Canceled:
            fireProgressEvent(ProgressEvent.CANCELED_EVENT_CODE);
            break;
        case Failed:
            fireProgressEvent(ProgressEvent.FAILED_EVENT_CODE);
            break;
        default:
            break;
        }
    }
}
