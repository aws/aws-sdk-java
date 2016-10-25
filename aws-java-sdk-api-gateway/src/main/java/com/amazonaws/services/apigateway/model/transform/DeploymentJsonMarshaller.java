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
package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DeploymentMarshaller
 */
public class DeploymentJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Deployment deployment, StructuredJsonGenerator jsonGenerator) {

        if (deployment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (deployment.getId() != null) {
                jsonGenerator.writeFieldName("id").writeValue(deployment.getId());
            }
            if (deployment.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(deployment.getDescription());
            }
            if (deployment.getCreatedDate() != null) {
                jsonGenerator.writeFieldName("createdDate").writeValue(deployment.getCreatedDate());
            }

            java.util.Map<String, java.util.Map<String, MethodSnapshot>> apiSummaryMap = deployment.getApiSummary();
            if (apiSummaryMap != null) {
                jsonGenerator.writeFieldName("apiSummary");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, java.util.Map<String, MethodSnapshot>> apiSummaryMapValue : apiSummaryMap.entrySet()) {
                    if (apiSummaryMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(apiSummaryMapValue.getKey());

                        jsonGenerator.writeStartObject();
                        for (Map.Entry<String, MethodSnapshot> apiSummaryMapValueNestedMap : apiSummaryMapValue.getValue().entrySet()) {
                            if (apiSummaryMapValueNestedMap.getValue() != null) {
                                jsonGenerator.writeFieldName(apiSummaryMapValueNestedMap.getKey());

                                MethodSnapshotJsonMarshaller.getInstance().marshall(apiSummaryMapValueNestedMap.getValue(), jsonGenerator);
                            }
                        }
                        jsonGenerator.writeEndObject();
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DeploymentJsonMarshaller instance;

    public static DeploymentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentJsonMarshaller();
        return instance;
    }

}
