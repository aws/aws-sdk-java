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
 * ProjectEnvironment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectEnvironmentJsonUnmarshaller implements Unmarshaller<ProjectEnvironment, JsonUnmarshallerContext> {

    public ProjectEnvironment unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProjectEnvironment projectEnvironment = new ProjectEnvironment();

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
                    projectEnvironment.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("image", targetDepth)) {
                    context.nextToken();
                    projectEnvironment.setImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("computeType", targetDepth)) {
                    context.nextToken();
                    projectEnvironment.setComputeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentVariables", targetDepth)) {
                    context.nextToken();
                    projectEnvironment.setEnvironmentVariables(new ListUnmarshaller<EnvironmentVariable>(EnvironmentVariableJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("privilegedMode", targetDepth)) {
                    context.nextToken();
                    projectEnvironment.setPrivilegedMode(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("certificate", targetDepth)) {
                    context.nextToken();
                    projectEnvironment.setCertificate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("registryCredential", targetDepth)) {
                    context.nextToken();
                    projectEnvironment.setRegistryCredential(RegistryCredentialJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("imagePullCredentialsType", targetDepth)) {
                    context.nextToken();
                    projectEnvironment.setImagePullCredentialsType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return projectEnvironment;
    }

    private static ProjectEnvironmentJsonUnmarshaller instance;

    public static ProjectEnvironmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProjectEnvironmentJsonUnmarshaller();
        return instance;
    }
}
