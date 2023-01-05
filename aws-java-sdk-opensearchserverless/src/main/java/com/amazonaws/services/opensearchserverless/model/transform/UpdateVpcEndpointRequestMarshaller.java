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
package com.amazonaws.services.opensearchserverless.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opensearchserverless.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateVpcEndpointRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateVpcEndpointRequestMarshaller {

    private static final MarshallingInfo<List> ADDSECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addSecurityGroupIds").build();
    private static final MarshallingInfo<List> ADDSUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("addSubnetIds").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<List> REMOVESECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("removeSecurityGroupIds").build();
    private static final MarshallingInfo<List> REMOVESUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("removeSubnetIds").build();

    private static final UpdateVpcEndpointRequestMarshaller instance = new UpdateVpcEndpointRequestMarshaller();

    public static UpdateVpcEndpointRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateVpcEndpointRequest updateVpcEndpointRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateVpcEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateVpcEndpointRequest.getAddSecurityGroupIds(), ADDSECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(updateVpcEndpointRequest.getAddSubnetIds(), ADDSUBNETIDS_BINDING);
            protocolMarshaller.marshall(updateVpcEndpointRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(updateVpcEndpointRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(updateVpcEndpointRequest.getRemoveSecurityGroupIds(), REMOVESECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(updateVpcEndpointRequest.getRemoveSubnetIds(), REMOVESUBNETIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
