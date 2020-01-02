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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeAuditMitigationActionsTaskResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAuditMitigationActionsTaskResultJsonUnmarshaller implements
        Unmarshaller<DescribeAuditMitigationActionsTaskResult, JsonUnmarshallerContext> {

    public DescribeAuditMitigationActionsTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAuditMitigationActionsTaskResult describeAuditMitigationActionsTaskResult = new DescribeAuditMitigationActionsTaskResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAuditMitigationActionsTaskResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("taskStatus", targetDepth)) {
                    context.nextToken();
                    describeAuditMitigationActionsTaskResult.setTaskStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    describeAuditMitigationActionsTaskResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    describeAuditMitigationActionsTaskResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("taskStatistics", targetDepth)) {
                    context.nextToken();
                    describeAuditMitigationActionsTaskResult.setTaskStatistics(new MapUnmarshaller<String, TaskStatisticsForAuditCheck>(context
                            .getUnmarshaller(String.class), TaskStatisticsForAuditCheckJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("target", targetDepth)) {
                    context.nextToken();
                    describeAuditMitigationActionsTaskResult.setTarget(AuditMitigationActionsTaskTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("auditCheckToActionsMapping", targetDepth)) {
                    context.nextToken();
                    describeAuditMitigationActionsTaskResult.setAuditCheckToActionsMapping(new MapUnmarshaller<String, java.util.List<String>>(context
                            .getUnmarshaller(String.class), new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("actionsDefinition", targetDepth)) {
                    context.nextToken();
                    describeAuditMitigationActionsTaskResult.setActionsDefinition(new ListUnmarshaller<MitigationAction>(MitigationActionJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeAuditMitigationActionsTaskResult;
    }

    private static DescribeAuditMitigationActionsTaskResultJsonUnmarshaller instance;

    public static DescribeAuditMitigationActionsTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAuditMitigationActionsTaskResultJsonUnmarshaller();
        return instance;
    }
}
