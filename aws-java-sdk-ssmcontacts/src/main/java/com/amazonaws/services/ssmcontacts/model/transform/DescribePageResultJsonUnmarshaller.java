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
 * DescribePageResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePageResultJsonUnmarshaller implements Unmarshaller<DescribePageResult, JsonUnmarshallerContext> {

    public DescribePageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePageResult describePageResult = new DescribePageResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describePageResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("PageArn", targetDepth)) {
                    context.nextToken();
                    describePageResult.setPageArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngagementArn", targetDepth)) {
                    context.nextToken();
                    describePageResult.setEngagementArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContactArn", targetDepth)) {
                    context.nextToken();
                    describePageResult.setContactArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Sender", targetDepth)) {
                    context.nextToken();
                    describePageResult.setSender(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Subject", targetDepth)) {
                    context.nextToken();
                    describePageResult.setSubject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    describePageResult.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublicSubject", targetDepth)) {
                    context.nextToken();
                    describePageResult.setPublicSubject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublicContent", targetDepth)) {
                    context.nextToken();
                    describePageResult.setPublicContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IncidentId", targetDepth)) {
                    context.nextToken();
                    describePageResult.setIncidentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SentTime", targetDepth)) {
                    context.nextToken();
                    describePageResult.setSentTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ReadTime", targetDepth)) {
                    context.nextToken();
                    describePageResult.setReadTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DeliveryTime", targetDepth)) {
                    context.nextToken();
                    describePageResult.setDeliveryTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describePageResult;
    }

    private static DescribePageResultJsonUnmarshaller instance;

    public static DescribePageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePageResultJsonUnmarshaller();
        return instance;
    }
}
