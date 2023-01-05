/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudcontrolapi.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudcontrolapi.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProgressEventMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProgressEventMarshaller {

    private static final MarshallingInfo<String> TYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TypeName").build();
    private static final MarshallingInfo<String> IDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Identifier").build();
    private static final MarshallingInfo<String> REQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestToken").build();
    private static final MarshallingInfo<String> OPERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Operation").build();
    private static final MarshallingInfo<String> OPERATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperationStatus").build();
    private static final MarshallingInfo<java.util.Date> EVENTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> RESOURCEMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceModel").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();
    private static final MarshallingInfo<String> ERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ErrorCode").build();
    private static final MarshallingInfo<java.util.Date> RETRYAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetryAfter").timestampFormat("unixTimestamp").build();

    private static final ProgressEventMarshaller instance = new ProgressEventMarshaller();

    public static ProgressEventMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProgressEvent progressEvent, ProtocolMarshaller protocolMarshaller) {

        if (progressEvent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(progressEvent.getTypeName(), TYPENAME_BINDING);
            protocolMarshaller.marshall(progressEvent.getIdentifier(), IDENTIFIER_BINDING);
            protocolMarshaller.marshall(progressEvent.getRequestToken(), REQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(progressEvent.getOperation(), OPERATION_BINDING);
            protocolMarshaller.marshall(progressEvent.getOperationStatus(), OPERATIONSTATUS_BINDING);
            protocolMarshaller.marshall(progressEvent.getEventTime(), EVENTTIME_BINDING);
            protocolMarshaller.marshall(progressEvent.getResourceModel(), RESOURCEMODEL_BINDING);
            protocolMarshaller.marshall(progressEvent.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(progressEvent.getErrorCode(), ERRORCODE_BINDING);
            protocolMarshaller.marshall(progressEvent.getRetryAfter(), RETRYAFTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
