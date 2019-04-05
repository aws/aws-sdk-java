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
 * EndpointRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointRequestJsonUnmarshaller implements Unmarshaller<EndpointRequest, JsonUnmarshallerContext> {

    public EndpointRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        EndpointRequest endpointRequest = new EndpointRequest();

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
                    endpointRequest.setAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Attributes", targetDepth)) {
                    context.nextToken();
                    endpointRequest.setAttributes(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("ChannelType", targetDepth)) {
                    context.nextToken();
                    endpointRequest.setChannelType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Demographic", targetDepth)) {
                    context.nextToken();
                    endpointRequest.setDemographic(EndpointDemographicJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EffectiveDate", targetDepth)) {
                    context.nextToken();
                    endpointRequest.setEffectiveDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointStatus", targetDepth)) {
                    context.nextToken();
                    endpointRequest.setEndpointStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Location", targetDepth)) {
                    context.nextToken();
                    endpointRequest.setLocation(EndpointLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Metrics", targetDepth)) {
                    context.nextToken();
                    endpointRequest
                            .setMetrics(new MapUnmarshaller<String, Double>(context.getUnmarshaller(String.class), context.getUnmarshaller(Double.class))
                                    .unmarshall(context));
                }
                if (context.testExpression("OptOut", targetDepth)) {
                    context.nextToken();
                    endpointRequest.setOptOut(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    endpointRequest.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("User", targetDepth)) {
                    context.nextToken();
                    endpointRequest.setUser(EndpointUserJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return endpointRequest;
    }

    private static EndpointRequestJsonUnmarshaller instance;

    public static EndpointRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointRequestJsonUnmarshaller();
        return instance;
    }
}
