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
 * ClusterMarshaller
 */
public class ClusterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Cluster cluster, StructuredJsonGenerator jsonGenerator) {

        if (cluster == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (cluster.getClusterArn() != null) {
                jsonGenerator.writeFieldName("clusterArn").writeValue(cluster.getClusterArn());
            }
            if (cluster.getClusterName() != null) {
                jsonGenerator.writeFieldName("clusterName").writeValue(cluster.getClusterName());
            }
            if (cluster.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(cluster.getStatus());
            }
            if (cluster.getRegisteredContainerInstancesCount() != null) {
                jsonGenerator.writeFieldName("registeredContainerInstancesCount").writeValue(cluster.getRegisteredContainerInstancesCount());
            }
            if (cluster.getRunningTasksCount() != null) {
                jsonGenerator.writeFieldName("runningTasksCount").writeValue(cluster.getRunningTasksCount());
            }
            if (cluster.getPendingTasksCount() != null) {
                jsonGenerator.writeFieldName("pendingTasksCount").writeValue(cluster.getPendingTasksCount());
            }
            if (cluster.getActiveServicesCount() != null) {
                jsonGenerator.writeFieldName("activeServicesCount").writeValue(cluster.getActiveServicesCount());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ClusterJsonMarshaller instance;

    public static ClusterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterJsonMarshaller();
        return instance;
    }

}
