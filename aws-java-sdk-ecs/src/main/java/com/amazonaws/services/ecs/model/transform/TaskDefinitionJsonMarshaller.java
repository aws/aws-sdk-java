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
 * TaskDefinitionMarshaller
 */
public class TaskDefinitionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(TaskDefinition taskDefinition, StructuredJsonGenerator jsonGenerator) {

        if (taskDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (taskDefinition.getTaskDefinitionArn() != null) {
                jsonGenerator.writeFieldName("taskDefinitionArn").writeValue(taskDefinition.getTaskDefinitionArn());
            }

            com.amazonaws.internal.SdkInternalList<ContainerDefinition> containerDefinitionsList = (com.amazonaws.internal.SdkInternalList<ContainerDefinition>) taskDefinition
                    .getContainerDefinitions();
            if (!containerDefinitionsList.isEmpty() || !containerDefinitionsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("containerDefinitions");
                jsonGenerator.writeStartArray();
                for (ContainerDefinition containerDefinitionsListValue : containerDefinitionsList) {
                    if (containerDefinitionsListValue != null) {

                        ContainerDefinitionJsonMarshaller.getInstance().marshall(containerDefinitionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (taskDefinition.getFamily() != null) {
                jsonGenerator.writeFieldName("family").writeValue(taskDefinition.getFamily());
            }
            if (taskDefinition.getTaskRoleArn() != null) {
                jsonGenerator.writeFieldName("taskRoleArn").writeValue(taskDefinition.getTaskRoleArn());
            }
            if (taskDefinition.getNetworkMode() != null) {
                jsonGenerator.writeFieldName("networkMode").writeValue(taskDefinition.getNetworkMode());
            }
            if (taskDefinition.getRevision() != null) {
                jsonGenerator.writeFieldName("revision").writeValue(taskDefinition.getRevision());
            }

            com.amazonaws.internal.SdkInternalList<Volume> volumesList = (com.amazonaws.internal.SdkInternalList<Volume>) taskDefinition.getVolumes();
            if (!volumesList.isEmpty() || !volumesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("volumes");
                jsonGenerator.writeStartArray();
                for (Volume volumesListValue : volumesList) {
                    if (volumesListValue != null) {

                        VolumeJsonMarshaller.getInstance().marshall(volumesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (taskDefinition.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(taskDefinition.getStatus());
            }

            com.amazonaws.internal.SdkInternalList<Attribute> requiresAttributesList = (com.amazonaws.internal.SdkInternalList<Attribute>) taskDefinition
                    .getRequiresAttributes();
            if (!requiresAttributesList.isEmpty() || !requiresAttributesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("requiresAttributes");
                jsonGenerator.writeStartArray();
                for (Attribute requiresAttributesListValue : requiresAttributesList) {
                    if (requiresAttributesListValue != null) {

                        AttributeJsonMarshaller.getInstance().marshall(requiresAttributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TaskDefinitionJsonMarshaller instance;

    public static TaskDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskDefinitionJsonMarshaller();
        return instance;
    }

}
