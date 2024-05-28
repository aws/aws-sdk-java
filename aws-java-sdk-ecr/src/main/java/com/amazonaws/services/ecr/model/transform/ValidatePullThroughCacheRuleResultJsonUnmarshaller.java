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
package com.amazonaws.services.ecr.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecr.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ValidatePullThroughCacheRuleResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidatePullThroughCacheRuleResultJsonUnmarshaller implements Unmarshaller<ValidatePullThroughCacheRuleResult, JsonUnmarshallerContext> {

    public ValidatePullThroughCacheRuleResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ValidatePullThroughCacheRuleResult validatePullThroughCacheRuleResult = new ValidatePullThroughCacheRuleResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return validatePullThroughCacheRuleResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ecrRepositoryPrefix", targetDepth)) {
                    context.nextToken();
                    validatePullThroughCacheRuleResult.setEcrRepositoryPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("registryId", targetDepth)) {
                    context.nextToken();
                    validatePullThroughCacheRuleResult.setRegistryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("upstreamRegistryUrl", targetDepth)) {
                    context.nextToken();
                    validatePullThroughCacheRuleResult.setUpstreamRegistryUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("credentialArn", targetDepth)) {
                    context.nextToken();
                    validatePullThroughCacheRuleResult.setCredentialArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isValid", targetDepth)) {
                    context.nextToken();
                    validatePullThroughCacheRuleResult.setIsValid(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("failure", targetDepth)) {
                    context.nextToken();
                    validatePullThroughCacheRuleResult.setFailure(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return validatePullThroughCacheRuleResult;
    }

    private static ValidatePullThroughCacheRuleResultJsonUnmarshaller instance;

    public static ValidatePullThroughCacheRuleResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ValidatePullThroughCacheRuleResultJsonUnmarshaller();
        return instance;
    }
}
