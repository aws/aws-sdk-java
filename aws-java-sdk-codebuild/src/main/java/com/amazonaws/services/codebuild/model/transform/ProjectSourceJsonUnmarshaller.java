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
 * ProjectSource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectSourceJsonUnmarshaller implements Unmarshaller<ProjectSource, JsonUnmarshallerContext> {

    public ProjectSource unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProjectSource projectSource = new ProjectSource();

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
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    projectSource.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    projectSource.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gitCloneDepth", targetDepth)) {
                    context.nextToken();
                    projectSource.setGitCloneDepth(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("gitSubmodulesConfig", targetDepth)) {
                    context.nextToken();
                    projectSource.setGitSubmodulesConfig(GitSubmodulesConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("buildspec", targetDepth)) {
                    context.nextToken();
                    projectSource.setBuildspec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("auth", targetDepth)) {
                    context.nextToken();
                    projectSource.setAuth(SourceAuthJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("reportBuildStatus", targetDepth)) {
                    context.nextToken();
                    projectSource.setReportBuildStatus(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("insecureSsl", targetDepth)) {
                    context.nextToken();
                    projectSource.setInsecureSsl(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("sourceIdentifier", targetDepth)) {
                    context.nextToken();
                    projectSource.setSourceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return projectSource;
    }

    private static ProjectSourceJsonUnmarshaller instance;

    public static ProjectSourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProjectSourceJsonUnmarshaller();
        return instance;
    }
}
