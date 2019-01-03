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
package com.amazonaws.services.servicecatalog.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProvisioningArtifactParameterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProvisioningArtifactParameterMarshaller {

    private static final MarshallingInfo<String> PARAMETERKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterKey").build();
    private static final MarshallingInfo<String> DEFAULTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultValue").build();
    private static final MarshallingInfo<String> PARAMETERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterType").build();
    private static final MarshallingInfo<Boolean> ISNOECHO_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsNoEcho").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> PARAMETERCONSTRAINTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterConstraints").build();

    private static final ProvisioningArtifactParameterMarshaller instance = new ProvisioningArtifactParameterMarshaller();

    public static ProvisioningArtifactParameterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProvisioningArtifactParameter provisioningArtifactParameter, ProtocolMarshaller protocolMarshaller) {

        if (provisioningArtifactParameter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(provisioningArtifactParameter.getParameterKey(), PARAMETERKEY_BINDING);
            protocolMarshaller.marshall(provisioningArtifactParameter.getDefaultValue(), DEFAULTVALUE_BINDING);
            protocolMarshaller.marshall(provisioningArtifactParameter.getParameterType(), PARAMETERTYPE_BINDING);
            protocolMarshaller.marshall(provisioningArtifactParameter.getIsNoEcho(), ISNOECHO_BINDING);
            protocolMarshaller.marshall(provisioningArtifactParameter.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(provisioningArtifactParameter.getParameterConstraints(), PARAMETERCONSTRAINTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
