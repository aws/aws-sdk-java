/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DetectMitigationActionExecutionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DetectMitigationActionExecutionMarshaller {

    private static final MarshallingInfo<String> TASKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("taskId").build();
    private static final MarshallingInfo<String> VIOLATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("violationId").build();
    private static final MarshallingInfo<String> ACTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionName").build();
    private static final MarshallingInfo<String> THINGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("thingName").build();
    private static final MarshallingInfo<java.util.Date> EXECUTIONSTARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionStartDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EXECUTIONENDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionEndDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> ERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("errorCode").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("message").build();

    private static final DetectMitigationActionExecutionMarshaller instance = new DetectMitigationActionExecutionMarshaller();

    public static DetectMitigationActionExecutionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DetectMitigationActionExecution detectMitigationActionExecution, ProtocolMarshaller protocolMarshaller) {

        if (detectMitigationActionExecution == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(detectMitigationActionExecution.getTaskId(), TASKID_BINDING);
            protocolMarshaller.marshall(detectMitigationActionExecution.getViolationId(), VIOLATIONID_BINDING);
            protocolMarshaller.marshall(detectMitigationActionExecution.getActionName(), ACTIONNAME_BINDING);
            protocolMarshaller.marshall(detectMitigationActionExecution.getThingName(), THINGNAME_BINDING);
            protocolMarshaller.marshall(detectMitigationActionExecution.getExecutionStartDate(), EXECUTIONSTARTDATE_BINDING);
            protocolMarshaller.marshall(detectMitigationActionExecution.getExecutionEndDate(), EXECUTIONENDDATE_BINDING);
            protocolMarshaller.marshall(detectMitigationActionExecution.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(detectMitigationActionExecution.getErrorCode(), ERRORCODE_BINDING);
            protocolMarshaller.marshall(detectMitigationActionExecution.getMessage(), MESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
