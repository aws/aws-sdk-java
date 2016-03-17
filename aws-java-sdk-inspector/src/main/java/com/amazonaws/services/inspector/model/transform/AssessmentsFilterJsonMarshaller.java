/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * AssessmentsFilterMarshaller
 */
public class AssessmentsFilterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AssessmentsFilter assessmentsFilter,
            SdkJsonGenerator jsonGenerator) {
        if (assessmentsFilter == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.List<String> assessmentNamePatternsList = assessmentsFilter
                    .getAssessmentNamePatterns();
            if (assessmentNamePatternsList != null) {
                jsonGenerator.writeFieldName("assessmentNamePatterns");
                jsonGenerator.writeStartArray();
                for (String assessmentNamePatternsListValue : assessmentNamePatternsList) {
                    if (assessmentNamePatternsListValue != null) {
                        jsonGenerator
                                .writeValue(assessmentNamePatternsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> assessmentStatesList = assessmentsFilter
                    .getAssessmentStates();
            if (assessmentStatesList != null) {
                jsonGenerator.writeFieldName("assessmentStates");
                jsonGenerator.writeStartArray();
                for (String assessmentStatesListValue : assessmentStatesList) {
                    if (assessmentStatesListValue != null) {
                        jsonGenerator.writeValue(assessmentStatesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (assessmentsFilter.getDataCollected() != null) {
                jsonGenerator.writeFieldName("dataCollected").writeValue(
                        assessmentsFilter.getDataCollected());
            }
            if (assessmentsFilter.getStartTimeRange() != null) {
                jsonGenerator.writeFieldName("startTimeRange");
                TimestampRangeJsonMarshaller.getInstance().marshall(
                        assessmentsFilter.getStartTimeRange(), jsonGenerator);
            }
            if (assessmentsFilter.getEndTimeRange() != null) {
                jsonGenerator.writeFieldName("endTimeRange");
                TimestampRangeJsonMarshaller.getInstance().marshall(
                        assessmentsFilter.getEndTimeRange(), jsonGenerator);
            }
            if (assessmentsFilter.getDurationRange() != null) {
                jsonGenerator.writeFieldName("durationRange");
                DurationRangeJsonMarshaller.getInstance().marshall(
                        assessmentsFilter.getDurationRange(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AssessmentsFilterJsonMarshaller instance;

    public static AssessmentsFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentsFilterJsonMarshaller();
        return instance;
    }

}
