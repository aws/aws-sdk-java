/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemakergeospatial.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakergeospatial.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobConfigInput JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobConfigInputJsonUnmarshaller implements Unmarshaller<JobConfigInput, JsonUnmarshallerContext> {

    public JobConfigInput unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobConfigInput jobConfigInput = new JobConfigInput();

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
                if (context.testExpression("BandMathConfig", targetDepth)) {
                    context.nextToken();
                    jobConfigInput.setBandMathConfig(BandMathConfigInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudMaskingConfig", targetDepth)) {
                    context.nextToken();
                    jobConfigInput.setCloudMaskingConfig(CloudMaskingConfigInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudRemovalConfig", targetDepth)) {
                    context.nextToken();
                    jobConfigInput.setCloudRemovalConfig(CloudRemovalConfigInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GeoMosaicConfig", targetDepth)) {
                    context.nextToken();
                    jobConfigInput.setGeoMosaicConfig(GeoMosaicConfigInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LandCoverSegmentationConfig", targetDepth)) {
                    context.nextToken();
                    jobConfigInput.setLandCoverSegmentationConfig(LandCoverSegmentationConfigInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResamplingConfig", targetDepth)) {
                    context.nextToken();
                    jobConfigInput.setResamplingConfig(ResamplingConfigInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StackConfig", targetDepth)) {
                    context.nextToken();
                    jobConfigInput.setStackConfig(StackConfigInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TemporalStatisticsConfig", targetDepth)) {
                    context.nextToken();
                    jobConfigInput.setTemporalStatisticsConfig(TemporalStatisticsConfigInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ZonalStatisticsConfig", targetDepth)) {
                    context.nextToken();
                    jobConfigInput.setZonalStatisticsConfig(ZonalStatisticsConfigInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jobConfigInput;
    }

    private static JobConfigInputJsonUnmarshaller instance;

    public static JobConfigInputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobConfigInputJsonUnmarshaller();
        return instance;
    }
}
