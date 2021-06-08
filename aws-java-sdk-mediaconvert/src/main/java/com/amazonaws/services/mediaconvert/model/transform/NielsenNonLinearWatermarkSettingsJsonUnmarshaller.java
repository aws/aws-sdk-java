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
 * NielsenNonLinearWatermarkSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NielsenNonLinearWatermarkSettingsJsonUnmarshaller implements Unmarshaller<NielsenNonLinearWatermarkSettings, JsonUnmarshallerContext> {

    public NielsenNonLinearWatermarkSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        NielsenNonLinearWatermarkSettings nielsenNonLinearWatermarkSettings = new NielsenNonLinearWatermarkSettings();

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
                if (context.testExpression("activeWatermarkProcess", targetDepth)) {
                    context.nextToken();
                    nielsenNonLinearWatermarkSettings.setActiveWatermarkProcess(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("adiFilename", targetDepth)) {
                    context.nextToken();
                    nielsenNonLinearWatermarkSettings.setAdiFilename(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetId", targetDepth)) {
                    context.nextToken();
                    nielsenNonLinearWatermarkSettings.setAssetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetName", targetDepth)) {
                    context.nextToken();
                    nielsenNonLinearWatermarkSettings.setAssetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cbetSourceId", targetDepth)) {
                    context.nextToken();
                    nielsenNonLinearWatermarkSettings.setCbetSourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("episodeId", targetDepth)) {
                    context.nextToken();
                    nielsenNonLinearWatermarkSettings.setEpisodeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadataDestination", targetDepth)) {
                    context.nextToken();
                    nielsenNonLinearWatermarkSettings.setMetadataDestination(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceId", targetDepth)) {
                    context.nextToken();
                    nielsenNonLinearWatermarkSettings.setSourceId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("sourceWatermarkStatus", targetDepth)) {
                    context.nextToken();
                    nielsenNonLinearWatermarkSettings.setSourceWatermarkStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ticServerUrl", targetDepth)) {
                    context.nextToken();
                    nielsenNonLinearWatermarkSettings.setTicServerUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uniqueTicPerAudioTrack", targetDepth)) {
                    context.nextToken();
                    nielsenNonLinearWatermarkSettings.setUniqueTicPerAudioTrack(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return nielsenNonLinearWatermarkSettings;
    }

    private static NielsenNonLinearWatermarkSettingsJsonUnmarshaller instance;

    public static NielsenNonLinearWatermarkSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NielsenNonLinearWatermarkSettingsJsonUnmarshaller();
        return instance;
    }
}
