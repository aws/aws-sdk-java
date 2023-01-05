/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsCodeBuildProjectArtifactsDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCodeBuildProjectArtifactsDetailsJsonUnmarshaller implements Unmarshaller<AwsCodeBuildProjectArtifactsDetails, JsonUnmarshallerContext> {

    public AwsCodeBuildProjectArtifactsDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsCodeBuildProjectArtifactsDetails awsCodeBuildProjectArtifactsDetails = new AwsCodeBuildProjectArtifactsDetails();

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
                if (context.testExpression("ArtifactIdentifier", targetDepth)) {
                    context.nextToken();
                    awsCodeBuildProjectArtifactsDetails.setArtifactIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionDisabled", targetDepth)) {
                    context.nextToken();
                    awsCodeBuildProjectArtifactsDetails.setEncryptionDisabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Location", targetDepth)) {
                    context.nextToken();
                    awsCodeBuildProjectArtifactsDetails.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    awsCodeBuildProjectArtifactsDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NamespaceType", targetDepth)) {
                    context.nextToken();
                    awsCodeBuildProjectArtifactsDetails.setNamespaceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OverrideArtifactName", targetDepth)) {
                    context.nextToken();
                    awsCodeBuildProjectArtifactsDetails.setOverrideArtifactName(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Packaging", targetDepth)) {
                    context.nextToken();
                    awsCodeBuildProjectArtifactsDetails.setPackaging(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Path", targetDepth)) {
                    context.nextToken();
                    awsCodeBuildProjectArtifactsDetails.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    awsCodeBuildProjectArtifactsDetails.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsCodeBuildProjectArtifactsDetails;
    }

    private static AwsCodeBuildProjectArtifactsDetailsJsonUnmarshaller instance;

    public static AwsCodeBuildProjectArtifactsDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsCodeBuildProjectArtifactsDetailsJsonUnmarshaller();
        return instance;
    }
}
