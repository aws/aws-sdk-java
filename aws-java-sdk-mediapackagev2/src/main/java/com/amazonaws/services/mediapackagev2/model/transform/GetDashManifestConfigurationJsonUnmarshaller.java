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
 * GetDashManifestConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDashManifestConfigurationJsonUnmarshaller implements Unmarshaller<GetDashManifestConfiguration, JsonUnmarshallerContext> {

    public GetDashManifestConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDashManifestConfiguration getDashManifestConfiguration = new GetDashManifestConfiguration();

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
                    getDashManifestConfiguration.setManifestName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    context.nextToken();
                    getDashManifestConfiguration.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ManifestWindowSeconds", targetDepth)) {
                    context.nextToken();
                    getDashManifestConfiguration.setManifestWindowSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FilterConfiguration", targetDepth)) {
                    context.nextToken();
                    getDashManifestConfiguration.setFilterConfiguration(FilterConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MinUpdatePeriodSeconds", targetDepth)) {
                    context.nextToken();
                    getDashManifestConfiguration.setMinUpdatePeriodSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MinBufferTimeSeconds", targetDepth)) {
                    context.nextToken();
                    getDashManifestConfiguration.setMinBufferTimeSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SuggestedPresentationDelaySeconds", targetDepth)) {
                    context.nextToken();
                    getDashManifestConfiguration.setSuggestedPresentationDelaySeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SegmentTemplateFormat", targetDepth)) {
                    context.nextToken();
                    getDashManifestConfiguration.setSegmentTemplateFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PeriodTriggers", targetDepth)) {
                    context.nextToken();
                    getDashManifestConfiguration.setPeriodTriggers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ScteDash", targetDepth)) {
                    context.nextToken();
                    getDashManifestConfiguration.setScteDash(ScteDashJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DrmSignaling", targetDepth)) {
                    context.nextToken();
                    getDashManifestConfiguration.setDrmSignaling(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UtcTiming", targetDepth)) {
                    context.nextToken();
                    getDashManifestConfiguration.setUtcTiming(DashUtcTimingJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getDashManifestConfiguration;
    }

    private static GetDashManifestConfigurationJsonUnmarshaller instance;

    public static GetDashManifestConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDashManifestConfigurationJsonUnmarshaller();
        return instance;
    }
}
