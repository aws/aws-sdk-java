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
package com.amazonaws.services.lightsail.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * InstanceSnapshotMarshaller
 */
public class InstanceSnapshotJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceSnapshot instanceSnapshot, StructuredJsonGenerator jsonGenerator) {

        if (instanceSnapshot == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceSnapshot.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(instanceSnapshot.getName());
            }
            if (instanceSnapshot.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(instanceSnapshot.getArn());
            }
            if (instanceSnapshot.getSupportCode() != null) {
                jsonGenerator.writeFieldName("supportCode").writeValue(instanceSnapshot.getSupportCode());
            }
            if (instanceSnapshot.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("createdAt").writeValue(instanceSnapshot.getCreatedAt());
            }
            if (instanceSnapshot.getLocation() != null) {
                jsonGenerator.writeFieldName("location");
                ResourceLocationJsonMarshaller.getInstance().marshall(instanceSnapshot.getLocation(), jsonGenerator);
            }
            if (instanceSnapshot.getResourceType() != null) {
                jsonGenerator.writeFieldName("resourceType").writeValue(instanceSnapshot.getResourceType());
            }
            if (instanceSnapshot.getState() != null) {
                jsonGenerator.writeFieldName("state").writeValue(instanceSnapshot.getState());
            }
            if (instanceSnapshot.getProgress() != null) {
                jsonGenerator.writeFieldName("progress").writeValue(instanceSnapshot.getProgress());
            }
            if (instanceSnapshot.getFromInstanceName() != null) {
                jsonGenerator.writeFieldName("fromInstanceName").writeValue(instanceSnapshot.getFromInstanceName());
            }
            if (instanceSnapshot.getFromInstanceArn() != null) {
                jsonGenerator.writeFieldName("fromInstanceArn").writeValue(instanceSnapshot.getFromInstanceArn());
            }
            if (instanceSnapshot.getFromBlueprintId() != null) {
                jsonGenerator.writeFieldName("fromBlueprintId").writeValue(instanceSnapshot.getFromBlueprintId());
            }
            if (instanceSnapshot.getFromBundleId() != null) {
                jsonGenerator.writeFieldName("fromBundleId").writeValue(instanceSnapshot.getFromBundleId());
            }
            if (instanceSnapshot.getSizeInGb() != null) {
                jsonGenerator.writeFieldName("sizeInGb").writeValue(instanceSnapshot.getSizeInGb());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceSnapshotJsonMarshaller instance;

    public static InstanceSnapshotJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceSnapshotJsonMarshaller();
        return instance;
    }

}
