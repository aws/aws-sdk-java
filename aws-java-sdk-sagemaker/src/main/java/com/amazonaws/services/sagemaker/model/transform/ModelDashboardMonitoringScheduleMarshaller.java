/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModelDashboardMonitoringScheduleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModelDashboardMonitoringScheduleMarshaller {

    private static final MarshallingInfo<String> MONITORINGSCHEDULEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringScheduleArn").build();
    private static final MarshallingInfo<String> MONITORINGSCHEDULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringScheduleName").build();
    private static final MarshallingInfo<String> MONITORINGSCHEDULESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringScheduleStatus").build();
    private static final MarshallingInfo<String> MONITORINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringType").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> MONITORINGSCHEDULECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringScheduleConfig").build();
    private static final MarshallingInfo<String> ENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointName").build();
    private static final MarshallingInfo<List> MONITORINGALERTSUMMARIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringAlertSummaries").build();
    private static final MarshallingInfo<StructuredPojo> LASTMONITORINGEXECUTIONSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastMonitoringExecutionSummary").build();

    private static final ModelDashboardMonitoringScheduleMarshaller instance = new ModelDashboardMonitoringScheduleMarshaller();

    public static ModelDashboardMonitoringScheduleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModelDashboardMonitoringSchedule modelDashboardMonitoringSchedule, ProtocolMarshaller protocolMarshaller) {

        if (modelDashboardMonitoringSchedule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modelDashboardMonitoringSchedule.getMonitoringScheduleArn(), MONITORINGSCHEDULEARN_BINDING);
            protocolMarshaller.marshall(modelDashboardMonitoringSchedule.getMonitoringScheduleName(), MONITORINGSCHEDULENAME_BINDING);
            protocolMarshaller.marshall(modelDashboardMonitoringSchedule.getMonitoringScheduleStatus(), MONITORINGSCHEDULESTATUS_BINDING);
            protocolMarshaller.marshall(modelDashboardMonitoringSchedule.getMonitoringType(), MONITORINGTYPE_BINDING);
            protocolMarshaller.marshall(modelDashboardMonitoringSchedule.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(modelDashboardMonitoringSchedule.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(modelDashboardMonitoringSchedule.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(modelDashboardMonitoringSchedule.getMonitoringScheduleConfig(), MONITORINGSCHEDULECONFIG_BINDING);
            protocolMarshaller.marshall(modelDashboardMonitoringSchedule.getEndpointName(), ENDPOINTNAME_BINDING);
            protocolMarshaller.marshall(modelDashboardMonitoringSchedule.getMonitoringAlertSummaries(), MONITORINGALERTSUMMARIES_BINDING);
            protocolMarshaller.marshall(modelDashboardMonitoringSchedule.getLastMonitoringExecutionSummary(), LASTMONITORINGEXECUTIONSUMMARY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
