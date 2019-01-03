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
package com.amazonaws.services.apigateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Stage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StageJsonUnmarshaller implements Unmarshaller<Stage, JsonUnmarshallerContext> {

    public Stage unmarshall(JsonUnmarshallerContext context) throws Exception {
        Stage stage = new Stage();

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
                if (context.testExpression("deploymentId", targetDepth)) {
                    context.nextToken();
                    stage.setDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientCertificateId", targetDepth)) {
                    context.nextToken();
                    stage.setClientCertificateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stageName", targetDepth)) {
                    context.nextToken();
                    stage.setStageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    stage.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cacheClusterEnabled", targetDepth)) {
                    context.nextToken();
                    stage.setCacheClusterEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("cacheClusterSize", targetDepth)) {
                    context.nextToken();
                    stage.setCacheClusterSize(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cacheClusterStatus", targetDepth)) {
                    context.nextToken();
                    stage.setCacheClusterStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("methodSettings", targetDepth)) {
                    context.nextToken();
                    stage.setMethodSettings(new MapUnmarshaller<String, MethodSetting>(context.getUnmarshaller(String.class), MethodSettingJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("variables", targetDepth)) {
                    context.nextToken();
                    stage.setVariables(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("documentationVersion", targetDepth)) {
                    context.nextToken();
                    stage.setDocumentationVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("accessLogSettings", targetDepth)) {
                    context.nextToken();
                    stage.setAccessLogSettings(AccessLogSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("canarySettings", targetDepth)) {
                    context.nextToken();
                    stage.setCanarySettings(CanarySettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tracingEnabled", targetDepth)) {
                    context.nextToken();
                    stage.setTracingEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("webAclArn", targetDepth)) {
                    context.nextToken();
                    stage.setWebAclArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    stage.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    context.nextToken();
                    stage.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDate", targetDepth)) {
                    context.nextToken();
                    stage.setLastUpdatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return stage;
    }

    private static StageJsonUnmarshaller instance;

    public static StageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StageJsonUnmarshaller();
        return instance;
    }
}
