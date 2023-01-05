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
package com.amazonaws.services.networkmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CoreNetworkChangeValues JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetworkChangeValuesJsonUnmarshaller implements Unmarshaller<CoreNetworkChangeValues, JsonUnmarshallerContext> {

    public CoreNetworkChangeValues unmarshall(JsonUnmarshallerContext context) throws Exception {
        CoreNetworkChangeValues coreNetworkChangeValues = new CoreNetworkChangeValues();

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
                if (context.testExpression("SegmentName", targetDepth)) {
                    context.nextToken();
                    coreNetworkChangeValues.setSegmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EdgeLocations", targetDepth)) {
                    context.nextToken();
                    coreNetworkChangeValues.setEdgeLocations(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Asn", targetDepth)) {
                    context.nextToken();
                    coreNetworkChangeValues.setAsn(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Cidr", targetDepth)) {
                    context.nextToken();
                    coreNetworkChangeValues.setCidr(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationIdentifier", targetDepth)) {
                    context.nextToken();
                    coreNetworkChangeValues.setDestinationIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InsideCidrBlocks", targetDepth)) {
                    context.nextToken();
                    coreNetworkChangeValues.setInsideCidrBlocks(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SharedSegments", targetDepth)) {
                    context.nextToken();
                    coreNetworkChangeValues.setSharedSegments(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return coreNetworkChangeValues;
    }

    private static CoreNetworkChangeValuesJsonUnmarshaller instance;

    public static CoreNetworkChangeValuesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CoreNetworkChangeValuesJsonUnmarshaller();
        return instance;
    }
}
