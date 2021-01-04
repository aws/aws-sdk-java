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
package com.amazonaws.services.managedblockchain.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.managedblockchain.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NodeFabricLogPublishingConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NodeFabricLogPublishingConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> CHAINCODELOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChaincodeLogs").build();
    private static final MarshallingInfo<StructuredPojo> PEERLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PeerLogs").build();

    private static final NodeFabricLogPublishingConfigurationMarshaller instance = new NodeFabricLogPublishingConfigurationMarshaller();

    public static NodeFabricLogPublishingConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NodeFabricLogPublishingConfiguration nodeFabricLogPublishingConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (nodeFabricLogPublishingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(nodeFabricLogPublishingConfiguration.getChaincodeLogs(), CHAINCODELOGS_BINDING);
            protocolMarshaller.marshall(nodeFabricLogPublishingConfiguration.getPeerLogs(), PEERLOGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
