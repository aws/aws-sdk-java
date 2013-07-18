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
package com.amazonaws.services.s3.model;

/**
 * Notification of a progress change on an Amazon S3 transfer. Typically this
 * means notice that another chunk of bytes was transferred, but it also signals
 * other types of progress events such as a transfer starting, or failing.
 */
public class ProgressEvent {
    // Single part event codes
    public static final int STARTED_EVENT_CODE   = 1;
    public static final int COMPLETED_EVENT_CODE = 2;
    public static final int FAILED_EVENT_CODE    = 4;
    public static final int CANCELED_EVENT_CODE  = 8;

    // Multipart event codes
    public static final int PART_STARTED_EVENT_CODE   = 1024;
    public static final int PART_COMPLETED_EVENT_CODE = 2048;
    public static final int PART_FAILED_EVENT_CODE    = 4096;
    

    /** The number of bytes transferred since the last progress event. */
    private int bytesTransferred;
    
    /**
     * The unique event code that identifies what type of specific type of event
     * this object represents.
     */
    private int eventCode;

    
    public ProgressEvent(int bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
    }

    /**
     * @deprecated Replaced by {@link #setBytesTransferred()}
     */
    @Deprecated
    public void setBytesTransfered(int bytesTransferred) {
        setBytesTransferred(bytesTransferred);
    }

    /**
     * Sets the number of bytes transferred since the last progress event.
     * 
     * @param bytesTransferred
     *            The number of bytes transferred since the last progress event.
     */
    public void setBytesTransferred(int bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
    }

    /**
     * @deprecated Replaced by {@link #getBytesTransferred()}
     */
    @Deprecated
    public int getBytesTransfered() {
        return getBytesTransferred();
    }

    /**
     * Returns the number of bytes transferred since the last progress event.
     * 
     * @return The number of bytes transferred since the last progress event.
     */
    public int getBytesTransferred() {
        return bytesTransferred;
    }

    /**
     * Returns the unique event code that identifies what type of specific type
     * of event this object represents.
     * 
     * @return The unique event code that identifies what type of specific type
     *         of event this object represents.
     */
    public int getEventCode() {
        return eventCode;
    }

    /**
     * Sets the unique event code that identifies what type of specific type of
     * event this object represents.
     * 
     * @param eventType
     *            The unique event code that identifies what type of specific
     *            type of event this object represents.
     */
    public void setEventCode(int eventType) {
        this.eventCode = eventType;
    }

}
