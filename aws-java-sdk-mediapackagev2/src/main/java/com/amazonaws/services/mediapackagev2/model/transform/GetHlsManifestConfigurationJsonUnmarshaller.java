/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagev2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackagev2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetHlsManifestConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHlsManifestConfigurationJsonUnmarshaller implements Unmarshaller<GetHlsManifestConfiguration, JsonUnmarshallerContext> {

    public GetHlsManifestConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetHlsManifestConfiguration getHlsManifestConfiguration = new GetHlsManifestConfiguration();

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
                if (context.testExpression("ManifestName", targetDepth)) {
                    context.nextToken();
                    getHlsManifestConfiguration.setManifestName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    context.nextToken();
                    getHlsManifestConfiguration.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChildManifestName", targetDepth)) {
                    context.nextToken();
                    getHlsManifestConfiguration.setChildManifestName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ManifestWindowSeconds", targetDepth)) {
                    context.nextToken();
                    getHlsManifestConfiguration.setManifestWindowSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ProgramDateTimeIntervalSeconds", targetDepth)) {
                    context.nextToken();
                    getHlsManifestConfiguration.setProgramDateTimeIntervalSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ScteHls", targetDepth)) {
                    context.nextToken();
                    getHlsManifestConfiguration.setScteHls(ScteHlsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FilterConfiguration", targetDepth)) {
                    context.nextToken();
                    getHlsManifestConfiguration.setFilterConfiguration(FilterConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getHlsManifestConfiguration;
    }

    private static GetHlsManifestConfigurationJsonUnmarshaller instance;

    public static GetHlsManifestConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetHlsManifestConfigurationJsonUnmarshaller();
        return instance;
    }
}
