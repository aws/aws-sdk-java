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
 * CreateOriginEndpointResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOriginEndpointResultJsonUnmarshaller implements Unmarshaller<CreateOriginEndpointResult, JsonUnmarshallerContext> {

    public CreateOriginEndpointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateOriginEndpointResult createOriginEndpointResult = new CreateOriginEndpointResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createOriginEndpointResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChannelGroupName", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setChannelGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChannelName", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setChannelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OriginEndpointName", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setOriginEndpointName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContainerType", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setContainerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Segment", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setSegment(SegmentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ModifiedAt", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setModifiedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartoverWindowSeconds", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setStartoverWindowSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("HlsManifests", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setHlsManifests(new ListUnmarshaller<GetHlsManifestConfiguration>(GetHlsManifestConfigurationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LowLatencyHlsManifests", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setLowLatencyHlsManifests(new ListUnmarshaller<GetLowLatencyHlsManifestConfiguration>(
                            GetLowLatencyHlsManifestConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DashManifests", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setDashManifests(new ListUnmarshaller<GetDashManifestConfiguration>(GetDashManifestConfigurationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ETag", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setETag(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createOriginEndpointResult;
    }

    private static CreateOriginEndpointResultJsonUnmarshaller instance;

    public static CreateOriginEndpointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateOriginEndpointResultJsonUnmarshaller();
        return instance;
    }
}
