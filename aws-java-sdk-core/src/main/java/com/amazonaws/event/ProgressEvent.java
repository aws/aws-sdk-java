/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.annotation.Immutable;

import java.util.EnumMap;
import java.util.Map;

/**
 * A progress event. Typically this is used to notify a chunk of bytes has been
 * transferred. Also used to notify other types of progress events such as a
 * transfer starting, or failing.
 * <p>
 * The legacy Amazon S3 progress event
 * com.amazonaws.services.s3.model.ProgressEvent has been deprecated in favor of
 * this new class.
 * </p>
 */
@Immutable
public class ProgressEvent {
    /** The number of bytes associated with the progress event. */
    private final long bytes;
    private final ProgressEventType eventType;

    /**
     * Creates a BYTE_TRANSFER_EVENT with the specified bytesTransferred data.
     */
    @Deprecated
    public ProgressEvent(long bytes) {
        this(ProgressEventType.BYTE_TRANSFER_EVENT, bytes);
    }

    /**
     * Creates a ProgressEvent object with the specified event type.
     *
     * @param eventType
     *            Type of the progress event. This parameter must not be null.
     */
    public ProgressEvent(ProgressEventType eventType) {
        this(eventType, 0);
    }

    /**
     * Creates a ProgressEvent object.
     *
     * @param eventType
     *            Type of the progress event. This parameter must not be null.
     * @param bytes
     *            Number of bytes involved.
     */
    public ProgressEvent(ProgressEventType eventType, long bytes) {
        if (eventType == null)
            throw new IllegalArgumentException("eventType must not be null.");
        if (bytes < 0)
            throw new IllegalArgumentException("bytes reported must be non-negative");
        this.eventType = eventType;
        this.bytes = bytes;
    }

    /**
     * Returns the number of bytes associated with the event. The number of
     * bytes are not necessarily the same as the number of bytes transferred,
     * and it's meaning depends on the specific event type. For example, the
     * bytes of a {@link ProgressEventType#REQUEST_CONTENT_LENGTH_EVENT} refers
     * to the expected number of bytes to be sent to AWS, not the actual number
     * of bytes that have been transferred.
     */
    public long getBytes() {
        return bytes;
    }

    /**
     * Convenient method to returns the number of bytes transferred in this
     * event, or the number of bytes reset (or discarded) if negative. In
     * particular, bytes of a content-length event is excluded.
     */
    public long getBytesTransferred() {
        switch(eventType) {
            case REQUEST_BYTE_TRANSFER_EVENT:
            case RESPONSE_BYTE_TRANSFER_EVENT:
                return bytes;
            case HTTP_RESPONSE_CONTENT_RESET_EVENT:
            case HTTP_REQUEST_CONTENT_RESET_EVENT:
            case RESPONSE_BYTE_DISCARD_EVENT:
                return 0 - bytes;
        default:
            return 0;
        }
    }

    /**
     * Returns the unique event code identifying the type of event this object
     * represents.
     *
     * @return The unique event code that identifies what type of specific type
     *         of event this object represents.
     *
     * @deprecated Use {@link #getEventType()} instead.
     */
    @Deprecated
    public int getEventCode() {
        Integer legacyCode =  legacyEventCodes.get(eventType);
        // Returns -1 if the event type does not have a legacy event code
        return legacyCode == null ? -1 : legacyCode;
    }

    /**
     * Returns the type of event this object represents. This method never
     * returns null.
     *
     * @return The type of event this object represents.
     */
    public ProgressEventType getEventType() {
        return eventType;
    }

    // Deprecated integer event codes

    /** @deprecated Replaced by {@link ProgressEventType#TRANSFER_PREPARING_EVENT} */
    @Deprecated public static final int PREPARING_EVENT_CODE = 1;

    /** @deprecated Replaced by {@link ProgressEventType#TRANSFER_STARTED_EVENT} */
    @Deprecated public static final int STARTED_EVENT_CODE = 2;

    /** @deprecated Replaced by {@link ProgressEventType#TRANSFER_COMPLETED_EVENT} */
    @Deprecated public static final int COMPLETED_EVENT_CODE = 4;

    /** @deprecated Replaced by {@link ProgressEventType#TRANSFER_FAILED_EVENT} */
    @Deprecated public static final int FAILED_EVENT_CODE = 8;

    /** @deprecated Replaced by {@link ProgressEventType#TRANSFER_CANCELED_EVENT} */
    @Deprecated public static final int CANCELED_EVENT_CODE = 16;

    /** @deprecated Replaced by {@link ProgressEventType#HTTP_REQUEST_CONTENT_RESET_EVENT} */
    @Deprecated public static final int RESET_EVENT_CODE = 32;

    /** @deprecated Replaced by {@link ProgressEventType#TRANSFER_PART_STARTED_EVENT} */
    @Deprecated public static final int PART_STARTED_EVENT_CODE = 1024;

    /** @deprecated Replaced by {@link ProgressEventType#TRANSFER_PART_COMPLETED_EVENT} */
    @Deprecated public static final int PART_COMPLETED_EVENT_CODE = 2048;

    /** @deprecated Replaced by {@link ProgressEventType#TRANSFER_PART_FAILED_EVENT} */
    @Deprecated public static final int PART_FAILED_EVENT_CODE = 4096;

    // Mapping from event types to the legacy event codes
    private static final Map<ProgressEventType, Integer> legacyEventCodes =
        new EnumMap<ProgressEventType, Integer>(ProgressEventType.class);
    static {
        legacyEventCodes.put(ProgressEventType.BYTE_TRANSFER_EVENT,              0);
        legacyEventCodes.put(ProgressEventType.TRANSFER_PREPARING_EVENT,         PREPARING_EVENT_CODE);
        legacyEventCodes.put(ProgressEventType.TRANSFER_STARTED_EVENT,           STARTED_EVENT_CODE);
        legacyEventCodes.put(ProgressEventType.TRANSFER_COMPLETED_EVENT,         COMPLETED_EVENT_CODE);
        legacyEventCodes.put(ProgressEventType.TRANSFER_FAILED_EVENT,            FAILED_EVENT_CODE);
        legacyEventCodes.put(ProgressEventType.TRANSFER_CANCELED_EVENT,          CANCELED_EVENT_CODE);
        legacyEventCodes.put(ProgressEventType.HTTP_REQUEST_CONTENT_RESET_EVENT, RESET_EVENT_CODE);
        legacyEventCodes.put(ProgressEventType.HTTP_RESPONSE_CONTENT_RESET_EVENT,RESET_EVENT_CODE);
        legacyEventCodes.put(ProgressEventType.TRANSFER_PART_STARTED_EVENT,      PART_STARTED_EVENT_CODE);
        legacyEventCodes.put(ProgressEventType.TRANSFER_PART_COMPLETED_EVENT,    PART_COMPLETED_EVENT_CODE);
        legacyEventCodes.put(ProgressEventType.TRANSFER_PART_FAILED_EVENT,       PART_FAILED_EVENT_CODE);
    }
    
    @Override
    public String toString() {
        return eventType + ", bytes: " + bytes;
    }
}
