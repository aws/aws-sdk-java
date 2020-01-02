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
 * GetCapacityReservationUsageResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCapacityReservationUsageResultStaxUnmarshaller implements Unmarshaller<GetCapacityReservationUsageResult, StaxUnmarshallerContext> {

    public GetCapacityReservationUsageResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetCapacityReservationUsageResult getCapacityReservationUsageResult = new GetCapacityReservationUsageResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getCapacityReservationUsageResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("nextToken", targetDepth)) {
                    getCapacityReservationUsageResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("capacityReservationId", targetDepth)) {
                    getCapacityReservationUsageResult.setCapacityReservationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceType", targetDepth)) {
                    getCapacityReservationUsageResult.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("totalInstanceCount", targetDepth)) {
                    getCapacityReservationUsageResult.setTotalInstanceCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availableInstanceCount", targetDepth)) {
                    getCapacityReservationUsageResult.setAvailableInstanceCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    getCapacityReservationUsageResult.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceUsageSet", targetDepth)) {
                    getCapacityReservationUsageResult.withInstanceUsages(new ArrayList<InstanceUsage>());
                    continue;
                }

                if (context.testExpression("instanceUsageSet/item", targetDepth)) {
                    getCapacityReservationUsageResult.withInstanceUsages(InstanceUsageStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getCapacityReservationUsageResult;
                }
            }
        }
    }

    private static GetCapacityReservationUsageResultStaxUnmarshaller instance;

    public static GetCapacityReservationUsageResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCapacityReservationUsageResultStaxUnmarshaller();
        return instance;
    }
}
