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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateMonitoringAlertRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateMonitoringAlertRequestMarshaller {

    private static final MarshallingInfo<String> MONITORINGSCHEDULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringScheduleName").build();
    private static final MarshallingInfo<String> MONITORINGALERTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringAlertName").build();
    private static final MarshallingInfo<Integer> DATAPOINTSTOALERT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatapointsToAlert").build();
    private static final MarshallingInfo<Integer> EVALUATIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationPeriod").build();

    private static final UpdateMonitoringAlertRequestMarshaller instance = new UpdateMonitoringAlertRequestMarshaller();

    public static UpdateMonitoringAlertRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateMonitoringAlertRequest updateMonitoringAlertRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateMonitoringAlertRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateMonitoringAlertRequest.getMonitoringScheduleName(), MONITORINGSCHEDULENAME_BINDING);
            protocolMarshaller.marshall(updateMonitoringAlertRequest.getMonitoringAlertName(), MONITORINGALERTNAME_BINDING);
            protocolMarshaller.marshall(updateMonitoringAlertRequest.getDatapointsToAlert(), DATAPOINTSTOALERT_BINDING);
            protocolMarshaller.marshall(updateMonitoringAlertRequest.getEvaluationPeriod(), EVALUATIONPERIOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
