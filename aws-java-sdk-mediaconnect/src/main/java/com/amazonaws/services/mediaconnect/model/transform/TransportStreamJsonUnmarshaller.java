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
package com.amazonaws.services.mediaconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TransportStream JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransportStreamJsonUnmarshaller implements Unmarshaller<TransportStream, JsonUnmarshallerContext> {

    public TransportStream unmarshall(JsonUnmarshallerContext context) throws Exception {
        TransportStream transportStream = new TransportStream();

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
                if (context.testExpression("channels", targetDepth)) {
                    context.nextToken();
                    transportStream.setChannels(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("codec", targetDepth)) {
                    context.nextToken();
                    transportStream.setCodec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("frameRate", targetDepth)) {
                    context.nextToken();
                    transportStream.setFrameRate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("frameResolution", targetDepth)) {
                    context.nextToken();
                    transportStream.setFrameResolution(FrameResolutionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("pid", targetDepth)) {
                    context.nextToken();
                    transportStream.setPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("sampleRate", targetDepth)) {
                    context.nextToken();
                    transportStream.setSampleRate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("sampleSize", targetDepth)) {
                    context.nextToken();
                    transportStream.setSampleSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("streamType", targetDepth)) {
                    context.nextToken();
                    transportStream.setStreamType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return transportStream;
    }

    private static TransportStreamJsonUnmarshaller instance;

    public static TransportStreamJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransportStreamJsonUnmarshaller();
        return instance;
    }
}
