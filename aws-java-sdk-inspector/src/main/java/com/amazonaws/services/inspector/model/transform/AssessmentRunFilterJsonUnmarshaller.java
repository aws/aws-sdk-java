/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AssessmentRunFilter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentRunFilterJsonUnmarshaller implements Unmarshaller<AssessmentRunFilter, JsonUnmarshallerContext> {

    public AssessmentRunFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssessmentRunFilter assessmentRunFilter = new AssessmentRunFilter();

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
                if (context.testExpression("namePattern", targetDepth)) {
                    context.nextToken();
                    assessmentRunFilter.setNamePattern(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("states", targetDepth)) {
                    context.nextToken();
                    assessmentRunFilter.setStates(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("durationRange", targetDepth)) {
                    context.nextToken();
                    assessmentRunFilter.setDurationRange(DurationRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("rulesPackageArns", targetDepth)) {
                    context.nextToken();
                    assessmentRunFilter.setRulesPackageArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("startTimeRange", targetDepth)) {
                    context.nextToken();
                    assessmentRunFilter.setStartTimeRange(TimestampRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("completionTimeRange", targetDepth)) {
                    context.nextToken();
                    assessmentRunFilter.setCompletionTimeRange(TimestampRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("stateChangeTimeRange", targetDepth)) {
                    context.nextToken();
                    assessmentRunFilter.setStateChangeTimeRange(TimestampRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assessmentRunFilter;
    }

    private static AssessmentRunFilterJsonUnmarshaller instance;

    public static AssessmentRunFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentRunFilterJsonUnmarshaller();
        return instance;
    }
}
