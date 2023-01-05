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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsBackupRecoveryPointDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsBackupRecoveryPointDetailsJsonUnmarshaller implements Unmarshaller<AwsBackupRecoveryPointDetails, JsonUnmarshallerContext> {

    public AwsBackupRecoveryPointDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsBackupRecoveryPointDetails awsBackupRecoveryPointDetails = new AwsBackupRecoveryPointDetails();

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
                if (context.testExpression("BackupSizeInBytes", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setBackupSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("BackupVaultArn", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setBackupVaultArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupVaultName", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setBackupVaultName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CalculatedLifecycle", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setCalculatedLifecycle(AwsBackupRecoveryPointCalculatedLifecycleDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("CompletionDate", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setCompletionDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setCreatedBy(AwsBackupRecoveryPointCreatedByDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionKeyArn", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setEncryptionKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsEncrypted", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setIsEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LastRestoreTime", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setLastRestoreTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Lifecycle", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setLifecycle(AwsBackupRecoveryPointLifecycleDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RecoveryPointArn", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setRecoveryPointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceBackupVaultArn", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setSourceBackupVaultArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageClass", targetDepth)) {
                    context.nextToken();
                    awsBackupRecoveryPointDetails.setStorageClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsBackupRecoveryPointDetails;
    }

    private static AwsBackupRecoveryPointDetailsJsonUnmarshaller instance;

    public static AwsBackupRecoveryPointDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsBackupRecoveryPointDetailsJsonUnmarshaller();
        return instance;
    }
}
