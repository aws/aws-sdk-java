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
package com.amazonaws.services.applicationdiscovery.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationdiscovery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchDeleteConfigurationTaskMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchDeleteConfigurationTaskMarshaller {

    private static final MarshallingInfo<String> TASKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("taskId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CONFIGURATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationType").build();
    private static final MarshallingInfo<List> REQUESTEDCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestedConfigurations").build();
    private static final MarshallingInfo<List> DELETEDCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deletedConfigurations").build();
    private static final MarshallingInfo<List> FAILEDCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failedConfigurations").build();
    private static final MarshallingInfo<List> DELETIONWARNINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deletionWarnings").build();

    private static final BatchDeleteConfigurationTaskMarshaller instance = new BatchDeleteConfigurationTaskMarshaller();

    public static BatchDeleteConfigurationTaskMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchDeleteConfigurationTask batchDeleteConfigurationTask, ProtocolMarshaller protocolMarshaller) {

        if (batchDeleteConfigurationTask == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchDeleteConfigurationTask.getTaskId(), TASKID_BINDING);
            protocolMarshaller.marshall(batchDeleteConfigurationTask.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(batchDeleteConfigurationTask.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(batchDeleteConfigurationTask.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(batchDeleteConfigurationTask.getConfigurationType(), CONFIGURATIONTYPE_BINDING);
            protocolMarshaller.marshall(batchDeleteConfigurationTask.getRequestedConfigurations(), REQUESTEDCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(batchDeleteConfigurationTask.getDeletedConfigurations(), DELETEDCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(batchDeleteConfigurationTask.getFailedConfigurations(), FAILEDCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(batchDeleteConfigurationTask.getDeletionWarnings(), DELETIONWARNINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
