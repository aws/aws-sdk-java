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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ReservedNodeExchangeStatus StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedNodeExchangeStatusStaxUnmarshaller implements Unmarshaller<ReservedNodeExchangeStatus, StaxUnmarshallerContext> {

    public ReservedNodeExchangeStatus unmarshall(StaxUnmarshallerContext context) throws Exception {
        ReservedNodeExchangeStatus reservedNodeExchangeStatus = new ReservedNodeExchangeStatus();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return reservedNodeExchangeStatus;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ReservedNodeExchangeRequestId", targetDepth)) {
                    reservedNodeExchangeStatus.setReservedNodeExchangeRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    reservedNodeExchangeStatus.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RequestTime", targetDepth)) {
                    reservedNodeExchangeStatus.setRequestTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("SourceReservedNodeId", targetDepth)) {
                    reservedNodeExchangeStatus.setSourceReservedNodeId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SourceReservedNodeType", targetDepth)) {
                    reservedNodeExchangeStatus.setSourceReservedNodeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SourceReservedNodeCount", targetDepth)) {
                    reservedNodeExchangeStatus.setSourceReservedNodeCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetReservedNodeOfferingId", targetDepth)) {
                    reservedNodeExchangeStatus.setTargetReservedNodeOfferingId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetReservedNodeType", targetDepth)) {
                    reservedNodeExchangeStatus.setTargetReservedNodeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetReservedNodeCount", targetDepth)) {
                    reservedNodeExchangeStatus.setTargetReservedNodeCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return reservedNodeExchangeStatus;
                }
            }
        }
    }

    private static ReservedNodeExchangeStatusStaxUnmarshaller instance;

    public static ReservedNodeExchangeStatusStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedNodeExchangeStatusStaxUnmarshaller();
        return instance;
    }
}
