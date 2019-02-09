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
package com.amazonaws.services.dlm.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dlm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LifecyclePolicy JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicyJsonUnmarshaller implements Unmarshaller<LifecyclePolicy, JsonUnmarshallerContext> {

    public LifecyclePolicy unmarshall(JsonUnmarshallerContext context) throws Exception {
        LifecyclePolicy lifecyclePolicy = new LifecyclePolicy();

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
                if (context.testExpression("PolicyId", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setPolicyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionRoleArn", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DateCreated", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setDateCreated(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("DateModified", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setDateModified(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("PolicyDetails", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setPolicyDetails(PolicyDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return lifecyclePolicy;
    }

    private static LifecyclePolicyJsonUnmarshaller instance;

    public static LifecyclePolicyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LifecyclePolicyJsonUnmarshaller();
        return instance;
    }
}
