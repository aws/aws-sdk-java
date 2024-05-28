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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StartDeleteMonitorDeploymentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDeleteMonitorDeploymentResultJsonUnmarshaller implements Unmarshaller<StartDeleteMonitorDeploymentResult, JsonUnmarshallerContext> {

    public StartDeleteMonitorDeploymentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartDeleteMonitorDeploymentResult startDeleteMonitorDeploymentResult = new StartDeleteMonitorDeploymentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return startDeleteMonitorDeploymentResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cloudWatchAlarmTemplateGroupIds", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setCloudWatchAlarmTemplateGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("discoveryEntryPointArn", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setDiscoveryEntryPointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventBridgeRuleTemplateGroupIds", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setEventBridgeRuleTemplateGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("failedMediaResourceMap", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setFailedMediaResourceMap(new MapUnmarshaller<String, MediaResource>(context
                            .getUnmarshaller(String.class), MediaResourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastDiscoveredAt", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setLastDiscoveredAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("lastSuccessfulMonitorDeployment", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setLastSuccessfulMonitorDeployment(SuccessfulMonitorDeploymentJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("mediaResourceMap", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setMediaResourceMap(new MapUnmarshaller<String, MediaResource>(context.getUnmarshaller(String.class),
                            MediaResourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("modifiedAt", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setModifiedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("monitorChangesPendingDeployment", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setMonitorChangesPendingDeployment(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("monitorDeployment", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setMonitorDeployment(MonitorDeploymentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    startDeleteMonitorDeploymentResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return startDeleteMonitorDeploymentResult;
    }

    private static StartDeleteMonitorDeploymentResultJsonUnmarshaller instance;

    public static StartDeleteMonitorDeploymentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartDeleteMonitorDeploymentResultJsonUnmarshaller();
        return instance;
    }
}
