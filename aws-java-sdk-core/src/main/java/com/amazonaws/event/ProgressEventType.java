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

/**
 * An enumeration that denotes various types of progress event.
 */
public enum ProgressEventType {
    //////////////////////////////////////////////////////////////////////////
    // Request Cycle Event:
    // related to the execution of a single http request-response to AWS
    //////////////////////////////////////////////////////////////////////////
    /**
     * A general byte transfer event that happens during sending a request or
     * reading a response.
     */
    @Deprecated
    BYTE_TRANSFER_EVENT,
    /**
     * Event of the content length to be sent in a request.
     */
    REQUEST_CONTENT_LENGTH_EVENT,
    /**
     * Event of the content length received in a response.
     */
    RESPONSE_CONTENT_LENGTH_EVENT,

    /**
     * Used to indicate the number of bytes to be sent to AWS.
     */
    REQUEST_BYTE_TRANSFER_EVENT,
    /**
     * Used to indicate the number of bytes received from AWS.
     */
    RESPONSE_BYTE_TRANSFER_EVENT,
    /**
     * Used to indicate the number of bytes discarded after being received from AWS.
     */
    RESPONSE_BYTE_DISCARD_EVENT,

    /* Generic request progress events */

    /**
     * Event indicating that the client has started sending the AWS API request.
     * This type of event is guaranteed to be only fired once during a
     * request-response cycle, even when the request is retried.
     */
    CLIENT_REQUEST_STARTED_EVENT,

    /**
     * Event indicating that the client has started sending the HTTP request.
     * The request progress listener will be notified of multiple instances of
     * this type of event if the request gets retried.
     */
    HTTP_REQUEST_STARTED_EVENT,

    /**
     * Event indicating that the client has finished sending the HTTP request.
     * The request progress listener will be notified of multiple instances of
     * this type of event if the request gets retried.
     */
    HTTP_REQUEST_COMPLETED_EVENT,

    /**
     * Event indicating that the HTTP request content is reset, which may or may not
     * be caused by the retry of the request.
     */
    HTTP_REQUEST_CONTENT_RESET_EVENT,

    /**
     * Event indicating that a failed request is detected as retryable and is
     * ready for the next retry.
     */
    CLIENT_REQUEST_RETRY_EVENT,

    /**
     * Event indicating that the client has started reading the HTTP response.
     * The request progress listener will be notified of this event only if the
     * client receives a successful service response (i.e. 2XX status code).
     */
    HTTP_RESPONSE_STARTED_EVENT,

    /**
     * Event indicating that the client has finished reading the HTTP response.
     * The request progress listener will be notified of this event only if the
     * client receives a successful service response (i.e. 2XX status code).
     */
    HTTP_RESPONSE_COMPLETED_EVENT,

    /**
     * Event indicating that the HTTP response content is reset.
     */
    HTTP_RESPONSE_CONTENT_RESET_EVENT,

    /**
     * Event indicating that the client has received a successful service
     * response and has finished parsing the response data.
     */
    CLIENT_REQUEST_SUCCESS_EVENT,

    /**
     * Event indicating that a client request has failed (after retries have
     * been conducted).
     */
    CLIENT_REQUEST_FAILED_EVENT,

    //////////////////////////////////////////////////////////////////////////
    // Transfer Event:
    // Progress events that are used by S3 and Glacier client */
    //////////////////////////////////////////////////////////////////////////
    TRANSFER_PREPARING_EVENT,
    TRANSFER_STARTED_EVENT,
    TRANSFER_COMPLETED_EVENT,
    TRANSFER_FAILED_EVENT,
    TRANSFER_CANCELED_EVENT,
    TRANSFER_PART_STARTED_EVENT,
    TRANSFER_PART_COMPLETED_EVENT,
    TRANSFER_PART_FAILED_EVENT;

    /**
     * Returns true if this event type is a transfer event, which may involve
     * multiple request cycle events.
     * 
     * @see #isRequestCycleEvent()
     */
    public boolean isTransferEvent() {
        switch (this) {
            case TRANSFER_CANCELED_EVENT:
            case TRANSFER_COMPLETED_EVENT:
            case TRANSFER_FAILED_EVENT:
            case TRANSFER_PART_COMPLETED_EVENT:
            case TRANSFER_PART_FAILED_EVENT:
            case TRANSFER_PART_STARTED_EVENT:
            case TRANSFER_PREPARING_EVENT:
            case TRANSFER_STARTED_EVENT:
                return true;
            default:
                return false;
        }
    }

    /**
     * Returns true if this event type is related to the execution of a 
     * single http request-response to AWS; false otherwise.
     */
    public boolean isRequestCycleEvent() {
        return !isTransferEvent();
    }

    /**
     * Returns true if this even type is associated with some number of bytes;
     * false otherwise.
     */
    public boolean isByteCountEvent() {
        switch (this) {
            case BYTE_TRANSFER_EVENT:
            case HTTP_REQUEST_CONTENT_RESET_EVENT:
            case HTTP_RESPONSE_CONTENT_RESET_EVENT:

            case REQUEST_BYTE_TRANSFER_EVENT:
            case RESPONSE_BYTE_TRANSFER_EVENT:

            case RESPONSE_BYTE_DISCARD_EVENT:

            case REQUEST_CONTENT_LENGTH_EVENT:
            case RESPONSE_CONTENT_LENGTH_EVENT:
                return true;
            default:
                return false;
        }
    }
}
