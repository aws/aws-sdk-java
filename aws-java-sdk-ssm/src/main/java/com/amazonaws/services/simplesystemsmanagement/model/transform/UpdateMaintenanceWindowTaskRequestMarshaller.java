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

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateMaintenanceWindowTaskRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateMaintenanceWindowTaskRequestMarshaller {

    private static final MarshallingInfo<String> WINDOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WindowId").build();
    private static final MarshallingInfo<String> WINDOWTASKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WindowTaskId").build();
    private static final MarshallingInfo<List> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Targets").build();
    private static final MarshallingInfo<String> TASKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TaskArn").build();
    private static final MarshallingInfo<String> SERVICEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRoleArn").build();
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
    private static final MarshallingInfo<Boolean> REPLACE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Replace").build();

    private static final UpdateMaintenanceWindowTaskRequestMarshaller instance = new UpdateMaintenanceWindowTaskRequestMarshaller();

    public static UpdateMaintenanceWindowTaskRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateMaintenanceWindowTaskRequest updateMaintenanceWindowTaskRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateMaintenanceWindowTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateMaintenanceWindowTaskRequest.getWindowId(), WINDOWID_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTaskRequest.getWindowTaskId(), WINDOWTASKID_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTaskRequest.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTaskRequest.getTaskArn(), TASKARN_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTaskRequest.getServiceRoleArn(), SERVICEROLEARN_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTaskRequest.getTaskParameters(), TASKPARAMETERS_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTaskRequest.getTaskInvocationParameters(), TASKINVOCATIONPARAMETERS_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTaskRequest.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTaskRequest.getMaxConcurrency(), MAXCONCURRENCY_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTaskRequest.getMaxErrors(), MAXERRORS_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTaskRequest.getLoggingInfo(), LOGGINGINFO_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTaskRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTaskRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTaskRequest.getReplace(), REPLACE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
