/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsCloudFrontDistributionLogging JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFrontDistributionLoggingJsonUnmarshaller implements Unmarshaller<AwsCloudFrontDistributionLogging, JsonUnmarshallerContext> {

    public AwsCloudFrontDistributionLogging unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsCloudFrontDistributionLogging awsCloudFrontDistributionLogging = new AwsCloudFrontDistributionLogging();

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
                if (context.testExpression("Bucket", targetDepth)) {
                    context.nextToken();
                    awsCloudFrontDistributionLogging.setBucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    context.nextToken();
                    awsCloudFrontDistributionLogging.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeCookies", targetDepth)) {
                    context.nextToken();
                    awsCloudFrontDistributionLogging.setIncludeCookies(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Prefix", targetDepth)) {
                    context.nextToken();
                    awsCloudFrontDistributionLogging.setPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsCloudFrontDistributionLogging;
    }

    private static AwsCloudFrontDistributionLoggingJsonUnmarshaller instance;

    public static AwsCloudFrontDistributionLoggingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsCloudFrontDistributionLoggingJsonUnmarshaller();
        return instance;
    }
}
