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

package com.amazonaws.services.simpleemail.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Identity Notification Attributes StAX Unmarshaller
 */
public class IdentityNotificationAttributesStaxUnmarshaller implements Unmarshaller<IdentityNotificationAttributes, StaxUnmarshallerContext> {

    public IdentityNotificationAttributes unmarshall(StaxUnmarshallerContext context) throws Exception {
        IdentityNotificationAttributes identityNotificationAttributes = new IdentityNotificationAttributes();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return identityNotificationAttributes;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("BounceTopic", targetDepth)) {
                    identityNotificationAttributes.setBounceTopic(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ComplaintTopic", targetDepth)) {
                    identityNotificationAttributes.setComplaintTopic(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ForwardingEnabled", targetDepth)) {
                    identityNotificationAttributes.setForwardingEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return identityNotificationAttributes;
                }
            }
        }
    }

    private static IdentityNotificationAttributesStaxUnmarshaller instance;
    public static IdentityNotificationAttributesStaxUnmarshaller getInstance() {
        if (instance == null) instance = new IdentityNotificationAttributesStaxUnmarshaller();
        return instance;
    }
}
    