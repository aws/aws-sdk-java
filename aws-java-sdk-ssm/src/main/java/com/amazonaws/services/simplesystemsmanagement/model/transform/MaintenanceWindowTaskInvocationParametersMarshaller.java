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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MaintenanceWindowTaskInvocationParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MaintenanceWindowTaskInvocationParametersMarshaller {

    private static final MarshallingInfo<StructuredPojo> RUNCOMMAND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RunCommand").build();
    private static final MarshallingInfo<StructuredPojo> AUTOMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Automation").build();
    private static final MarshallingInfo<StructuredPojo> STEPFUNCTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StepFunctions").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Lambda").build();

    private static final MaintenanceWindowTaskInvocationParametersMarshaller instance = new MaintenanceWindowTaskInvocationParametersMarshaller();

    public static MaintenanceWindowTaskInvocationParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MaintenanceWindowTaskInvocationParameters maintenanceWindowTaskInvocationParameters, ProtocolMarshaller protocolMarshaller) {

        if (maintenanceWindowTaskInvocationParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(maintenanceWindowTaskInvocationParameters.getRunCommand(), RUNCOMMAND_BINDING);
            protocolMarshaller.marshall(maintenanceWindowTaskInvocationParameters.getAutomation(), AUTOMATION_BINDING);
            protocolMarshaller.marshall(maintenanceWindowTaskInvocationParameters.getStepFunctions(), STEPFUNCTIONS_BINDING);
            protocolMarshaller.marshall(maintenanceWindowTaskInvocationParameters.getLambda(), LAMBDA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
