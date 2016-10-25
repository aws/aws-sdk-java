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
package com.amazonaws.services.directconnect.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ConnectionMarshaller
 */
public class ConnectionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Connection connection, StructuredJsonGenerator jsonGenerator) {

        if (connection == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (connection.getOwnerAccount() != null) {
                jsonGenerator.writeFieldName("ownerAccount").writeValue(connection.getOwnerAccount());
            }
            if (connection.getConnectionId() != null) {
                jsonGenerator.writeFieldName("connectionId").writeValue(connection.getConnectionId());
            }
            if (connection.getConnectionName() != null) {
                jsonGenerator.writeFieldName("connectionName").writeValue(connection.getConnectionName());
            }
            if (connection.getConnectionState() != null) {
                jsonGenerator.writeFieldName("connectionState").writeValue(connection.getConnectionState());
            }
            if (connection.getRegion() != null) {
                jsonGenerator.writeFieldName("region").writeValue(connection.getRegion());
            }
            if (connection.getLocation() != null) {
                jsonGenerator.writeFieldName("location").writeValue(connection.getLocation());
            }
            if (connection.getBandwidth() != null) {
                jsonGenerator.writeFieldName("bandwidth").writeValue(connection.getBandwidth());
            }
            if (connection.getVlan() != null) {
                jsonGenerator.writeFieldName("vlan").writeValue(connection.getVlan());
            }
            if (connection.getPartnerName() != null) {
                jsonGenerator.writeFieldName("partnerName").writeValue(connection.getPartnerName());
            }
            if (connection.getLoaIssueTime() != null) {
                jsonGenerator.writeFieldName("loaIssueTime").writeValue(connection.getLoaIssueTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ConnectionJsonMarshaller instance;

    public static ConnectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionJsonMarshaller();
        return instance;
    }

}
