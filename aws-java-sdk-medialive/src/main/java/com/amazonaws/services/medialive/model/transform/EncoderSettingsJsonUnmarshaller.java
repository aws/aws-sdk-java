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
 * EncoderSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncoderSettingsJsonUnmarshaller implements Unmarshaller<EncoderSettings, JsonUnmarshallerContext> {

    public EncoderSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        EncoderSettings encoderSettings = new EncoderSettings();

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
                if (context.testExpression("audioDescriptions", targetDepth)) {
                    context.nextToken();
                    encoderSettings.setAudioDescriptions(new ListUnmarshaller<AudioDescription>(AudioDescriptionJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("availBlanking", targetDepth)) {
                    context.nextToken();
                    encoderSettings.setAvailBlanking(AvailBlankingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("availConfiguration", targetDepth)) {
                    context.nextToken();
                    encoderSettings.setAvailConfiguration(AvailConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("blackoutSlate", targetDepth)) {
                    context.nextToken();
                    encoderSettings.setBlackoutSlate(BlackoutSlateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("captionDescriptions", targetDepth)) {
                    context.nextToken();
                    encoderSettings.setCaptionDescriptions(new ListUnmarshaller<CaptionDescription>(CaptionDescriptionJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("globalConfiguration", targetDepth)) {
                    context.nextToken();
                    encoderSettings.setGlobalConfiguration(GlobalConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("outputGroups", targetDepth)) {
                    context.nextToken();
                    encoderSettings.setOutputGroups(new ListUnmarshaller<OutputGroup>(OutputGroupJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("timecodeConfig", targetDepth)) {
                    context.nextToken();
                    encoderSettings.setTimecodeConfig(TimecodeConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("videoDescriptions", targetDepth)) {
                    context.nextToken();
                    encoderSettings.setVideoDescriptions(new ListUnmarshaller<VideoDescription>(VideoDescriptionJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return encoderSettings;
    }

    private static EncoderSettingsJsonUnmarshaller instance;

    public static EncoderSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EncoderSettingsJsonUnmarshaller();
        return instance;
    }
}
