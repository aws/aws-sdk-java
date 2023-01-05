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
 * EdgeDeploymentPlanSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EdgeDeploymentPlanSummaryMarshaller {

    private static final MarshallingInfo<String> EDGEDEPLOYMENTPLANARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeDeploymentPlanArn").build();
    private static final MarshallingInfo<String> EDGEDEPLOYMENTPLANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeDeploymentPlanName").build();
    private static final MarshallingInfo<String> DEVICEFLEETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceFleetName").build();
    private static final MarshallingInfo<Integer> EDGEDEPLOYMENTSUCCESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeDeploymentSuccess").build();
    private static final MarshallingInfo<Integer> EDGEDEPLOYMENTPENDING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeDeploymentPending").build();
    private static final MarshallingInfo<Integer> EDGEDEPLOYMENTFAILED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeDeploymentFailed").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();

    private static final EdgeDeploymentPlanSummaryMarshaller instance = new EdgeDeploymentPlanSummaryMarshaller();

    public static EdgeDeploymentPlanSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EdgeDeploymentPlanSummary edgeDeploymentPlanSummary, ProtocolMarshaller protocolMarshaller) {

        if (edgeDeploymentPlanSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(edgeDeploymentPlanSummary.getEdgeDeploymentPlanArn(), EDGEDEPLOYMENTPLANARN_BINDING);
            protocolMarshaller.marshall(edgeDeploymentPlanSummary.getEdgeDeploymentPlanName(), EDGEDEPLOYMENTPLANNAME_BINDING);
            protocolMarshaller.marshall(edgeDeploymentPlanSummary.getDeviceFleetName(), DEVICEFLEETNAME_BINDING);
            protocolMarshaller.marshall(edgeDeploymentPlanSummary.getEdgeDeploymentSuccess(), EDGEDEPLOYMENTSUCCESS_BINDING);
            protocolMarshaller.marshall(edgeDeploymentPlanSummary.getEdgeDeploymentPending(), EDGEDEPLOYMENTPENDING_BINDING);
            protocolMarshaller.marshall(edgeDeploymentPlanSummary.getEdgeDeploymentFailed(), EDGEDEPLOYMENTFAILED_BINDING);
            protocolMarshaller.marshall(edgeDeploymentPlanSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(edgeDeploymentPlanSummary.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
