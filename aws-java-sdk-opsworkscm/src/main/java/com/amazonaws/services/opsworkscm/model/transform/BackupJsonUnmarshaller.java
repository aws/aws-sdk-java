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
package com.amazonaws.services.opsworkscm.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opsworkscm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Backup JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupJsonUnmarshaller implements Unmarshaller<Backup, JsonUnmarshallerContext> {

    public Backup unmarshall(JsonUnmarshallerContext context) throws Exception {
        Backup backup = new Backup();

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
                if (context.testExpression("BackupArn", targetDepth)) {
                    context.nextToken();
                    backup.setBackupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupId", targetDepth)) {
                    context.nextToken();
                    backup.setBackupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupType", targetDepth)) {
                    context.nextToken();
                    backup.setBackupType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    backup.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    backup.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Engine", targetDepth)) {
                    context.nextToken();
                    backup.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineModel", targetDepth)) {
                    context.nextToken();
                    backup.setEngineModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    backup.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceProfileArn", targetDepth)) {
                    context.nextToken();
                    backup.setInstanceProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    backup.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyPair", targetDepth)) {
                    context.nextToken();
                    backup.setKeyPair(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreferredBackupWindow", targetDepth)) {
                    context.nextToken();
                    backup.setPreferredBackupWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    context.nextToken();
                    backup.setPreferredMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3DataSize", targetDepth)) {
                    context.nextToken();
                    backup.setS3DataSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("S3DataUrl", targetDepth)) {
                    context.nextToken();
                    backup.setS3DataUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3LogUrl", targetDepth)) {
                    context.nextToken();
                    backup.setS3LogUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroupIds", targetDepth)) {
                    context.nextToken();
                    backup.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    context.nextToken();
                    backup.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceRoleArn", targetDepth)) {
                    context.nextToken();
                    backup.setServiceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    backup.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDescription", targetDepth)) {
                    context.nextToken();
                    backup.setStatusDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetIds", targetDepth)) {
                    context.nextToken();
                    backup.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ToolsVersion", targetDepth)) {
                    context.nextToken();
                    backup.setToolsVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserArn", targetDepth)) {
                    context.nextToken();
                    backup.setUserArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return backup;
    }

    private static BackupJsonUnmarshaller instance;

    public static BackupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BackupJsonUnmarshaller();
        return instance;
    }
}
