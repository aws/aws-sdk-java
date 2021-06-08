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
package com.amazonaws.services.appmesh.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appmesh.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VirtualGatewayDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VirtualGatewayDataMarshaller {

    private static final MarshallingInfo<String> MESHNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("meshName").build();
    private static final MarshallingInfo<StructuredPojo> METADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metadata").build();
    private static final MarshallingInfo<StructuredPojo> SPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("spec").build();
    private static final MarshallingInfo<StructuredPojo> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("status").build();
    private static final MarshallingInfo<String> VIRTUALGATEWAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualGatewayName").build();

    private static final VirtualGatewayDataMarshaller instance = new VirtualGatewayDataMarshaller();

    public static VirtualGatewayDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VirtualGatewayData virtualGatewayData, ProtocolMarshaller protocolMarshaller) {

        if (virtualGatewayData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(virtualGatewayData.getMeshName(), MESHNAME_BINDING);
            protocolMarshaller.marshall(virtualGatewayData.getMetadata(), METADATA_BINDING);
            protocolMarshaller.marshall(virtualGatewayData.getSpec(), SPEC_BINDING);
            protocolMarshaller.marshall(virtualGatewayData.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(virtualGatewayData.getVirtualGatewayName(), VIRTUALGATEWAYNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
