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
package com.amazonaws.services.recyclebin.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.recyclebin.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UnlockRuleResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnlockRuleResultJsonUnmarshaller implements Unmarshaller<UnlockRuleResult, JsonUnmarshallerContext> {

    public UnlockRuleResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UnlockRuleResult unlockRuleResult = new UnlockRuleResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return unlockRuleResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Identifier", targetDepth)) {
                    context.nextToken();
                    unlockRuleResult.setIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    unlockRuleResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    context.nextToken();
                    unlockRuleResult.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetentionPeriod", targetDepth)) {
                    context.nextToken();
                    unlockRuleResult.setRetentionPeriod(RetentionPeriodJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceTags", targetDepth)) {
                    context.nextToken();
                    unlockRuleResult.setResourceTags(new ListUnmarshaller<ResourceTag>(ResourceTagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    unlockRuleResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LockConfiguration", targetDepth)) {
                    context.nextToken();
                    unlockRuleResult.setLockConfiguration(LockConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LockState", targetDepth)) {
                    context.nextToken();
                    unlockRuleResult.setLockState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LockEndTime", targetDepth)) {
                    context.nextToken();
                    unlockRuleResult.setLockEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return unlockRuleResult;
    }

    private static UnlockRuleResultJsonUnmarshaller instance;

    public static UnlockRuleResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UnlockRuleResultJsonUnmarshaller();
        return instance;
    }
}
