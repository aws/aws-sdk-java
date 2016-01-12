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
 * ContainerInstanceMarshaller
 */
public class ContainerInstanceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ContainerInstance containerInstance,
            JSONWriter jsonWriter) {
        if (containerInstance == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (containerInstance.getContainerInstanceArn() != null) {
                jsonWriter.key("containerInstanceArn").value(
                        containerInstance.getContainerInstanceArn());
            }

            if (containerInstance.getEc2InstanceId() != null) {
                jsonWriter.key("ec2InstanceId").value(
                        containerInstance.getEc2InstanceId());
            }

            if (containerInstance.getVersionInfo() != null) {
                jsonWriter.key("versionInfo");
                VersionInfoJsonMarshaller.getInstance().marshall(
                        containerInstance.getVersionInfo(), jsonWriter);
            }

            com.amazonaws.internal.SdkInternalList<Resource> remainingResourcesList = (com.amazonaws.internal.SdkInternalList<Resource>) containerInstance
                    .getRemainingResources();
            if (!remainingResourcesList.isEmpty()
                    || !remainingResourcesList.isAutoConstruct()) {
                jsonWriter.key("remainingResources");
                jsonWriter.array();
                for (Resource remainingResourcesListValue : remainingResourcesList) {
                    if (remainingResourcesListValue != null) {

                        ResourceJsonMarshaller.getInstance().marshall(
                                remainingResourcesListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<Resource> registeredResourcesList = (com.amazonaws.internal.SdkInternalList<Resource>) containerInstance
                    .getRegisteredResources();
            if (!registeredResourcesList.isEmpty()
                    || !registeredResourcesList.isAutoConstruct()) {
                jsonWriter.key("registeredResources");
                jsonWriter.array();
                for (Resource registeredResourcesListValue : registeredResourcesList) {
                    if (registeredResourcesListValue != null) {

                        ResourceJsonMarshaller.getInstance().marshall(
                                registeredResourcesListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (containerInstance.getStatus() != null) {
                jsonWriter.key("status").value(containerInstance.getStatus());
            }

            if (containerInstance.getAgentConnected() != null) {
                jsonWriter.key("agentConnected").value(
                        containerInstance.getAgentConnected());
            }

            if (containerInstance.getRunningTasksCount() != null) {
                jsonWriter.key("runningTasksCount").value(
                        containerInstance.getRunningTasksCount());
            }

            if (containerInstance.getPendingTasksCount() != null) {
                jsonWriter.key("pendingTasksCount").value(
                        containerInstance.getPendingTasksCount());
            }

            if (containerInstance.getAgentUpdateStatus() != null) {
                jsonWriter.key("agentUpdateStatus").value(
                        containerInstance.getAgentUpdateStatus());
            }

            com.amazonaws.internal.SdkInternalList<Attribute> attributesList = (com.amazonaws.internal.SdkInternalList<Attribute>) containerInstance
                    .getAttributes();
            if (!attributesList.isEmpty() || !attributesList.isAutoConstruct()) {
                jsonWriter.key("attributes");
                jsonWriter.array();
                for (Attribute attributesListValue : attributesList) {
                    if (attributesListValue != null) {

                        AttributeJsonMarshaller.getInstance().marshall(
                                attributesListValue, jsonWriter);
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

    private static ContainerInstanceJsonMarshaller instance;

    public static ContainerInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerInstanceJsonMarshaller();
        return instance;
    }

}
