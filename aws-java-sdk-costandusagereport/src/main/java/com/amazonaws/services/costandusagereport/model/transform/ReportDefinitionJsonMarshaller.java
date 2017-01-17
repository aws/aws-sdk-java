/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costandusagereport.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costandusagereport.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ReportDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportDefinitionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ReportDefinition reportDefinition, StructuredJsonGenerator jsonGenerator) {

        if (reportDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (reportDefinition.getReportName() != null) {
                jsonGenerator.writeFieldName("ReportName").writeValue(reportDefinition.getReportName());
            }
            if (reportDefinition.getTimeUnit() != null) {
                jsonGenerator.writeFieldName("TimeUnit").writeValue(reportDefinition.getTimeUnit());
            }
            if (reportDefinition.getFormat() != null) {
                jsonGenerator.writeFieldName("Format").writeValue(reportDefinition.getFormat());
            }
            if (reportDefinition.getCompression() != null) {
                jsonGenerator.writeFieldName("Compression").writeValue(reportDefinition.getCompression());
            }

            java.util.List<String> additionalSchemaElementsList = reportDefinition.getAdditionalSchemaElements();
            if (additionalSchemaElementsList != null) {
                jsonGenerator.writeFieldName("AdditionalSchemaElements");
                jsonGenerator.writeStartArray();
                for (String additionalSchemaElementsListValue : additionalSchemaElementsList) {
                    if (additionalSchemaElementsListValue != null) {
                        jsonGenerator.writeValue(additionalSchemaElementsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (reportDefinition.getS3Bucket() != null) {
                jsonGenerator.writeFieldName("S3Bucket").writeValue(reportDefinition.getS3Bucket());
            }
            if (reportDefinition.getS3Prefix() != null) {
                jsonGenerator.writeFieldName("S3Prefix").writeValue(reportDefinition.getS3Prefix());
            }
            if (reportDefinition.getS3Region() != null) {
                jsonGenerator.writeFieldName("S3Region").writeValue(reportDefinition.getS3Region());
            }

            java.util.List<String> additionalArtifactsList = reportDefinition.getAdditionalArtifacts();
            if (additionalArtifactsList != null) {
                jsonGenerator.writeFieldName("AdditionalArtifacts");
                jsonGenerator.writeStartArray();
                for (String additionalArtifactsListValue : additionalArtifactsList) {
                    if (additionalArtifactsListValue != null) {
                        jsonGenerator.writeValue(additionalArtifactsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ReportDefinitionJsonMarshaller instance;

    public static ReportDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReportDefinitionJsonMarshaller();
        return instance;
    }

}
