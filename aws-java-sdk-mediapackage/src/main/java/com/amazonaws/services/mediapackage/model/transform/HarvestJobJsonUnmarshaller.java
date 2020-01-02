/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * HarvestJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HarvestJobJsonUnmarshaller implements Unmarshaller<HarvestJob, JsonUnmarshallerContext> {

    public HarvestJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        HarvestJob harvestJob = new HarvestJob();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    harvestJob.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("channelId", targetDepth)) {
                    context.nextToken();
                    harvestJob.setChannelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    harvestJob.setCreatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    harvestJob.setEndTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    harvestJob.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("originEndpointId", targetDepth)) {
                    context.nextToken();
                    harvestJob.setOriginEndpointId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("s3Destination", targetDepth)) {
                    context.nextToken();
                    harvestJob.setS3Destination(S3DestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    harvestJob.setStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    harvestJob.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return harvestJob;
    }

    private static HarvestJobJsonUnmarshaller instance;

    public static HarvestJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HarvestJobJsonUnmarshaller();
        return instance;
    }
}
