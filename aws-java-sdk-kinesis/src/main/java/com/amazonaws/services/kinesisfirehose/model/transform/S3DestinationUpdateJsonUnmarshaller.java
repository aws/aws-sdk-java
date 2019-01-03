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
package com.amazonaws.services.kinesisfirehose.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * S3DestinationUpdate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DestinationUpdateJsonUnmarshaller implements Unmarshaller<S3DestinationUpdate, JsonUnmarshallerContext> {

    public S3DestinationUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        S3DestinationUpdate s3DestinationUpdate = new S3DestinationUpdate();

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
                if (context.testExpression("RoleARN", targetDepth)) {
                    context.nextToken();
                    s3DestinationUpdate.setRoleARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BucketARN", targetDepth)) {
                    context.nextToken();
                    s3DestinationUpdate.setBucketARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Prefix", targetDepth)) {
                    context.nextToken();
                    s3DestinationUpdate.setPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorOutputPrefix", targetDepth)) {
                    context.nextToken();
                    s3DestinationUpdate.setErrorOutputPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BufferingHints", targetDepth)) {
                    context.nextToken();
                    s3DestinationUpdate.setBufferingHints(BufferingHintsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CompressionFormat", targetDepth)) {
                    context.nextToken();
                    s3DestinationUpdate.setCompressionFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionConfiguration", targetDepth)) {
                    context.nextToken();
                    s3DestinationUpdate.setEncryptionConfiguration(EncryptionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudWatchLoggingOptions", targetDepth)) {
                    context.nextToken();
                    s3DestinationUpdate.setCloudWatchLoggingOptions(CloudWatchLoggingOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return s3DestinationUpdate;
    }

    private static S3DestinationUpdateJsonUnmarshaller instance;

    public static S3DestinationUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3DestinationUpdateJsonUnmarshaller();
        return instance;
    }
}
