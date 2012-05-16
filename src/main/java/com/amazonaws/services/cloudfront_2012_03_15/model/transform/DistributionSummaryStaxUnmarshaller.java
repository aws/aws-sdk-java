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
 * Distribution Summary StAX Unmarshaller
 */
public class DistributionSummaryStaxUnmarshaller implements Unmarshaller<DistributionSummary, StaxUnmarshallerContext> {

    public DistributionSummary unmarshall(StaxUnmarshallerContext context) throws Exception {
        DistributionSummary distributionSummary = new DistributionSummary();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        if (context.isStartOfDocument()) targetDepth += 1;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return distributionSummary;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("Id", targetDepth)) {
                    distributionSummary.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    distributionSummary.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    distributionSummary.setLastModifiedTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    distributionSummary.setDomainName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("S3Origin", targetDepth)) {
                    distributionSummary.setS3Origin(S3OriginStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CustomOrigin", targetDepth)) {
                    distributionSummary.setCustomOrigin(CustomOriginStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CNAME", targetDepth)) {
                    distributionSummary.getCNAME().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Comment", targetDepth)) {
                    distributionSummary.setComment(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    distributionSummary.setEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("TrustedSigners", targetDepth)) {
                    distributionSummary.setTrustedSigners(TrustedSignersStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CachingBehavior", targetDepth)) {
                    distributionSummary.setCachingBehavior(CachingBehaviorStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return distributionSummary;
                }
            }
        }
    }

    private static DistributionSummaryStaxUnmarshaller instance;
    public static DistributionSummaryStaxUnmarshaller getInstance() {
        if (instance == null) instance = new DistributionSummaryStaxUnmarshaller();
        return instance;
    }
}
    
