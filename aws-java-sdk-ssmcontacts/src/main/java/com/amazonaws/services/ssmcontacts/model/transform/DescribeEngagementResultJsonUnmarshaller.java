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
package com.amazonaws.services.ssmcontacts.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ssmcontacts.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeEngagementResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEngagementResultJsonUnmarshaller implements Unmarshaller<DescribeEngagementResult, JsonUnmarshallerContext> {

    public DescribeEngagementResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeEngagementResult describeEngagementResult = new DescribeEngagementResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeEngagementResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ContactArn", targetDepth)) {
                    context.nextToken();
                    describeEngagementResult.setContactArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngagementArn", targetDepth)) {
                    context.nextToken();
                    describeEngagementResult.setEngagementArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Sender", targetDepth)) {
                    context.nextToken();
                    describeEngagementResult.setSender(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Subject", targetDepth)) {
                    context.nextToken();
                    describeEngagementResult.setSubject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    describeEngagementResult.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublicSubject", targetDepth)) {
                    context.nextToken();
                    describeEngagementResult.setPublicSubject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublicContent", targetDepth)) {
                    context.nextToken();
                    describeEngagementResult.setPublicContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IncidentId", targetDepth)) {
                    context.nextToken();
                    describeEngagementResult.setIncidentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    describeEngagementResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StopTime", targetDepth)) {
                    context.nextToken();
                    describeEngagementResult.setStopTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeEngagementResult;
    }

    private static DescribeEngagementResultJsonUnmarshaller instance;

    public static DescribeEngagementResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeEngagementResultJsonUnmarshaller();
        return instance;
    }
}
