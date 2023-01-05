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
 * DescribeAppVersionResourcesResolutionStatusResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAppVersionResourcesResolutionStatusResultJsonUnmarshaller implements
        Unmarshaller<DescribeAppVersionResourcesResolutionStatusResult, JsonUnmarshallerContext> {

    public DescribeAppVersionResourcesResolutionStatusResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAppVersionResourcesResolutionStatusResult describeAppVersionResourcesResolutionStatusResult = new DescribeAppVersionResourcesResolutionStatusResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAppVersionResourcesResolutionStatusResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("appArn", targetDepth)) {
                    context.nextToken();
                    describeAppVersionResourcesResolutionStatusResult.setAppArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("appVersion", targetDepth)) {
                    context.nextToken();
                    describeAppVersionResourcesResolutionStatusResult.setAppVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    describeAppVersionResourcesResolutionStatusResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resolutionId", targetDepth)) {
                    context.nextToken();
                    describeAppVersionResourcesResolutionStatusResult.setResolutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    describeAppVersionResourcesResolutionStatusResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeAppVersionResourcesResolutionStatusResult;
    }

    private static DescribeAppVersionResourcesResolutionStatusResultJsonUnmarshaller instance;

    public static DescribeAppVersionResourcesResolutionStatusResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAppVersionResourcesResolutionStatusResultJsonUnmarshaller();
        return instance;
    }
}
