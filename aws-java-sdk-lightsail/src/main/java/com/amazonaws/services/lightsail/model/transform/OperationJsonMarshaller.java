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
 * OperationMarshaller
 */
public class OperationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Operation operation, StructuredJsonGenerator jsonGenerator) {

        if (operation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (operation.getId() != null) {
                jsonGenerator.writeFieldName("id").writeValue(operation.getId());
            }
            if (operation.getResourceName() != null) {
                jsonGenerator.writeFieldName("resourceName").writeValue(operation.getResourceName());
            }
            if (operation.getResourceType() != null) {
                jsonGenerator.writeFieldName("resourceType").writeValue(operation.getResourceType());
            }
            if (operation.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("createdAt").writeValue(operation.getCreatedAt());
            }
            if (operation.getLocation() != null) {
                jsonGenerator.writeFieldName("location");
                ResourceLocationJsonMarshaller.getInstance().marshall(operation.getLocation(), jsonGenerator);
            }
            if (operation.getIsTerminal() != null) {
                jsonGenerator.writeFieldName("isTerminal").writeValue(operation.getIsTerminal());
            }
            if (operation.getOperationDetails() != null) {
                jsonGenerator.writeFieldName("operationDetails").writeValue(operation.getOperationDetails());
            }
            if (operation.getOperationType() != null) {
                jsonGenerator.writeFieldName("operationType").writeValue(operation.getOperationType());
            }
            if (operation.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(operation.getStatus());
            }
            if (operation.getStatusChangedAt() != null) {
                jsonGenerator.writeFieldName("statusChangedAt").writeValue(operation.getStatusChangedAt());
            }
            if (operation.getErrorCode() != null) {
                jsonGenerator.writeFieldName("errorCode").writeValue(operation.getErrorCode());
            }
            if (operation.getErrorDetails() != null) {
                jsonGenerator.writeFieldName("errorDetails").writeValue(operation.getErrorDetails());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static OperationJsonMarshaller instance;

    public static OperationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OperationJsonMarshaller();
        return instance;
    }

}
