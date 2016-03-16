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

package com.amazonaws.services.databasemigrationservice.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * OrderableReplicationInstanceMarshaller
 */
public class OrderableReplicationInstanceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(
            OrderableReplicationInstance orderableReplicationInstance,
            JSONWriter jsonWriter) {
        if (orderableReplicationInstance == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (orderableReplicationInstance.getEngineVersion() != null) {
                jsonWriter.key("EngineVersion").value(
                        orderableReplicationInstance.getEngineVersion());
            }
            if (orderableReplicationInstance.getReplicationInstanceClass() != null) {
                jsonWriter.key("ReplicationInstanceClass").value(
                        orderableReplicationInstance
                                .getReplicationInstanceClass());
            }
            if (orderableReplicationInstance.getStorageType() != null) {
                jsonWriter.key("StorageType").value(
                        orderableReplicationInstance.getStorageType());
            }
            if (orderableReplicationInstance.getMinAllocatedStorage() != null) {
                jsonWriter.key("MinAllocatedStorage").value(
                        orderableReplicationInstance.getMinAllocatedStorage());
            }
            if (orderableReplicationInstance.getMaxAllocatedStorage() != null) {
                jsonWriter.key("MaxAllocatedStorage").value(
                        orderableReplicationInstance.getMaxAllocatedStorage());
            }
            if (orderableReplicationInstance.getDefaultAllocatedStorage() != null) {
                jsonWriter.key("DefaultAllocatedStorage").value(
                        orderableReplicationInstance
                                .getDefaultAllocatedStorage());
            }
            if (orderableReplicationInstance.getIncludedAllocatedStorage() != null) {
                jsonWriter.key("IncludedAllocatedStorage").value(
                        orderableReplicationInstance
                                .getIncludedAllocatedStorage());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static OrderableReplicationInstanceJsonMarshaller instance;

    public static OrderableReplicationInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OrderableReplicationInstanceJsonMarshaller();
        return instance;
    }

}
