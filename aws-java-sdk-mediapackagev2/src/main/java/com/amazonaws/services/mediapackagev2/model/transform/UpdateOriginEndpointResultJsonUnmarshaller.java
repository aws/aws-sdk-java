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
 * UpdateOriginEndpointResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOriginEndpointResultJsonUnmarshaller implements Unmarshaller<UpdateOriginEndpointResult, JsonUnmarshallerContext> {

    public UpdateOriginEndpointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateOriginEndpointResult updateOriginEndpointResult = new UpdateOriginEndpointResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateOriginEndpointResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChannelGroupName", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setChannelGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChannelName", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setChannelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OriginEndpointName", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setOriginEndpointName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContainerType", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setContainerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Segment", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setSegment(SegmentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ModifiedAt", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setModifiedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartoverWindowSeconds", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setStartoverWindowSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("HlsManifests", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setHlsManifests(new ListUnmarshaller<GetHlsManifestConfiguration>(GetHlsManifestConfigurationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LowLatencyHlsManifests", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setLowLatencyHlsManifests(new ListUnmarshaller<GetLowLatencyHlsManifestConfiguration>(
                            GetLowLatencyHlsManifestConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ETag", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setETag(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("DashManifests", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setDashManifests(new ListUnmarshaller<GetDashManifestConfiguration>(GetDashManifestConfigurationJsonUnmarshaller
                            .getInstance())

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

        return updateOriginEndpointResult;
    }

    private static UpdateOriginEndpointResultJsonUnmarshaller instance;

    public static UpdateOriginEndpointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateOriginEndpointResultJsonUnmarshaller();
        return instance;
    }
}
