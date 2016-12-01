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
 * MaintenanceWindowTaskMarshaller
 */
public class MaintenanceWindowTaskJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MaintenanceWindowTask maintenanceWindowTask, StructuredJsonGenerator jsonGenerator) {

        if (maintenanceWindowTask == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (maintenanceWindowTask.getWindowId() != null) {
                jsonGenerator.writeFieldName("WindowId").writeValue(maintenanceWindowTask.getWindowId());
            }
            if (maintenanceWindowTask.getWindowTaskId() != null) {
                jsonGenerator.writeFieldName("WindowTaskId").writeValue(maintenanceWindowTask.getWindowTaskId());
            }
            if (maintenanceWindowTask.getTaskArn() != null) {
                jsonGenerator.writeFieldName("TaskArn").writeValue(maintenanceWindowTask.getTaskArn());
            }
            if (maintenanceWindowTask.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(maintenanceWindowTask.getType());
            }

            com.amazonaws.internal.SdkInternalList<Target> targetsList = (com.amazonaws.internal.SdkInternalList<Target>) maintenanceWindowTask.getTargets();
            if (!targetsList.isEmpty() || !targetsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Targets");
                jsonGenerator.writeStartArray();
                for (Target targetsListValue : targetsList) {
                    if (targetsListValue != null) {

                        TargetJsonMarshaller.getInstance().marshall(targetsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParametersMap = maintenanceWindowTask.getTaskParameters();
            if (taskParametersMap != null) {
                jsonGenerator.writeFieldName("TaskParameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, MaintenanceWindowTaskParameterValueExpression> taskParametersMapValue : taskParametersMap.entrySet()) {
                    if (taskParametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(taskParametersMapValue.getKey());

                        MaintenanceWindowTaskParameterValueExpressionJsonMarshaller.getInstance().marshall(taskParametersMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (maintenanceWindowTask.getPriority() != null) {
                jsonGenerator.writeFieldName("Priority").writeValue(maintenanceWindowTask.getPriority());
            }
            if (maintenanceWindowTask.getLoggingInfo() != null) {
                jsonGenerator.writeFieldName("LoggingInfo");
                LoggingInfoJsonMarshaller.getInstance().marshall(maintenanceWindowTask.getLoggingInfo(), jsonGenerator);
            }
            if (maintenanceWindowTask.getServiceRoleArn() != null) {
                jsonGenerator.writeFieldName("ServiceRoleArn").writeValue(maintenanceWindowTask.getServiceRoleArn());
            }
            if (maintenanceWindowTask.getMaxConcurrency() != null) {
                jsonGenerator.writeFieldName("MaxConcurrency").writeValue(maintenanceWindowTask.getMaxConcurrency());
            }
            if (maintenanceWindowTask.getMaxErrors() != null) {
                jsonGenerator.writeFieldName("MaxErrors").writeValue(maintenanceWindowTask.getMaxErrors());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MaintenanceWindowTaskJsonMarshaller instance;

    public static MaintenanceWindowTaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowTaskJsonMarshaller();
        return instance;
    }

}
