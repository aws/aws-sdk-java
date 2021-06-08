/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrassv2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrassv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDeploymentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDeploymentRequestMarshaller {

    private static final MarshallingInfo<String> TARGETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("targetArn").build();
    private static final MarshallingInfo<String> DEPLOYMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentName").build();
    private static final MarshallingInfo<Map> COMPONENTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("components").build();
    private static final MarshallingInfo<StructuredPojo> IOTJOBCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iotJobConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DEPLOYMENTPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentPolicies").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateDeploymentRequestMarshaller instance = new CreateDeploymentRequestMarshaller();

    public static CreateDeploymentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDeploymentRequest createDeploymentRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDeploymentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDeploymentRequest.getTargetArn(), TARGETARN_BINDING);
            protocolMarshaller.marshall(createDeploymentRequest.getDeploymentName(), DEPLOYMENTNAME_BINDING);
            protocolMarshaller.marshall(createDeploymentRequest.getComponents(), COMPONENTS_BINDING);
            protocolMarshaller.marshall(createDeploymentRequest.getIotJobConfiguration(), IOTJOBCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createDeploymentRequest.getDeploymentPolicies(), DEPLOYMENTPOLICIES_BINDING);
            protocolMarshaller.marshall(createDeploymentRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
