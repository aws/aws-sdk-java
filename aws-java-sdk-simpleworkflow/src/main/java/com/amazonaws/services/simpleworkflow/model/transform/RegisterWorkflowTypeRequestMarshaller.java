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
 * RegisterWorkflowTypeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterWorkflowTypeRequestMarshaller {

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
    private static final MarshallingInfo<String> DEFAULTEXECUTIONSTARTTOCLOSETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultExecutionStartToCloseTimeout").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTTASKLIST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultTaskList").build();
    private static final MarshallingInfo<String> DEFAULTTASKPRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultTaskPriority").build();
    private static final MarshallingInfo<String> DEFAULTCHILDPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultChildPolicy").build();
    private static final MarshallingInfo<String> DEFAULTLAMBDAROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultLambdaRole").build();

    private static final RegisterWorkflowTypeRequestMarshaller instance = new RegisterWorkflowTypeRequestMarshaller();

    public static RegisterWorkflowTypeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterWorkflowTypeRequest registerWorkflowTypeRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerWorkflowTypeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerWorkflowTypeRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(registerWorkflowTypeRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(registerWorkflowTypeRequest.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(registerWorkflowTypeRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(registerWorkflowTypeRequest.getDefaultTaskStartToCloseTimeout(), DEFAULTTASKSTARTTOCLOSETIMEOUT_BINDING);
            protocolMarshaller.marshall(registerWorkflowTypeRequest.getDefaultExecutionStartToCloseTimeout(), DEFAULTEXECUTIONSTARTTOCLOSETIMEOUT_BINDING);
            protocolMarshaller.marshall(registerWorkflowTypeRequest.getDefaultTaskList(), DEFAULTTASKLIST_BINDING);
            protocolMarshaller.marshall(registerWorkflowTypeRequest.getDefaultTaskPriority(), DEFAULTTASKPRIORITY_BINDING);
            protocolMarshaller.marshall(registerWorkflowTypeRequest.getDefaultChildPolicy(), DEFAULTCHILDPOLICY_BINDING);
            protocolMarshaller.marshall(registerWorkflowTypeRequest.getDefaultLambdaRole(), DEFAULTLAMBDAROLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
