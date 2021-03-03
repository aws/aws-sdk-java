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
package com.amazonaws.services.codebuild.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BuildBatch JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildBatchJsonUnmarshaller implements Unmarshaller<BuildBatch, JsonUnmarshallerContext> {

    public BuildBatch unmarshall(JsonUnmarshallerContext context) throws Exception {
        BuildBatch buildBatch = new BuildBatch();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    buildBatch.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    buildBatch.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    buildBatch.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    buildBatch.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("currentPhase", targetDepth)) {
                    context.nextToken();
                    buildBatch.setCurrentPhase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("buildBatchStatus", targetDepth)) {
                    context.nextToken();
                    buildBatch.setBuildBatchStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceVersion", targetDepth)) {
                    context.nextToken();
                    buildBatch.setSourceVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resolvedSourceVersion", targetDepth)) {
                    context.nextToken();
                    buildBatch.setResolvedSourceVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("projectName", targetDepth)) {
                    context.nextToken();
                    buildBatch.setProjectName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("phases", targetDepth)) {
                    context.nextToken();
                    buildBatch.setPhases(new ListUnmarshaller<BuildBatchPhase>(BuildBatchPhaseJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("source", targetDepth)) {
                    context.nextToken();
                    buildBatch.setSource(ProjectSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("secondarySources", targetDepth)) {
                    context.nextToken();
                    buildBatch.setSecondarySources(new ListUnmarshaller<ProjectSource>(ProjectSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("secondarySourceVersions", targetDepth)) {
                    context.nextToken();
                    buildBatch.setSecondarySourceVersions(new ListUnmarshaller<ProjectSourceVersion>(ProjectSourceVersionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("artifacts", targetDepth)) {
                    context.nextToken();
                    buildBatch.setArtifacts(BuildArtifactsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("secondaryArtifacts", targetDepth)) {
                    context.nextToken();
                    buildBatch.setSecondaryArtifacts(new ListUnmarshaller<BuildArtifacts>(BuildArtifactsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("cache", targetDepth)) {
                    context.nextToken();
                    buildBatch.setCache(ProjectCacheJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("environment", targetDepth)) {
                    context.nextToken();
                    buildBatch.setEnvironment(ProjectEnvironmentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serviceRole", targetDepth)) {
                    context.nextToken();
                    buildBatch.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logConfig", targetDepth)) {
                    context.nextToken();
                    buildBatch.setLogConfig(LogsConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("buildTimeoutInMinutes", targetDepth)) {
                    context.nextToken();
                    buildBatch.setBuildTimeoutInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("queuedTimeoutInMinutes", targetDepth)) {
                    context.nextToken();
                    buildBatch.setQueuedTimeoutInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("complete", targetDepth)) {
                    context.nextToken();
                    buildBatch.setComplete(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("initiator", targetDepth)) {
                    context.nextToken();
                    buildBatch.setInitiator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcConfig", targetDepth)) {
                    context.nextToken();
                    buildBatch.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("encryptionKey", targetDepth)) {
                    context.nextToken();
                    buildBatch.setEncryptionKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("buildBatchNumber", targetDepth)) {
                    context.nextToken();
                    buildBatch.setBuildBatchNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("fileSystemLocations", targetDepth)) {
                    context.nextToken();
                    buildBatch.setFileSystemLocations(new ListUnmarshaller<ProjectFileSystemLocation>(ProjectFileSystemLocationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("buildBatchConfig", targetDepth)) {
                    context.nextToken();
                    buildBatch.setBuildBatchConfig(ProjectBuildBatchConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("buildGroups", targetDepth)) {
                    context.nextToken();
                    buildBatch.setBuildGroups(new ListUnmarshaller<BuildGroup>(BuildGroupJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("debugSessionEnabled", targetDepth)) {
                    context.nextToken();
                    buildBatch.setDebugSessionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return buildBatch;
    }

    private static BuildBatchJsonUnmarshaller instance;

    public static BuildBatchJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BuildBatchJsonUnmarshaller();
        return instance;
    }
}
