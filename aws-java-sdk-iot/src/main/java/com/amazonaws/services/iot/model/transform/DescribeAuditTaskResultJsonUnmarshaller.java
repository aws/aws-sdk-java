/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeAuditTaskResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAuditTaskResultJsonUnmarshaller implements Unmarshaller<DescribeAuditTaskResult, JsonUnmarshallerContext> {

    public DescribeAuditTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAuditTaskResult describeAuditTaskResult = new DescribeAuditTaskResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAuditTaskResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("taskStatus", targetDepth)) {
                    context.nextToken();
                    describeAuditTaskResult.setTaskStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskType", targetDepth)) {
                    context.nextToken();
                    describeAuditTaskResult.setTaskType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskStartTime", targetDepth)) {
                    context.nextToken();
                    describeAuditTaskResult.setTaskStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("taskStatistics", targetDepth)) {
                    context.nextToken();
                    describeAuditTaskResult.setTaskStatistics(TaskStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("scheduledAuditName", targetDepth)) {
                    context.nextToken();
                    describeAuditTaskResult.setScheduledAuditName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("auditDetails", targetDepth)) {
                    context.nextToken();
                    describeAuditTaskResult.setAuditDetails(new MapUnmarshaller<String, AuditCheckDetails>(context.getUnmarshaller(String.class),
                            AuditCheckDetailsJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeAuditTaskResult;
    }

    private static DescribeAuditTaskResultJsonUnmarshaller instance;

    public static DescribeAuditTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAuditTaskResultJsonUnmarshaller();
        return instance;
    }
}
