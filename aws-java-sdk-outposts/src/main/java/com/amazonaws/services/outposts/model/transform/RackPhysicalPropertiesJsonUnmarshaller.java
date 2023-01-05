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
package com.amazonaws.services.outposts.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.outposts.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RackPhysicalProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RackPhysicalPropertiesJsonUnmarshaller implements Unmarshaller<RackPhysicalProperties, JsonUnmarshallerContext> {

    public RackPhysicalProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        RackPhysicalProperties rackPhysicalProperties = new RackPhysicalProperties();

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
                if (context.testExpression("PowerDrawKva", targetDepth)) {
                    context.nextToken();
                    rackPhysicalProperties.setPowerDrawKva(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PowerPhase", targetDepth)) {
                    context.nextToken();
                    rackPhysicalProperties.setPowerPhase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PowerConnector", targetDepth)) {
                    context.nextToken();
                    rackPhysicalProperties.setPowerConnector(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PowerFeedDrop", targetDepth)) {
                    context.nextToken();
                    rackPhysicalProperties.setPowerFeedDrop(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UplinkGbps", targetDepth)) {
                    context.nextToken();
                    rackPhysicalProperties.setUplinkGbps(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UplinkCount", targetDepth)) {
                    context.nextToken();
                    rackPhysicalProperties.setUplinkCount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FiberOpticCableType", targetDepth)) {
                    context.nextToken();
                    rackPhysicalProperties.setFiberOpticCableType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OpticalStandard", targetDepth)) {
                    context.nextToken();
                    rackPhysicalProperties.setOpticalStandard(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaximumSupportedWeightLbs", targetDepth)) {
                    context.nextToken();
                    rackPhysicalProperties.setMaximumSupportedWeightLbs(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return rackPhysicalProperties;
    }

    private static RackPhysicalPropertiesJsonUnmarshaller instance;

    public static RackPhysicalPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RackPhysicalPropertiesJsonUnmarshaller();
        return instance;
    }
}
