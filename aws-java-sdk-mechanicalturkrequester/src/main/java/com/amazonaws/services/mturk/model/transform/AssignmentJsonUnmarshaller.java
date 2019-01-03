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
package com.amazonaws.services.mturk.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mturk.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Assignment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignmentJsonUnmarshaller implements Unmarshaller<Assignment, JsonUnmarshallerContext> {

    public Assignment unmarshall(JsonUnmarshallerContext context) throws Exception {
        Assignment assignment = new Assignment();

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
                if (context.testExpression("AssignmentId", targetDepth)) {
                    context.nextToken();
                    assignment.setAssignmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkerId", targetDepth)) {
                    context.nextToken();
                    assignment.setWorkerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HITId", targetDepth)) {
                    context.nextToken();
                    assignment.setHITId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssignmentStatus", targetDepth)) {
                    context.nextToken();
                    assignment.setAssignmentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoApprovalTime", targetDepth)) {
                    context.nextToken();
                    assignment.setAutoApprovalTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AcceptTime", targetDepth)) {
                    context.nextToken();
                    assignment.setAcceptTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SubmitTime", targetDepth)) {
                    context.nextToken();
                    assignment.setSubmitTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ApprovalTime", targetDepth)) {
                    context.nextToken();
                    assignment.setApprovalTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RejectionTime", targetDepth)) {
                    context.nextToken();
                    assignment.setRejectionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Deadline", targetDepth)) {
                    context.nextToken();
                    assignment.setDeadline(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Answer", targetDepth)) {
                    context.nextToken();
                    assignment.setAnswer(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequesterFeedback", targetDepth)) {
                    context.nextToken();
                    assignment.setRequesterFeedback(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assignment;
    }

    private static AssignmentJsonUnmarshaller instance;

    public static AssignmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssignmentJsonUnmarshaller();
        return instance;
    }
}
