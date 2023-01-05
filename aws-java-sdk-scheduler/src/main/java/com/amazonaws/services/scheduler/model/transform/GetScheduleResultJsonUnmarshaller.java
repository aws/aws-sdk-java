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
package com.amazonaws.services.scheduler.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.scheduler.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetScheduleResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetScheduleResultJsonUnmarshaller implements Unmarshaller<GetScheduleResult, JsonUnmarshallerContext> {

    public GetScheduleResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetScheduleResult getScheduleResult = new GetScheduleResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getScheduleResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    getScheduleResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    getScheduleResult.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getScheduleResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndDate", targetDepth)) {
                    context.nextToken();
                    getScheduleResult.setEndDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FlexibleTimeWindow", targetDepth)) {
                    context.nextToken();
                    getScheduleResult.setFlexibleTimeWindow(FlexibleTimeWindowJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GroupName", targetDepth)) {
                    context.nextToken();
                    getScheduleResult.setGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyArn", targetDepth)) {
                    context.nextToken();
                    getScheduleResult.setKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModificationDate", targetDepth)) {
                    context.nextToken();
                    getScheduleResult.setLastModificationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getScheduleResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleExpression", targetDepth)) {
                    context.nextToken();
                    getScheduleResult.setScheduleExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleExpressionTimezone", targetDepth)) {
                    context.nextToken();
                    getScheduleResult.setScheduleExpressionTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartDate", targetDepth)) {
                    context.nextToken();
                    getScheduleResult.setStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    getScheduleResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Target", targetDepth)) {
                    context.nextToken();
                    getScheduleResult.setTarget(TargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getScheduleResult;
    }

    private static GetScheduleResultJsonUnmarshaller instance;

    public static GetScheduleResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetScheduleResultJsonUnmarshaller();
        return instance;
    }
}
