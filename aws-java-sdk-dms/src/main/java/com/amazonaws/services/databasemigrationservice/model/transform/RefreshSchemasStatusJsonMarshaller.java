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
 * RefreshSchemasStatusMarshaller
 */
public class RefreshSchemasStatusJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(RefreshSchemasStatus refreshSchemasStatus,
            JSONWriter jsonWriter) {
        if (refreshSchemasStatus == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (refreshSchemasStatus.getEndpointArn() != null) {
                jsonWriter.key("EndpointArn").value(
                        refreshSchemasStatus.getEndpointArn());
            }
            if (refreshSchemasStatus.getReplicationInstanceArn() != null) {
                jsonWriter.key("ReplicationInstanceArn").value(
                        refreshSchemasStatus.getReplicationInstanceArn());
            }
            if (refreshSchemasStatus.getStatus() != null) {
                jsonWriter.key("Status")
                        .value(refreshSchemasStatus.getStatus());
            }
            if (refreshSchemasStatus.getLastRefreshDate() != null) {
                jsonWriter.key("LastRefreshDate").value(
                        refreshSchemasStatus.getLastRefreshDate());
            }
            if (refreshSchemasStatus.getLastFailureMessage() != null) {
                jsonWriter.key("LastFailureMessage").value(
                        refreshSchemasStatus.getLastFailureMessage());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RefreshSchemasStatusJsonMarshaller instance;

    public static RefreshSchemasStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RefreshSchemasStatusJsonMarshaller();
        return instance;
    }

}
