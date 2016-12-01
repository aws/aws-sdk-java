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
 * MaintenanceWindowExecutionTaskInvocationIdentityMarshaller
 */
public class MaintenanceWindowExecutionTaskInvocationIdentityJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MaintenanceWindowExecutionTaskInvocationIdentity maintenanceWindowExecutionTaskInvocationIdentity,
            StructuredJsonGenerator jsonGenerator) {

        if (maintenanceWindowExecutionTaskInvocationIdentity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (maintenanceWindowExecutionTaskInvocationIdentity.getWindowExecutionId() != null) {
                jsonGenerator.writeFieldName("WindowExecutionId").writeValue(maintenanceWindowExecutionTaskInvocationIdentity.getWindowExecutionId());
            }
            if (maintenanceWindowExecutionTaskInvocationIdentity.getTaskExecutionId() != null) {
                jsonGenerator.writeFieldName("TaskExecutionId").writeValue(maintenanceWindowExecutionTaskInvocationIdentity.getTaskExecutionId());
            }
            if (maintenanceWindowExecutionTaskInvocationIdentity.getInvocationId() != null) {
                jsonGenerator.writeFieldName("InvocationId").writeValue(maintenanceWindowExecutionTaskInvocationIdentity.getInvocationId());
            }
            if (maintenanceWindowExecutionTaskInvocationIdentity.getExecutionId() != null) {
                jsonGenerator.writeFieldName("ExecutionId").writeValue(maintenanceWindowExecutionTaskInvocationIdentity.getExecutionId());
            }
            if (maintenanceWindowExecutionTaskInvocationIdentity.getParameters() != null) {
                jsonGenerator.writeFieldName("Parameters").writeValue(maintenanceWindowExecutionTaskInvocationIdentity.getParameters());
            }
            if (maintenanceWindowExecutionTaskInvocationIdentity.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(maintenanceWindowExecutionTaskInvocationIdentity.getStatus());
            }
            if (maintenanceWindowExecutionTaskInvocationIdentity.getStatusDetails() != null) {
                jsonGenerator.writeFieldName("StatusDetails").writeValue(maintenanceWindowExecutionTaskInvocationIdentity.getStatusDetails());
            }
            if (maintenanceWindowExecutionTaskInvocationIdentity.getStartTime() != null) {
                jsonGenerator.writeFieldName("StartTime").writeValue(maintenanceWindowExecutionTaskInvocationIdentity.getStartTime());
            }
            if (maintenanceWindowExecutionTaskInvocationIdentity.getEndTime() != null) {
                jsonGenerator.writeFieldName("EndTime").writeValue(maintenanceWindowExecutionTaskInvocationIdentity.getEndTime());
            }
            if (maintenanceWindowExecutionTaskInvocationIdentity.getOwnerInformation() != null) {
                jsonGenerator.writeFieldName("OwnerInformation").writeValue(maintenanceWindowExecutionTaskInvocationIdentity.getOwnerInformation());
            }
            if (maintenanceWindowExecutionTaskInvocationIdentity.getWindowTargetId() != null) {
                jsonGenerator.writeFieldName("WindowTargetId").writeValue(maintenanceWindowExecutionTaskInvocationIdentity.getWindowTargetId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MaintenanceWindowExecutionTaskInvocationIdentityJsonMarshaller instance;

    public static MaintenanceWindowExecutionTaskInvocationIdentityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowExecutionTaskInvocationIdentityJsonMarshaller();
        return instance;
    }

}
