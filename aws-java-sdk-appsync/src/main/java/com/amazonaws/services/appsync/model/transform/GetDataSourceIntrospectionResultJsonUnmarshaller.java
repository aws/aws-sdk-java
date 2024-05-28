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
package com.amazonaws.services.appsync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appsync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDataSourceIntrospectionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataSourceIntrospectionResultJsonUnmarshaller implements Unmarshaller<GetDataSourceIntrospectionResult, JsonUnmarshallerContext> {

    public GetDataSourceIntrospectionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDataSourceIntrospectionResult getDataSourceIntrospectionResult = new GetDataSourceIntrospectionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDataSourceIntrospectionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("introspectionId", targetDepth)) {
                    context.nextToken();
                    getDataSourceIntrospectionResult.setIntrospectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("introspectionStatus", targetDepth)) {
                    context.nextToken();
                    getDataSourceIntrospectionResult.setIntrospectionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("introspectionStatusDetail", targetDepth)) {
                    context.nextToken();
                    getDataSourceIntrospectionResult.setIntrospectionStatusDetail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("introspectionResult", targetDepth)) {
                    context.nextToken();
                    getDataSourceIntrospectionResult.setIntrospectionResult(DataSourceIntrospectionResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getDataSourceIntrospectionResult;
    }

    private static GetDataSourceIntrospectionResultJsonUnmarshaller instance;

    public static GetDataSourceIntrospectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDataSourceIntrospectionResultJsonUnmarshaller();
        return instance;
    }
}
