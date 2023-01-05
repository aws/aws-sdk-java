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
package com.amazonaws.services.private5g.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.private5g.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NetworkResourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkResourceMarshaller {

    private static final MarshallingInfo<List> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("attributes").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> HEALTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("health").build();
    private static final MarshallingInfo<String> MODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("model").build();
    private static final MarshallingInfo<String> NETWORKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkArn").build();
    private static final MarshallingInfo<String> NETWORKRESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkResourceArn").build();
    private static final MarshallingInfo<String> NETWORKSITEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkSiteArn").build();
    private static final MarshallingInfo<String> ORDERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("orderArn").build();
    private static final MarshallingInfo<StructuredPojo> POSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("position").build();
    private static final MarshallingInfo<String> SERIALNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serialNumber").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusReason").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> VENDOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vendor").build();

    private static final NetworkResourceMarshaller instance = new NetworkResourceMarshaller();

    public static NetworkResourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkResource networkResource, ProtocolMarshaller protocolMarshaller) {

        if (networkResource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkResource.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(networkResource.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(networkResource.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(networkResource.getHealth(), HEALTH_BINDING);
            protocolMarshaller.marshall(networkResource.getModel(), MODEL_BINDING);
            protocolMarshaller.marshall(networkResource.getNetworkArn(), NETWORKARN_BINDING);
            protocolMarshaller.marshall(networkResource.getNetworkResourceArn(), NETWORKRESOURCEARN_BINDING);
            protocolMarshaller.marshall(networkResource.getNetworkSiteArn(), NETWORKSITEARN_BINDING);
            protocolMarshaller.marshall(networkResource.getOrderArn(), ORDERARN_BINDING);
            protocolMarshaller.marshall(networkResource.getPosition(), POSITION_BINDING);
            protocolMarshaller.marshall(networkResource.getSerialNumber(), SERIALNUMBER_BINDING);
            protocolMarshaller.marshall(networkResource.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(networkResource.getStatusReason(), STATUSREASON_BINDING);
            protocolMarshaller.marshall(networkResource.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(networkResource.getVendor(), VENDOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
