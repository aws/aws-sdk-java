/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationdiscovery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AgentInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AgentInfoMarshaller {

    private static final MarshallingInfo<String> AGENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("agentId").build();
    private static final MarshallingInfo<String> HOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("hostName").build();
    private static final MarshallingInfo<List> AGENTNETWORKINFOLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentNetworkInfoList").build();
    private static final MarshallingInfo<String> CONNECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorId").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<String> HEALTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("health").build();
    private static final MarshallingInfo<String> LASTHEALTHPINGTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastHealthPingTime").build();
    private static final MarshallingInfo<String> COLLECTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collectionStatus").build();
    private static final MarshallingInfo<String> AGENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("agentType").build();
    private static final MarshallingInfo<String> REGISTEREDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registeredTime").build();

    private static final AgentInfoMarshaller instance = new AgentInfoMarshaller();

    public static AgentInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AgentInfo agentInfo, ProtocolMarshaller protocolMarshaller) {

        if (agentInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(agentInfo.getAgentId(), AGENTID_BINDING);
            protocolMarshaller.marshall(agentInfo.getHostName(), HOSTNAME_BINDING);
            protocolMarshaller.marshall(agentInfo.getAgentNetworkInfoList(), AGENTNETWORKINFOLIST_BINDING);
            protocolMarshaller.marshall(agentInfo.getConnectorId(), CONNECTORID_BINDING);
            protocolMarshaller.marshall(agentInfo.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(agentInfo.getHealth(), HEALTH_BINDING);
            protocolMarshaller.marshall(agentInfo.getLastHealthPingTime(), LASTHEALTHPINGTIME_BINDING);
            protocolMarshaller.marshall(agentInfo.getCollectionStatus(), COLLECTIONSTATUS_BINDING);
            protocolMarshaller.marshall(agentInfo.getAgentType(), AGENTTYPE_BINDING);
            protocolMarshaller.marshall(agentInfo.getRegisteredTime(), REGISTEREDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
