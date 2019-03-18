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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RedshiftSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftSettingsJsonUnmarshaller implements Unmarshaller<RedshiftSettings, JsonUnmarshallerContext> {

    public RedshiftSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        RedshiftSettings redshiftSettings = new RedshiftSettings();

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
                if (context.testExpression("AcceptAnyDate", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setAcceptAnyDate(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AfterConnectScript", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setAfterConnectScript(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BucketFolder", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setBucketFolder(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BucketName", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setBucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConnectionTimeout", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setConnectionTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DateFormat", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setDateFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EmptyAsNull", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setEmptyAsNull(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionMode", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setEncryptionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileTransferUploadStreams", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setFileTransferUploadStreams(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("LoadTimeout", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setLoadTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxFileSize", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setMaxFileSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Password", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RemoveQuotes", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setRemoveQuotes(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ReplaceInvalidChars", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setReplaceInvalidChars(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplaceChars", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setReplaceChars(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setServiceAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerSideEncryptionKmsKeyId", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setServerSideEncryptionKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimeFormat", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setTimeFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrimBlanks", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setTrimBlanks(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TruncateColumns", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setTruncateColumns(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WriteBufferSize", targetDepth)) {
                    context.nextToken();
                    redshiftSettings.setWriteBufferSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return redshiftSettings;
    }

    private static RedshiftSettingsJsonUnmarshaller instance;

    public static RedshiftSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftSettingsJsonUnmarshaller();
        return instance;
    }
}
