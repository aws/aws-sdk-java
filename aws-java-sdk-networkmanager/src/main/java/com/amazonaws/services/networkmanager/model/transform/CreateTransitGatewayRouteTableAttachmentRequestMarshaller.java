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
package com.amazonaws.services.networkmanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkmanager.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateTransitGatewayRouteTableAttachmentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateTransitGatewayRouteTableAttachmentRequestMarshaller {

    private static final MarshallingInfo<String> PEERINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PeeringId").build();
    private static final MarshallingInfo<String> TRANSITGATEWAYROUTETABLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransitGatewayRouteTableArn").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final CreateTransitGatewayRouteTableAttachmentRequestMarshaller instance = new CreateTransitGatewayRouteTableAttachmentRequestMarshaller();

    public static CreateTransitGatewayRouteTableAttachmentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateTransitGatewayRouteTableAttachmentRequest createTransitGatewayRouteTableAttachmentRequest, ProtocolMarshaller protocolMarshaller) {

        if (createTransitGatewayRouteTableAttachmentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createTransitGatewayRouteTableAttachmentRequest.getPeeringId(), PEERINGID_BINDING);
            protocolMarshaller.marshall(createTransitGatewayRouteTableAttachmentRequest.getTransitGatewayRouteTableArn(), TRANSITGATEWAYROUTETABLEARN_BINDING);
            protocolMarshaller.marshall(createTransitGatewayRouteTableAttachmentRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createTransitGatewayRouteTableAttachmentRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
