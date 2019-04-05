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
package com.amazonaws.services.applicationdiscovery.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * NeighborConnectionDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NeighborConnectionDetailJsonUnmarshaller implements Unmarshaller<NeighborConnectionDetail, JsonUnmarshallerContext> {

    public NeighborConnectionDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        NeighborConnectionDetail neighborConnectionDetail = new NeighborConnectionDetail();

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
                if (context.testExpression("sourceServerId", targetDepth)) {
                    context.nextToken();
                    neighborConnectionDetail.setSourceServerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinationServerId", targetDepth)) {
                    context.nextToken();
                    neighborConnectionDetail.setDestinationServerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinationPort", targetDepth)) {
                    context.nextToken();
                    neighborConnectionDetail.setDestinationPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("transportProtocol", targetDepth)) {
                    context.nextToken();
                    neighborConnectionDetail.setTransportProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionsCount", targetDepth)) {
                    context.nextToken();
                    neighborConnectionDetail.setConnectionsCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return neighborConnectionDetail;
    }

    private static NeighborConnectionDetailJsonUnmarshaller instance;

    public static NeighborConnectionDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NeighborConnectionDetailJsonUnmarshaller();
        return instance;
    }
}
