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
 * CaptionSourceSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionSourceSettingsJsonUnmarshaller implements Unmarshaller<CaptionSourceSettings, JsonUnmarshallerContext> {

    public CaptionSourceSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        CaptionSourceSettings captionSourceSettings = new CaptionSourceSettings();

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
                if (context.testExpression("ancillarySourceSettings", targetDepth)) {
                    context.nextToken();
                    captionSourceSettings.setAncillarySourceSettings(AncillarySourceSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dvbSubSourceSettings", targetDepth)) {
                    context.nextToken();
                    captionSourceSettings.setDvbSubSourceSettings(DvbSubSourceSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("embeddedSourceSettings", targetDepth)) {
                    context.nextToken();
                    captionSourceSettings.setEmbeddedSourceSettings(EmbeddedSourceSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fileSourceSettings", targetDepth)) {
                    context.nextToken();
                    captionSourceSettings.setFileSourceSettings(FileSourceSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourceType", targetDepth)) {
                    context.nextToken();
                    captionSourceSettings.setSourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("teletextSourceSettings", targetDepth)) {
                    context.nextToken();
                    captionSourceSettings.setTeletextSourceSettings(TeletextSourceSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("trackSourceSettings", targetDepth)) {
                    context.nextToken();
                    captionSourceSettings.setTrackSourceSettings(TrackSourceSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return captionSourceSettings;
    }

    private static CaptionSourceSettingsJsonUnmarshaller instance;

    public static CaptionSourceSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CaptionSourceSettingsJsonUnmarshaller();
        return instance;
    }
}
