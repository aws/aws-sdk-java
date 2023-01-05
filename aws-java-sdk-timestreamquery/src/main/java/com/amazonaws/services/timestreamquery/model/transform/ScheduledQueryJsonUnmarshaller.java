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
package com.amazonaws.services.timestreamquery.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.timestreamquery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ScheduledQuery JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledQueryJsonUnmarshaller implements Unmarshaller<ScheduledQuery, JsonUnmarshallerContext> {

    public ScheduledQuery unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScheduledQuery scheduledQuery = new ScheduledQuery();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    scheduledQuery.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    scheduledQuery.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    scheduledQuery.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    scheduledQuery.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreviousInvocationTime", targetDepth)) {
                    context.nextToken();
                    scheduledQuery.setPreviousInvocationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("NextInvocationTime", targetDepth)) {
                    context.nextToken();
                    scheduledQuery.setNextInvocationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ErrorReportConfiguration", targetDepth)) {
                    context.nextToken();
                    scheduledQuery.setErrorReportConfiguration(ErrorReportConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TargetDestination", targetDepth)) {
                    context.nextToken();
                    scheduledQuery.setTargetDestination(TargetDestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastRunStatus", targetDepth)) {
                    context.nextToken();
                    scheduledQuery.setLastRunStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scheduledQuery;
    }

    private static ScheduledQueryJsonUnmarshaller instance;

    public static ScheduledQueryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledQueryJsonUnmarshaller();
        return instance;
    }
}
