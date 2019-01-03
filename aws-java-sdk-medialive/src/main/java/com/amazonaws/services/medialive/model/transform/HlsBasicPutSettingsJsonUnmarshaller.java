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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * HlsBasicPutSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsBasicPutSettingsJsonUnmarshaller implements Unmarshaller<HlsBasicPutSettings, JsonUnmarshallerContext> {

    public HlsBasicPutSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        HlsBasicPutSettings hlsBasicPutSettings = new HlsBasicPutSettings();

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
                if (context.testExpression("connectionRetryInterval", targetDepth)) {
                    context.nextToken();
                    hlsBasicPutSettings.setConnectionRetryInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("filecacheDuration", targetDepth)) {
                    context.nextToken();
                    hlsBasicPutSettings.setFilecacheDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numRetries", targetDepth)) {
                    context.nextToken();
                    hlsBasicPutSettings.setNumRetries(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("restartDelay", targetDepth)) {
                    context.nextToken();
                    hlsBasicPutSettings.setRestartDelay(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return hlsBasicPutSettings;
    }

    private static HlsBasicPutSettingsJsonUnmarshaller instance;

    public static HlsBasicPutSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HlsBasicPutSettingsJsonUnmarshaller();
        return instance;
    }
}
