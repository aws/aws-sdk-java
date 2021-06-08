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
 * AwsApiGatewayStageDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiGatewayStageDetailsJsonUnmarshaller implements Unmarshaller<AwsApiGatewayStageDetails, JsonUnmarshallerContext> {

    public AwsApiGatewayStageDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsApiGatewayStageDetails awsApiGatewayStageDetails = new AwsApiGatewayStageDetails();

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
                if (context.testExpression("DeploymentId", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientCertificateId", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setClientCertificateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StageName", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setStageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CacheClusterEnabled", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setCacheClusterEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CacheClusterSize", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setCacheClusterSize(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CacheClusterStatus", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setCacheClusterStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MethodSettings", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setMethodSettings(new ListUnmarshaller<AwsApiGatewayMethodSettings>(AwsApiGatewayMethodSettingsJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Variables", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setVariables(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("DocumentationVersion", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setDocumentationVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccessLogSettings", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setAccessLogSettings(AwsApiGatewayAccessLogSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CanarySettings", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setCanarySettings(AwsApiGatewayCanarySettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TracingEnabled", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setTracingEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setCreatedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdatedDate", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setLastUpdatedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WebAclArn", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayStageDetails.setWebAclArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsApiGatewayStageDetails;
    }

    private static AwsApiGatewayStageDetailsJsonUnmarshaller instance;

    public static AwsApiGatewayStageDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsApiGatewayStageDetailsJsonUnmarshaller();
        return instance;
    }
}
