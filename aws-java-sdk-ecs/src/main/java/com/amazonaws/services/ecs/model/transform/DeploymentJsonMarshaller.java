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
package com.amazonaws.services.ecs.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;
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
            if (deployment.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(deployment.getStatus());
            }
            if (deployment.getTaskDefinition() != null) {
                jsonGenerator.writeFieldName("taskDefinition").writeValue(deployment.getTaskDefinition());
            }
            if (deployment.getDesiredCount() != null) {
                jsonGenerator.writeFieldName("desiredCount").writeValue(deployment.getDesiredCount());
            }
            if (deployment.getPendingCount() != null) {
                jsonGenerator.writeFieldName("pendingCount").writeValue(deployment.getPendingCount());
            }
            if (deployment.getRunningCount() != null) {
                jsonGenerator.writeFieldName("runningCount").writeValue(deployment.getRunningCount());
            }
            if (deployment.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("createdAt").writeValue(deployment.getCreatedAt());
            }
            if (deployment.getUpdatedAt() != null) {
                jsonGenerator.writeFieldName("updatedAt").writeValue(deployment.getUpdatedAt());
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
