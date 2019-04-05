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
package com.amazonaws.services.apigateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PutMethodResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMethodResultJsonUnmarshaller implements Unmarshaller<PutMethodResult, JsonUnmarshallerContext> {

    public PutMethodResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutMethodResult putMethodResult = new PutMethodResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return putMethodResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("httpMethod", targetDepth)) {
                    context.nextToken();
                    putMethodResult.setHttpMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorizationType", targetDepth)) {
                    context.nextToken();
                    putMethodResult.setAuthorizationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorizerId", targetDepth)) {
                    context.nextToken();
                    putMethodResult.setAuthorizerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("apiKeyRequired", targetDepth)) {
                    context.nextToken();
                    putMethodResult.setApiKeyRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("requestValidatorId", targetDepth)) {
                    context.nextToken();
                    putMethodResult.setRequestValidatorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operationName", targetDepth)) {
                    context.nextToken();
                    putMethodResult.setOperationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requestParameters", targetDepth)) {
                    context.nextToken();
                    putMethodResult.setRequestParameters(new MapUnmarshaller<String, Boolean>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Boolean.class)).unmarshall(context));
                }
                if (context.testExpression("requestModels", targetDepth)) {
                    context.nextToken();
                    putMethodResult.setRequestModels(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("methodResponses", targetDepth)) {
                    context.nextToken();
                    putMethodResult.setMethodResponses(new MapUnmarshaller<String, MethodResponse>(context.getUnmarshaller(String.class),
                            MethodResponseJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("methodIntegration", targetDepth)) {
                    context.nextToken();
                    putMethodResult.setMethodIntegration(IntegrationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("authorizationScopes", targetDepth)) {
                    context.nextToken();
                    putMethodResult.setAuthorizationScopes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return putMethodResult;
    }

    private static PutMethodResultJsonUnmarshaller instance;

    public static PutMethodResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutMethodResultJsonUnmarshaller();
        return instance;
    }
}
