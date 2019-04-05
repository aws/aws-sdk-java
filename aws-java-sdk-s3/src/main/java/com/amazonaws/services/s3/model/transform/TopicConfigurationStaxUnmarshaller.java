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

import com.amazonaws.services.s3.model.TopicConfiguration;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;

class TopicConfigurationStaxUnmarshaller extends NotificationConfigurationStaxUnmarshaller<TopicConfiguration> {

    private static final TopicConfigurationStaxUnmarshaller instance = new TopicConfigurationStaxUnmarshaller();

    public static TopicConfigurationStaxUnmarshaller getInstance() {
        return instance;
    }

    private TopicConfigurationStaxUnmarshaller() {
    }

    protected boolean handleXmlEvent(TopicConfiguration topicConfig, StaxUnmarshallerContext context, int targetDepth)
            throws Exception {
        if (context.testExpression("Topic", targetDepth)) {
            topicConfig.setTopicARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
            return true;
        }
        return false;

    }

    protected TopicConfiguration createConfiguration() {
        return new TopicConfiguration();
    }

}
