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
package com.amazonaws.services.vpclattice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.vpclattice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetListenerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetListenerResultJsonUnmarshaller implements Unmarshaller<GetListenerResult, JsonUnmarshallerContext> {

    public GetListenerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetListenerResult getListenerResult = new GetListenerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getListenerResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getListenerResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getListenerResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("defaultAction", targetDepth)) {
                    context.nextToken();
                    getListenerResult.setDefaultAction(RuleActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getListenerResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    getListenerResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getListenerResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("port", targetDepth)) {
                    context.nextToken();
                    getListenerResult.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("protocol", targetDepth)) {
                    context.nextToken();
                    getListenerResult.setProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceArn", targetDepth)) {
                    context.nextToken();
                    getListenerResult.setServiceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceId", targetDepth)) {
                    context.nextToken();
                    getListenerResult.setServiceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getListenerResult;
    }

    private static GetListenerResultJsonUnmarshaller instance;

    public static GetListenerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetListenerResultJsonUnmarshaller();
        return instance;
    }
}
