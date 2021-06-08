/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AssessmentControl JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentControlJsonUnmarshaller implements Unmarshaller<AssessmentControl, JsonUnmarshallerContext> {

    public AssessmentControl unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssessmentControl assessmentControl = new AssessmentControl();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    assessmentControl.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    assessmentControl.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    assessmentControl.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    assessmentControl.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("response", targetDepth)) {
                    context.nextToken();
                    assessmentControl.setResponse(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("comments", targetDepth)) {
                    context.nextToken();
                    assessmentControl.setComments(new ListUnmarshaller<ControlComment>(ControlCommentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("evidenceSources", targetDepth)) {
                    context.nextToken();
                    assessmentControl.setEvidenceSources(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("evidenceCount", targetDepth)) {
                    context.nextToken();
                    assessmentControl.setEvidenceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("assessmentReportEvidenceCount", targetDepth)) {
                    context.nextToken();
                    assessmentControl.setAssessmentReportEvidenceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assessmentControl;
    }

    private static AssessmentControlJsonUnmarshaller instance;

    public static AssessmentControlJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentControlJsonUnmarshaller();
        return instance;
    }
}
