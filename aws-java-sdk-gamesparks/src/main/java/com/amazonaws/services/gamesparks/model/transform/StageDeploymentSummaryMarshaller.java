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
package com.amazonaws.services.gamesparks.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamesparks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StageDeploymentSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StageDeploymentSummaryMarshaller {

    private static final MarshallingInfo<String> DEPLOYMENTACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentAction").build();
    private static final MarshallingInfo<String> DEPLOYMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentId").build();
    private static final MarshallingInfo<StructuredPojo> DEPLOYMENTRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentResult").build();
    private static final MarshallingInfo<String> DEPLOYMENTSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentState").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdated").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> SNAPSHOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotId").build();

    private static final StageDeploymentSummaryMarshaller instance = new StageDeploymentSummaryMarshaller();

    public static StageDeploymentSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StageDeploymentSummary stageDeploymentSummary, ProtocolMarshaller protocolMarshaller) {

        if (stageDeploymentSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stageDeploymentSummary.getDeploymentAction(), DEPLOYMENTACTION_BINDING);
            protocolMarshaller.marshall(stageDeploymentSummary.getDeploymentId(), DEPLOYMENTID_BINDING);
            protocolMarshaller.marshall(stageDeploymentSummary.getDeploymentResult(), DEPLOYMENTRESULT_BINDING);
            protocolMarshaller.marshall(stageDeploymentSummary.getDeploymentState(), DEPLOYMENTSTATE_BINDING);
            protocolMarshaller.marshall(stageDeploymentSummary.getLastUpdated(), LASTUPDATED_BINDING);
            protocolMarshaller.marshall(stageDeploymentSummary.getSnapshotId(), SNAPSHOTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
