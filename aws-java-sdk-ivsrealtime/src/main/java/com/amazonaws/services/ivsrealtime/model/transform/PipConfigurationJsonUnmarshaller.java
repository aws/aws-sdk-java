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
package com.amazonaws.services.ivsrealtime.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ivsrealtime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PipConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipConfigurationJsonUnmarshaller implements Unmarshaller<PipConfiguration, JsonUnmarshallerContext> {

    public PipConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        PipConfiguration pipConfiguration = new PipConfiguration();

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
                if (context.testExpression("featuredParticipantAttribute", targetDepth)) {
                    context.nextToken();
                    pipConfiguration.setFeaturedParticipantAttribute(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gridGap", targetDepth)) {
                    context.nextToken();
                    pipConfiguration.setGridGap(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("omitStoppedVideo", targetDepth)) {
                    context.nextToken();
                    pipConfiguration.setOmitStoppedVideo(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("pipBehavior", targetDepth)) {
                    context.nextToken();
                    pipConfiguration.setPipBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pipHeight", targetDepth)) {
                    context.nextToken();
                    pipConfiguration.setPipHeight(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pipOffset", targetDepth)) {
                    context.nextToken();
                    pipConfiguration.setPipOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pipParticipantAttribute", targetDepth)) {
                    context.nextToken();
                    pipConfiguration.setPipParticipantAttribute(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pipPosition", targetDepth)) {
                    context.nextToken();
                    pipConfiguration.setPipPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pipWidth", targetDepth)) {
                    context.nextToken();
                    pipConfiguration.setPipWidth(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("videoFillMode", targetDepth)) {
                    context.nextToken();
                    pipConfiguration.setVideoFillMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pipConfiguration;
    }

    private static PipConfigurationJsonUnmarshaller instance;

    public static PipConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipConfigurationJsonUnmarshaller();
        return instance;
    }
}
