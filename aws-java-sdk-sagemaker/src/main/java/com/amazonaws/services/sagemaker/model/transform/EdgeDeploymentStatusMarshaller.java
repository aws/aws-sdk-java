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
 * EdgeDeploymentStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EdgeDeploymentStatusMarshaller {

    private static final MarshallingInfo<String> STAGESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StageStatus").build();
    private static final MarshallingInfo<Integer> EDGEDEPLOYMENTSUCCESSINSTAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeDeploymentSuccessInStage").build();
    private static final MarshallingInfo<Integer> EDGEDEPLOYMENTPENDINGINSTAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeDeploymentPendingInStage").build();
    private static final MarshallingInfo<Integer> EDGEDEPLOYMENTFAILEDINSTAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeDeploymentFailedInStage").build();
    private static final MarshallingInfo<String> EDGEDEPLOYMENTSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeDeploymentStatusMessage").build();
    private static final MarshallingInfo<java.util.Date> EDGEDEPLOYMENTSTAGESTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeDeploymentStageStartTime").timestampFormat("unixTimestamp").build();

    private static final EdgeDeploymentStatusMarshaller instance = new EdgeDeploymentStatusMarshaller();

    public static EdgeDeploymentStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EdgeDeploymentStatus edgeDeploymentStatus, ProtocolMarshaller protocolMarshaller) {

        if (edgeDeploymentStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(edgeDeploymentStatus.getStageStatus(), STAGESTATUS_BINDING);
            protocolMarshaller.marshall(edgeDeploymentStatus.getEdgeDeploymentSuccessInStage(), EDGEDEPLOYMENTSUCCESSINSTAGE_BINDING);
            protocolMarshaller.marshall(edgeDeploymentStatus.getEdgeDeploymentPendingInStage(), EDGEDEPLOYMENTPENDINGINSTAGE_BINDING);
            protocolMarshaller.marshall(edgeDeploymentStatus.getEdgeDeploymentFailedInStage(), EDGEDEPLOYMENTFAILEDINSTAGE_BINDING);
            protocolMarshaller.marshall(edgeDeploymentStatus.getEdgeDeploymentStatusMessage(), EDGEDEPLOYMENTSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(edgeDeploymentStatus.getEdgeDeploymentStageStartTime(), EDGEDEPLOYMENTSTAGESTARTTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
