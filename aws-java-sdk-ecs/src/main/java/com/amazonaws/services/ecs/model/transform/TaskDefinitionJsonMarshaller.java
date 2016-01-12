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

package com.amazonaws.services.ecs.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * TaskDefinitionMarshaller
 */
public class TaskDefinitionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(TaskDefinition taskDefinition, JSONWriter jsonWriter) {
        if (taskDefinition == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (taskDefinition.getTaskDefinitionArn() != null) {
                jsonWriter.key("taskDefinitionArn").value(
                        taskDefinition.getTaskDefinitionArn());
            }

            com.amazonaws.internal.SdkInternalList<ContainerDefinition> containerDefinitionsList = (com.amazonaws.internal.SdkInternalList<ContainerDefinition>) taskDefinition
                    .getContainerDefinitions();
            if (!containerDefinitionsList.isEmpty()
                    || !containerDefinitionsList.isAutoConstruct()) {
                jsonWriter.key("containerDefinitions");
                jsonWriter.array();
                for (ContainerDefinition containerDefinitionsListValue : containerDefinitionsList) {
                    if (containerDefinitionsListValue != null) {

                        ContainerDefinitionJsonMarshaller.getInstance()
                                .marshall(containerDefinitionsListValue,
                                        jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (taskDefinition.getFamily() != null) {
                jsonWriter.key("family").value(taskDefinition.getFamily());
            }

            if (taskDefinition.getRevision() != null) {
                jsonWriter.key("revision").value(taskDefinition.getRevision());
            }

            com.amazonaws.internal.SdkInternalList<Volume> volumesList = (com.amazonaws.internal.SdkInternalList<Volume>) taskDefinition
                    .getVolumes();
            if (!volumesList.isEmpty() || !volumesList.isAutoConstruct()) {
                jsonWriter.key("volumes");
                jsonWriter.array();
                for (Volume volumesListValue : volumesList) {
                    if (volumesListValue != null) {

                        VolumeJsonMarshaller.getInstance().marshall(
                                volumesListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (taskDefinition.getStatus() != null) {
                jsonWriter.key("status").value(taskDefinition.getStatus());
            }

            com.amazonaws.internal.SdkInternalList<Attribute> requiresAttributesList = (com.amazonaws.internal.SdkInternalList<Attribute>) taskDefinition
                    .getRequiresAttributes();
            if (!requiresAttributesList.isEmpty()
                    || !requiresAttributesList.isAutoConstruct()) {
                jsonWriter.key("requiresAttributes");
                jsonWriter.array();
                for (Attribute requiresAttributesListValue : requiresAttributesList) {
                    if (requiresAttributesListValue != null) {

                        AttributeJsonMarshaller.getInstance().marshall(
                                requiresAttributesListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TaskDefinitionJsonMarshaller instance;

    public static TaskDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskDefinitionJsonMarshaller();
        return instance;
    }

}
