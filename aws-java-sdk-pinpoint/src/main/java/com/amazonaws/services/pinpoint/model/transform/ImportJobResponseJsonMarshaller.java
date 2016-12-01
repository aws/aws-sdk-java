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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ImportJobResponseMarshaller
 */
public class ImportJobResponseJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ImportJobResponse importJobResponse, StructuredJsonGenerator jsonGenerator) {

        if (importJobResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (importJobResponse.getApplicationId() != null) {
                jsonGenerator.writeFieldName("ApplicationId").writeValue(importJobResponse.getApplicationId());
            }
            if (importJobResponse.getCompletedPieces() != null) {
                jsonGenerator.writeFieldName("CompletedPieces").writeValue(importJobResponse.getCompletedPieces());
            }
            if (importJobResponse.getCompletionDate() != null) {
                jsonGenerator.writeFieldName("CompletionDate").writeValue(importJobResponse.getCompletionDate());
            }
            if (importJobResponse.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(importJobResponse.getCreationDate());
            }
            if (importJobResponse.getDefinition() != null) {
                jsonGenerator.writeFieldName("Definition");
                ImportJobResourceJsonMarshaller.getInstance().marshall(importJobResponse.getDefinition(), jsonGenerator);
            }
            if (importJobResponse.getFailedPieces() != null) {
                jsonGenerator.writeFieldName("FailedPieces").writeValue(importJobResponse.getFailedPieces());
            }

            java.util.List<String> failuresList = importJobResponse.getFailures();
            if (failuresList != null) {
                jsonGenerator.writeFieldName("Failures");
                jsonGenerator.writeStartArray();
                for (String failuresListValue : failuresList) {
                    if (failuresListValue != null) {
                        jsonGenerator.writeValue(failuresListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (importJobResponse.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(importJobResponse.getId());
            }
            if (importJobResponse.getJobStatus() != null) {
                jsonGenerator.writeFieldName("JobStatus").writeValue(importJobResponse.getJobStatus());
            }
            if (importJobResponse.getTotalFailures() != null) {
                jsonGenerator.writeFieldName("TotalFailures").writeValue(importJobResponse.getTotalFailures());
            }
            if (importJobResponse.getTotalPieces() != null) {
                jsonGenerator.writeFieldName("TotalPieces").writeValue(importJobResponse.getTotalPieces());
            }
            if (importJobResponse.getTotalProcessed() != null) {
                jsonGenerator.writeFieldName("TotalProcessed").writeValue(importJobResponse.getTotalProcessed());
            }
            if (importJobResponse.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(importJobResponse.getType());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ImportJobResponseJsonMarshaller instance;

    public static ImportJobResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportJobResponseJsonMarshaller();
        return instance;
    }

}
