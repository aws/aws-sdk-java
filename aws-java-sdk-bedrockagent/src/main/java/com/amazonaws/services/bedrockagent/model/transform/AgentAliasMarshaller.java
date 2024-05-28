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
package com.amazonaws.services.bedrockagent.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockagent.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AgentAliasMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AgentAliasMarshaller {

    private static final MarshallingInfo<String> AGENTALIASARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentAliasArn").build();
    private static final MarshallingInfo<List> AGENTALIASHISTORYEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentAliasHistoryEvents").build();
    private static final MarshallingInfo<String> AGENTALIASID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentAliasId").build();
    private static final MarshallingInfo<String> AGENTALIASNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentAliasName").build();
    private static final MarshallingInfo<String> AGENTALIASSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentAliasStatus").build();
    private static final MarshallingInfo<String> AGENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("agentId").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> FAILUREREASONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureReasons").build();
    private static final MarshallingInfo<List> ROUTINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("routingConfiguration").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("iso8601").build();

    private static final AgentAliasMarshaller instance = new AgentAliasMarshaller();

    public static AgentAliasMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AgentAlias agentAlias, ProtocolMarshaller protocolMarshaller) {

        if (agentAlias == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(agentAlias.getAgentAliasArn(), AGENTALIASARN_BINDING);
            protocolMarshaller.marshall(agentAlias.getAgentAliasHistoryEvents(), AGENTALIASHISTORYEVENTS_BINDING);
            protocolMarshaller.marshall(agentAlias.getAgentAliasId(), AGENTALIASID_BINDING);
            protocolMarshaller.marshall(agentAlias.getAgentAliasName(), AGENTALIASNAME_BINDING);
            protocolMarshaller.marshall(agentAlias.getAgentAliasStatus(), AGENTALIASSTATUS_BINDING);
            protocolMarshaller.marshall(agentAlias.getAgentId(), AGENTID_BINDING);
            protocolMarshaller.marshall(agentAlias.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(agentAlias.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(agentAlias.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(agentAlias.getFailureReasons(), FAILUREREASONS_BINDING);
            protocolMarshaller.marshall(agentAlias.getRoutingConfiguration(), ROUTINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(agentAlias.getUpdatedAt(), UPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
