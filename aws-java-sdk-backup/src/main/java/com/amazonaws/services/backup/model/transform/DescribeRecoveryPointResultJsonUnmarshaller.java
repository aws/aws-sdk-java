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
 * DescribeRecoveryPointResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRecoveryPointResultJsonUnmarshaller implements Unmarshaller<DescribeRecoveryPointResult, JsonUnmarshallerContext> {

    public DescribeRecoveryPointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeRecoveryPointResult describeRecoveryPointResult = new DescribeRecoveryPointResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeRecoveryPointResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("RecoveryPointArn", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setRecoveryPointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupVaultName", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setBackupVaultName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupVaultArn", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setBackupVaultArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setCreatedBy(RecoveryPointCreatorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionDate", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setCompletionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("BackupSizeInBytes", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setBackupSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CalculatedLifecycle", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setCalculatedLifecycle(CalculatedLifecycleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Lifecycle", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setLifecycle(LifecycleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EncryptionKeyArn", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setEncryptionKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsEncrypted", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setIsEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("StorageClass", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setStorageClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastRestoreTime", targetDepth)) {
                    context.nextToken();
                    describeRecoveryPointResult.setLastRestoreTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeRecoveryPointResult;
    }

    private static DescribeRecoveryPointResultJsonUnmarshaller instance;

    public static DescribeRecoveryPointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeRecoveryPointResultJsonUnmarshaller();
        return instance;
    }
}
