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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ConnectionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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

            if (connection.getReplicationInstanceArn() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceArn").writeValue(connection.getReplicationInstanceArn());
            }
            if (connection.getEndpointArn() != null) {
                jsonGenerator.writeFieldName("EndpointArn").writeValue(connection.getEndpointArn());
            }
            if (connection.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(connection.getStatus());
            }
            if (connection.getLastFailureMessage() != null) {
                jsonGenerator.writeFieldName("LastFailureMessage").writeValue(connection.getLastFailureMessage());
            }
            if (connection.getEndpointIdentifier() != null) {
                jsonGenerator.writeFieldName("EndpointIdentifier").writeValue(connection.getEndpointIdentifier());
            }
            if (connection.getReplicationInstanceIdentifier() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceIdentifier").writeValue(connection.getReplicationInstanceIdentifier());
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
