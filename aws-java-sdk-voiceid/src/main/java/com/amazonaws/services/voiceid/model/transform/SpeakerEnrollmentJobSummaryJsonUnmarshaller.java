/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.voiceid.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.voiceid.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SpeakerEnrollmentJobSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpeakerEnrollmentJobSummaryJsonUnmarshaller implements Unmarshaller<SpeakerEnrollmentJobSummary, JsonUnmarshallerContext> {

    public SpeakerEnrollmentJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        SpeakerEnrollmentJobSummary speakerEnrollmentJobSummary = new SpeakerEnrollmentJobSummary();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    speakerEnrollmentJobSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DomainId", targetDepth)) {
                    context.nextToken();
                    speakerEnrollmentJobSummary.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndedAt", targetDepth)) {
                    context.nextToken();
                    speakerEnrollmentJobSummary.setEndedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureDetails", targetDepth)) {
                    context.nextToken();
                    speakerEnrollmentJobSummary.setFailureDetails(FailureDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobId", targetDepth)) {
                    context.nextToken();
                    speakerEnrollmentJobSummary.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobName", targetDepth)) {
                    context.nextToken();
                    speakerEnrollmentJobSummary.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobProgress", targetDepth)) {
                    context.nextToken();
                    speakerEnrollmentJobSummary.setJobProgress(JobProgressJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobStatus", targetDepth)) {
                    context.nextToken();
                    speakerEnrollmentJobSummary.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return speakerEnrollmentJobSummary;
    }

    private static SpeakerEnrollmentJobSummaryJsonUnmarshaller instance;

    public static SpeakerEnrollmentJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SpeakerEnrollmentJobSummaryJsonUnmarshaller();
        return instance;
    }
}
