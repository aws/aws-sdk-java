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
package com.amazonaws.services.bedrock.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.bedrock.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetGuardrailResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGuardrailResultJsonUnmarshaller implements Unmarshaller<GetGuardrailResult, JsonUnmarshallerContext> {

    public GetGuardrailResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetGuardrailResult getGuardrailResult = new GetGuardrailResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getGuardrailResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("guardrailId", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setGuardrailId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("guardrailArn", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setGuardrailArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("topicPolicy", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setTopicPolicy(GuardrailTopicPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("contentPolicy", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setContentPolicy(GuardrailContentPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("wordPolicy", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setWordPolicy(GuardrailWordPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sensitiveInformationPolicy", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setSensitiveInformationPolicy(GuardrailSensitiveInformationPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("statusReasons", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setStatusReasons(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("failureRecommendations", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setFailureRecommendations(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("blockedInputMessaging", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setBlockedInputMessaging(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("blockedOutputsMessaging", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setBlockedOutputsMessaging(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyArn", targetDepth)) {
                    context.nextToken();
                    getGuardrailResult.setKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getGuardrailResult;
    }

    private static GetGuardrailResultJsonUnmarshaller instance;

    public static GetGuardrailResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetGuardrailResultJsonUnmarshaller();
        return instance;
    }
}
