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
 * ComponentDeploymentSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComponentDeploymentSpecificationMarshaller {

    private static final MarshallingInfo<String> COMPONENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("componentVersion").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationUpdate").build();
    private static final MarshallingInfo<StructuredPojo> RUNWITH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runWith").build();

    private static final ComponentDeploymentSpecificationMarshaller instance = new ComponentDeploymentSpecificationMarshaller();

    public static ComponentDeploymentSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComponentDeploymentSpecification componentDeploymentSpecification, ProtocolMarshaller protocolMarshaller) {

        if (componentDeploymentSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(componentDeploymentSpecification.getComponentVersion(), COMPONENTVERSION_BINDING);
            protocolMarshaller.marshall(componentDeploymentSpecification.getConfigurationUpdate(), CONFIGURATIONUPDATE_BINDING);
            protocolMarshaller.marshall(componentDeploymentSpecification.getRunWith(), RUNWITH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
