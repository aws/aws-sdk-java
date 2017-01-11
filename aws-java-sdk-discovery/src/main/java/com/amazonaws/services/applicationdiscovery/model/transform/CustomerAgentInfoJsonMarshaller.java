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

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.protocol.json.*;

/**
 * CustomerAgentInfoMarshaller
 */
public class CustomerAgentInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CustomerAgentInfo customerAgentInfo, StructuredJsonGenerator jsonGenerator) {

        if (customerAgentInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (customerAgentInfo.getActiveAgents() != null) {
                jsonGenerator.writeFieldName("activeAgents").writeValue(customerAgentInfo.getActiveAgents());
            }
            if (customerAgentInfo.getHealthyAgents() != null) {
                jsonGenerator.writeFieldName("healthyAgents").writeValue(customerAgentInfo.getHealthyAgents());
            }
            if (customerAgentInfo.getBlackListedAgents() != null) {
                jsonGenerator.writeFieldName("blackListedAgents").writeValue(customerAgentInfo.getBlackListedAgents());
            }
            if (customerAgentInfo.getShutdownAgents() != null) {
                jsonGenerator.writeFieldName("shutdownAgents").writeValue(customerAgentInfo.getShutdownAgents());
            }
            if (customerAgentInfo.getUnhealthyAgents() != null) {
                jsonGenerator.writeFieldName("unhealthyAgents").writeValue(customerAgentInfo.getUnhealthyAgents());
            }
            if (customerAgentInfo.getTotalAgents() != null) {
                jsonGenerator.writeFieldName("totalAgents").writeValue(customerAgentInfo.getTotalAgents());
            }
            if (customerAgentInfo.getUnknownAgents() != null) {
                jsonGenerator.writeFieldName("unknownAgents").writeValue(customerAgentInfo.getUnknownAgents());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CustomerAgentInfoJsonMarshaller instance;

    public static CustomerAgentInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CustomerAgentInfoJsonMarshaller();
        return instance;
    }

}
