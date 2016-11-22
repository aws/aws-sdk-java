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
 * ContainerInstanceMarshaller
 */
public class ContainerInstanceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ContainerInstance containerInstance, StructuredJsonGenerator jsonGenerator) {

        if (containerInstance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (containerInstance.getContainerInstanceArn() != null) {
                jsonGenerator.writeFieldName("containerInstanceArn").writeValue(containerInstance.getContainerInstanceArn());
            }
            if (containerInstance.getEc2InstanceId() != null) {
                jsonGenerator.writeFieldName("ec2InstanceId").writeValue(containerInstance.getEc2InstanceId());
            }
            if (containerInstance.getVersion() != null) {
                jsonGenerator.writeFieldName("version").writeValue(containerInstance.getVersion());
            }
            if (containerInstance.getVersionInfo() != null) {
                jsonGenerator.writeFieldName("versionInfo");
                VersionInfoJsonMarshaller.getInstance().marshall(containerInstance.getVersionInfo(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<Resource> remainingResourcesList = (com.amazonaws.internal.SdkInternalList<Resource>) containerInstance
                    .getRemainingResources();
            if (!remainingResourcesList.isEmpty() || !remainingResourcesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("remainingResources");
                jsonGenerator.writeStartArray();
                for (Resource remainingResourcesListValue : remainingResourcesList) {
                    if (remainingResourcesListValue != null) {

                        ResourceJsonMarshaller.getInstance().marshall(remainingResourcesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<Resource> registeredResourcesList = (com.amazonaws.internal.SdkInternalList<Resource>) containerInstance
                    .getRegisteredResources();
            if (!registeredResourcesList.isEmpty() || !registeredResourcesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("registeredResources");
                jsonGenerator.writeStartArray();
                for (Resource registeredResourcesListValue : registeredResourcesList) {
                    if (registeredResourcesListValue != null) {

                        ResourceJsonMarshaller.getInstance().marshall(registeredResourcesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (containerInstance.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(containerInstance.getStatus());
            }
            if (containerInstance.getAgentConnected() != null) {
                jsonGenerator.writeFieldName("agentConnected").writeValue(containerInstance.getAgentConnected());
            }
            if (containerInstance.getRunningTasksCount() != null) {
                jsonGenerator.writeFieldName("runningTasksCount").writeValue(containerInstance.getRunningTasksCount());
            }
            if (containerInstance.getPendingTasksCount() != null) {
                jsonGenerator.writeFieldName("pendingTasksCount").writeValue(containerInstance.getPendingTasksCount());
            }
            if (containerInstance.getAgentUpdateStatus() != null) {
                jsonGenerator.writeFieldName("agentUpdateStatus").writeValue(containerInstance.getAgentUpdateStatus());
            }

            com.amazonaws.internal.SdkInternalList<Attribute> attributesList = (com.amazonaws.internal.SdkInternalList<Attribute>) containerInstance
                    .getAttributes();
            if (!attributesList.isEmpty() || !attributesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("attributes");
                jsonGenerator.writeStartArray();
                for (Attribute attributesListValue : attributesList) {
                    if (attributesListValue != null) {

                        AttributeJsonMarshaller.getInstance().marshall(attributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ContainerInstanceJsonMarshaller instance;

    public static ContainerInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerInstanceJsonMarshaller();
        return instance;
    }

}
