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
package com.amazonaws.services.entityresolution.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.entityresolution.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResolutionTechniquesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResolutionTechniquesMarshaller {

    private static final MarshallingInfo<StructuredPojo> PROVIDERPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("providerProperties").build();
    private static final MarshallingInfo<String> RESOLUTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resolutionType").build();
    private static final MarshallingInfo<StructuredPojo> RULEBASEDPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ruleBasedProperties").build();

    private static final ResolutionTechniquesMarshaller instance = new ResolutionTechniquesMarshaller();

    public static ResolutionTechniquesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResolutionTechniques resolutionTechniques, ProtocolMarshaller protocolMarshaller) {

        if (resolutionTechniques == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resolutionTechniques.getProviderProperties(), PROVIDERPROPERTIES_BINDING);
            protocolMarshaller.marshall(resolutionTechniques.getResolutionType(), RESOLUTIONTYPE_BINDING);
            protocolMarshaller.marshall(resolutionTechniques.getRuleBasedProperties(), RULEBASEDPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
