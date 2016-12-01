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
 * MaintenanceWindowExecutionTaskIdentityMarshaller
 */
public class MaintenanceWindowExecutionTaskIdentityJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MaintenanceWindowExecutionTaskIdentity maintenanceWindowExecutionTaskIdentity, StructuredJsonGenerator jsonGenerator) {

        if (maintenanceWindowExecutionTaskIdentity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (maintenanceWindowExecutionTaskIdentity.getWindowExecutionId() != null) {
                jsonGenerator.writeFieldName("WindowExecutionId").writeValue(maintenanceWindowExecutionTaskIdentity.getWindowExecutionId());
            }
            if (maintenanceWindowExecutionTaskIdentity.getTaskExecutionId() != null) {
                jsonGenerator.writeFieldName("TaskExecutionId").writeValue(maintenanceWindowExecutionTaskIdentity.getTaskExecutionId());
            }
            if (maintenanceWindowExecutionTaskIdentity.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(maintenanceWindowExecutionTaskIdentity.getStatus());
            }
            if (maintenanceWindowExecutionTaskIdentity.getStatusDetails() != null) {
                jsonGenerator.writeFieldName("StatusDetails").writeValue(maintenanceWindowExecutionTaskIdentity.getStatusDetails());
            }
            if (maintenanceWindowExecutionTaskIdentity.getStartTime() != null) {
                jsonGenerator.writeFieldName("StartTime").writeValue(maintenanceWindowExecutionTaskIdentity.getStartTime());
            }
            if (maintenanceWindowExecutionTaskIdentity.getEndTime() != null) {
                jsonGenerator.writeFieldName("EndTime").writeValue(maintenanceWindowExecutionTaskIdentity.getEndTime());
            }
            if (maintenanceWindowExecutionTaskIdentity.getTaskArn() != null) {
                jsonGenerator.writeFieldName("TaskArn").writeValue(maintenanceWindowExecutionTaskIdentity.getTaskArn());
            }
            if (maintenanceWindowExecutionTaskIdentity.getTaskType() != null) {
                jsonGenerator.writeFieldName("TaskType").writeValue(maintenanceWindowExecutionTaskIdentity.getTaskType());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MaintenanceWindowExecutionTaskIdentityJsonMarshaller instance;

    public static MaintenanceWindowExecutionTaskIdentityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowExecutionTaskIdentityJsonMarshaller();
        return instance;
    }

}
