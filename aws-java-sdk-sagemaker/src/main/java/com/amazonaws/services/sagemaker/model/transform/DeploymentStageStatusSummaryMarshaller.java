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
 * DeploymentStageStatusSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeploymentStageStatusSummaryMarshaller {

    private static final MarshallingInfo<String> STAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StageName").build();
    private static final MarshallingInfo<StructuredPojo> DEVICESELECTIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceSelectionConfig").build();
    private static final MarshallingInfo<StructuredPojo> DEPLOYMENTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentConfig").build();
    private static final MarshallingInfo<StructuredPojo> DEPLOYMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentStatus").build();

    private static final DeploymentStageStatusSummaryMarshaller instance = new DeploymentStageStatusSummaryMarshaller();

    public static DeploymentStageStatusSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeploymentStageStatusSummary deploymentStageStatusSummary, ProtocolMarshaller protocolMarshaller) {

        if (deploymentStageStatusSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deploymentStageStatusSummary.getStageName(), STAGENAME_BINDING);
            protocolMarshaller.marshall(deploymentStageStatusSummary.getDeviceSelectionConfig(), DEVICESELECTIONCONFIG_BINDING);
            protocolMarshaller.marshall(deploymentStageStatusSummary.getDeploymentConfig(), DEPLOYMENTCONFIG_BINDING);
            protocolMarshaller.marshall(deploymentStageStatusSummary.getDeploymentStatus(), DEPLOYMENTSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
