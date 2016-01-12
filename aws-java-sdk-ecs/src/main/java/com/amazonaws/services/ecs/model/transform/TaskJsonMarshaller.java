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
 * TaskMarshaller
 */
public class TaskJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Task task, JSONWriter jsonWriter) {
        if (task == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (task.getTaskArn() != null) {
                jsonWriter.key("taskArn").value(task.getTaskArn());
            }

            if (task.getClusterArn() != null) {
                jsonWriter.key("clusterArn").value(task.getClusterArn());
            }

            if (task.getTaskDefinitionArn() != null) {
                jsonWriter.key("taskDefinitionArn").value(
                        task.getTaskDefinitionArn());
            }

            if (task.getContainerInstanceArn() != null) {
                jsonWriter.key("containerInstanceArn").value(
                        task.getContainerInstanceArn());
            }

            if (task.getOverrides() != null) {
                jsonWriter.key("overrides");
                TaskOverrideJsonMarshaller.getInstance().marshall(
                        task.getOverrides(), jsonWriter);
            }

            if (task.getLastStatus() != null) {
                jsonWriter.key("lastStatus").value(task.getLastStatus());
            }

            if (task.getDesiredStatus() != null) {
                jsonWriter.key("desiredStatus").value(task.getDesiredStatus());
            }

            com.amazonaws.internal.SdkInternalList<Container> containersList = (com.amazonaws.internal.SdkInternalList<Container>) task
                    .getContainers();
            if (!containersList.isEmpty() || !containersList.isAutoConstruct()) {
                jsonWriter.key("containers");
                jsonWriter.array();
                for (Container containersListValue : containersList) {
                    if (containersListValue != null) {

                        ContainerJsonMarshaller.getInstance().marshall(
                                containersListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (task.getStartedBy() != null) {
                jsonWriter.key("startedBy").value(task.getStartedBy());
            }

            if (task.getStoppedReason() != null) {
                jsonWriter.key("stoppedReason").value(task.getStoppedReason());
            }

            if (task.getCreatedAt() != null) {
                jsonWriter.key("createdAt").value(task.getCreatedAt());
            }

            if (task.getStartedAt() != null) {
                jsonWriter.key("startedAt").value(task.getStartedAt());
            }

            if (task.getStoppedAt() != null) {
                jsonWriter.key("stoppedAt").value(task.getStoppedAt());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TaskJsonMarshaller instance;

    public static TaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskJsonMarshaller();
        return instance;
    }

}
