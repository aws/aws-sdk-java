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

import com.amazonaws.util.XmlUtils;
import java.io.InputStream;
import java.util.Map.Entry;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

public class BucketNotificationConfigurationStaxUnmarshaller implements
        Unmarshaller<BucketNotificationConfiguration, InputStream> {

    private static final BucketNotificationConfigurationStaxUnmarshaller instance = new BucketNotificationConfigurationStaxUnmarshaller();

    public static BucketNotificationConfigurationStaxUnmarshaller getInstance() {
        return instance;
    }

    private BucketNotificationConfigurationStaxUnmarshaller() {
    }

    @Override
    public BucketNotificationConfiguration unmarshall(InputStream inputStream) throws Exception {
        StaxUnmarshallerContext context =
            new StaxUnmarshallerContext(XmlUtils.getXmlInputFactory().createXMLEventReader(inputStream));
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            targetDepth += 1;
        }

        BucketNotificationConfiguration config = new BucketNotificationConfiguration();

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) {
                return config;
            }
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("TopicConfiguration", targetDepth)) {
                    Entry<String, NotificationConfiguration> entry = TopicConfigurationStaxUnmarshaller.getInstance()
                            .unmarshall(context);
                    config.addConfiguration(entry.getKey(), entry.getValue());
                } else if (context.testExpression("QueueConfiguration", targetDepth)) {
                    Entry<String, NotificationConfiguration> entry = QueueConfigurationStaxUnmarshaller.getInstance()
                            .unmarshall(context);
                    config.addConfiguration(entry.getKey(), entry.getValue());
                } else if (context.testExpression("CloudFunctionConfiguration", targetDepth)) {
                    Entry<String, NotificationConfiguration> entry = LambdaConfigurationStaxUnmarshaller.getInstance()
                            .unmarshall(context);
                    config.addConfiguration(entry.getKey(), entry.getValue());
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return config;
                }
            }
        }
    }

}
