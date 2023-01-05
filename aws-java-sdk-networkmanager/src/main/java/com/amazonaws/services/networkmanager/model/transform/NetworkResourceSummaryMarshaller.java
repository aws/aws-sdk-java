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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NetworkResourceSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkResourceSummaryMarshaller {

    private static final MarshallingInfo<String> REGISTEREDGATEWAYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegisteredGatewayArn").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<String> DEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Definition").build();
    private static final MarshallingInfo<String> NAMETAG_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NameTag").build();
    private static final MarshallingInfo<Boolean> ISMIDDLEBOX_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsMiddlebox").build();

    private static final NetworkResourceSummaryMarshaller instance = new NetworkResourceSummaryMarshaller();

    public static NetworkResourceSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkResourceSummary networkResourceSummary, ProtocolMarshaller protocolMarshaller) {

        if (networkResourceSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkResourceSummary.getRegisteredGatewayArn(), REGISTEREDGATEWAYARN_BINDING);
            protocolMarshaller.marshall(networkResourceSummary.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(networkResourceSummary.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(networkResourceSummary.getDefinition(), DEFINITION_BINDING);
            protocolMarshaller.marshall(networkResourceSummary.getNameTag(), NAMETAG_BINDING);
            protocolMarshaller.marshall(networkResourceSummary.getIsMiddlebox(), ISMIDDLEBOX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
