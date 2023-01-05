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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeDataSharesForConsumerResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataSharesForConsumerResultStaxUnmarshaller implements Unmarshaller<DescribeDataSharesForConsumerResult, StaxUnmarshallerContext> {

    public DescribeDataSharesForConsumerResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeDataSharesForConsumerResult describeDataSharesForConsumerResult = new DescribeDataSharesForConsumerResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeDataSharesForConsumerResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DataShares", targetDepth)) {
                    describeDataSharesForConsumerResult.withDataShares(new ArrayList<DataShare>());
                    continue;
                }

                if (context.testExpression("DataShares/member", targetDepth)) {
                    describeDataSharesForConsumerResult.withDataShares(DataShareStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Marker", targetDepth)) {
                    describeDataSharesForConsumerResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeDataSharesForConsumerResult;
                }
            }
        }
    }

    private static DescribeDataSharesForConsumerResultStaxUnmarshaller instance;

    public static DescribeDataSharesForConsumerResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDataSharesForConsumerResultStaxUnmarshaller();
        return instance;
    }
}
