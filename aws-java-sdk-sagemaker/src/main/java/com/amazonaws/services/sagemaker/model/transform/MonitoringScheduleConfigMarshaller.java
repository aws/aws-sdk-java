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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MonitoringScheduleConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MonitoringScheduleConfigMarshaller {

    private static final MarshallingInfo<StructuredPojo> SCHEDULECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleConfig").build();
    private static final MarshallingInfo<StructuredPojo> MONITORINGJOBDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringJobDefinition").build();
    private static final MarshallingInfo<String> MONITORINGJOBDEFINITIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringJobDefinitionName").build();
    private static final MarshallingInfo<String> MONITORINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringType").build();

    private static final MonitoringScheduleConfigMarshaller instance = new MonitoringScheduleConfigMarshaller();

    public static MonitoringScheduleConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MonitoringScheduleConfig monitoringScheduleConfig, ProtocolMarshaller protocolMarshaller) {

        if (monitoringScheduleConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(monitoringScheduleConfig.getScheduleConfig(), SCHEDULECONFIG_BINDING);
            protocolMarshaller.marshall(monitoringScheduleConfig.getMonitoringJobDefinition(), MONITORINGJOBDEFINITION_BINDING);
            protocolMarshaller.marshall(monitoringScheduleConfig.getMonitoringJobDefinitionName(), MONITORINGJOBDEFINITIONNAME_BINDING);
            protocolMarshaller.marshall(monitoringScheduleConfig.getMonitoringType(), MONITORINGTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
