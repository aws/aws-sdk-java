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
 * BackupRuleInput JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupRuleInputJsonUnmarshaller implements Unmarshaller<BackupRuleInput, JsonUnmarshallerContext> {

    public BackupRuleInput unmarshall(JsonUnmarshallerContext context) throws Exception {
        BackupRuleInput backupRuleInput = new BackupRuleInput();

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
                    backupRuleInput.setRuleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetBackupVaultName", targetDepth)) {
                    context.nextToken();
                    backupRuleInput.setTargetBackupVaultName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleExpression", targetDepth)) {
                    context.nextToken();
                    backupRuleInput.setScheduleExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartWindowMinutes", targetDepth)) {
                    context.nextToken();
                    backupRuleInput.setStartWindowMinutes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CompletionWindowMinutes", targetDepth)) {
                    context.nextToken();
                    backupRuleInput.setCompletionWindowMinutes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Lifecycle", targetDepth)) {
                    context.nextToken();
                    backupRuleInput.setLifecycle(LifecycleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RecoveryPointTags", targetDepth)) {
                    context.nextToken();
                    backupRuleInput.setRecoveryPointTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return backupRuleInput;
    }

    private static BackupRuleInputJsonUnmarshaller instance;

    public static BackupRuleInputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BackupRuleInputJsonUnmarshaller();
        return instance;
    }
}
