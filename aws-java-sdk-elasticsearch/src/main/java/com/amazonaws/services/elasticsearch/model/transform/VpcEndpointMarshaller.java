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
package com.amazonaws.services.elasticsearch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticsearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VpcEndpointMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VpcEndpointMarshaller {

    private static final MarshallingInfo<String> VPCENDPOINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcEndpointId").build();
    private static final MarshallingInfo<String> VPCENDPOINTOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcEndpointOwner").build();
    private static final MarshallingInfo<String> DOMAINARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DomainArn").build();
    private static final MarshallingInfo<StructuredPojo> VPCOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcOptions").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Endpoint").build();

    private static final VpcEndpointMarshaller instance = new VpcEndpointMarshaller();

    public static VpcEndpointMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VpcEndpoint vpcEndpoint, ProtocolMarshaller protocolMarshaller) {

        if (vpcEndpoint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vpcEndpoint.getVpcEndpointId(), VPCENDPOINTID_BINDING);
            protocolMarshaller.marshall(vpcEndpoint.getVpcEndpointOwner(), VPCENDPOINTOWNER_BINDING);
            protocolMarshaller.marshall(vpcEndpoint.getDomainArn(), DOMAINARN_BINDING);
            protocolMarshaller.marshall(vpcEndpoint.getVpcOptions(), VPCOPTIONS_BINDING);
            protocolMarshaller.marshall(vpcEndpoint.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(vpcEndpoint.getEndpoint(), ENDPOINT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
