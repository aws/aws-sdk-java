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
 * AwsApiGatewayV2StageDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiGatewayV2StageDetailsJsonUnmarshaller implements Unmarshaller<AwsApiGatewayV2StageDetails, JsonUnmarshallerContext> {

    public AwsApiGatewayV2StageDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsApiGatewayV2StageDetails awsApiGatewayV2StageDetails = new AwsApiGatewayV2StageDetails();

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
                if (context.testExpression("ClientCertificateId", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayV2StageDetails.setClientCertificateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayV2StageDetails.setCreatedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayV2StageDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultRouteSettings", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayV2StageDetails.setDefaultRouteSettings(AwsApiGatewayV2RouteSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeploymentId", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayV2StageDetails.setDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdatedDate", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayV2StageDetails.setLastUpdatedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RouteSettings", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayV2StageDetails.setRouteSettings(AwsApiGatewayV2RouteSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StageName", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayV2StageDetails.setStageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StageVariables", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayV2StageDetails.setStageVariables(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("AccessLogSettings", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayV2StageDetails.setAccessLogSettings(AwsApiGatewayAccessLogSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AutoDeploy", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayV2StageDetails.setAutoDeploy(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LastDeploymentStatusMessage", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayV2StageDetails.setLastDeploymentStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApiGatewayManaged", targetDepth)) {
                    context.nextToken();
                    awsApiGatewayV2StageDetails.setApiGatewayManaged(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsApiGatewayV2StageDetails;
    }

    private static AwsApiGatewayV2StageDetailsJsonUnmarshaller instance;

    public static AwsApiGatewayV2StageDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsApiGatewayV2StageDetailsJsonUnmarshaller();
        return instance;
    }
}
