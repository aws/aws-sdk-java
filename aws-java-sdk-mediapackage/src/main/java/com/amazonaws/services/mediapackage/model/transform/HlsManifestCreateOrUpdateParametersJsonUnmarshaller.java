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
package com.amazonaws.services.mediapackage.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackage.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * HlsManifestCreateOrUpdateParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsManifestCreateOrUpdateParametersJsonUnmarshaller implements Unmarshaller<HlsManifestCreateOrUpdateParameters, JsonUnmarshallerContext> {

    public HlsManifestCreateOrUpdateParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        HlsManifestCreateOrUpdateParameters hlsManifestCreateOrUpdateParameters = new HlsManifestCreateOrUpdateParameters();

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
                    hlsManifestCreateOrUpdateParameters.setAdMarkers(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    hlsManifestCreateOrUpdateParameters.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("includeIframeOnlyStream", targetDepth)) {
                    context.nextToken();
                    hlsManifestCreateOrUpdateParameters.setIncludeIframeOnlyStream(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("manifestName", targetDepth)) {
                    context.nextToken();
                    hlsManifestCreateOrUpdateParameters.setManifestName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("playlistType", targetDepth)) {
                    context.nextToken();
                    hlsManifestCreateOrUpdateParameters.setPlaylistType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("playlistWindowSeconds", targetDepth)) {
                    context.nextToken();
                    hlsManifestCreateOrUpdateParameters.setPlaylistWindowSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("programDateTimeIntervalSeconds", targetDepth)) {
                    context.nextToken();
                    hlsManifestCreateOrUpdateParameters.setProgramDateTimeIntervalSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return hlsManifestCreateOrUpdateParameters;
    }

    private static HlsManifestCreateOrUpdateParametersJsonUnmarshaller instance;

    public static HlsManifestCreateOrUpdateParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HlsManifestCreateOrUpdateParametersJsonUnmarshaller();
        return instance;
    }
}
