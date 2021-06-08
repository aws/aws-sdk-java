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
package com.amazonaws.services.datasync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datasync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeLocationObjectStorageResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocationObjectStorageResultJsonUnmarshaller implements Unmarshaller<DescribeLocationObjectStorageResult, JsonUnmarshallerContext> {

    public DescribeLocationObjectStorageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeLocationObjectStorageResult describeLocationObjectStorageResult = new DescribeLocationObjectStorageResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeLocationObjectStorageResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("LocationArn", targetDepth)) {
                    context.nextToken();
                    describeLocationObjectStorageResult.setLocationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LocationUri", targetDepth)) {
                    context.nextToken();
                    describeLocationObjectStorageResult.setLocationUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccessKey", targetDepth)) {
                    context.nextToken();
                    describeLocationObjectStorageResult.setAccessKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerPort", targetDepth)) {
                    context.nextToken();
                    describeLocationObjectStorageResult.setServerPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ServerProtocol", targetDepth)) {
                    context.nextToken();
                    describeLocationObjectStorageResult.setServerProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AgentArns", targetDepth)) {
                    context.nextToken();
                    describeLocationObjectStorageResult.setAgentArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeLocationObjectStorageResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeLocationObjectStorageResult;
    }

    private static DescribeLocationObjectStorageResultJsonUnmarshaller instance;

    public static DescribeLocationObjectStorageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeLocationObjectStorageResultJsonUnmarshaller();
        return instance;
    }
}
