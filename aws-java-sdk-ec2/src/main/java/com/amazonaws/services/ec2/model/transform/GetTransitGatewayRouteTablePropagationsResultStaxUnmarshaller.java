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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetTransitGatewayRouteTablePropagationsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTransitGatewayRouteTablePropagationsResultStaxUnmarshaller implements
        Unmarshaller<GetTransitGatewayRouteTablePropagationsResult, StaxUnmarshallerContext> {

    public GetTransitGatewayRouteTablePropagationsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetTransitGatewayRouteTablePropagationsResult getTransitGatewayRouteTablePropagationsResult = new GetTransitGatewayRouteTablePropagationsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getTransitGatewayRouteTablePropagationsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("transitGatewayRouteTablePropagations", targetDepth)) {
                    getTransitGatewayRouteTablePropagationsResult
                            .withTransitGatewayRouteTablePropagations(new ArrayList<TransitGatewayRouteTablePropagation>());
                    continue;
                }

                if (context.testExpression("transitGatewayRouteTablePropagations/item", targetDepth)) {
                    getTransitGatewayRouteTablePropagationsResult.withTransitGatewayRouteTablePropagations(TransitGatewayRouteTablePropagationStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("nextToken", targetDepth)) {
                    getTransitGatewayRouteTablePropagationsResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getTransitGatewayRouteTablePropagationsResult;
                }
            }
        }
    }

    private static GetTransitGatewayRouteTablePropagationsResultStaxUnmarshaller instance;

    public static GetTransitGatewayRouteTablePropagationsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTransitGatewayRouteTablePropagationsResultStaxUnmarshaller();
        return instance;
    }
}
