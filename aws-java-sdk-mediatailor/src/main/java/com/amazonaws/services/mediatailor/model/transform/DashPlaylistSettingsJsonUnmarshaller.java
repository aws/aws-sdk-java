/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediatailor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediatailor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DashPlaylistSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashPlaylistSettingsJsonUnmarshaller implements Unmarshaller<DashPlaylistSettings, JsonUnmarshallerContext> {

    public DashPlaylistSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        DashPlaylistSettings dashPlaylistSettings = new DashPlaylistSettings();

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
                if (context.testExpression("ManifestWindowSeconds", targetDepth)) {
                    context.nextToken();
                    dashPlaylistSettings.setManifestWindowSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MinBufferTimeSeconds", targetDepth)) {
                    context.nextToken();
                    dashPlaylistSettings.setMinBufferTimeSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MinUpdatePeriodSeconds", targetDepth)) {
                    context.nextToken();
                    dashPlaylistSettings.setMinUpdatePeriodSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SuggestedPresentationDelaySeconds", targetDepth)) {
                    context.nextToken();
                    dashPlaylistSettings.setSuggestedPresentationDelaySeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dashPlaylistSettings;
    }

    private static DashPlaylistSettingsJsonUnmarshaller instance;

    public static DashPlaylistSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DashPlaylistSettingsJsonUnmarshaller();
        return instance;
    }
}
