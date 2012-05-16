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
 * Custom Origin StAX Unmarshaller
 */
public class CustomOriginStaxUnmarshaller implements Unmarshaller<CustomOrigin, StaxUnmarshallerContext> {

    public CustomOrigin unmarshall(StaxUnmarshallerContext context) throws Exception {
        CustomOrigin customOrigin = new CustomOrigin();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        if (context.isStartOfDocument()) targetDepth += 1;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return customOrigin;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("DNSName", targetDepth)) {
                    customOrigin.setDNSName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HTTPPort", targetDepth)) {
                    customOrigin.setHTTPPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HTTPSPort", targetDepth)) {
                    customOrigin.setHTTPSPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("OriginProtocolPolicy", targetDepth)) {
                    customOrigin.setOriginProtocolPolicy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return customOrigin;
                }
            }
        }
    }

    private static CustomOriginStaxUnmarshaller instance;
    public static CustomOriginStaxUnmarshaller getInstance() {
        if (instance == null) instance = new CustomOriginStaxUnmarshaller();
        return instance;
    }
}
    
