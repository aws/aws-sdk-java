/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisterActivityTypeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterActivityTypeRequestMarshaller {

    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("domain").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> DEFAULTTASKSTARTTOCLOSETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultTaskStartToCloseTimeout").build();
    private static final MarshallingInfo<String> DEFAULTTASKHEARTBEATTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultTaskHeartbeatTimeout").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTTASKLIST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultTaskList").build();
    private static final MarshallingInfo<String> DEFAULTTASKPRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultTaskPriority").build();
    private static final MarshallingInfo<String> DEFAULTTASKSCHEDULETOSTARTTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultTaskScheduleToStartTimeout").build();
    private static final MarshallingInfo<String> DEFAULTTASKSCHEDULETOCLOSETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultTaskScheduleToCloseTimeout").build();

    private static final RegisterActivityTypeRequestMarshaller instance = new RegisterActivityTypeRequestMarshaller();

    public static RegisterActivityTypeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterActivityTypeRequest registerActivityTypeRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerActivityTypeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerActivityTypeRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(registerActivityTypeRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(registerActivityTypeRequest.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(registerActivityTypeRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(registerActivityTypeRequest.getDefaultTaskStartToCloseTimeout(), DEFAULTTASKSTARTTOCLOSETIMEOUT_BINDING);
            protocolMarshaller.marshall(registerActivityTypeRequest.getDefaultTaskHeartbeatTimeout(), DEFAULTTASKHEARTBEATTIMEOUT_BINDING);
            protocolMarshaller.marshall(registerActivityTypeRequest.getDefaultTaskList(), DEFAULTTASKLIST_BINDING);
            protocolMarshaller.marshall(registerActivityTypeRequest.getDefaultTaskPriority(), DEFAULTTASKPRIORITY_BINDING);
            protocolMarshaller.marshall(registerActivityTypeRequest.getDefaultTaskScheduleToStartTimeout(), DEFAULTTASKSCHEDULETOSTARTTIMEOUT_BINDING);
            protocolMarshaller.marshall(registerActivityTypeRequest.getDefaultTaskScheduleToCloseTimeout(), DEFAULTTASKSCHEDULETOCLOSETIMEOUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
