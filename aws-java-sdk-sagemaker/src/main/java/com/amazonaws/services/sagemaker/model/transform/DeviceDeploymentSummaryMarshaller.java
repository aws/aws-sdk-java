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
 * DeviceDeploymentSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeviceDeploymentSummaryMarshaller {

    private static final MarshallingInfo<String> EDGEDEPLOYMENTPLANARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeDeploymentPlanArn").build();
    private static final MarshallingInfo<String> EDGEDEPLOYMENTPLANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeDeploymentPlanName").build();
    private static final MarshallingInfo<String> STAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StageName").build();
    private static final MarshallingInfo<String> DEPLOYEDSTAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeployedStageName").build();
    private static final MarshallingInfo<String> DEVICEFLEETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceFleetName").build();
    private static final MarshallingInfo<String> DEVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceName").build();
    private static final MarshallingInfo<String> DEVICEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DeviceArn").build();
    private static final MarshallingInfo<String> DEVICEDEPLOYMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceDeploymentStatus").build();
    private static final MarshallingInfo<String> DEVICEDEPLOYMENTSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceDeploymentStatusMessage").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<java.util.Date> DEPLOYMENTSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentStartTime").timestampFormat("unixTimestamp").build();

    private static final DeviceDeploymentSummaryMarshaller instance = new DeviceDeploymentSummaryMarshaller();

    public static DeviceDeploymentSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeviceDeploymentSummary deviceDeploymentSummary, ProtocolMarshaller protocolMarshaller) {

        if (deviceDeploymentSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deviceDeploymentSummary.getEdgeDeploymentPlanArn(), EDGEDEPLOYMENTPLANARN_BINDING);
            protocolMarshaller.marshall(deviceDeploymentSummary.getEdgeDeploymentPlanName(), EDGEDEPLOYMENTPLANNAME_BINDING);
            protocolMarshaller.marshall(deviceDeploymentSummary.getStageName(), STAGENAME_BINDING);
            protocolMarshaller.marshall(deviceDeploymentSummary.getDeployedStageName(), DEPLOYEDSTAGENAME_BINDING);
            protocolMarshaller.marshall(deviceDeploymentSummary.getDeviceFleetName(), DEVICEFLEETNAME_BINDING);
            protocolMarshaller.marshall(deviceDeploymentSummary.getDeviceName(), DEVICENAME_BINDING);
            protocolMarshaller.marshall(deviceDeploymentSummary.getDeviceArn(), DEVICEARN_BINDING);
            protocolMarshaller.marshall(deviceDeploymentSummary.getDeviceDeploymentStatus(), DEVICEDEPLOYMENTSTATUS_BINDING);
            protocolMarshaller.marshall(deviceDeploymentSummary.getDeviceDeploymentStatusMessage(), DEVICEDEPLOYMENTSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(deviceDeploymentSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(deviceDeploymentSummary.getDeploymentStartTime(), DEPLOYMENTSTARTTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
