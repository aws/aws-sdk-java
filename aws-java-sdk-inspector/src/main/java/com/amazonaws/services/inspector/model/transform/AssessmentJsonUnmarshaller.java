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

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Assessment JSON Unmarshaller
 */
public class AssessmentJsonUnmarshaller implements
        Unmarshaller<Assessment, JsonUnmarshallerContext> {

    public Assessment unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        Assessment assessment = new Assessment();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("assessmentArn", targetDepth)) {
                    context.nextToken();
                    assessment.setAssessmentArn(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("assessmentName", targetDepth)) {
                    context.nextToken();
                    assessment.setAssessmentName(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("applicationArn", targetDepth)) {
                    context.nextToken();
                    assessment.setApplicationArn(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("assessmentState", targetDepth)) {
                    context.nextToken();
                    assessment.setAssessmentState(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("failureMessage", targetDepth)) {
                    context.nextToken();
                    assessment.setFailureMessage(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("dataCollected", targetDepth)) {
                    context.nextToken();
                    assessment.setDataCollected(BooleanJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    assessment.setStartTime(DateJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    assessment.setEndTime(DateJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("durationInSeconds", targetDepth)) {
                    context.nextToken();
                    assessment.setDurationInSeconds(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("userAttributesForFindings",
                        targetDepth)) {
                    context.nextToken();
                    assessment
                            .setUserAttributesForFindings(new ListUnmarshaller<Attribute>(
                                    AttributeJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assessment;
    }

    private static AssessmentJsonUnmarshaller instance;

    public static AssessmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentJsonUnmarshaller();
        return instance;
    }
}
