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
 * CaptionDestinationSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionDestinationSettingsJsonUnmarshaller implements Unmarshaller<CaptionDestinationSettings, JsonUnmarshallerContext> {

    public CaptionDestinationSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        CaptionDestinationSettings captionDestinationSettings = new CaptionDestinationSettings();

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
                if (context.testExpression("burninDestinationSettings", targetDepth)) {
                    context.nextToken();
                    captionDestinationSettings.setBurninDestinationSettings(BurninDestinationSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("destinationType", targetDepth)) {
                    context.nextToken();
                    captionDestinationSettings.setDestinationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dvbSubDestinationSettings", targetDepth)) {
                    context.nextToken();
                    captionDestinationSettings.setDvbSubDestinationSettings(DvbSubDestinationSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("embeddedDestinationSettings", targetDepth)) {
                    context.nextToken();
                    captionDestinationSettings.setEmbeddedDestinationSettings(EmbeddedDestinationSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sccDestinationSettings", targetDepth)) {
                    context.nextToken();
                    captionDestinationSettings.setSccDestinationSettings(SccDestinationSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("teletextDestinationSettings", targetDepth)) {
                    context.nextToken();
                    captionDestinationSettings.setTeletextDestinationSettings(TeletextDestinationSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ttmlDestinationSettings", targetDepth)) {
                    context.nextToken();
                    captionDestinationSettings.setTtmlDestinationSettings(TtmlDestinationSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return captionDestinationSettings;
    }

    private static CaptionDestinationSettingsJsonUnmarshaller instance;

    public static CaptionDestinationSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CaptionDestinationSettingsJsonUnmarshaller();
        return instance;
    }
}
