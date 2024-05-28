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
 * GetOriginEndpointResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOriginEndpointResultJsonUnmarshaller implements Unmarshaller<GetOriginEndpointResult, JsonUnmarshallerContext> {

    public GetOriginEndpointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetOriginEndpointResult getOriginEndpointResult = new GetOriginEndpointResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getOriginEndpointResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    getOriginEndpointResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChannelGroupName", targetDepth)) {
                    context.nextToken();
                    getOriginEndpointResult.setChannelGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChannelName", targetDepth)) {
                    context.nextToken();
                    getOriginEndpointResult.setChannelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OriginEndpointName", targetDepth)) {
                    context.nextToken();
                    getOriginEndpointResult.setOriginEndpointName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContainerType", targetDepth)) {
                    context.nextToken();
                    getOriginEndpointResult.setContainerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Segment", targetDepth)) {
                    context.nextToken();
                    getOriginEndpointResult.setSegment(SegmentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    getOriginEndpointResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ModifiedAt", targetDepth)) {
                    context.nextToken();
                    getOriginEndpointResult.setModifiedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getOriginEndpointResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartoverWindowSeconds", targetDepth)) {
                    context.nextToken();
                    getOriginEndpointResult.setStartoverWindowSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("HlsManifests", targetDepth)) {
                    context.nextToken();
                    getOriginEndpointResult.setHlsManifests(new ListUnmarshaller<GetHlsManifestConfiguration>(GetHlsManifestConfigurationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LowLatencyHlsManifests", targetDepth)) {
                    context.nextToken();
                    getOriginEndpointResult.setLowLatencyHlsManifests(new ListUnmarshaller<GetLowLatencyHlsManifestConfiguration>(
                            GetLowLatencyHlsManifestConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ETag", targetDepth)) {
                    context.nextToken();
                    getOriginEndpointResult.setETag(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    getOriginEndpointResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("DashManifests", targetDepth)) {
                    context.nextToken();
                    getOriginEndpointResult.setDashManifests(new ListUnmarshaller<GetDashManifestConfiguration>(GetDashManifestConfigurationJsonUnmarshaller
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

        return getOriginEndpointResult;
    }

    private static GetOriginEndpointResultJsonUnmarshaller instance;

    public static GetOriginEndpointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetOriginEndpointResultJsonUnmarshaller();
        return instance;
    }
}
