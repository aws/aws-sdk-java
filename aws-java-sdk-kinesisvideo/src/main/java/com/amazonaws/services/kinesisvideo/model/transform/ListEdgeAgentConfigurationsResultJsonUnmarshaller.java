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
package com.amazonaws.services.kinesisvideo.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListEdgeAgentConfigurationsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEdgeAgentConfigurationsResultJsonUnmarshaller implements Unmarshaller<ListEdgeAgentConfigurationsResult, JsonUnmarshallerContext> {

    public ListEdgeAgentConfigurationsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListEdgeAgentConfigurationsResult listEdgeAgentConfigurationsResult = new ListEdgeAgentConfigurationsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listEdgeAgentConfigurationsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("EdgeConfigs", targetDepth)) {
                    context.nextToken();
                    listEdgeAgentConfigurationsResult.setEdgeConfigs(new ListUnmarshaller<ListEdgeAgentConfigurationsEdgeConfig>(
                            ListEdgeAgentConfigurationsEdgeConfigJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    listEdgeAgentConfigurationsResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listEdgeAgentConfigurationsResult;
    }

    private static ListEdgeAgentConfigurationsResultJsonUnmarshaller instance;

    public static ListEdgeAgentConfigurationsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListEdgeAgentConfigurationsResultJsonUnmarshaller();
        return instance;
    }
}
