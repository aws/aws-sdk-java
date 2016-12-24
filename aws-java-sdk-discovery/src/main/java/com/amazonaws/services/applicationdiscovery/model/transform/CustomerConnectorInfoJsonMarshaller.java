/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CustomerConnectorInfoMarshaller
 */
public class CustomerConnectorInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CustomerConnectorInfo customerConnectorInfo, StructuredJsonGenerator jsonGenerator) {

        if (customerConnectorInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (customerConnectorInfo.getActiveConnectors() != null) {
                jsonGenerator.writeFieldName("activeConnectors").writeValue(customerConnectorInfo.getActiveConnectors());
            }
            if (customerConnectorInfo.getHealthyConnectors() != null) {
                jsonGenerator.writeFieldName("healthyConnectors").writeValue(customerConnectorInfo.getHealthyConnectors());
            }
            if (customerConnectorInfo.getBlackListedConnectors() != null) {
                jsonGenerator.writeFieldName("blackListedConnectors").writeValue(customerConnectorInfo.getBlackListedConnectors());
            }
            if (customerConnectorInfo.getShutdownConnectors() != null) {
                jsonGenerator.writeFieldName("shutdownConnectors").writeValue(customerConnectorInfo.getShutdownConnectors());
            }
            if (customerConnectorInfo.getUnhealthyConnectors() != null) {
                jsonGenerator.writeFieldName("unhealthyConnectors").writeValue(customerConnectorInfo.getUnhealthyConnectors());
            }
            if (customerConnectorInfo.getTotalConnectors() != null) {
                jsonGenerator.writeFieldName("totalConnectors").writeValue(customerConnectorInfo.getTotalConnectors());
            }
            if (customerConnectorInfo.getUnknownConnectors() != null) {
                jsonGenerator.writeFieldName("unknownConnectors").writeValue(customerConnectorInfo.getUnknownConnectors());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CustomerConnectorInfoJsonMarshaller instance;

    public static CustomerConnectorInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CustomerConnectorInfoJsonMarshaller();
        return instance;
    }

}
