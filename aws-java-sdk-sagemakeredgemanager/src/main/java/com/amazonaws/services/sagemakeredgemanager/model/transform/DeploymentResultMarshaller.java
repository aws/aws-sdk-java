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
package com.amazonaws.services.sagemakeredgemanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemakeredgemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeploymentResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeploymentResultMarshaller {

    private static final MarshallingInfo<String> DEPLOYMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentName").build();
    private static final MarshallingInfo<String> DEPLOYMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentStatus").build();
    private static final MarshallingInfo<String> DEPLOYMENTSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentStatusMessage").build();
    private static final MarshallingInfo<java.util.Date> DEPLOYMENTSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DEPLOYMENTENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> DEPLOYMENTMODELS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentModels").build();

    private static final DeploymentResultMarshaller instance = new DeploymentResultMarshaller();

    public static DeploymentResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeploymentResult deploymentResult, ProtocolMarshaller protocolMarshaller) {

        if (deploymentResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deploymentResult.getDeploymentName(), DEPLOYMENTNAME_BINDING);
            protocolMarshaller.marshall(deploymentResult.getDeploymentStatus(), DEPLOYMENTSTATUS_BINDING);
            protocolMarshaller.marshall(deploymentResult.getDeploymentStatusMessage(), DEPLOYMENTSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(deploymentResult.getDeploymentStartTime(), DEPLOYMENTSTARTTIME_BINDING);
            protocolMarshaller.marshall(deploymentResult.getDeploymentEndTime(), DEPLOYMENTENDTIME_BINDING);
            protocolMarshaller.marshall(deploymentResult.getDeploymentModels(), DEPLOYMENTMODELS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
