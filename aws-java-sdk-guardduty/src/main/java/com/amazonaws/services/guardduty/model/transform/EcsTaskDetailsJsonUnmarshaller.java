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
package com.amazonaws.services.guardduty.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EcsTaskDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsTaskDetailsJsonUnmarshaller implements Unmarshaller<EcsTaskDetails, JsonUnmarshallerContext> {

    public EcsTaskDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        EcsTaskDetails ecsTaskDetails = new EcsTaskDetails();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    ecsTaskDetails.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("definitionArn", targetDepth)) {
                    context.nextToken();
                    ecsTaskDetails.setDefinitionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    ecsTaskDetails.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    ecsTaskDetails.setTaskCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    ecsTaskDetails.setStartedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("startedBy", targetDepth)) {
                    context.nextToken();
                    ecsTaskDetails.setStartedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    ecsTaskDetails.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("volumes", targetDepth)) {
                    context.nextToken();
                    ecsTaskDetails.setVolumes(new ListUnmarshaller<Volume>(VolumeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("containers", targetDepth)) {
                    context.nextToken();
                    ecsTaskDetails.setContainers(new ListUnmarshaller<Container>(ContainerJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("group", targetDepth)) {
                    context.nextToken();
                    ecsTaskDetails.setGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ecsTaskDetails;
    }

    private static EcsTaskDetailsJsonUnmarshaller instance;

    public static EcsTaskDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EcsTaskDetailsJsonUnmarshaller();
        return instance;
    }
}
