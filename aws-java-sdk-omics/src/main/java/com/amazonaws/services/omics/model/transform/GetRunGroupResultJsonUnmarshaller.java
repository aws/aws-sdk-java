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
package com.amazonaws.services.omics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.omics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetRunGroupResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRunGroupResultJsonUnmarshaller implements Unmarshaller<GetRunGroupResult, JsonUnmarshallerContext> {

    public GetRunGroupResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRunGroupResult getRunGroupResult = new GetRunGroupResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getRunGroupResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getRunGroupResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getRunGroupResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getRunGroupResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maxCpus", targetDepth)) {
                    context.nextToken();
                    getRunGroupResult.setMaxCpus(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxDuration", targetDepth)) {
                    context.nextToken();
                    getRunGroupResult.setMaxDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxRuns", targetDepth)) {
                    context.nextToken();
                    getRunGroupResult.setMaxRuns(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getRunGroupResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getRunGroupResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getRunGroupResult;
    }

    private static GetRunGroupResultJsonUnmarshaller instance;

    public static GetRunGroupResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRunGroupResultJsonUnmarshaller();
        return instance;
    }
}
