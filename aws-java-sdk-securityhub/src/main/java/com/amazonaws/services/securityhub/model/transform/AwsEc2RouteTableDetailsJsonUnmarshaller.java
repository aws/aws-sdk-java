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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsEc2RouteTableDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2RouteTableDetailsJsonUnmarshaller implements Unmarshaller<AwsEc2RouteTableDetails, JsonUnmarshallerContext> {

    public AwsEc2RouteTableDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2RouteTableDetails awsEc2RouteTableDetails = new AwsEc2RouteTableDetails();

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
                if (context.testExpression("AssociationSet", targetDepth)) {
                    context.nextToken();
                    awsEc2RouteTableDetails.setAssociationSet(new ListUnmarshaller<AssociationSetDetails>(AssociationSetDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("OwnerId", targetDepth)) {
                    context.nextToken();
                    awsEc2RouteTableDetails.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PropagatingVgwSet", targetDepth)) {
                    context.nextToken();
                    awsEc2RouteTableDetails.setPropagatingVgwSet(new ListUnmarshaller<PropagatingVgwSetDetails>(PropagatingVgwSetDetailsJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RouteTableId", targetDepth)) {
                    context.nextToken();
                    awsEc2RouteTableDetails.setRouteTableId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RouteSet", targetDepth)) {
                    context.nextToken();
                    awsEc2RouteTableDetails.setRouteSet(new ListUnmarshaller<RouteSetDetails>(RouteSetDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    awsEc2RouteTableDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2RouteTableDetails;
    }

    private static AwsEc2RouteTableDetailsJsonUnmarshaller instance;

    public static AwsEc2RouteTableDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2RouteTableDetailsJsonUnmarshaller();
        return instance;
    }
}
