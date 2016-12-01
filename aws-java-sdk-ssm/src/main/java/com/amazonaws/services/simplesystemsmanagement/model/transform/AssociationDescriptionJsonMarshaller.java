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
 * AssociationDescriptionMarshaller
 */
public class AssociationDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AssociationDescription associationDescription, StructuredJsonGenerator jsonGenerator) {

        if (associationDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (associationDescription.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(associationDescription.getName());
            }
            if (associationDescription.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(associationDescription.getInstanceId());
            }
            if (associationDescription.getDate() != null) {
                jsonGenerator.writeFieldName("Date").writeValue(associationDescription.getDate());
            }
            if (associationDescription.getLastUpdateAssociationDate() != null) {
                jsonGenerator.writeFieldName("LastUpdateAssociationDate").writeValue(associationDescription.getLastUpdateAssociationDate());
            }
            if (associationDescription.getStatus() != null) {
                jsonGenerator.writeFieldName("Status");
                AssociationStatusJsonMarshaller.getInstance().marshall(associationDescription.getStatus(), jsonGenerator);
            }
            if (associationDescription.getOverview() != null) {
                jsonGenerator.writeFieldName("Overview");
                AssociationOverviewJsonMarshaller.getInstance().marshall(associationDescription.getOverview(), jsonGenerator);
            }
            if (associationDescription.getDocumentVersion() != null) {
                jsonGenerator.writeFieldName("DocumentVersion").writeValue(associationDescription.getDocumentVersion());
            }

            java.util.Map<String, java.util.List<String>> parametersMap = associationDescription.getParameters();
            if (parametersMap != null) {
                jsonGenerator.writeFieldName("Parameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, java.util.List<String>> parametersMapValue : parametersMap.entrySet()) {
                    if (parametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(parametersMapValue.getKey());

                        jsonGenerator.writeStartArray();
                        for (String parametersMapValueList : parametersMapValue.getValue()) {
                            if (parametersMapValueList != null) {
                                jsonGenerator.writeValue(parametersMapValueList);
                            }
                        }
                        jsonGenerator.writeEndArray();
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (associationDescription.getAssociationId() != null) {
                jsonGenerator.writeFieldName("AssociationId").writeValue(associationDescription.getAssociationId());
            }

            com.amazonaws.internal.SdkInternalList<Target> targetsList = (com.amazonaws.internal.SdkInternalList<Target>) associationDescription.getTargets();
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
            if (associationDescription.getScheduleExpression() != null) {
                jsonGenerator.writeFieldName("ScheduleExpression").writeValue(associationDescription.getScheduleExpression());
            }
            if (associationDescription.getOutputLocation() != null) {
                jsonGenerator.writeFieldName("OutputLocation");
                InstanceAssociationOutputLocationJsonMarshaller.getInstance().marshall(associationDescription.getOutputLocation(), jsonGenerator);
            }
            if (associationDescription.getLastExecutionDate() != null) {
                jsonGenerator.writeFieldName("LastExecutionDate").writeValue(associationDescription.getLastExecutionDate());
            }
            if (associationDescription.getLastSuccessfulExecutionDate() != null) {
                jsonGenerator.writeFieldName("LastSuccessfulExecutionDate").writeValue(associationDescription.getLastSuccessfulExecutionDate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AssociationDescriptionJsonMarshaller instance;

    public static AssociationDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssociationDescriptionJsonMarshaller();
        return instance;
    }

}
