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
 * TaskMarshaller
 */
public class TaskJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Task task, StructuredJsonGenerator jsonGenerator) {

        if (task == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (task.getTaskArn() != null) {
                jsonGenerator.writeFieldName("taskArn").writeValue(task.getTaskArn());
            }
            if (task.getClusterArn() != null) {
                jsonGenerator.writeFieldName("clusterArn").writeValue(task.getClusterArn());
            }
            if (task.getTaskDefinitionArn() != null) {
                jsonGenerator.writeFieldName("taskDefinitionArn").writeValue(task.getTaskDefinitionArn());
            }
            if (task.getContainerInstanceArn() != null) {
                jsonGenerator.writeFieldName("containerInstanceArn").writeValue(task.getContainerInstanceArn());
            }
            if (task.getOverrides() != null) {
                jsonGenerator.writeFieldName("overrides");
                TaskOverrideJsonMarshaller.getInstance().marshall(task.getOverrides(), jsonGenerator);
            }
            if (task.getLastStatus() != null) {
                jsonGenerator.writeFieldName("lastStatus").writeValue(task.getLastStatus());
            }
            if (task.getDesiredStatus() != null) {
                jsonGenerator.writeFieldName("desiredStatus").writeValue(task.getDesiredStatus());
            }

            com.amazonaws.internal.SdkInternalList<Container> containersList = (com.amazonaws.internal.SdkInternalList<Container>) task.getContainers();
            if (!containersList.isEmpty() || !containersList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("containers");
                jsonGenerator.writeStartArray();
                for (Container containersListValue : containersList) {
                    if (containersListValue != null) {

                        ContainerJsonMarshaller.getInstance().marshall(containersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (task.getStartedBy() != null) {
                jsonGenerator.writeFieldName("startedBy").writeValue(task.getStartedBy());
            }
            if (task.getVersion() != null) {
                jsonGenerator.writeFieldName("version").writeValue(task.getVersion());
            }
            if (task.getStoppedReason() != null) {
                jsonGenerator.writeFieldName("stoppedReason").writeValue(task.getStoppedReason());
            }
            if (task.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("createdAt").writeValue(task.getCreatedAt());
            }
            if (task.getStartedAt() != null) {
                jsonGenerator.writeFieldName("startedAt").writeValue(task.getStartedAt());
            }
            if (task.getStoppedAt() != null) {
                jsonGenerator.writeFieldName("stoppedAt").writeValue(task.getStoppedAt());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TaskJsonMarshaller instance;

    public static TaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskJsonMarshaller();
        return instance;
    }

}
