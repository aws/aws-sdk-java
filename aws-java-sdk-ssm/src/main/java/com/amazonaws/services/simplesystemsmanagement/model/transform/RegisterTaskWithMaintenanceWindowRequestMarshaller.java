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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisterTaskWithMaintenanceWindowRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterTaskWithMaintenanceWindowRequestMarshaller {

    private static final MarshallingInfo<String> WINDOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WindowId").build();
    private static final MarshallingInfo<List> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Targets").build();
    private static final MarshallingInfo<String> TASKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TaskArn").build();
    private static final MarshallingInfo<String> SERVICEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRoleArn").build();
    private static final MarshallingInfo<String> TASKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TaskType").build();
    private static final MarshallingInfo<Map> TASKPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TaskParameters").build();
    private static final MarshallingInfo<StructuredPojo> TASKINVOCATIONPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskInvocationParameters").build();
    private static final MarshallingInfo<Integer> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Priority").build();
    private static final MarshallingInfo<String> MAXCONCURRENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxConcurrency").build();
    private static final MarshallingInfo<String> MAXERRORS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxErrors").build();
    private static final MarshallingInfo<StructuredPojo> LOGGINGINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoggingInfo").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final RegisterTaskWithMaintenanceWindowRequestMarshaller instance = new RegisterTaskWithMaintenanceWindowRequestMarshaller();

    public static RegisterTaskWithMaintenanceWindowRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerTaskWithMaintenanceWindowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerTaskWithMaintenanceWindowRequest.getWindowId(), WINDOWID_BINDING);
            protocolMarshaller.marshall(registerTaskWithMaintenanceWindowRequest.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(registerTaskWithMaintenanceWindowRequest.getTaskArn(), TASKARN_BINDING);
            protocolMarshaller.marshall(registerTaskWithMaintenanceWindowRequest.getServiceRoleArn(), SERVICEROLEARN_BINDING);
            protocolMarshaller.marshall(registerTaskWithMaintenanceWindowRequest.getTaskType(), TASKTYPE_BINDING);
            protocolMarshaller.marshall(registerTaskWithMaintenanceWindowRequest.getTaskParameters(), TASKPARAMETERS_BINDING);
            protocolMarshaller.marshall(registerTaskWithMaintenanceWindowRequest.getTaskInvocationParameters(), TASKINVOCATIONPARAMETERS_BINDING);
            protocolMarshaller.marshall(registerTaskWithMaintenanceWindowRequest.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(registerTaskWithMaintenanceWindowRequest.getMaxConcurrency(), MAXCONCURRENCY_BINDING);
            protocolMarshaller.marshall(registerTaskWithMaintenanceWindowRequest.getMaxErrors(), MAXERRORS_BINDING);
            protocolMarshaller.marshall(registerTaskWithMaintenanceWindowRequest.getLoggingInfo(), LOGGINGINFO_BINDING);
            protocolMarshaller.marshall(registerTaskWithMaintenanceWindowRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(registerTaskWithMaintenanceWindowRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(registerTaskWithMaintenanceWindowRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
