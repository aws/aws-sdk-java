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
package com.amazonaws.services.migrationhubrefactorspaces.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhubrefactorspaces.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ApiGatewayProxySummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiGatewayProxySummaryJsonUnmarshaller implements Unmarshaller<ApiGatewayProxySummary, JsonUnmarshallerContext> {

    public ApiGatewayProxySummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ApiGatewayProxySummary apiGatewayProxySummary = new ApiGatewayProxySummary();

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
                if (context.testExpression("ApiGatewayId", targetDepth)) {
                    context.nextToken();
                    apiGatewayProxySummary.setApiGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointType", targetDepth)) {
                    context.nextToken();
                    apiGatewayProxySummary.setEndpointType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NlbArn", targetDepth)) {
                    context.nextToken();
                    apiGatewayProxySummary.setNlbArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NlbName", targetDepth)) {
                    context.nextToken();
                    apiGatewayProxySummary.setNlbName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProxyUrl", targetDepth)) {
                    context.nextToken();
                    apiGatewayProxySummary.setProxyUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StageName", targetDepth)) {
                    context.nextToken();
                    apiGatewayProxySummary.setStageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcLinkId", targetDepth)) {
                    context.nextToken();
                    apiGatewayProxySummary.setVpcLinkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return apiGatewayProxySummary;
    }

    private static ApiGatewayProxySummaryJsonUnmarshaller instance;

    public static ApiGatewayProxySummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApiGatewayProxySummaryJsonUnmarshaller();
        return instance;
    }
}
