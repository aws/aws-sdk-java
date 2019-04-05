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
package com.amazonaws.services.simpleemail.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetSendQuotaResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSendQuotaResultStaxUnmarshaller implements Unmarshaller<GetSendQuotaResult, StaxUnmarshallerContext> {

    public GetSendQuotaResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetSendQuotaResult getSendQuotaResult = new GetSendQuotaResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getSendQuotaResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Max24HourSend", targetDepth)) {
                    getSendQuotaResult.setMax24HourSend(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxSendRate", targetDepth)) {
                    getSendQuotaResult.setMaxSendRate(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SentLast24Hours", targetDepth)) {
                    getSendQuotaResult.setSentLast24Hours(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getSendQuotaResult;
                }
            }
        }
    }

    private static GetSendQuotaResultStaxUnmarshaller instance;

    public static GetSendQuotaResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSendQuotaResultStaxUnmarshaller();
        return instance;
    }
}
