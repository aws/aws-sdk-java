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

package com.amazonaws.services.apigateway.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DeploymentMarshaller
 */
public class DeploymentJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Deployment deployment, JSONWriter jsonWriter) {
        if (deployment == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (deployment.getId() != null) {
                jsonWriter.key("id").value(deployment.getId());
            }

            if (deployment.getDescription() != null) {
                jsonWriter.key("description")
                        .value(deployment.getDescription());
            }

            if (deployment.getCreatedDate() != null) {
                jsonWriter.key("createdDate")
                        .value(deployment.getCreatedDate());
            }

            java.util.Map<String, java.util.Map<String, MethodSnapshot>> apiSummaryMap = deployment
                    .getApiSummary();
            if (apiSummaryMap != null) {
                jsonWriter.key("apiSummary");
                jsonWriter.object();

                for (Map.Entry<String, java.util.Map<String, MethodSnapshot>> apiSummaryMapValue : apiSummaryMap
                        .entrySet()) {
                    if (apiSummaryMapValue.getValue() != null) {
                        jsonWriter.key(apiSummaryMapValue.getKey());

                        jsonWriter.object();
                        for (Map.Entry<String, MethodSnapshot> apiSummaryMapValueNestedMap : apiSummaryMapValue
                                .getValue().entrySet()) {
                            if (apiSummaryMapValueNestedMap.getValue() != null) {
                                jsonWriter.key(apiSummaryMapValueNestedMap
                                        .getKey());

                                MethodSnapshotJsonMarshaller
                                        .getInstance()
                                        .marshall(
                                                apiSummaryMapValueNestedMap
                                                        .getValue(),
                                                jsonWriter);
                            }
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DeploymentJsonMarshaller instance;

    public static DeploymentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentJsonMarshaller();
        return instance;
    }

}
