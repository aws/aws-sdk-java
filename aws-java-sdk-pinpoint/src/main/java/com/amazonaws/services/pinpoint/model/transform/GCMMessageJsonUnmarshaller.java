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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GCMMessage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GCMMessageJsonUnmarshaller implements Unmarshaller<GCMMessage, JsonUnmarshallerContext> {

    public GCMMessage unmarshall(JsonUnmarshallerContext context) throws Exception {
        GCMMessage gCMMessage = new GCMMessage();

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
                if (context.testExpression("Action", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Body", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setBody(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CollapseKey", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setCollapseKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Data", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setData(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("IconReference", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setIconReference(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageIconUrl", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setImageIconUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageUrl", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setImageUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Priority", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setPriority(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RawContent", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setRawContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RestrictedPackageName", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setRestrictedPackageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SilentPush", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setSilentPush(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SmallImageIconUrl", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setSmallImageIconUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Sound", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setSound(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Substitutions", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setSubstitutions(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("TimeToLive", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setTimeToLive(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    context.nextToken();
                    gCMMessage.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return gCMMessage;
    }

    private static GCMMessageJsonUnmarshaller instance;

    public static GCMMessageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GCMMessageJsonUnmarshaller();
        return instance;
    }
}
