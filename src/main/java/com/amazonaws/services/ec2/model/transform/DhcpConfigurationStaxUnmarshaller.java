/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.ec2.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Dhcp Configuration StAX Unmarshaller
 */
public class DhcpConfigurationStaxUnmarshaller implements Unmarshaller<DhcpConfiguration, StaxUnmarshallerContext> {

    

    public DhcpConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        DhcpConfiguration dhcpConfiguration = new DhcpConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        
        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            XMLEvent event = context.nextEvent();
            if (event.isEndDocument()) return dhcpConfiguration;

            if (event.isAttribute() || event.isStartElement()) {
                if (context.testExpression("key", targetDepth)) {
                    dhcpConfiguration.setKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("valueSet/item/value", targetDepth)) {
                    dhcpConfiguration.getValues().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (event.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dhcpConfiguration;
                }
            }
        }
    }

    private static DhcpConfigurationStaxUnmarshaller instance;
    public static DhcpConfigurationStaxUnmarshaller getInstance() {
        if (instance == null) instance = new DhcpConfigurationStaxUnmarshaller();
        return instance;
    }
}
    