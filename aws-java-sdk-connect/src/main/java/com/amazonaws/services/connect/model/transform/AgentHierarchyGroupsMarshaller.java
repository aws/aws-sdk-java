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
package com.amazonaws.services.connect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AgentHierarchyGroupsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AgentHierarchyGroupsMarshaller {

    private static final MarshallingInfo<List> L1IDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("L1Ids").build();
    private static final MarshallingInfo<List> L2IDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("L2Ids").build();
    private static final MarshallingInfo<List> L3IDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("L3Ids").build();
    private static final MarshallingInfo<List> L4IDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("L4Ids").build();
    private static final MarshallingInfo<List> L5IDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("L5Ids").build();

    private static final AgentHierarchyGroupsMarshaller instance = new AgentHierarchyGroupsMarshaller();

    public static AgentHierarchyGroupsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AgentHierarchyGroups agentHierarchyGroups, ProtocolMarshaller protocolMarshaller) {

        if (agentHierarchyGroups == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(agentHierarchyGroups.getL1Ids(), L1IDS_BINDING);
            protocolMarshaller.marshall(agentHierarchyGroups.getL2Ids(), L2IDS_BINDING);
            protocolMarshaller.marshall(agentHierarchyGroups.getL3Ids(), L3IDS_BINDING);
            protocolMarshaller.marshall(agentHierarchyGroups.getL4Ids(), L4IDS_BINDING);
            protocolMarshaller.marshall(agentHierarchyGroups.getL5Ids(), L5IDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
