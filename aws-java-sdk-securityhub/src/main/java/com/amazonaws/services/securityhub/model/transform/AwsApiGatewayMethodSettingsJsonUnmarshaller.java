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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsApiGatewayMethodSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiGatewayMethodSettingsJsonUnmarshaller implements Unmarshaller<AwsApiGatewayMethodSettings, JsonUnmarshallerContext> {

    public AwsApiGatewayMethodSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsApiGatewayMethodSettings awsApiGatewayMethodSettings = new AwsApiGatewayMethodSettings();

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
                if (context.testExpression("MetricsEnabled", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayMethodSettings.setMetricsEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LoggingLevel", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayMethodSettings.setLoggingLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataTraceEnabled", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayMethodSettings.setDataTraceEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ThrottlingBurstLimit", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayMethodSettings.setThrottlingBurstLimit(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ThrottlingRateLimit", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayMethodSettings.setThrottlingRateLimit(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("CachingEnabled", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayMethodSettings.setCachingEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CacheTtlInSeconds", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayMethodSettings.setCacheTtlInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CacheDataEncrypted", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayMethodSettings.setCacheDataEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RequireAuthorizationForCacheControl", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayMethodSettings.setRequireAuthorizationForCacheControl(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UnauthorizedCacheControlHeaderStrategy", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayMethodSettings.setUnauthorizedCacheControlHeaderStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HttpMethod", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayMethodSettings.setHttpMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourcePath", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayMethodSettings.setResourcePath(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsApiGatewayMethodSettings;
    }

    private static AwsApiGatewayMethodSettingsJsonUnmarshaller instance;

    public static AwsApiGatewayMethodSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsApiGatewayMethodSettingsJsonUnmarshaller();
        return instance;
    }
}
