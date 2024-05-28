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
 * StartUpdateSignalMapResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartUpdateSignalMapResultJsonUnmarshaller implements Unmarshaller<StartUpdateSignalMapResult, JsonUnmarshallerContext> {

    public StartUpdateSignalMapResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartUpdateSignalMapResult startUpdateSignalMapResult = new StartUpdateSignalMapResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return startUpdateSignalMapResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cloudWatchAlarmTemplateGroupIds", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setCloudWatchAlarmTemplateGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("discoveryEntryPointArn", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setDiscoveryEntryPointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventBridgeRuleTemplateGroupIds", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setEventBridgeRuleTemplateGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("failedMediaResourceMap", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setFailedMediaResourceMap(new MapUnmarshaller<String, MediaResource>(context.getUnmarshaller(String.class),
                            MediaResourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastDiscoveredAt", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setLastDiscoveredAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("lastSuccessfulMonitorDeployment", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult
                            .setLastSuccessfulMonitorDeployment(SuccessfulMonitorDeploymentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mediaResourceMap", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setMediaResourceMap(new MapUnmarshaller<String, MediaResource>(context.getUnmarshaller(String.class),
                            MediaResourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("modifiedAt", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setModifiedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("monitorChangesPendingDeployment", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setMonitorChangesPendingDeployment(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("monitorDeployment", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setMonitorDeployment(MonitorDeploymentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    startUpdateSignalMapResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return startUpdateSignalMapResult;
    }

    private static StartUpdateSignalMapResultJsonUnmarshaller instance;

    public static StartUpdateSignalMapResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartUpdateSignalMapResultJsonUnmarshaller();
        return instance;
    }
}
