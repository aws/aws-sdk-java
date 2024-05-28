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
 * CreateSignalMapResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSignalMapResultJsonUnmarshaller implements Unmarshaller<CreateSignalMapResult, JsonUnmarshallerContext> {

    public CreateSignalMapResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateSignalMapResult createSignalMapResult = new CreateSignalMapResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createSignalMapResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cloudWatchAlarmTemplateGroupIds", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setCloudWatchAlarmTemplateGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("discoveryEntryPointArn", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setDiscoveryEntryPointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventBridgeRuleTemplateGroupIds", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setEventBridgeRuleTemplateGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("failedMediaResourceMap", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setFailedMediaResourceMap(new MapUnmarshaller<String, MediaResource>(context.getUnmarshaller(String.class),
                            MediaResourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastDiscoveredAt", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setLastDiscoveredAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("lastSuccessfulMonitorDeployment", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setLastSuccessfulMonitorDeployment(SuccessfulMonitorDeploymentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mediaResourceMap", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setMediaResourceMap(new MapUnmarshaller<String, MediaResource>(context.getUnmarshaller(String.class),
                            MediaResourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("modifiedAt", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setModifiedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("monitorChangesPendingDeployment", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setMonitorChangesPendingDeployment(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("monitorDeployment", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setMonitorDeployment(MonitorDeploymentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    createSignalMapResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return createSignalMapResult;
    }

    private static CreateSignalMapResultJsonUnmarshaller instance;

    public static CreateSignalMapResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateSignalMapResultJsonUnmarshaller();
        return instance;
    }
}
