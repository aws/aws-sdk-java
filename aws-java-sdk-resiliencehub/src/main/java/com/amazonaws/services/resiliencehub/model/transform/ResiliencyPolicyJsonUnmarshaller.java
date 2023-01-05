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
package com.amazonaws.services.resiliencehub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.resiliencehub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ResiliencyPolicy JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResiliencyPolicyJsonUnmarshaller implements Unmarshaller<ResiliencyPolicy, JsonUnmarshallerContext> {

    public ResiliencyPolicy unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResiliencyPolicy resiliencyPolicy = new ResiliencyPolicy();

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
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    resiliencyPolicy.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("dataLocationConstraint", targetDepth)) {
                    context.nextToken();
                    resiliencyPolicy.setDataLocationConstraint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("estimatedCostTier", targetDepth)) {
                    context.nextToken();
                    resiliencyPolicy.setEstimatedCostTier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("policy", targetDepth)) {
                    context.nextToken();
                    resiliencyPolicy.setPolicy(new MapUnmarshaller<String, FailurePolicy>(context.getUnmarshaller(String.class), FailurePolicyJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("policyArn", targetDepth)) {
                    context.nextToken();
                    resiliencyPolicy.setPolicyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("policyDescription", targetDepth)) {
                    context.nextToken();
                    resiliencyPolicy.setPolicyDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("policyName", targetDepth)) {
                    context.nextToken();
                    resiliencyPolicy.setPolicyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    resiliencyPolicy.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("tier", targetDepth)) {
                    context.nextToken();
                    resiliencyPolicy.setTier(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return resiliencyPolicy;
    }

    private static ResiliencyPolicyJsonUnmarshaller instance;

    public static ResiliencyPolicyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResiliencyPolicyJsonUnmarshaller();
        return instance;
    }
}
