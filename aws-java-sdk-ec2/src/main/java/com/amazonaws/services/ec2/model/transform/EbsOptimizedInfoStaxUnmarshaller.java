/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * EbsOptimizedInfo StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsOptimizedInfoStaxUnmarshaller implements Unmarshaller<EbsOptimizedInfo, StaxUnmarshallerContext> {

    public EbsOptimizedInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
        EbsOptimizedInfo ebsOptimizedInfo = new EbsOptimizedInfo();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ebsOptimizedInfo;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("baselineBandwidthInMbps", targetDepth)) {
                    ebsOptimizedInfo.setBaselineBandwidthInMbps(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("baselineThroughputInMBps", targetDepth)) {
                    ebsOptimizedInfo.setBaselineThroughputInMBps(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("baselineIops", targetDepth)) {
                    ebsOptimizedInfo.setBaselineIops(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("maximumBandwidthInMbps", targetDepth)) {
                    ebsOptimizedInfo.setMaximumBandwidthInMbps(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("maximumThroughputInMBps", targetDepth)) {
                    ebsOptimizedInfo.setMaximumThroughputInMBps(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("maximumIops", targetDepth)) {
                    ebsOptimizedInfo.setMaximumIops(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ebsOptimizedInfo;
                }
            }
        }
    }

    private static EbsOptimizedInfoStaxUnmarshaller instance;

    public static EbsOptimizedInfoStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new EbsOptimizedInfoStaxUnmarshaller();
        return instance;
    }
}
