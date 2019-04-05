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
package com.amazonaws.services.backup.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.backup.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BackupRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupRuleJsonUnmarshaller implements Unmarshaller<BackupRule, JsonUnmarshallerContext> {

    public BackupRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        BackupRule backupRule = new BackupRule();

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
                if (context.testExpression("RuleName", targetDepth)) {
                    context.nextToken();
                    backupRule.setRuleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetBackupVaultName", targetDepth)) {
                    context.nextToken();
                    backupRule.setTargetBackupVaultName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleExpression", targetDepth)) {
                    context.nextToken();
                    backupRule.setScheduleExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartWindowMinutes", targetDepth)) {
                    context.nextToken();
                    backupRule.setStartWindowMinutes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CompletionWindowMinutes", targetDepth)) {
                    context.nextToken();
                    backupRule.setCompletionWindowMinutes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Lifecycle", targetDepth)) {
                    context.nextToken();
                    backupRule.setLifecycle(LifecycleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RecoveryPointTags", targetDepth)) {
                    context.nextToken();
                    backupRule.setRecoveryPointTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("RuleId", targetDepth)) {
                    context.nextToken();
                    backupRule.setRuleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return backupRule;
    }

    private static BackupRuleJsonUnmarshaller instance;

    public static BackupRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BackupRuleJsonUnmarshaller();
        return instance;
    }
}
