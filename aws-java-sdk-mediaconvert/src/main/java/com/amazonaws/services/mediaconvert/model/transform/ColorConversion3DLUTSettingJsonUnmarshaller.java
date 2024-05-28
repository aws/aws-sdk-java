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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ColorConversion3DLUTSetting JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColorConversion3DLUTSettingJsonUnmarshaller implements Unmarshaller<ColorConversion3DLUTSetting, JsonUnmarshallerContext> {

    public ColorConversion3DLUTSetting unmarshall(JsonUnmarshallerContext context) throws Exception {
        ColorConversion3DLUTSetting colorConversion3DLUTSetting = new ColorConversion3DLUTSetting();

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
                if (context.testExpression("fileInput", targetDepth)) {
                    context.nextToken();
                    colorConversion3DLUTSetting.setFileInput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputColorSpace", targetDepth)) {
                    context.nextToken();
                    colorConversion3DLUTSetting.setInputColorSpace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputMasteringLuminance", targetDepth)) {
                    context.nextToken();
                    colorConversion3DLUTSetting.setInputMasteringLuminance(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("outputColorSpace", targetDepth)) {
                    context.nextToken();
                    colorConversion3DLUTSetting.setOutputColorSpace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputMasteringLuminance", targetDepth)) {
                    context.nextToken();
                    colorConversion3DLUTSetting.setOutputMasteringLuminance(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return colorConversion3DLUTSetting;
    }

    private static ColorConversion3DLUTSettingJsonUnmarshaller instance;

    public static ColorConversion3DLUTSettingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ColorConversion3DLUTSettingJsonUnmarshaller();
        return instance;
    }
}
