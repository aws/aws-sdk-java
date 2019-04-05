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
package com.amazonaws.services.apigateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateUsagePlanResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUsagePlanResultJsonUnmarshaller implements Unmarshaller<UpdateUsagePlanResult, JsonUnmarshallerContext> {

    public UpdateUsagePlanResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateUsagePlanResult updateUsagePlanResult = new UpdateUsagePlanResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateUsagePlanResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    updateUsagePlanResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    updateUsagePlanResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    updateUsagePlanResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("apiStages", targetDepth)) {
                    context.nextToken();
                    updateUsagePlanResult.setApiStages(new ListUnmarshaller<ApiStage>(ApiStageJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("throttle", targetDepth)) {
                    context.nextToken();
                    updateUsagePlanResult.setThrottle(ThrottleSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("quota", targetDepth)) {
                    context.nextToken();
                    updateUsagePlanResult.setQuota(QuotaSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("productCode", targetDepth)) {
                    context.nextToken();
                    updateUsagePlanResult.setProductCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateUsagePlanResult;
    }

    private static UpdateUsagePlanResultJsonUnmarshaller instance;

    public static UpdateUsagePlanResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateUsagePlanResultJsonUnmarshaller();
        return instance;
    }
}
