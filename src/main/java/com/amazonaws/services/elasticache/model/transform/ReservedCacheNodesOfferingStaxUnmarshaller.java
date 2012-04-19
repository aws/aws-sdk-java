/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticache.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Reserved Cache Nodes Offering StAX Unmarshaller
 */
public class ReservedCacheNodesOfferingStaxUnmarshaller implements Unmarshaller<ReservedCacheNodesOffering, StaxUnmarshallerContext> {

    public ReservedCacheNodesOffering unmarshall(StaxUnmarshallerContext context) throws Exception {
        ReservedCacheNodesOffering reservedCacheNodesOffering = new ReservedCacheNodesOffering();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        if (context.isStartOfDocument()) targetDepth++;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return reservedCacheNodesOffering;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("ReservedCacheNodesOfferingId", targetDepth)) {
                    reservedCacheNodesOffering.setReservedCacheNodesOfferingId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheNodeType", targetDepth)) {
                    reservedCacheNodesOffering.setCacheNodeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Duration", targetDepth)) {
                    reservedCacheNodesOffering.setDuration(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("FixedPrice", targetDepth)) {
                    reservedCacheNodesOffering.setFixedPrice(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("UsagePrice", targetDepth)) {
                    reservedCacheNodesOffering.setUsagePrice(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ProductDescription", targetDepth)) {
                    reservedCacheNodesOffering.setProductDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("OfferingType", targetDepth)) {
                    reservedCacheNodesOffering.setOfferingType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RecurringCharges/RecurringCharge", targetDepth)) {
                    reservedCacheNodesOffering.getRecurringCharges().add(RecurringChargeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return reservedCacheNodesOffering;
                }
            }
        }
    }

    private static ReservedCacheNodesOfferingStaxUnmarshaller instance;
    public static ReservedCacheNodesOfferingStaxUnmarshaller getInstance() {
        if (instance == null) instance = new ReservedCacheNodesOfferingStaxUnmarshaller();
        return instance;
    }
}
    