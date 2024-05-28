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
package com.amazonaws.services.accessanalyzer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetFindingV2Result JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingV2ResultJsonUnmarshaller implements Unmarshaller<GetFindingV2Result, JsonUnmarshallerContext> {

    public GetFindingV2Result unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetFindingV2Result getFindingV2Result = new GetFindingV2Result();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getFindingV2Result;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("analyzedAt", targetDepth)) {
                    context.nextToken();
                    getFindingV2Result.setAnalyzedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getFindingV2Result.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("error", targetDepth)) {
                    context.nextToken();
                    getFindingV2Result.setError(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getFindingV2Result.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nextToken", targetDepth)) {
                    context.nextToken();
                    getFindingV2Result.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resource", targetDepth)) {
                    context.nextToken();
                    getFindingV2Result.setResource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    getFindingV2Result.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceOwnerAccount", targetDepth)) {
                    context.nextToken();
                    getFindingV2Result.setResourceOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getFindingV2Result.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getFindingV2Result.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("findingDetails", targetDepth)) {
                    context.nextToken();
                    getFindingV2Result.setFindingDetails(new ListUnmarshaller<FindingDetails>(FindingDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("findingType", targetDepth)) {
                    context.nextToken();
                    getFindingV2Result.setFindingType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getFindingV2Result;
    }

    private static GetFindingV2ResultJsonUnmarshaller instance;

    public static GetFindingV2ResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetFindingV2ResultJsonUnmarshaller();
        return instance;
    }
}
