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
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * AssessmentsFilterMarshaller
 */
public class AssessmentsFilterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(AssessmentsFilter assessmentsFilter,
            JSONWriter jsonWriter) {
        if (assessmentsFilter == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            java.util.List<String> assessmentNamePatternsList = assessmentsFilter
                    .getAssessmentNamePatterns();
            if (assessmentNamePatternsList != null) {
                jsonWriter.key("assessmentNamePatterns");
                jsonWriter.array();
                for (String assessmentNamePatternsListValue : assessmentNamePatternsList) {
                    if (assessmentNamePatternsListValue != null) {
                        jsonWriter.value(assessmentNamePatternsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.List<String> assessmentStatesList = assessmentsFilter
                    .getAssessmentStates();
            if (assessmentStatesList != null) {
                jsonWriter.key("assessmentStates");
                jsonWriter.array();
                for (String assessmentStatesListValue : assessmentStatesList) {
                    if (assessmentStatesListValue != null) {
                        jsonWriter.value(assessmentStatesListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (assessmentsFilter.getDataCollected() != null) {
                jsonWriter.key("dataCollected").value(
                        assessmentsFilter.getDataCollected());
            }

            if (assessmentsFilter.getStartTimeRange() != null) {
                jsonWriter.key("startTimeRange");
                TimestampRangeJsonMarshaller.getInstance().marshall(
                        assessmentsFilter.getStartTimeRange(), jsonWriter);
            }

            if (assessmentsFilter.getEndTimeRange() != null) {
                jsonWriter.key("endTimeRange");
                TimestampRangeJsonMarshaller.getInstance().marshall(
                        assessmentsFilter.getEndTimeRange(), jsonWriter);
            }

            if (assessmentsFilter.getDurationRange() != null) {
                jsonWriter.key("durationRange");
                DurationRangeJsonMarshaller.getInstance().marshall(
                        assessmentsFilter.getDurationRange(), jsonWriter);
            }

            jsonWriter.endObject();
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
