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
 * UpdateNodeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateNodeRequestMarshaller {

    private static final MarshallingInfo<String> NETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("networkId").build();
    private static final MarshallingInfo<String> MEMBERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MemberId").build();
    private static final MarshallingInfo<String> NODEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("nodeId").build();
    private static final MarshallingInfo<StructuredPojo> LOGPUBLISHINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogPublishingConfiguration").build();

    private static final UpdateNodeRequestMarshaller instance = new UpdateNodeRequestMarshaller();

    public static UpdateNodeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateNodeRequest updateNodeRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateNodeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateNodeRequest.getNetworkId(), NETWORKID_BINDING);
            protocolMarshaller.marshall(updateNodeRequest.getMemberId(), MEMBERID_BINDING);
            protocolMarshaller.marshall(updateNodeRequest.getNodeId(), NODEID_BINDING);
            protocolMarshaller.marshall(updateNodeRequest.getLogPublishingConfiguration(), LOGPUBLISHINGCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
