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
package com.amazonaws.services.servicecatalog.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * LaunchPathSummaryMarshaller
 */
public class LaunchPathSummaryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(LaunchPathSummary launchPathSummary, StructuredJsonGenerator jsonGenerator) {

        if (launchPathSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (launchPathSummary.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(launchPathSummary.getId());
            }

            java.util.List<ConstraintSummary> constraintSummariesList = launchPathSummary.getConstraintSummaries();
            if (constraintSummariesList != null) {
                jsonGenerator.writeFieldName("ConstraintSummaries");
                jsonGenerator.writeStartArray();
                for (ConstraintSummary constraintSummariesListValue : constraintSummariesList) {
                    if (constraintSummariesListValue != null) {

                        ConstraintSummaryJsonMarshaller.getInstance().marshall(constraintSummariesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<Tag> tagsList = launchPathSummary.getTags();
            if (tagsList != null) {
                jsonGenerator.writeFieldName("Tags");
                jsonGenerator.writeStartArray();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (launchPathSummary.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(launchPathSummary.getName());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static LaunchPathSummaryJsonMarshaller instance;

    public static LaunchPathSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchPathSummaryJsonMarshaller();
        return instance;
    }

}
