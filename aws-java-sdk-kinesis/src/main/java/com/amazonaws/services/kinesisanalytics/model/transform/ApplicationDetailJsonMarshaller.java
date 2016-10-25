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
package com.amazonaws.services.kinesisanalytics.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalytics.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ApplicationDetailMarshaller
 */
public class ApplicationDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ApplicationDetail applicationDetail, StructuredJsonGenerator jsonGenerator) {

        if (applicationDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (applicationDetail.getApplicationName() != null) {
                jsonGenerator.writeFieldName("ApplicationName").writeValue(applicationDetail.getApplicationName());
            }
            if (applicationDetail.getApplicationDescription() != null) {
                jsonGenerator.writeFieldName("ApplicationDescription").writeValue(applicationDetail.getApplicationDescription());
            }
            if (applicationDetail.getApplicationARN() != null) {
                jsonGenerator.writeFieldName("ApplicationARN").writeValue(applicationDetail.getApplicationARN());
            }
            if (applicationDetail.getApplicationStatus() != null) {
                jsonGenerator.writeFieldName("ApplicationStatus").writeValue(applicationDetail.getApplicationStatus());
            }
            if (applicationDetail.getCreateTimestamp() != null) {
                jsonGenerator.writeFieldName("CreateTimestamp").writeValue(applicationDetail.getCreateTimestamp());
            }
            if (applicationDetail.getLastUpdateTimestamp() != null) {
                jsonGenerator.writeFieldName("LastUpdateTimestamp").writeValue(applicationDetail.getLastUpdateTimestamp());
            }

            java.util.List<InputDescription> inputDescriptionsList = applicationDetail.getInputDescriptions();
            if (inputDescriptionsList != null) {
                jsonGenerator.writeFieldName("InputDescriptions");
                jsonGenerator.writeStartArray();
                for (InputDescription inputDescriptionsListValue : inputDescriptionsList) {
                    if (inputDescriptionsListValue != null) {

                        InputDescriptionJsonMarshaller.getInstance().marshall(inputDescriptionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<OutputDescription> outputDescriptionsList = applicationDetail.getOutputDescriptions();
            if (outputDescriptionsList != null) {
                jsonGenerator.writeFieldName("OutputDescriptions");
                jsonGenerator.writeStartArray();
                for (OutputDescription outputDescriptionsListValue : outputDescriptionsList) {
                    if (outputDescriptionsListValue != null) {

                        OutputDescriptionJsonMarshaller.getInstance().marshall(outputDescriptionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<ReferenceDataSourceDescription> referenceDataSourceDescriptionsList = applicationDetail.getReferenceDataSourceDescriptions();
            if (referenceDataSourceDescriptionsList != null) {
                jsonGenerator.writeFieldName("ReferenceDataSourceDescriptions");
                jsonGenerator.writeStartArray();
                for (ReferenceDataSourceDescription referenceDataSourceDescriptionsListValue : referenceDataSourceDescriptionsList) {
                    if (referenceDataSourceDescriptionsListValue != null) {

                        ReferenceDataSourceDescriptionJsonMarshaller.getInstance().marshall(referenceDataSourceDescriptionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (applicationDetail.getApplicationCode() != null) {
                jsonGenerator.writeFieldName("ApplicationCode").writeValue(applicationDetail.getApplicationCode());
            }
            if (applicationDetail.getApplicationVersionId() != null) {
                jsonGenerator.writeFieldName("ApplicationVersionId").writeValue(applicationDetail.getApplicationVersionId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ApplicationDetailJsonMarshaller instance;

    public static ApplicationDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationDetailJsonMarshaller();
        return instance;
    }

}
