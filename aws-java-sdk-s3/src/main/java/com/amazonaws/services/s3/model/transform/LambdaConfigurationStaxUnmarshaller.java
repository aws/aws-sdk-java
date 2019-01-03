/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.transform;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.s3.model.CloudFunctionConfiguration;
import com.amazonaws.services.s3.model.Filter;
import com.amazonaws.services.s3.model.LambdaConfiguration;
import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/**
 * CloudFunctionConfiguration is a little different then Topic or Queue Configurations and thus
 * doesn't fit nicely as a subclass of {@link NotificationConfigurationStaxUnmarshaller}. A
 * CloudFunctionConfiguration element may be unmarshalled into two different classes based on
 * presence of the InvocationRole attribute. If InvocationRole is present we unmarshall into the
 * legacy {@link CloudFunctionConfiguration}, otherwise we unmarshall into
 * {@link LambdaConfiguration}.
 */
class LambdaConfigurationStaxUnmarshaller implements
        Unmarshaller<Entry<String, NotificationConfiguration>, StaxUnmarshallerContext> {

    private static final LambdaConfigurationStaxUnmarshaller instance = new LambdaConfigurationStaxUnmarshaller();

    public static LambdaConfigurationStaxUnmarshaller getInstance() {
        return instance;
    }

    private LambdaConfigurationStaxUnmarshaller() {
    }

    @Override
    public Entry<String, NotificationConfiguration> unmarshall(StaxUnmarshallerContext context) throws Exception {
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            targetDepth += 1;
        }

        String id = null;
        List<String> events = new ArrayList<String>();
        Filter filter = null;
        String functionArn = null;
        String invocationRole = null;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) {
                return createLambdaConfig(id, events, functionArn, invocationRole, filter);
            }

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("Id", targetDepth)) {
                    id = StringStaxUnmarshaller.getInstance().unmarshall(context);
                } else if (context.testExpression("Event", targetDepth)) {
                    events.add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                } else if (context.testExpression("Filter", targetDepth)) {
                    filter = FilterStaxUnmarshaller.getInstance().unmarshall(context);
                } else if (context.testExpression("CloudFunction", targetDepth)) {
                    functionArn = StringStaxUnmarshaller.getInstance().unmarshall(context);
                } else if (context.testExpression("InvocationRole", targetDepth)) {
                    invocationRole = StringStaxUnmarshaller.getInstance().unmarshall(context);
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createLambdaConfig(id, events, functionArn, invocationRole, filter);
                }
            }
        }
    }

    private Entry<String, NotificationConfiguration> createLambdaConfig(String id,
                                                                        List<String> events,
                                                                        String functionArn,
                                                                        String invocationRole,
                                                                        Filter filter) {
        NotificationConfiguration config;
        if (invocationRole == null) {
            config = new LambdaConfiguration(functionArn, events.toArray(new String[0]));
        } else {
            config = new CloudFunctionConfiguration(invocationRole, functionArn, events.toArray(new String[0]));
        }
        return new SimpleEntry<String, NotificationConfiguration>(id, config.withFilter(filter));
    }

}
