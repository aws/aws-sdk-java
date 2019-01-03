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
 * SplunkDestinationUpdate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SplunkDestinationUpdateJsonUnmarshaller implements Unmarshaller<SplunkDestinationUpdate, JsonUnmarshallerContext> {

    public SplunkDestinationUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        SplunkDestinationUpdate splunkDestinationUpdate = new SplunkDestinationUpdate();

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
                if (context.testExpression("HECEndpoint", targetDepth)) {
                    context.nextToken();
                    splunkDestinationUpdate.setHECEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HECEndpointType", targetDepth)) {
                    context.nextToken();
                    splunkDestinationUpdate.setHECEndpointType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HECToken", targetDepth)) {
                    context.nextToken();
                    splunkDestinationUpdate.setHECToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HECAcknowledgmentTimeoutInSeconds", targetDepth)) {
                    context.nextToken();
                    splunkDestinationUpdate.setHECAcknowledgmentTimeoutInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RetryOptions", targetDepth)) {
                    context.nextToken();
                    splunkDestinationUpdate.setRetryOptions(SplunkRetryOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3BackupMode", targetDepth)) {
                    context.nextToken();
                    splunkDestinationUpdate.setS3BackupMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Update", targetDepth)) {
                    context.nextToken();
                    splunkDestinationUpdate.setS3Update(S3DestinationUpdateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProcessingConfiguration", targetDepth)) {
                    context.nextToken();
                    splunkDestinationUpdate.setProcessingConfiguration(ProcessingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudWatchLoggingOptions", targetDepth)) {
                    context.nextToken();
                    splunkDestinationUpdate.setCloudWatchLoggingOptions(CloudWatchLoggingOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return splunkDestinationUpdate;
    }

    private static SplunkDestinationUpdateJsonUnmarshaller instance;

    public static SplunkDestinationUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SplunkDestinationUpdateJsonUnmarshaller();
        return instance;
    }
}
