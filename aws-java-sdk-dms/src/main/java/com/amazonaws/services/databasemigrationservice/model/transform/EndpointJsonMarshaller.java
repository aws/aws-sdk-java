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

package com.amazonaws.services.databasemigrationservice.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * EndpointMarshaller
 */
public class EndpointJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Endpoint endpoint, JSONWriter jsonWriter) {
        if (endpoint == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (endpoint.getEndpointIdentifier() != null) {
                jsonWriter.key("EndpointIdentifier").value(
                        endpoint.getEndpointIdentifier());
            }
            if (endpoint.getEndpointType() != null) {
                jsonWriter.key("EndpointType")
                        .value(endpoint.getEndpointType());
            }
            if (endpoint.getEngineName() != null) {
                jsonWriter.key("EngineName").value(endpoint.getEngineName());
            }
            if (endpoint.getUsername() != null) {
                jsonWriter.key("Username").value(endpoint.getUsername());
            }
            if (endpoint.getServerName() != null) {
                jsonWriter.key("ServerName").value(endpoint.getServerName());
            }
            if (endpoint.getPort() != null) {
                jsonWriter.key("Port").value(endpoint.getPort());
            }
            if (endpoint.getDatabaseName() != null) {
                jsonWriter.key("DatabaseName")
                        .value(endpoint.getDatabaseName());
            }
            if (endpoint.getExtraConnectionAttributes() != null) {
                jsonWriter.key("ExtraConnectionAttributes").value(
                        endpoint.getExtraConnectionAttributes());
            }
            if (endpoint.getStatus() != null) {
                jsonWriter.key("Status").value(endpoint.getStatus());
            }
            if (endpoint.getKmsKeyId() != null) {
                jsonWriter.key("KmsKeyId").value(endpoint.getKmsKeyId());
            }
            if (endpoint.getEndpointArn() != null) {
                jsonWriter.key("EndpointArn").value(endpoint.getEndpointArn());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EndpointJsonMarshaller instance;

    public static EndpointJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointJsonMarshaller();
        return instance;
    }

}
