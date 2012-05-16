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

package com.amazonaws.services.cloudfront_2012_03_15.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.cloudfront_2012_03_15.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Distribution List StAX Unmarshaller
 */
public class DistributionListStaxUnmarshaller implements Unmarshaller<DistributionList, StaxUnmarshallerContext> {

    public DistributionList unmarshall(StaxUnmarshallerContext context) throws Exception {
        DistributionList distributionList = new DistributionList();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        if (context.isStartOfDocument()) targetDepth += 1;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return distributionList;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("Marker", targetDepth)) {
                    distributionList.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextMarker", targetDepth)) {
                    distributionList.setNextMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MaxItems", targetDepth)) {
                    distributionList.setMaxItems(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IsTruncated", targetDepth)) {
                    distributionList.setIsTruncated(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DistributionSummary", targetDepth)) {
                    distributionList.getDistributionSummaries().add(DistributionSummaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return distributionList;
                }
            }
        }
    }

    private static DistributionListStaxUnmarshaller instance;
    public static DistributionListStaxUnmarshaller getInstance() {
        if (instance == null) instance = new DistributionListStaxUnmarshaller();
        return instance;
    }
}
    
