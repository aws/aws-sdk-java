/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backup.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.backup.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RestoreTestingPlanForGet JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTestingPlanForGetJsonUnmarshaller implements Unmarshaller<RestoreTestingPlanForGet, JsonUnmarshallerContext> {

    public RestoreTestingPlanForGet unmarshall(JsonUnmarshallerContext context) throws Exception {
        RestoreTestingPlanForGet restoreTestingPlanForGet = new RestoreTestingPlanForGet();

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
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    restoreTestingPlanForGet.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatorRequestId", targetDepth)) {
                    context.nextToken();
                    restoreTestingPlanForGet.setCreatorRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastExecutionTime", targetDepth)) {
                    context.nextToken();
                    restoreTestingPlanForGet.setLastExecutionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdateTime", targetDepth)) {
                    context.nextToken();
                    restoreTestingPlanForGet.setLastUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RecoveryPointSelection", targetDepth)) {
                    context.nextToken();
                    restoreTestingPlanForGet.setRecoveryPointSelection(RestoreTestingRecoveryPointSelectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RestoreTestingPlanArn", targetDepth)) {
                    context.nextToken();
                    restoreTestingPlanForGet.setRestoreTestingPlanArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RestoreTestingPlanName", targetDepth)) {
                    context.nextToken();
                    restoreTestingPlanForGet.setRestoreTestingPlanName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleExpression", targetDepth)) {
                    context.nextToken();
                    restoreTestingPlanForGet.setScheduleExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleExpressionTimezone", targetDepth)) {
                    context.nextToken();
                    restoreTestingPlanForGet.setScheduleExpressionTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartWindowHours", targetDepth)) {
                    context.nextToken();
                    restoreTestingPlanForGet.setStartWindowHours(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return restoreTestingPlanForGet;
    }

    private static RestoreTestingPlanForGetJsonUnmarshaller instance;

    public static RestoreTestingPlanForGetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RestoreTestingPlanForGetJsonUnmarshaller();
        return instance;
    }
}
