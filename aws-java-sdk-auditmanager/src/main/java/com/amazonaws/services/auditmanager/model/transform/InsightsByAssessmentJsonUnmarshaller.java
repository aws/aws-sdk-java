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
 * InsightsByAssessment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightsByAssessmentJsonUnmarshaller implements Unmarshaller<InsightsByAssessment, JsonUnmarshallerContext> {

    public InsightsByAssessment unmarshall(JsonUnmarshallerContext context) throws Exception {
        InsightsByAssessment insightsByAssessment = new InsightsByAssessment();

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
                if (context.testExpression("noncompliantEvidenceCount", targetDepth)) {
                    context.nextToken();
                    insightsByAssessment.setNoncompliantEvidenceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("compliantEvidenceCount", targetDepth)) {
                    context.nextToken();
                    insightsByAssessment.setCompliantEvidenceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("inconclusiveEvidenceCount", targetDepth)) {
                    context.nextToken();
                    insightsByAssessment.setInconclusiveEvidenceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("assessmentControlsCountByNoncompliantEvidence", targetDepth)) {
                    context.nextToken();
                    insightsByAssessment.setAssessmentControlsCountByNoncompliantEvidence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalAssessmentControlsCount", targetDepth)) {
                    context.nextToken();
                    insightsByAssessment.setTotalAssessmentControlsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdated", targetDepth)) {
                    context.nextToken();
                    insightsByAssessment.setLastUpdated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return insightsByAssessment;
    }

    private static InsightsByAssessmentJsonUnmarshaller instance;

    public static InsightsByAssessmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InsightsByAssessmentJsonUnmarshaller();
        return instance;
    }
}
