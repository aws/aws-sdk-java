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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Hdr10Metadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Hdr10MetadataJsonUnmarshaller implements Unmarshaller<Hdr10Metadata, JsonUnmarshallerContext> {

    public Hdr10Metadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        Hdr10Metadata hdr10Metadata = new Hdr10Metadata();

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
                if (context.testExpression("bluePrimaryX", targetDepth)) {
                    context.nextToken();
                    hdr10Metadata.setBluePrimaryX(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("bluePrimaryY", targetDepth)) {
                    context.nextToken();
                    hdr10Metadata.setBluePrimaryY(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("greenPrimaryX", targetDepth)) {
                    context.nextToken();
                    hdr10Metadata.setGreenPrimaryX(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("greenPrimaryY", targetDepth)) {
                    context.nextToken();
                    hdr10Metadata.setGreenPrimaryY(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxContentLightLevel", targetDepth)) {
                    context.nextToken();
                    hdr10Metadata.setMaxContentLightLevel(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxFrameAverageLightLevel", targetDepth)) {
                    context.nextToken();
                    hdr10Metadata.setMaxFrameAverageLightLevel(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxLuminance", targetDepth)) {
                    context.nextToken();
                    hdr10Metadata.setMaxLuminance(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("minLuminance", targetDepth)) {
                    context.nextToken();
                    hdr10Metadata.setMinLuminance(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("redPrimaryX", targetDepth)) {
                    context.nextToken();
                    hdr10Metadata.setRedPrimaryX(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("redPrimaryY", targetDepth)) {
                    context.nextToken();
                    hdr10Metadata.setRedPrimaryY(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("whitePointX", targetDepth)) {
                    context.nextToken();
                    hdr10Metadata.setWhitePointX(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("whitePointY", targetDepth)) {
                    context.nextToken();
                    hdr10Metadata.setWhitePointY(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return hdr10Metadata;
    }

    private static Hdr10MetadataJsonUnmarshaller instance;

    public static Hdr10MetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Hdr10MetadataJsonUnmarshaller();
        return instance;
    }
}
