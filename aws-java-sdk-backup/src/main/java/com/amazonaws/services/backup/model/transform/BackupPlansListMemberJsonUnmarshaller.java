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
 * BackupPlansListMember JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupPlansListMemberJsonUnmarshaller implements Unmarshaller<BackupPlansListMember, JsonUnmarshallerContext> {

    public BackupPlansListMember unmarshall(JsonUnmarshallerContext context) throws Exception {
        BackupPlansListMember backupPlansListMember = new BackupPlansListMember();

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
                if (context.testExpression("BackupPlanArn", targetDepth)) {
                    context.nextToken();
                    backupPlansListMember.setBackupPlanArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupPlanId", targetDepth)) {
                    context.nextToken();
                    backupPlansListMember.setBackupPlanId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    backupPlansListMember.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DeletionDate", targetDepth)) {
                    context.nextToken();
                    backupPlansListMember.setDeletionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("VersionId", targetDepth)) {
                    context.nextToken();
                    backupPlansListMember.setVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupPlanName", targetDepth)) {
                    context.nextToken();
                    backupPlansListMember.setBackupPlanName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatorRequestId", targetDepth)) {
                    context.nextToken();
                    backupPlansListMember.setCreatorRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastExecutionDate", targetDepth)) {
                    context.nextToken();
                    backupPlansListMember.setLastExecutionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return backupPlansListMember;
    }

    private static BackupPlansListMemberJsonUnmarshaller instance;

    public static BackupPlansListMemberJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BackupPlansListMemberJsonUnmarshaller();
        return instance;
    }
}
