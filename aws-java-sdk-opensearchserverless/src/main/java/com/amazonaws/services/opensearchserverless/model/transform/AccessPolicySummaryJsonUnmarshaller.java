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
package com.amazonaws.services.opensearchserverless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opensearchserverless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AccessPolicySummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessPolicySummaryJsonUnmarshaller implements Unmarshaller<AccessPolicySummary, JsonUnmarshallerContext> {

    public AccessPolicySummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AccessPolicySummary accessPolicySummary = new AccessPolicySummary();

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
                if (context.testExpression("createdDate", targetDepth)) {
                    context.nextToken();
                    accessPolicySummary.setCreatedDate(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    accessPolicySummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    context.nextToken();
                    accessPolicySummary.setLastModifiedDate(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    accessPolicySummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("policyVersion", targetDepth)) {
                    context.nextToken();
                    accessPolicySummary.setPolicyVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    accessPolicySummary.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return accessPolicySummary;
    }

    private static AccessPolicySummaryJsonUnmarshaller instance;

    public static AccessPolicySummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccessPolicySummaryJsonUnmarshaller();
        return instance;
    }
}
