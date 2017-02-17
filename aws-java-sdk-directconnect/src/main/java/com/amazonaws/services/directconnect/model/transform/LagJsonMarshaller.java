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
package com.amazonaws.services.directconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.json.*;

/**
 * LagMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LagJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Lag lag, StructuredJsonGenerator jsonGenerator) {

        if (lag == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (lag.getConnectionsBandwidth() != null) {
                jsonGenerator.writeFieldName("connectionsBandwidth").writeValue(lag.getConnectionsBandwidth());
            }
            if (lag.getNumberOfConnections() != null) {
                jsonGenerator.writeFieldName("numberOfConnections").writeValue(lag.getNumberOfConnections());
            }
            if (lag.getLagId() != null) {
                jsonGenerator.writeFieldName("lagId").writeValue(lag.getLagId());
            }
            if (lag.getOwnerAccount() != null) {
                jsonGenerator.writeFieldName("ownerAccount").writeValue(lag.getOwnerAccount());
            }
            if (lag.getLagName() != null) {
                jsonGenerator.writeFieldName("lagName").writeValue(lag.getLagName());
            }
            if (lag.getLagState() != null) {
                jsonGenerator.writeFieldName("lagState").writeValue(lag.getLagState());
            }
            if (lag.getLocation() != null) {
                jsonGenerator.writeFieldName("location").writeValue(lag.getLocation());
            }
            if (lag.getRegion() != null) {
                jsonGenerator.writeFieldName("region").writeValue(lag.getRegion());
            }
            if (lag.getMinimumLinks() != null) {
                jsonGenerator.writeFieldName("minimumLinks").writeValue(lag.getMinimumLinks());
            }
            if (lag.getAwsDevice() != null) {
                jsonGenerator.writeFieldName("awsDevice").writeValue(lag.getAwsDevice());
            }

            com.amazonaws.internal.SdkInternalList<Connection> connectionsList = (com.amazonaws.internal.SdkInternalList<Connection>) lag.getConnections();
            if (!connectionsList.isEmpty() || !connectionsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("connections");
                jsonGenerator.writeStartArray();
                for (Connection connectionsListValue : connectionsList) {
                    if (connectionsListValue != null) {

                        ConnectionJsonMarshaller.getInstance().marshall(connectionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (lag.getAllowsHostedConnections() != null) {
                jsonGenerator.writeFieldName("allowsHostedConnections").writeValue(lag.getAllowsHostedConnections());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static LagJsonMarshaller instance;

    public static LagJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LagJsonMarshaller();
        return instance;
    }

}
