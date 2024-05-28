/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.controltower.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.controltower.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ControlOperationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ControlOperationSummaryMarshaller {

    private static final MarshallingInfo<String> CONTROLIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("controlIdentifier").build();
    private static final MarshallingInfo<String> ENABLEDCONTROLIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enabledControlIdentifier").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> OPERATIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("operationIdentifier").build();
    private static final MarshallingInfo<String> OPERATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("operationType").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<String> TARGETIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetIdentifier").build();

    private static final ControlOperationSummaryMarshaller instance = new ControlOperationSummaryMarshaller();

    public static ControlOperationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ControlOperationSummary controlOperationSummary, ProtocolMarshaller protocolMarshaller) {

        if (controlOperationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(controlOperationSummary.getControlIdentifier(), CONTROLIDENTIFIER_BINDING);
            protocolMarshaller.marshall(controlOperationSummary.getEnabledControlIdentifier(), ENABLEDCONTROLIDENTIFIER_BINDING);
            protocolMarshaller.marshall(controlOperationSummary.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(controlOperationSummary.getOperationIdentifier(), OPERATIONIDENTIFIER_BINDING);
            protocolMarshaller.marshall(controlOperationSummary.getOperationType(), OPERATIONTYPE_BINDING);
            protocolMarshaller.marshall(controlOperationSummary.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(controlOperationSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(controlOperationSummary.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(controlOperationSummary.getTargetIdentifier(), TARGETIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
