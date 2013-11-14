/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.redshift.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Event Subscription StAX Unmarshaller
 */
public class EventSubscriptionStaxUnmarshaller implements Unmarshaller<EventSubscription, StaxUnmarshallerContext> {

    public EventSubscription unmarshall(StaxUnmarshallerContext context) throws Exception {
        EventSubscription eventSubscription = new EventSubscription();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        if (context.isStartOfDocument()) targetDepth++;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return eventSubscription;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("CustomerAwsId", targetDepth)) {
                    eventSubscription.setCustomerAwsId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CustSubscriptionId", targetDepth)) {
                    eventSubscription.setCustSubscriptionId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SnsTopicArn", targetDepth)) {
                    eventSubscription.setSnsTopicArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    eventSubscription.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SubscriptionCreationTime", targetDepth)) {
                    eventSubscription.setSubscriptionCreationTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SourceType", targetDepth)) {
                    eventSubscription.setSourceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SourceIdsList/SourceId", targetDepth)) {
                    eventSubscription.getSourceIdsList().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EventCategoriesList/EventCategory", targetDepth)) {
                    eventSubscription.getEventCategoriesList().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Severity", targetDepth)) {
                    eventSubscription.setSeverity(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    eventSubscription.setEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return eventSubscription;
                }
            }
        }
    }

    private static EventSubscriptionStaxUnmarshaller instance;
    public static EventSubscriptionStaxUnmarshaller getInstance() {
        if (instance == null) instance = new EventSubscriptionStaxUnmarshaller();
        return instance;
    }
}
    