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
 * AwsEcsTaskDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDetailsJsonUnmarshaller implements Unmarshaller<AwsEcsTaskDetails, JsonUnmarshallerContext> {

    public AwsEcsTaskDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEcsTaskDetails awsEcsTaskDetails = new AwsEcsTaskDetails();

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
                if (context.testExpression("ClusterArn", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDetails.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskDefinitionArn", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDetails.setTaskDefinitionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDetails.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDetails.setCreatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartedAt", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDetails.setStartedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartedBy", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDetails.setStartedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Group", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDetails.setGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Volumes", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDetails.setVolumes(new ListUnmarshaller<AwsEcsTaskVolumeDetails>(AwsEcsTaskVolumeDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Containers", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDetails.setContainers(new ListUnmarshaller<AwsEcsContainerDetails>(AwsEcsContainerDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEcsTaskDetails;
    }

    private static AwsEcsTaskDetailsJsonUnmarshaller instance;

    public static AwsEcsTaskDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEcsTaskDetailsJsonUnmarshaller();
        return instance;
    }
}
