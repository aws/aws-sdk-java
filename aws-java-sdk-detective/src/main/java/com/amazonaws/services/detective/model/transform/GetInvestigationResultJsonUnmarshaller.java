/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.detective.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.detective.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetInvestigationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInvestigationResultJsonUnmarshaller implements Unmarshaller<GetInvestigationResult, JsonUnmarshallerContext> {

    public GetInvestigationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetInvestigationResult getInvestigationResult = new GetInvestigationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getInvestigationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("GraphArn", targetDepth)) {
                    context.nextToken();
                    getInvestigationResult.setGraphArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InvestigationId", targetDepth)) {
                    context.nextToken();
                    getInvestigationResult.setInvestigationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EntityArn", targetDepth)) {
                    context.nextToken();
                    getInvestigationResult.setEntityArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EntityType", targetDepth)) {
                    context.nextToken();
                    getInvestigationResult.setEntityType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    getInvestigationResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("ScopeStartTime", targetDepth)) {
                    context.nextToken();
                    getInvestigationResult.setScopeStartTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("ScopeEndTime", targetDepth)) {
                    context.nextToken();
                    getInvestigationResult.setScopeEndTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getInvestigationResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Severity", targetDepth)) {
                    context.nextToken();
                    getInvestigationResult.setSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    getInvestigationResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getInvestigationResult;
    }

    private static GetInvestigationResultJsonUnmarshaller instance;

    public static GetInvestigationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetInvestigationResultJsonUnmarshaller();
        return instance;
    }
}
