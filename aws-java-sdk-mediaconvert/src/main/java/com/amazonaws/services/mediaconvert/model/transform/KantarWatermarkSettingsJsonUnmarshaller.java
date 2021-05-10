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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * KantarWatermarkSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KantarWatermarkSettingsJsonUnmarshaller implements Unmarshaller<KantarWatermarkSettings, JsonUnmarshallerContext> {

    public KantarWatermarkSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        KantarWatermarkSettings kantarWatermarkSettings = new KantarWatermarkSettings();

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
                if (context.testExpression("channelName", targetDepth)) {
                    context.nextToken();
                    kantarWatermarkSettings.setChannelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contentReference", targetDepth)) {
                    context.nextToken();
                    kantarWatermarkSettings.setContentReference(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("credentialsSecretName", targetDepth)) {
                    context.nextToken();
                    kantarWatermarkSettings.setCredentialsSecretName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fileOffset", targetDepth)) {
                    context.nextToken();
                    kantarWatermarkSettings.setFileOffset(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("kantarLicenseId", targetDepth)) {
                    context.nextToken();
                    kantarWatermarkSettings.setKantarLicenseId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("kantarServerUrl", targetDepth)) {
                    context.nextToken();
                    kantarWatermarkSettings.setKantarServerUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logDestination", targetDepth)) {
                    context.nextToken();
                    kantarWatermarkSettings.setLogDestination(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadata3", targetDepth)) {
                    context.nextToken();
                    kantarWatermarkSettings.setMetadata3(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadata4", targetDepth)) {
                    context.nextToken();
                    kantarWatermarkSettings.setMetadata4(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadata5", targetDepth)) {
                    context.nextToken();
                    kantarWatermarkSettings.setMetadata5(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadata6", targetDepth)) {
                    context.nextToken();
                    kantarWatermarkSettings.setMetadata6(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadata7", targetDepth)) {
                    context.nextToken();
                    kantarWatermarkSettings.setMetadata7(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadata8", targetDepth)) {
                    context.nextToken();
                    kantarWatermarkSettings.setMetadata8(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return kantarWatermarkSettings;
    }

    private static KantarWatermarkSettingsJsonUnmarshaller instance;

    public static KantarWatermarkSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KantarWatermarkSettingsJsonUnmarshaller();
        return instance;
    }
}
