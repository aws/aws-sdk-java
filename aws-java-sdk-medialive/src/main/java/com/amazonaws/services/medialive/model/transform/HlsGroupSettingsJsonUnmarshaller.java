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
 * HlsGroupSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsGroupSettingsJsonUnmarshaller implements Unmarshaller<HlsGroupSettings, JsonUnmarshallerContext> {

    public HlsGroupSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        HlsGroupSettings hlsGroupSettings = new HlsGroupSettings();

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
                if (context.testExpression("adMarkers", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setAdMarkers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("baseUrlContent", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setBaseUrlContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("baseUrlManifest", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setBaseUrlManifest(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("captionLanguageMappings", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setCaptionLanguageMappings(new ListUnmarshaller<CaptionLanguageMapping>(CaptionLanguageMappingJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("captionLanguageSetting", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setCaptionLanguageSetting(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientCache", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setClientCache(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("codecSpecification", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setCodecSpecification(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("constantIv", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setConstantIv(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destination", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setDestination(OutputLocationRefJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("directoryStructure", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setDirectoryStructure(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encryptionType", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setEncryptionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hlsCdnSettings", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setHlsCdnSettings(HlsCdnSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("iFrameOnlyPlaylists", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setIFrameOnlyPlaylists(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("indexNSegments", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setIndexNSegments(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("inputLossAction", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setInputLossAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ivInManifest", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setIvInManifest(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ivSource", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setIvSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("keepSegments", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setKeepSegments(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("keyFormat", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setKeyFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("keyFormatVersions", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setKeyFormatVersions(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("keyProviderSettings", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setKeyProviderSettings(KeyProviderSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("manifestCompression", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setManifestCompression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("manifestDurationFormat", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setManifestDurationFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("minSegmentLength", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setMinSegmentLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("mode", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputSelection", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setOutputSelection(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("programDateTime", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setProgramDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("programDateTimePeriod", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setProgramDateTimePeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("redundantManifest", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setRedundantManifest(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("segmentLength", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setSegmentLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("segmentationMode", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setSegmentationMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("segmentsPerSubdirectory", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setSegmentsPerSubdirectory(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("streamInfResolution", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setStreamInfResolution(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timedMetadataId3Frame", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setTimedMetadataId3Frame(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timedMetadataId3Period", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setTimedMetadataId3Period(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("timestampDeltaMilliseconds", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setTimestampDeltaMilliseconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tsFileMode", targetDepth)) {
                    context.nextToken();
                    hlsGroupSettings.setTsFileMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return hlsGroupSettings;
    }

    private static HlsGroupSettingsJsonUnmarshaller instance;

    public static HlsGroupSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HlsGroupSettingsJsonUnmarshaller();
        return instance;
    }
}
