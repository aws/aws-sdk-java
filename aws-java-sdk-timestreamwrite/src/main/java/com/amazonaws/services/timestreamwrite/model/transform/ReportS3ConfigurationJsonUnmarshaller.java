/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamwrite.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.timestreamwrite.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReportS3Configuration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportS3ConfigurationJsonUnmarshaller implements Unmarshaller<ReportS3Configuration, JsonUnmarshallerContext> {

    public ReportS3Configuration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReportS3Configuration reportS3Configuration = new ReportS3Configuration();

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
                if (context.testExpression("BucketName", targetDepth)) {
                    context.nextToken();
                    reportS3Configuration.setBucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ObjectKeyPrefix", targetDepth)) {
                    context.nextToken();
                    reportS3Configuration.setObjectKeyPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionOption", targetDepth)) {
                    context.nextToken();
                    reportS3Configuration.setEncryptionOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    reportS3Configuration.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return reportS3Configuration;
    }

    private static ReportS3ConfigurationJsonUnmarshaller instance;

    public static ReportS3ConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReportS3ConfigurationJsonUnmarshaller();
        return instance;
    }
}
