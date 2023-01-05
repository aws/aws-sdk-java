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
package com.amazonaws.services.auditmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.auditmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Insights JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightsJsonUnmarshaller implements Unmarshaller<Insights, JsonUnmarshallerContext> {

    public Insights unmarshall(JsonUnmarshallerContext context) throws Exception {
        Insights insights = new Insights();

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
                if (context.testExpression("activeAssessmentsCount", targetDepth)) {
                    context.nextToken();
                    insights.setActiveAssessmentsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("noncompliantEvidenceCount", targetDepth)) {
                    context.nextToken();
                    insights.setNoncompliantEvidenceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("compliantEvidenceCount", targetDepth)) {
                    context.nextToken();
                    insights.setCompliantEvidenceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("inconclusiveEvidenceCount", targetDepth)) {
                    context.nextToken();
                    insights.setInconclusiveEvidenceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("assessmentControlsCountByNoncompliantEvidence", targetDepth)) {
                    context.nextToken();
                    insights.setAssessmentControlsCountByNoncompliantEvidence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalAssessmentControlsCount", targetDepth)) {
                    context.nextToken();
                    insights.setTotalAssessmentControlsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdated", targetDepth)) {
                    context.nextToken();
                    insights.setLastUpdated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return insights;
    }

    private static InsightsJsonUnmarshaller instance;

    public static InsightsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InsightsJsonUnmarshaller();
        return instance;
    }
}
