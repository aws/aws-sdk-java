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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrassv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeploymentPoliciesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeploymentPoliciesMarshaller {

    private static final MarshallingInfo<String> FAILUREHANDLINGPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureHandlingPolicy").build();
    private static final MarshallingInfo<StructuredPojo> COMPONENTUPDATEPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("componentUpdatePolicy").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATIONVALIDATIONPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationValidationPolicy").build();

    private static final DeploymentPoliciesMarshaller instance = new DeploymentPoliciesMarshaller();

    public static DeploymentPoliciesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeploymentPolicies deploymentPolicies, ProtocolMarshaller protocolMarshaller) {

        if (deploymentPolicies == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deploymentPolicies.getFailureHandlingPolicy(), FAILUREHANDLINGPOLICY_BINDING);
            protocolMarshaller.marshall(deploymentPolicies.getComponentUpdatePolicy(), COMPONENTUPDATEPOLICY_BINDING);
            protocolMarshaller.marshall(deploymentPolicies.getConfigurationValidationPolicy(), CONFIGURATIONVALIDATIONPOLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
