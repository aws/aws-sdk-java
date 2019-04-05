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
package com.amazonaws.services.codedeploy.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codedeploy.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeploymentOverviewMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeploymentOverviewMarshaller {

    private static final MarshallingInfo<Long> PENDING_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Pending").build();
    private static final MarshallingInfo<Long> INPROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InProgress").build();
    private static final MarshallingInfo<Long> SUCCEEDED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Succeeded").build();
    private static final MarshallingInfo<Long> FAILED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Failed").build();
    private static final MarshallingInfo<Long> SKIPPED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Skipped").build();
    private static final MarshallingInfo<Long> READY_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Ready").build();

    private static final DeploymentOverviewMarshaller instance = new DeploymentOverviewMarshaller();

    public static DeploymentOverviewMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeploymentOverview deploymentOverview, ProtocolMarshaller protocolMarshaller) {

        if (deploymentOverview == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deploymentOverview.getPending(), PENDING_BINDING);
            protocolMarshaller.marshall(deploymentOverview.getInProgress(), INPROGRESS_BINDING);
            protocolMarshaller.marshall(deploymentOverview.getSucceeded(), SUCCEEDED_BINDING);
            protocolMarshaller.marshall(deploymentOverview.getFailed(), FAILED_BINDING);
            protocolMarshaller.marshall(deploymentOverview.getSkipped(), SKIPPED_BINDING);
            protocolMarshaller.marshall(deploymentOverview.getReady(), READY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
