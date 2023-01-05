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
package com.amazonaws.services.wafv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wafv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ManagedRuleSet JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedRuleSetJsonUnmarshaller implements Unmarshaller<ManagedRuleSet, JsonUnmarshallerContext> {

    public ManagedRuleSet unmarshall(JsonUnmarshallerContext context) throws Exception {
        ManagedRuleSet managedRuleSet = new ManagedRuleSet();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    managedRuleSet.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    managedRuleSet.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ARN", targetDepth)) {
                    context.nextToken();
                    managedRuleSet.setARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    managedRuleSet.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublishedVersions", targetDepth)) {
                    context.nextToken();
                    managedRuleSet.setPublishedVersions(new MapUnmarshaller<String, ManagedRuleSetVersion>(context.getUnmarshaller(String.class),
                            ManagedRuleSetVersionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("RecommendedVersion", targetDepth)) {
                    context.nextToken();
                    managedRuleSet.setRecommendedVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelNamespace", targetDepth)) {
                    context.nextToken();
                    managedRuleSet.setLabelNamespace(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return managedRuleSet;
    }

    private static ManagedRuleSetJsonUnmarshaller instance;

    public static ManagedRuleSetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ManagedRuleSetJsonUnmarshaller();
        return instance;
    }
}
