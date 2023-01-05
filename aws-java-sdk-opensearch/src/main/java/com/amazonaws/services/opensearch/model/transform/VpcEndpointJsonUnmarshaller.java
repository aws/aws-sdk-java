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
package com.amazonaws.services.opensearch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opensearch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VpcEndpoint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcEndpointJsonUnmarshaller implements Unmarshaller<VpcEndpoint, JsonUnmarshallerContext> {

    public VpcEndpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        VpcEndpoint vpcEndpoint = new VpcEndpoint();

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
                if (context.testExpression("VpcEndpointId", targetDepth)) {
                    context.nextToken();
                    vpcEndpoint.setVpcEndpointId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcEndpointOwner", targetDepth)) {
                    context.nextToken();
                    vpcEndpoint.setVpcEndpointOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainArn", targetDepth)) {
                    context.nextToken();
                    vpcEndpoint.setDomainArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcOptions", targetDepth)) {
                    context.nextToken();
                    vpcEndpoint.setVpcOptions(VPCDerivedInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    vpcEndpoint.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    context.nextToken();
                    vpcEndpoint.setEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return vpcEndpoint;
    }

    private static VpcEndpointJsonUnmarshaller instance;

    public static VpcEndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpcEndpointJsonUnmarshaller();
        return instance;
    }
}
