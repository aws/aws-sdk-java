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
package com.amazonaws.services.directory.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DirectoryLimits JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectoryLimitsJsonUnmarshaller implements Unmarshaller<DirectoryLimits, JsonUnmarshallerContext> {

    public DirectoryLimits unmarshall(JsonUnmarshallerContext context) throws Exception {
        DirectoryLimits directoryLimits = new DirectoryLimits();

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
                if (context.testExpression("CloudOnlyDirectoriesLimit", targetDepth)) {
                    context.nextToken();
                    directoryLimits.setCloudOnlyDirectoriesLimit(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CloudOnlyDirectoriesCurrentCount", targetDepth)) {
                    context.nextToken();
                    directoryLimits.setCloudOnlyDirectoriesCurrentCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CloudOnlyDirectoriesLimitReached", targetDepth)) {
                    context.nextToken();
                    directoryLimits.setCloudOnlyDirectoriesLimitReached(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CloudOnlyMicrosoftADLimit", targetDepth)) {
                    context.nextToken();
                    directoryLimits.setCloudOnlyMicrosoftADLimit(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CloudOnlyMicrosoftADCurrentCount", targetDepth)) {
                    context.nextToken();
                    directoryLimits.setCloudOnlyMicrosoftADCurrentCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CloudOnlyMicrosoftADLimitReached", targetDepth)) {
                    context.nextToken();
                    directoryLimits.setCloudOnlyMicrosoftADLimitReached(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ConnectedDirectoriesLimit", targetDepth)) {
                    context.nextToken();
                    directoryLimits.setConnectedDirectoriesLimit(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ConnectedDirectoriesCurrentCount", targetDepth)) {
                    context.nextToken();
                    directoryLimits.setConnectedDirectoriesCurrentCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ConnectedDirectoriesLimitReached", targetDepth)) {
                    context.nextToken();
                    directoryLimits.setConnectedDirectoriesLimitReached(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return directoryLimits;
    }

    private static DirectoryLimitsJsonUnmarshaller instance;

    public static DirectoryLimitsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DirectoryLimitsJsonUnmarshaller();
        return instance;
    }
}
