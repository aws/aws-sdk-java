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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appmesh.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VirtualGatewayClientPolicyTlsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VirtualGatewayClientPolicyTlsMarshaller {

    private static final MarshallingInfo<StructuredPojo> CERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificate").build();
    private static final MarshallingInfo<Boolean> ENFORCE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("enforce").build();
    private static final MarshallingInfo<List> PORTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ports").build();
    private static final MarshallingInfo<StructuredPojo> VALIDATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("validation").build();

    private static final VirtualGatewayClientPolicyTlsMarshaller instance = new VirtualGatewayClientPolicyTlsMarshaller();

    public static VirtualGatewayClientPolicyTlsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VirtualGatewayClientPolicyTls virtualGatewayClientPolicyTls, ProtocolMarshaller protocolMarshaller) {

        if (virtualGatewayClientPolicyTls == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(virtualGatewayClientPolicyTls.getCertificate(), CERTIFICATE_BINDING);
            protocolMarshaller.marshall(virtualGatewayClientPolicyTls.getEnforce(), ENFORCE_BINDING);
            protocolMarshaller.marshall(virtualGatewayClientPolicyTls.getPorts(), PORTS_BINDING);
            protocolMarshaller.marshall(virtualGatewayClientPolicyTls.getValidation(), VALIDATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
