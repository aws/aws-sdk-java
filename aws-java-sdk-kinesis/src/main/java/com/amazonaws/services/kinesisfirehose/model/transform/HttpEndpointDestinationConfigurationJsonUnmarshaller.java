/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * HttpEndpointDestinationConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpEndpointDestinationConfigurationJsonUnmarshaller implements Unmarshaller<HttpEndpointDestinationConfiguration, JsonUnmarshallerContext> {

    public HttpEndpointDestinationConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        HttpEndpointDestinationConfiguration httpEndpointDestinationConfiguration = new HttpEndpointDestinationConfiguration();

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
                if (context.testExpression("EndpointConfiguration", targetDepth)) {
                    context.nextToken();
                    httpEndpointDestinationConfiguration.setEndpointConfiguration(HttpEndpointConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BufferingHints", targetDepth)) {
                    context.nextToken();
                    httpEndpointDestinationConfiguration.setBufferingHints(HttpEndpointBufferingHintsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudWatchLoggingOptions", targetDepth)) {
                    context.nextToken();
                    httpEndpointDestinationConfiguration
                            .setCloudWatchLoggingOptions(CloudWatchLoggingOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RequestConfiguration", targetDepth)) {
                    context.nextToken();
                    httpEndpointDestinationConfiguration.setRequestConfiguration(HttpEndpointRequestConfigurationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("ProcessingConfiguration", targetDepth)) {
                    context.nextToken();
                    httpEndpointDestinationConfiguration.setProcessingConfiguration(ProcessingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleARN", targetDepth)) {
                    context.nextToken();
                    httpEndpointDestinationConfiguration.setRoleARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetryOptions", targetDepth)) {
                    context.nextToken();
                    httpEndpointDestinationConfiguration.setRetryOptions(HttpEndpointRetryOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3BackupMode", targetDepth)) {
                    context.nextToken();
                    httpEndpointDestinationConfiguration.setS3BackupMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Configuration", targetDepth)) {
                    context.nextToken();
                    httpEndpointDestinationConfiguration.setS3Configuration(S3DestinationConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return httpEndpointDestinationConfiguration;
    }

    private static HttpEndpointDestinationConfigurationJsonUnmarshaller instance;

    public static HttpEndpointDestinationConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HttpEndpointDestinationConfigurationJsonUnmarshaller();
        return instance;
    }
}
