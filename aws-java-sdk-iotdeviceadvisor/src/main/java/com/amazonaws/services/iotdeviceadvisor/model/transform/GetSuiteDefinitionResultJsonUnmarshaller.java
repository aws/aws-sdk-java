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
package com.amazonaws.services.iotdeviceadvisor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotdeviceadvisor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetSuiteDefinitionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSuiteDefinitionResultJsonUnmarshaller implements Unmarshaller<GetSuiteDefinitionResult, JsonUnmarshallerContext> {

    public GetSuiteDefinitionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSuiteDefinitionResult getSuiteDefinitionResult = new GetSuiteDefinitionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSuiteDefinitionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("suiteDefinitionId", targetDepth)) {
                    context.nextToken();
                    getSuiteDefinitionResult.setSuiteDefinitionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("suiteDefinitionArn", targetDepth)) {
                    context.nextToken();
                    getSuiteDefinitionResult.setSuiteDefinitionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("suiteDefinitionVersion", targetDepth)) {
                    context.nextToken();
                    getSuiteDefinitionResult.setSuiteDefinitionVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestVersion", targetDepth)) {
                    context.nextToken();
                    getSuiteDefinitionResult.setLatestVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("suiteDefinitionConfiguration", targetDepth)) {
                    context.nextToken();
                    getSuiteDefinitionResult.setSuiteDefinitionConfiguration(SuiteDefinitionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getSuiteDefinitionResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedAt", targetDepth)) {
                    context.nextToken();
                    getSuiteDefinitionResult.setLastModifiedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getSuiteDefinitionResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getSuiteDefinitionResult;
    }

    private static GetSuiteDefinitionResultJsonUnmarshaller instance;

    public static GetSuiteDefinitionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSuiteDefinitionResultJsonUnmarshaller();
        return instance;
    }
}
