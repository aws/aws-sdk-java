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
 * ColorCorrector JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColorCorrectorJsonUnmarshaller implements Unmarshaller<ColorCorrector, JsonUnmarshallerContext> {

    public ColorCorrector unmarshall(JsonUnmarshallerContext context) throws Exception {
        ColorCorrector colorCorrector = new ColorCorrector();

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
                if (context.testExpression("brightness", targetDepth)) {
                    context.nextToken();
                    colorCorrector.setBrightness(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("colorSpaceConversion", targetDepth)) {
                    context.nextToken();
                    colorCorrector.setColorSpaceConversion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contrast", targetDepth)) {
                    context.nextToken();
                    colorCorrector.setContrast(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("hdr10Metadata", targetDepth)) {
                    context.nextToken();
                    colorCorrector.setHdr10Metadata(Hdr10MetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("hue", targetDepth)) {
                    context.nextToken();
                    colorCorrector.setHue(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("saturation", targetDepth)) {
                    context.nextToken();
                    colorCorrector.setSaturation(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return colorCorrector;
    }

    private static ColorCorrectorJsonUnmarshaller instance;

    public static ColorCorrectorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ColorCorrectorJsonUnmarshaller();
        return instance;
    }
}
