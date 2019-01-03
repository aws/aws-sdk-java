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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AssociationExecutionTarget JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociationExecutionTargetJsonUnmarshaller implements Unmarshaller<AssociationExecutionTarget, JsonUnmarshallerContext> {

    public AssociationExecutionTarget unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssociationExecutionTarget associationExecutionTarget = new AssociationExecutionTarget();

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
                if (context.testExpression("AssociationId", targetDepth)) {
                    context.nextToken();
                    associationExecutionTarget.setAssociationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociationVersion", targetDepth)) {
                    context.nextToken();
                    associationExecutionTarget.setAssociationVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionId", targetDepth)) {
                    context.nextToken();
                    associationExecutionTarget.setExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceId", targetDepth)) {
                    context.nextToken();
                    associationExecutionTarget.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    context.nextToken();
                    associationExecutionTarget.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    associationExecutionTarget.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DetailedStatus", targetDepth)) {
                    context.nextToken();
                    associationExecutionTarget.setDetailedStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastExecutionDate", targetDepth)) {
                    context.nextToken();
                    associationExecutionTarget.setLastExecutionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("OutputSource", targetDepth)) {
                    context.nextToken();
                    associationExecutionTarget.setOutputSource(OutputSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return associationExecutionTarget;
    }

    private static AssociationExecutionTargetJsonUnmarshaller instance;

    public static AssociationExecutionTargetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociationExecutionTargetJsonUnmarshaller();
        return instance;
    }
}
