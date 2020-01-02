/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotthingsgraph.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotthingsgraph.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SystemInstanceSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SystemInstanceSummaryJsonUnmarshaller implements Unmarshaller<SystemInstanceSummary, JsonUnmarshallerContext> {

    public SystemInstanceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        SystemInstanceSummary systemInstanceSummary = new SystemInstanceSummary();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    systemInstanceSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    systemInstanceSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    systemInstanceSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("target", targetDepth)) {
                    context.nextToken();
                    systemInstanceSummary.setTarget(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("greengrassGroupName", targetDepth)) {
                    context.nextToken();
                    systemInstanceSummary.setGreengrassGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    systemInstanceSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    systemInstanceSummary.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("greengrassGroupId", targetDepth)) {
                    context.nextToken();
                    systemInstanceSummary.setGreengrassGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("greengrassGroupVersionId", targetDepth)) {
                    context.nextToken();
                    systemInstanceSummary.setGreengrassGroupVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return systemInstanceSummary;
    }

    private static SystemInstanceSummaryJsonUnmarshaller instance;

    public static SystemInstanceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SystemInstanceSummaryJsonUnmarshaller();
        return instance;
    }
}
