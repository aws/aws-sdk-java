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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CmafImageBasedTrickPlaySettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CmafImageBasedTrickPlaySettingsJsonUnmarshaller implements Unmarshaller<CmafImageBasedTrickPlaySettings, JsonUnmarshallerContext> {

    public CmafImageBasedTrickPlaySettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        CmafImageBasedTrickPlaySettings cmafImageBasedTrickPlaySettings = new CmafImageBasedTrickPlaySettings();

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
                if (context.testExpression("intervalCadence", targetDepth)) {
                    context.nextToken();
                    cmafImageBasedTrickPlaySettings.setIntervalCadence(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thumbnailHeight", targetDepth)) {
                    context.nextToken();
                    cmafImageBasedTrickPlaySettings.setThumbnailHeight(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("thumbnailInterval", targetDepth)) {
                    context.nextToken();
                    cmafImageBasedTrickPlaySettings.setThumbnailInterval(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("thumbnailWidth", targetDepth)) {
                    context.nextToken();
                    cmafImageBasedTrickPlaySettings.setThumbnailWidth(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tileHeight", targetDepth)) {
                    context.nextToken();
                    cmafImageBasedTrickPlaySettings.setTileHeight(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tileWidth", targetDepth)) {
                    context.nextToken();
                    cmafImageBasedTrickPlaySettings.setTileWidth(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return cmafImageBasedTrickPlaySettings;
    }

    private static CmafImageBasedTrickPlaySettingsJsonUnmarshaller instance;

    public static CmafImageBasedTrickPlaySettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CmafImageBasedTrickPlaySettingsJsonUnmarshaller();
        return instance;
    }
}
