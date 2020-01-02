/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * IAMPolicyAssignment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IAMPolicyAssignmentJsonUnmarshaller implements Unmarshaller<IAMPolicyAssignment, JsonUnmarshallerContext> {

    public IAMPolicyAssignment unmarshall(JsonUnmarshallerContext context) throws Exception {
        IAMPolicyAssignment iAMPolicyAssignment = new IAMPolicyAssignment();

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
                if (context.testExpression("AwsAccountId", targetDepth)) {
                    context.nextToken();
                    iAMPolicyAssignment.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssignmentId", targetDepth)) {
                    context.nextToken();
                    iAMPolicyAssignment.setAssignmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssignmentName", targetDepth)) {
                    context.nextToken();
                    iAMPolicyAssignment.setAssignmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PolicyArn", targetDepth)) {
                    context.nextToken();
                    iAMPolicyAssignment.setPolicyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Identities", targetDepth)) {
                    context.nextToken();
                    iAMPolicyAssignment.setIdentities(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("AssignmentStatus", targetDepth)) {
                    context.nextToken();
                    iAMPolicyAssignment.setAssignmentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return iAMPolicyAssignment;
    }

    private static IAMPolicyAssignmentJsonUnmarshaller instance;

    public static IAMPolicyAssignmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IAMPolicyAssignmentJsonUnmarshaller();
        return instance;
    }
}
