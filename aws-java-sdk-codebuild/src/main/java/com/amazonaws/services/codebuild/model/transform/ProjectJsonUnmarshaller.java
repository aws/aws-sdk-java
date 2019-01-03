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
package com.amazonaws.services.codebuild.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Project JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectJsonUnmarshaller implements Unmarshaller<Project, JsonUnmarshallerContext> {

    public Project unmarshall(JsonUnmarshallerContext context) throws Exception {
        Project project = new Project();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    project.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    project.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    project.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("source", targetDepth)) {
                    context.nextToken();
                    project.setSource(ProjectSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("secondarySources", targetDepth)) {
                    context.nextToken();
                    project.setSecondarySources(new ListUnmarshaller<ProjectSource>(ProjectSourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("artifacts", targetDepth)) {
                    context.nextToken();
                    project.setArtifacts(ProjectArtifactsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("secondaryArtifacts", targetDepth)) {
                    context.nextToken();
                    project.setSecondaryArtifacts(new ListUnmarshaller<ProjectArtifacts>(ProjectArtifactsJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("cache", targetDepth)) {
                    context.nextToken();
                    project.setCache(ProjectCacheJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("environment", targetDepth)) {
                    context.nextToken();
                    project.setEnvironment(ProjectEnvironmentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serviceRole", targetDepth)) {
                    context.nextToken();
                    project.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timeoutInMinutes", targetDepth)) {
                    context.nextToken();
                    project.setTimeoutInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("queuedTimeoutInMinutes", targetDepth)) {
                    context.nextToken();
                    project.setQueuedTimeoutInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("encryptionKey", targetDepth)) {
                    context.nextToken();
                    project.setEncryptionKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    project.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("created", targetDepth)) {
                    context.nextToken();
                    project.setCreated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModified", targetDepth)) {
                    context.nextToken();
                    project.setLastModified(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("webhook", targetDepth)) {
                    context.nextToken();
                    project.setWebhook(WebhookJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("vpcConfig", targetDepth)) {
                    context.nextToken();
                    project.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("badge", targetDepth)) {
                    context.nextToken();
                    project.setBadge(ProjectBadgeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("logsConfig", targetDepth)) {
                    context.nextToken();
                    project.setLogsConfig(LogsConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return project;
    }

    private static ProjectJsonUnmarshaller instance;

    public static ProjectJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProjectJsonUnmarshaller();
        return instance;
    }
}
