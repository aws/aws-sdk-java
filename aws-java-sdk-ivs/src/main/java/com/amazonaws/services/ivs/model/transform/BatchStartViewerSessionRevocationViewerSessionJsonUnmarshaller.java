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
package com.amazonaws.services.ivs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ivs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchStartViewerSessionRevocationViewerSession JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStartViewerSessionRevocationViewerSessionJsonUnmarshaller implements
        Unmarshaller<BatchStartViewerSessionRevocationViewerSession, JsonUnmarshallerContext> {

    public BatchStartViewerSessionRevocationViewerSession unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchStartViewerSessionRevocationViewerSession batchStartViewerSessionRevocationViewerSession = new BatchStartViewerSessionRevocationViewerSession();

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
                if (context.testExpression("channelArn", targetDepth)) {
                    context.nextToken();
                    batchStartViewerSessionRevocationViewerSession.setChannelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("viewerId", targetDepth)) {
                    context.nextToken();
                    batchStartViewerSessionRevocationViewerSession.setViewerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("viewerSessionVersionsLessThanOrEqualTo", targetDepth)) {
                    context.nextToken();
                    batchStartViewerSessionRevocationViewerSession.setViewerSessionVersionsLessThanOrEqualTo(context.getUnmarshaller(Integer.class).unmarshall(
                            context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchStartViewerSessionRevocationViewerSession;
    }

    private static BatchStartViewerSessionRevocationViewerSessionJsonUnmarshaller instance;

    public static BatchStartViewerSessionRevocationViewerSessionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchStartViewerSessionRevocationViewerSessionJsonUnmarshaller();
        return instance;
    }
}
