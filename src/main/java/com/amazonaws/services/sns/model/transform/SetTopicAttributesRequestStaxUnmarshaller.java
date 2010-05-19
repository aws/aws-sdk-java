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

package com.amazonaws.services.sns.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Set Topic Attributes Request StAX Unmarshaller
 */
public class SetTopicAttributesRequestStaxUnmarshaller implements Unmarshaller<SetTopicAttributesRequest, StaxUnmarshallerContext> {

    

    public SetTopicAttributesRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        SetTopicAttributesRequest setTopicAttributesRequest = new SetTopicAttributesRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        
        if (context.isStartOfDocument()) targetDepth += 2;

        while (true) {
            XMLEvent event = context.nextEvent();
            if (event.isEndDocument()) return setTopicAttributesRequest;

            if (event.isAttribute() || event.isStartElement()) {
                if (context.testExpression("TopicArn", targetDepth)) {
                    setTopicAttributesRequest.setTopicArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AttributeName", targetDepth)) {
                    setTopicAttributesRequest.setAttributeName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AttributeValue", targetDepth)) {
                    setTopicAttributesRequest.setAttributeValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (event.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return setTopicAttributesRequest;
                }
            }
        }
    }

    private static SetTopicAttributesRequestStaxUnmarshaller instance;
    public static SetTopicAttributesRequestStaxUnmarshaller getInstance() {
        if (instance == null) instance = new SetTopicAttributesRequestStaxUnmarshaller();
        return instance;
    }
}
    