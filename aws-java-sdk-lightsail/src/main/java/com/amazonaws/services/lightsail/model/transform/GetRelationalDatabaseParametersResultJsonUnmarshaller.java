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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetRelationalDatabaseParametersResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRelationalDatabaseParametersResultJsonUnmarshaller implements Unmarshaller<GetRelationalDatabaseParametersResult, JsonUnmarshallerContext> {

    public GetRelationalDatabaseParametersResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRelationalDatabaseParametersResult getRelationalDatabaseParametersResult = new GetRelationalDatabaseParametersResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getRelationalDatabaseParametersResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("parameters", targetDepth)) {
                    context.nextToken();
                    getRelationalDatabaseParametersResult.setParameters(new ListUnmarshaller<RelationalDatabaseParameter>(
                            RelationalDatabaseParameterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("nextPageToken", targetDepth)) {
                    context.nextToken();
                    getRelationalDatabaseParametersResult.setNextPageToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getRelationalDatabaseParametersResult;
    }

    private static GetRelationalDatabaseParametersResultJsonUnmarshaller instance;

    public static GetRelationalDatabaseParametersResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRelationalDatabaseParametersResultJsonUnmarshaller();
        return instance;
    }
}
