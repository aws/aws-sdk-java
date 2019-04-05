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
 * RedshiftDestinationUpdate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftDestinationUpdateJsonUnmarshaller implements Unmarshaller<RedshiftDestinationUpdate, JsonUnmarshallerContext> {

    public RedshiftDestinationUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        RedshiftDestinationUpdate redshiftDestinationUpdate = new RedshiftDestinationUpdate();

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
                    redshiftDestinationUpdate.setRoleARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterJDBCURL", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationUpdate.setClusterJDBCURL(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CopyCommand", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationUpdate.setCopyCommand(CopyCommandJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationUpdate.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Password", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationUpdate.setPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetryOptions", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationUpdate.setRetryOptions(RedshiftRetryOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3Update", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationUpdate.setS3Update(S3DestinationUpdateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProcessingConfiguration", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationUpdate.setProcessingConfiguration(ProcessingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3BackupMode", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationUpdate.setS3BackupMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3BackupUpdate", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationUpdate.setS3BackupUpdate(S3DestinationUpdateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudWatchLoggingOptions", targetDepth)) {
                    context.nextToken();
                    redshiftDestinationUpdate.setCloudWatchLoggingOptions(CloudWatchLoggingOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return redshiftDestinationUpdate;
    }

    private static RedshiftDestinationUpdateJsonUnmarshaller instance;

    public static RedshiftDestinationUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftDestinationUpdateJsonUnmarshaller();
        return instance;
    }
}
