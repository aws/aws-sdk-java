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
 * ReservedInstancesListing StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedInstancesListingStaxUnmarshaller implements Unmarshaller<ReservedInstancesListing, StaxUnmarshallerContext> {

    public ReservedInstancesListing unmarshall(StaxUnmarshallerContext context) throws Exception {
        ReservedInstancesListing reservedInstancesListing = new ReservedInstancesListing();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return reservedInstancesListing;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("clientToken", targetDepth)) {
                    reservedInstancesListing.setClientToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("createDate", targetDepth)) {
                    reservedInstancesListing.setCreateDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceCounts", targetDepth)) {
                    reservedInstancesListing.withInstanceCounts(new ArrayList<InstanceCount>());
                    continue;
                }

                if (context.testExpression("instanceCounts/item", targetDepth)) {
                    reservedInstancesListing.withInstanceCounts(InstanceCountStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("priceSchedules", targetDepth)) {
                    reservedInstancesListing.withPriceSchedules(new ArrayList<PriceSchedule>());
                    continue;
                }

                if (context.testExpression("priceSchedules/item", targetDepth)) {
                    reservedInstancesListing.withPriceSchedules(PriceScheduleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("reservedInstancesId", targetDepth)) {
                    reservedInstancesListing.setReservedInstancesId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("reservedInstancesListingId", targetDepth)) {
                    reservedInstancesListing.setReservedInstancesListingId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    reservedInstancesListing.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("statusMessage", targetDepth)) {
                    reservedInstancesListing.setStatusMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    reservedInstancesListing.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    reservedInstancesListing.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("updateDate", targetDepth)) {
                    reservedInstancesListing.setUpdateDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return reservedInstancesListing;
                }
            }
        }
    }

    private static ReservedInstancesListingStaxUnmarshaller instance;

    public static ReservedInstancesListingStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedInstancesListingStaxUnmarshaller();
        return instance;
    }
}
