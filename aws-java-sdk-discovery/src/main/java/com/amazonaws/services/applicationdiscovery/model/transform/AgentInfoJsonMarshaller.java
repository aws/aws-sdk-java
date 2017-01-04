/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AgentInfoMarshaller
 */
public class AgentInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AgentInfo agentInfo, StructuredJsonGenerator jsonGenerator) {

        if (agentInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (agentInfo.getAgentId() != null) {
                jsonGenerator.writeFieldName("agentId").writeValue(agentInfo.getAgentId());
            }
            if (agentInfo.getHostName() != null) {
                jsonGenerator.writeFieldName("hostName").writeValue(agentInfo.getHostName());
            }

            java.util.List<AgentNetworkInfo> agentNetworkInfoListList = agentInfo.getAgentNetworkInfoList();
            if (agentNetworkInfoListList != null) {
                jsonGenerator.writeFieldName("agentNetworkInfoList");
                jsonGenerator.writeStartArray();
                for (AgentNetworkInfo agentNetworkInfoListListValue : agentNetworkInfoListList) {
                    if (agentNetworkInfoListListValue != null) {

                        AgentNetworkInfoJsonMarshaller.getInstance().marshall(agentNetworkInfoListListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (agentInfo.getConnectorId() != null) {
                jsonGenerator.writeFieldName("connectorId").writeValue(agentInfo.getConnectorId());
            }
            if (agentInfo.getVersion() != null) {
                jsonGenerator.writeFieldName("version").writeValue(agentInfo.getVersion());
            }
            if (agentInfo.getHealth() != null) {
                jsonGenerator.writeFieldName("health").writeValue(agentInfo.getHealth());
            }
            if (agentInfo.getLastHealthPingTime() != null) {
                jsonGenerator.writeFieldName("lastHealthPingTime").writeValue(agentInfo.getLastHealthPingTime());
            }
            if (agentInfo.getCollectionStatus() != null) {
                jsonGenerator.writeFieldName("collectionStatus").writeValue(agentInfo.getCollectionStatus());
            }
            if (agentInfo.getAgentType() != null) {
                jsonGenerator.writeFieldName("agentType").writeValue(agentInfo.getAgentType());
            }
            if (agentInfo.getRegisteredTime() != null) {
                jsonGenerator.writeFieldName("registeredTime").writeValue(agentInfo.getRegisteredTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AgentInfoJsonMarshaller instance;

    public static AgentInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AgentInfoJsonMarshaller();
        return instance;
    }

}
