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
 * CreateEdgeDeploymentPlanRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateEdgeDeploymentPlanRequestMarshaller {

    private static final MarshallingInfo<String> EDGEDEPLOYMENTPLANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeDeploymentPlanName").build();
    private static final MarshallingInfo<List> MODELCONFIGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelConfigs").build();
    private static final MarshallingInfo<String> DEVICEFLEETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceFleetName").build();
    private static final MarshallingInfo<List> STAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Stages").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateEdgeDeploymentPlanRequestMarshaller instance = new CreateEdgeDeploymentPlanRequestMarshaller();

    public static CreateEdgeDeploymentPlanRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateEdgeDeploymentPlanRequest createEdgeDeploymentPlanRequest, ProtocolMarshaller protocolMarshaller) {

        if (createEdgeDeploymentPlanRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createEdgeDeploymentPlanRequest.getEdgeDeploymentPlanName(), EDGEDEPLOYMENTPLANNAME_BINDING);
            protocolMarshaller.marshall(createEdgeDeploymentPlanRequest.getModelConfigs(), MODELCONFIGS_BINDING);
            protocolMarshaller.marshall(createEdgeDeploymentPlanRequest.getDeviceFleetName(), DEVICEFLEETNAME_BINDING);
            protocolMarshaller.marshall(createEdgeDeploymentPlanRequest.getStages(), STAGES_BINDING);
            protocolMarshaller.marshall(createEdgeDeploymentPlanRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
