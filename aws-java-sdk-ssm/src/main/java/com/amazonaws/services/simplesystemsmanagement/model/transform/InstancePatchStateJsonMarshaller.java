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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * InstancePatchStateMarshaller
 */
public class InstancePatchStateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstancePatchState instancePatchState, StructuredJsonGenerator jsonGenerator) {

        if (instancePatchState == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instancePatchState.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(instancePatchState.getInstanceId());
            }
            if (instancePatchState.getPatchGroup() != null) {
                jsonGenerator.writeFieldName("PatchGroup").writeValue(instancePatchState.getPatchGroup());
            }
            if (instancePatchState.getBaselineId() != null) {
                jsonGenerator.writeFieldName("BaselineId").writeValue(instancePatchState.getBaselineId());
            }
            if (instancePatchState.getSnapshotId() != null) {
                jsonGenerator.writeFieldName("SnapshotId").writeValue(instancePatchState.getSnapshotId());
            }
            if (instancePatchState.getOwnerInformation() != null) {
                jsonGenerator.writeFieldName("OwnerInformation").writeValue(instancePatchState.getOwnerInformation());
            }
            if (instancePatchState.getInstalledCount() != null) {
                jsonGenerator.writeFieldName("InstalledCount").writeValue(instancePatchState.getInstalledCount());
            }
            if (instancePatchState.getInstalledOtherCount() != null) {
                jsonGenerator.writeFieldName("InstalledOtherCount").writeValue(instancePatchState.getInstalledOtherCount());
            }
            if (instancePatchState.getMissingCount() != null) {
                jsonGenerator.writeFieldName("MissingCount").writeValue(instancePatchState.getMissingCount());
            }
            if (instancePatchState.getFailedCount() != null) {
                jsonGenerator.writeFieldName("FailedCount").writeValue(instancePatchState.getFailedCount());
            }
            if (instancePatchState.getNotApplicableCount() != null) {
                jsonGenerator.writeFieldName("NotApplicableCount").writeValue(instancePatchState.getNotApplicableCount());
            }
            if (instancePatchState.getOperationStartTime() != null) {
                jsonGenerator.writeFieldName("OperationStartTime").writeValue(instancePatchState.getOperationStartTime());
            }
            if (instancePatchState.getOperationEndTime() != null) {
                jsonGenerator.writeFieldName("OperationEndTime").writeValue(instancePatchState.getOperationEndTime());
            }
            if (instancePatchState.getOperation() != null) {
                jsonGenerator.writeFieldName("Operation").writeValue(instancePatchState.getOperation());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstancePatchStateJsonMarshaller instance;

    public static InstancePatchStateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstancePatchStateJsonMarshaller();
        return instance;
    }

}
