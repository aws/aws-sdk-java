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

import com.amazonaws.services.s3.model.QueueConfiguration;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;

class QueueConfigurationStaxUnmarshaller extends NotificationConfigurationStaxUnmarshaller<QueueConfiguration> {

    private static final QueueConfigurationStaxUnmarshaller instance = new QueueConfigurationStaxUnmarshaller();

    public static QueueConfigurationStaxUnmarshaller getInstance() {
        return instance;
    }

    private QueueConfigurationStaxUnmarshaller() {
    }

    protected boolean handleXmlEvent(QueueConfiguration queueConfig, StaxUnmarshallerContext context, int targetDepth)
            throws Exception {
        if (context.testExpression("Queue", targetDepth)) {
            queueConfig.setQueueARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
            return true;
        }
        return false;

    }

    protected QueueConfiguration createConfiguration() {
        return new QueueConfiguration();
    }

}
