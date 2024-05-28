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
package com.amazonaws.services.imagebuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.imagebuilder.model.*;
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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executionRole", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setExecutionRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("policyDetails", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setPolicyDetails(new ListUnmarshaller<LifecyclePolicyDetail>(LifecyclePolicyDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resourceSelection", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setResourceSelection(LifecyclePolicyResourceSelectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dateCreated", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setDateCreated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("dateUpdated", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setDateUpdated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("dateLastRun", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setDateLastRun(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    lifecyclePolicy.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
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
