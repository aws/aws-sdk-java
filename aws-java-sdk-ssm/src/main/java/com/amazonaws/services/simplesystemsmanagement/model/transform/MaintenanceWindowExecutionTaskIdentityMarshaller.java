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
 * MaintenanceWindowExecutionTaskIdentityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MaintenanceWindowExecutionTaskIdentityMarshaller {

    private static final MarshallingInfo<String> WINDOWEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WindowExecutionId").build();
    private static final MarshallingInfo<String> TASKEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskExecutionId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusDetails").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TASKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TaskArn").build();
    private static final MarshallingInfo<String> TASKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TaskType").build();

    private static final MaintenanceWindowExecutionTaskIdentityMarshaller instance = new MaintenanceWindowExecutionTaskIdentityMarshaller();

    public static MaintenanceWindowExecutionTaskIdentityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MaintenanceWindowExecutionTaskIdentity maintenanceWindowExecutionTaskIdentity, ProtocolMarshaller protocolMarshaller) {

        if (maintenanceWindowExecutionTaskIdentity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(maintenanceWindowExecutionTaskIdentity.getWindowExecutionId(), WINDOWEXECUTIONID_BINDING);
            protocolMarshaller.marshall(maintenanceWindowExecutionTaskIdentity.getTaskExecutionId(), TASKEXECUTIONID_BINDING);
            protocolMarshaller.marshall(maintenanceWindowExecutionTaskIdentity.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(maintenanceWindowExecutionTaskIdentity.getStatusDetails(), STATUSDETAILS_BINDING);
            protocolMarshaller.marshall(maintenanceWindowExecutionTaskIdentity.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(maintenanceWindowExecutionTaskIdentity.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(maintenanceWindowExecutionTaskIdentity.getTaskArn(), TASKARN_BINDING);
            protocolMarshaller.marshall(maintenanceWindowExecutionTaskIdentity.getTaskType(), TASKTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
