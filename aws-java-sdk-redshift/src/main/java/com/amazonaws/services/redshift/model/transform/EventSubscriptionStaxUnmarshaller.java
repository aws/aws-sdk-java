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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * EventSubscription StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventSubscriptionStaxUnmarshaller implements Unmarshaller<EventSubscription, StaxUnmarshallerContext> {

    public EventSubscription unmarshall(StaxUnmarshallerContext context) throws Exception {
        EventSubscription eventSubscription = new EventSubscription();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return eventSubscription;

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
                    eventSubscription.setSubscriptionCreationTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("SourceType", targetDepth)) {
                    eventSubscription.setSourceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SourceIdsList", targetDepth)) {
                    eventSubscription.withSourceIdsList(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SourceIdsList/SourceId", targetDepth)) {
                    eventSubscription.withSourceIdsList(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EventCategoriesList", targetDepth)) {
                    eventSubscription.withEventCategoriesList(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("EventCategoriesList/EventCategory", targetDepth)) {
                    eventSubscription.withEventCategoriesList(StringStaxUnmarshaller.getInstance().unmarshall(context));
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

                if (context.testExpression("Tags", targetDepth)) {
                    eventSubscription.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("Tags/Tag", targetDepth)) {
                    eventSubscription.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
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
        if (instance == null)
            instance = new EventSubscriptionStaxUnmarshaller();
        return instance;
    }
}
