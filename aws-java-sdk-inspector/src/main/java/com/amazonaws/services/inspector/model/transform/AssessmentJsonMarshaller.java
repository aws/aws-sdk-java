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
 * AssessmentMarshaller
 */
public class AssessmentJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Assessment assessment, JSONWriter jsonWriter) {
        if (assessment == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (assessment.getAssessmentArn() != null) {
                jsonWriter.key("assessmentArn").value(
                        assessment.getAssessmentArn());
            }

            if (assessment.getAssessmentName() != null) {
                jsonWriter.key("assessmentName").value(
                        assessment.getAssessmentName());
            }

            if (assessment.getApplicationArn() != null) {
                jsonWriter.key("applicationArn").value(
                        assessment.getApplicationArn());
            }

            if (assessment.getAssessmentState() != null) {
                jsonWriter.key("assessmentState").value(
                        assessment.getAssessmentState());
            }

            if (assessment.getFailureMessage() != null) {
                jsonWriter.key("failureMessage").value(
                        assessment.getFailureMessage());
            }

            if (assessment.getDataCollected() != null) {
                jsonWriter.key("dataCollected").value(
                        assessment.getDataCollected());
            }

            if (assessment.getStartTime() != null) {
                jsonWriter.key("startTime").value(assessment.getStartTime());
            }

            if (assessment.getEndTime() != null) {
                jsonWriter.key("endTime").value(assessment.getEndTime());
            }

            if (assessment.getDurationInSeconds() != null) {
                jsonWriter.key("durationInSeconds").value(
                        assessment.getDurationInSeconds());
            }

            java.util.List<Attribute> userAttributesForFindingsList = assessment
                    .getUserAttributesForFindings();
            if (userAttributesForFindingsList != null) {
                jsonWriter.key("userAttributesForFindings");
                jsonWriter.array();
                for (Attribute userAttributesForFindingsListValue : userAttributesForFindingsList) {
                    if (userAttributesForFindingsListValue != null) {

                        AttributeJsonMarshaller.getInstance().marshall(
                                userAttributesForFindingsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AssessmentJsonMarshaller instance;

    public static AssessmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentJsonMarshaller();
        return instance;
    }

}
