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
package com.amazonaws.event;

/**
 * Notification of a progress change on a transfer. Typically this means notice
 * that another chunk of bytes was transferred, but it also signals other types
 * of progress events such as a transfer starting, or failing.
 * <p>
 * This class could be used for both Amazon S3 and Amazon Glacier clients. The
 * legacy Amazon S3 progress event
 * com.amazonaws.services.s3.model.ProgressEvent has been deprecated in favor
 * of this new class.
 * </p>
 */
public class ProgressEvent {

    public static final int PREPARING_EVENT_CODE = 1;
    public static final int STARTED_EVENT_CODE   = 2;
    public static final int COMPLETED_EVENT_CODE = 4;
    public static final int FAILED_EVENT_CODE    = 8;
    public static final int CANCELED_EVENT_CODE  = 16;
    public static final int RESET_EVENT_CODE     = 32;

    // Multipart event codes
    public static final int PART_STARTED_EVENT_CODE   = 1024;
    public static final int PART_COMPLETED_EVENT_CODE = 2048;
    public static final int PART_FAILED_EVENT_CODE    = 4096;


    /** The number of bytes transferred since the last progress event. */
    protected long bytesTransferred;

    /**
     * The unique event code identifying the type of event this object
     * represents.
     */
    protected int eventCode;


    public ProgressEvent(long bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
    }

    public ProgressEvent(int eventCode, long bytesTransferred) {
        this.eventCode = eventCode;
        this.bytesTransferred = bytesTransferred;
    }


    /**
     * Sets the number of bytes transferred since the last progress event.
     *
     * @param bytesTransferred
     *            The number of bytes transferred since the last progress event.
     */
    public void setBytesTransferred(long bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
    }


    /**
     * Returns the number of bytes transferred since the last progress event.
     *
     * @return The number of bytes transferred since the last progress event.
     */
    public long getBytesTransferred() {
        return bytesTransferred;
    }

    /**
     * Returns the unique event code identifying the type of event this
     * object represents.
     *
     * @return The unique event code that identifies what type of specific type
     *         of event this object represents.
     */
    public int getEventCode() {
        return eventCode;
    }

    /**
     * Sets the unique event code identifying the type of event this object
     * represents.
     *
     * @param eventType
     *            The unique event code that identifies what type of specific
     *            type of event this object represents.
     */
    public void setEventCode(int eventType) {
        this.eventCode = eventType;
    }

}
