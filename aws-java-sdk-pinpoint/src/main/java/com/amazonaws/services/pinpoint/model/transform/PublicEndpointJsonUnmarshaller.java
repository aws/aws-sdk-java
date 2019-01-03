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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PublicEndpoint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicEndpointJsonUnmarshaller implements Unmarshaller<PublicEndpoint, JsonUnmarshallerContext> {

    public PublicEndpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        PublicEndpoint publicEndpoint = new PublicEndpoint();

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
                if (context.testExpression("Address", targetDepth)) {
                    context.nextToken();
                    publicEndpoint.setAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Attributes", targetDepth)) {
                    context.nextToken();
                    publicEndpoint.setAttributes(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("ChannelType", targetDepth)) {
                    context.nextToken();
                    publicEndpoint.setChannelType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Demographic", targetDepth)) {
                    context.nextToken();
                    publicEndpoint.setDemographic(EndpointDemographicJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EffectiveDate", targetDepth)) {
                    context.nextToken();
                    publicEndpoint.setEffectiveDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointStatus", targetDepth)) {
                    context.nextToken();
                    publicEndpoint.setEndpointStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Location", targetDepth)) {
                    context.nextToken();
                    publicEndpoint.setLocation(EndpointLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Metrics", targetDepth)) {
                    context.nextToken();
                    publicEndpoint.setMetrics(new MapUnmarshaller<String, Double>(context.getUnmarshaller(String.class), context.getUnmarshaller(Double.class))
                            .unmarshall(context));
                }
                if (context.testExpression("OptOut", targetDepth)) {
                    context.nextToken();
                    publicEndpoint.setOptOut(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    publicEndpoint.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("User", targetDepth)) {
                    context.nextToken();
                    publicEndpoint.setUser(EndpointUserJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return publicEndpoint;
    }

    private static PublicEndpointJsonUnmarshaller instance;

    public static PublicEndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PublicEndpointJsonUnmarshaller();
        return instance;
    }
}
