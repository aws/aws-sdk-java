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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsStepFunctionStateMachineDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsStepFunctionStateMachineDetailsMarshaller {

    private static final MarshallingInfo<String> LABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Label").build();
    private static final MarshallingInfo<StructuredPojo> LOGGINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoggingConfiguration").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> STATEMACHINEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateMachineArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> TRACINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TracingConfiguration").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();

    private static final AwsStepFunctionStateMachineDetailsMarshaller instance = new AwsStepFunctionStateMachineDetailsMarshaller();

    public static AwsStepFunctionStateMachineDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsStepFunctionStateMachineDetails awsStepFunctionStateMachineDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsStepFunctionStateMachineDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsStepFunctionStateMachineDetails.getLabel(), LABEL_BINDING);
            protocolMarshaller.marshall(awsStepFunctionStateMachineDetails.getLoggingConfiguration(), LOGGINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsStepFunctionStateMachineDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(awsStepFunctionStateMachineDetails.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(awsStepFunctionStateMachineDetails.getStateMachineArn(), STATEMACHINEARN_BINDING);
            protocolMarshaller.marshall(awsStepFunctionStateMachineDetails.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(awsStepFunctionStateMachineDetails.getTracingConfiguration(), TRACINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsStepFunctionStateMachineDetails.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
