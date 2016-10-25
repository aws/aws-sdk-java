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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * OrderableReplicationInstanceMarshaller
 */
public class OrderableReplicationInstanceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(OrderableReplicationInstance orderableReplicationInstance, StructuredJsonGenerator jsonGenerator) {

        if (orderableReplicationInstance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (orderableReplicationInstance.getEngineVersion() != null) {
                jsonGenerator.writeFieldName("EngineVersion").writeValue(orderableReplicationInstance.getEngineVersion());
            }
            if (orderableReplicationInstance.getReplicationInstanceClass() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceClass").writeValue(orderableReplicationInstance.getReplicationInstanceClass());
            }
            if (orderableReplicationInstance.getStorageType() != null) {
                jsonGenerator.writeFieldName("StorageType").writeValue(orderableReplicationInstance.getStorageType());
            }
            if (orderableReplicationInstance.getMinAllocatedStorage() != null) {
                jsonGenerator.writeFieldName("MinAllocatedStorage").writeValue(orderableReplicationInstance.getMinAllocatedStorage());
            }
            if (orderableReplicationInstance.getMaxAllocatedStorage() != null) {
                jsonGenerator.writeFieldName("MaxAllocatedStorage").writeValue(orderableReplicationInstance.getMaxAllocatedStorage());
            }
            if (orderableReplicationInstance.getDefaultAllocatedStorage() != null) {
                jsonGenerator.writeFieldName("DefaultAllocatedStorage").writeValue(orderableReplicationInstance.getDefaultAllocatedStorage());
            }
            if (orderableReplicationInstance.getIncludedAllocatedStorage() != null) {
                jsonGenerator.writeFieldName("IncludedAllocatedStorage").writeValue(orderableReplicationInstance.getIncludedAllocatedStorage());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static OrderableReplicationInstanceJsonMarshaller instance;

    public static OrderableReplicationInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OrderableReplicationInstanceJsonMarshaller();
        return instance;
    }

}
