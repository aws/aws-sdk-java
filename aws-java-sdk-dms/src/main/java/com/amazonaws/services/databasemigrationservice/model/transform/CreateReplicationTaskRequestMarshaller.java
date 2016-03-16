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
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CreateReplicationTaskRequest Marshaller
 */
public class CreateReplicationTaskRequestMarshaller
        implements
        Marshaller<Request<CreateReplicationTaskRequest>, CreateReplicationTaskRequest> {

    public Request<CreateReplicationTaskRequest> marshall(
            CreateReplicationTaskRequest createReplicationTaskRequest) {

        if (createReplicationTaskRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateReplicationTaskRequest> request = new DefaultRequest<CreateReplicationTaskRequest>(
                createReplicationTaskRequest, "AWSDatabaseMigrationService");
        request.addHeader("X-Amz-Target",
                "AmazonDMSv20160101.CreateReplicationTask");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (createReplicationTaskRequest.getReplicationTaskIdentifier() != null) {
                jsonWriter.key("ReplicationTaskIdentifier").value(
                        createReplicationTaskRequest
                                .getReplicationTaskIdentifier());
            }
            if (createReplicationTaskRequest.getSourceEndpointArn() != null) {
                jsonWriter.key("SourceEndpointArn").value(
                        createReplicationTaskRequest.getSourceEndpointArn());
            }
            if (createReplicationTaskRequest.getTargetEndpointArn() != null) {
                jsonWriter.key("TargetEndpointArn").value(
                        createReplicationTaskRequest.getTargetEndpointArn());
            }
            if (createReplicationTaskRequest.getReplicationInstanceArn() != null) {
                jsonWriter.key("ReplicationInstanceArn").value(
                        createReplicationTaskRequest
                                .getReplicationInstanceArn());
            }
            if (createReplicationTaskRequest.getMigrationType() != null) {
                jsonWriter.key("MigrationType").value(
                        createReplicationTaskRequest.getMigrationType());
            }
            if (createReplicationTaskRequest.getTableMappings() != null) {
                jsonWriter.key("TableMappings").value(
                        createReplicationTaskRequest.getTableMappings());
            }
            if (createReplicationTaskRequest.getReplicationTaskSettings() != null) {
                jsonWriter.key("ReplicationTaskSettings").value(
                        createReplicationTaskRequest
                                .getReplicationTaskSettings());
            }
            if (createReplicationTaskRequest.getCdcStartTime() != null) {
                jsonWriter.key("CdcStartTime").value(
                        createReplicationTaskRequest.getCdcStartTime());
            }

            java.util.List<Tag> tagsList = createReplicationTaskRequest
                    .getTags();
            if (tagsList != null) {
                jsonWriter.key("Tags");
                jsonWriter.array();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
