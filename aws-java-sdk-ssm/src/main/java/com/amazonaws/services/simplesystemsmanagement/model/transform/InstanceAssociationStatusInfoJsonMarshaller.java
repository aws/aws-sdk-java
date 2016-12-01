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
 * InstanceAssociationStatusInfoMarshaller
 */
public class InstanceAssociationStatusInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceAssociationStatusInfo instanceAssociationStatusInfo, StructuredJsonGenerator jsonGenerator) {

        if (instanceAssociationStatusInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceAssociationStatusInfo.getAssociationId() != null) {
                jsonGenerator.writeFieldName("AssociationId").writeValue(instanceAssociationStatusInfo.getAssociationId());
            }
            if (instanceAssociationStatusInfo.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(instanceAssociationStatusInfo.getName());
            }
            if (instanceAssociationStatusInfo.getDocumentVersion() != null) {
                jsonGenerator.writeFieldName("DocumentVersion").writeValue(instanceAssociationStatusInfo.getDocumentVersion());
            }
            if (instanceAssociationStatusInfo.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(instanceAssociationStatusInfo.getInstanceId());
            }
            if (instanceAssociationStatusInfo.getExecutionDate() != null) {
                jsonGenerator.writeFieldName("ExecutionDate").writeValue(instanceAssociationStatusInfo.getExecutionDate());
            }
            if (instanceAssociationStatusInfo.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(instanceAssociationStatusInfo.getStatus());
            }
            if (instanceAssociationStatusInfo.getDetailedStatus() != null) {
                jsonGenerator.writeFieldName("DetailedStatus").writeValue(instanceAssociationStatusInfo.getDetailedStatus());
            }
            if (instanceAssociationStatusInfo.getExecutionSummary() != null) {
                jsonGenerator.writeFieldName("ExecutionSummary").writeValue(instanceAssociationStatusInfo.getExecutionSummary());
            }
            if (instanceAssociationStatusInfo.getErrorCode() != null) {
                jsonGenerator.writeFieldName("ErrorCode").writeValue(instanceAssociationStatusInfo.getErrorCode());
            }
            if (instanceAssociationStatusInfo.getOutputUrl() != null) {
                jsonGenerator.writeFieldName("OutputUrl");
                InstanceAssociationOutputUrlJsonMarshaller.getInstance().marshall(instanceAssociationStatusInfo.getOutputUrl(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceAssociationStatusInfoJsonMarshaller instance;

    public static InstanceAssociationStatusInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceAssociationStatusInfoJsonMarshaller();
        return instance;
    }

}
