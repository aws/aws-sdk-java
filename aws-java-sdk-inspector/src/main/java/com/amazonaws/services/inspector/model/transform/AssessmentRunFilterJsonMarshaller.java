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
 * AssessmentRunFilterMarshaller
 */
public class AssessmentRunFilterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AssessmentRunFilter assessmentRunFilter, StructuredJsonGenerator jsonGenerator) {

        if (assessmentRunFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (assessmentRunFilter.getNamePattern() != null) {
                jsonGenerator.writeFieldName("namePattern").writeValue(assessmentRunFilter.getNamePattern());
            }

            java.util.List<String> statesList = assessmentRunFilter.getStates();
            if (statesList != null) {
                jsonGenerator.writeFieldName("states");
                jsonGenerator.writeStartArray();
                for (String statesListValue : statesList) {
                    if (statesListValue != null) {
                        jsonGenerator.writeValue(statesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (assessmentRunFilter.getDurationRange() != null) {
                jsonGenerator.writeFieldName("durationRange");
                DurationRangeJsonMarshaller.getInstance().marshall(assessmentRunFilter.getDurationRange(), jsonGenerator);
            }

            java.util.List<String> rulesPackageArnsList = assessmentRunFilter.getRulesPackageArns();
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
            if (assessmentRunFilter.getStartTimeRange() != null) {
                jsonGenerator.writeFieldName("startTimeRange");
                TimestampRangeJsonMarshaller.getInstance().marshall(assessmentRunFilter.getStartTimeRange(), jsonGenerator);
            }
            if (assessmentRunFilter.getCompletionTimeRange() != null) {
                jsonGenerator.writeFieldName("completionTimeRange");
                TimestampRangeJsonMarshaller.getInstance().marshall(assessmentRunFilter.getCompletionTimeRange(), jsonGenerator);
            }
            if (assessmentRunFilter.getStateChangeTimeRange() != null) {
                jsonGenerator.writeFieldName("stateChangeTimeRange");
                TimestampRangeJsonMarshaller.getInstance().marshall(assessmentRunFilter.getStateChangeTimeRange(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AssessmentRunFilterJsonMarshaller instance;

    public static AssessmentRunFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentRunFilterJsonMarshaller();
        return instance;
    }

}
