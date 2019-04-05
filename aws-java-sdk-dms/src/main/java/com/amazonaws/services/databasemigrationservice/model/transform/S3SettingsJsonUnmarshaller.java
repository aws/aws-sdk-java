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
 * S3Settings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3SettingsJsonUnmarshaller implements Unmarshaller<S3Settings, JsonUnmarshallerContext> {

    public S3Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        S3Settings s3Settings = new S3Settings();

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
                if (context.testExpression("ServiceAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    s3Settings.setServiceAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExternalTableDefinition", targetDepth)) {
                    context.nextToken();
                    s3Settings.setExternalTableDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CsvRowDelimiter", targetDepth)) {
                    context.nextToken();
                    s3Settings.setCsvRowDelimiter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CsvDelimiter", targetDepth)) {
                    context.nextToken();
                    s3Settings.setCsvDelimiter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BucketFolder", targetDepth)) {
                    context.nextToken();
                    s3Settings.setBucketFolder(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BucketName", targetDepth)) {
                    context.nextToken();
                    s3Settings.setBucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompressionType", targetDepth)) {
                    context.nextToken();
                    s3Settings.setCompressionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionMode", targetDepth)) {
                    context.nextToken();
                    s3Settings.setEncryptionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerSideEncryptionKmsKeyId", targetDepth)) {
                    context.nextToken();
                    s3Settings.setServerSideEncryptionKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataFormat", targetDepth)) {
                    context.nextToken();
                    s3Settings.setDataFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncodingType", targetDepth)) {
                    context.nextToken();
                    s3Settings.setEncodingType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DictPageSizeLimit", targetDepth)) {
                    context.nextToken();
                    s3Settings.setDictPageSizeLimit(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RowGroupLength", targetDepth)) {
                    context.nextToken();
                    s3Settings.setRowGroupLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DataPageSize", targetDepth)) {
                    context.nextToken();
                    s3Settings.setDataPageSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ParquetVersion", targetDepth)) {
                    context.nextToken();
                    s3Settings.setParquetVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnableStatistics", targetDepth)) {
                    context.nextToken();
                    s3Settings.setEnableStatistics(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CdcInsertsOnly", targetDepth)) {
                    context.nextToken();
                    s3Settings.setCdcInsertsOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return s3Settings;
    }

    private static S3SettingsJsonUnmarshaller instance;

    public static S3SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3SettingsJsonUnmarshaller();
        return instance;
    }
}
