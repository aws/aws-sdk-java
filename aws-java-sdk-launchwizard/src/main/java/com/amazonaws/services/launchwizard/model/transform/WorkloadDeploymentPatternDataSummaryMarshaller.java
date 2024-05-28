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
package com.amazonaws.services.launchwizard.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.launchwizard.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkloadDeploymentPatternDataSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkloadDeploymentPatternDataSummaryMarshaller {

    private static final MarshallingInfo<String> DEPLOYMENTPATTERNNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentPatternName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<String> WORKLOADNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workloadName").build();
    private static final MarshallingInfo<String> WORKLOADVERSIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workloadVersionName").build();

    private static final WorkloadDeploymentPatternDataSummaryMarshaller instance = new WorkloadDeploymentPatternDataSummaryMarshaller();

    public static WorkloadDeploymentPatternDataSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkloadDeploymentPatternDataSummary workloadDeploymentPatternDataSummary, ProtocolMarshaller protocolMarshaller) {

        if (workloadDeploymentPatternDataSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workloadDeploymentPatternDataSummary.getDeploymentPatternName(), DEPLOYMENTPATTERNNAME_BINDING);
            protocolMarshaller.marshall(workloadDeploymentPatternDataSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(workloadDeploymentPatternDataSummary.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(workloadDeploymentPatternDataSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(workloadDeploymentPatternDataSummary.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(workloadDeploymentPatternDataSummary.getWorkloadName(), WORKLOADNAME_BINDING);
            protocolMarshaller.marshall(workloadDeploymentPatternDataSummary.getWorkloadVersionName(), WORKLOADVERSIONNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
