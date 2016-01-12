/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.directconnect.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ConnectionMarshaller
 */
public class ConnectionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Connection connection, JSONWriter jsonWriter) {
        if (connection == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (connection.getOwnerAccount() != null) {
                jsonWriter.key("ownerAccount").value(
                        connection.getOwnerAccount());
            }

            if (connection.getConnectionId() != null) {
                jsonWriter.key("connectionId").value(
                        connection.getConnectionId());
            }

            if (connection.getConnectionName() != null) {
                jsonWriter.key("connectionName").value(
                        connection.getConnectionName());
            }

            if (connection.getConnectionState() != null) {
                jsonWriter.key("connectionState").value(
                        connection.getConnectionState());
            }

            if (connection.getRegion() != null) {
                jsonWriter.key("region").value(connection.getRegion());
            }

            if (connection.getLocation() != null) {
                jsonWriter.key("location").value(connection.getLocation());
            }

            if (connection.getBandwidth() != null) {
                jsonWriter.key("bandwidth").value(connection.getBandwidth());
            }

            if (connection.getVlan() != null) {
                jsonWriter.key("vlan").value(connection.getVlan());
            }

            if (connection.getPartnerName() != null) {
                jsonWriter.key("partnerName")
                        .value(connection.getPartnerName());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ConnectionJsonMarshaller instance;

    public static ConnectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionJsonMarshaller();
        return instance;
    }

}
