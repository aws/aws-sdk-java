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
package com.amazonaws.services.inspector.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AssessmentTemplateMarshaller
 */
public class AssessmentTemplateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AssessmentTemplate assessmentTemplate, StructuredJsonGenerator jsonGenerator) {

        if (assessmentTemplate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (assessmentTemplate.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(assessmentTemplate.getArn());
            }
            if (assessmentTemplate.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(assessmentTemplate.getName());
            }
            if (assessmentTemplate.getAssessmentTargetArn() != null) {
                jsonGenerator.writeFieldName("assessmentTargetArn").writeValue(assessmentTemplate.getAssessmentTargetArn());
            }
            if (assessmentTemplate.getDurationInSeconds() != null) {
                jsonGenerator.writeFieldName("durationInSeconds").writeValue(assessmentTemplate.getDurationInSeconds());
            }

            java.util.List<String> rulesPackageArnsList = assessmentTemplate.getRulesPackageArns();
            if (rulesPackageArnsList != null) {
                jsonGenerator.writeFieldName("rulesPackageArns");
                jsonGenerator.writeStartArray();
                for (String rulesPackageArnsListValue : rulesPackageArnsList) {
                    if (rulesPackageArnsListValue != null) {
                        jsonGenerator.writeValue(rulesPackageArnsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<Attribute> userAttributesForFindingsList = assessmentTemplate.getUserAttributesForFindings();
            if (userAttributesForFindingsList != null) {
                jsonGenerator.writeFieldName("userAttributesForFindings");
                jsonGenerator.writeStartArray();
                for (Attribute userAttributesForFindingsListValue : userAttributesForFindingsList) {
                    if (userAttributesForFindingsListValue != null) {

                        AttributeJsonMarshaller.getInstance().marshall(userAttributesForFindingsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (assessmentTemplate.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("createdAt").writeValue(assessmentTemplate.getCreatedAt());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AssessmentTemplateJsonMarshaller instance;

    public static AssessmentTemplateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentTemplateJsonMarshaller();
        return instance;
    }

}
