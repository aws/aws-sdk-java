/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeAccessPolicyResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccessPolicyResultJsonUnmarshaller implements Unmarshaller<DescribeAccessPolicyResult, JsonUnmarshallerContext> {

    public DescribeAccessPolicyResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAccessPolicyResult describeAccessPolicyResult = new DescribeAccessPolicyResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAccessPolicyResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("accessPolicyId", targetDepth)) {
                    context.nextToken();
                    describeAccessPolicyResult.setAccessPolicyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("accessPolicyArn", targetDepth)) {
                    context.nextToken();
                    describeAccessPolicyResult.setAccessPolicyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("accessPolicyIdentity", targetDepth)) {
                    context.nextToken();
                    describeAccessPolicyResult.setAccessPolicyIdentity(IdentityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("accessPolicyResource", targetDepth)) {
                    context.nextToken();
                    describeAccessPolicyResult.setAccessPolicyResource(ResourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("accessPolicyPermission", targetDepth)) {
                    context.nextToken();
                    describeAccessPolicyResult.setAccessPolicyPermission(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("accessPolicyCreationDate", targetDepth)) {
                    context.nextToken();
                    describeAccessPolicyResult.setAccessPolicyCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("accessPolicyLastUpdateDate", targetDepth)) {
                    context.nextToken();
                    describeAccessPolicyResult.setAccessPolicyLastUpdateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeAccessPolicyResult;
    }

    private static DescribeAccessPolicyResultJsonUnmarshaller instance;

    public static DescribeAccessPolicyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAccessPolicyResultJsonUnmarshaller();
        return instance;
    }
}
