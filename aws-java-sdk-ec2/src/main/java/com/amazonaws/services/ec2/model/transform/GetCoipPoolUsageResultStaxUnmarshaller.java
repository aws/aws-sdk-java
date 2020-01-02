/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * GetCoipPoolUsageResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCoipPoolUsageResultStaxUnmarshaller implements Unmarshaller<GetCoipPoolUsageResult, StaxUnmarshallerContext> {

    public GetCoipPoolUsageResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetCoipPoolUsageResult getCoipPoolUsageResult = new GetCoipPoolUsageResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getCoipPoolUsageResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("coipPoolId", targetDepth)) {
                    getCoipPoolUsageResult.setCoipPoolId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("coipAddressUsageSet", targetDepth)) {
                    getCoipPoolUsageResult.withCoipAddressUsages(new ArrayList<CoipAddressUsage>());
                    continue;
                }

                if (context.testExpression("coipAddressUsageSet/item", targetDepth)) {
                    getCoipPoolUsageResult.withCoipAddressUsages(CoipAddressUsageStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("localGatewayRouteTableId", targetDepth)) {
                    getCoipPoolUsageResult.setLocalGatewayRouteTableId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getCoipPoolUsageResult;
                }
            }
        }
    }

    private static GetCoipPoolUsageResultStaxUnmarshaller instance;

    public static GetCoipPoolUsageResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCoipPoolUsageResultStaxUnmarshaller();
        return instance;
    }
}
