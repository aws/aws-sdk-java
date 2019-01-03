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
package com.amazonaws.services.sqs.model.transform;

import java.util.Map;

import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * SendMessageBatchRequestEntry StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendMessageBatchRequestEntryStaxUnmarshaller implements Unmarshaller<SendMessageBatchRequestEntry, StaxUnmarshallerContext> {

    private static class MessageAttributesMapEntryUnmarshaller implements Unmarshaller<Map.Entry<String, MessageAttributeValue>, StaxUnmarshallerContext> {

        @Override
        public Entry<String, MessageAttributeValue> unmarshall(StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<String, MessageAttributeValue> entry = new MapEntry<String, MessageAttributeValue>();

            while (true) {
                XMLEvent xmlEvent = context.nextEvent();
                if (xmlEvent.isEndDocument())
                    return entry;

                if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                    if (context.testExpression("Name", targetDepth)) {
                        entry.setKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                    if (context.testExpression("Value", targetDepth)) {
                        entry.setValue(MessageAttributeValueStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                } else if (xmlEvent.isEndElement()) {
                    if (context.getCurrentDepth() < originalDepth)
                        return entry;
                }
            }
        }

        private static MessageAttributesMapEntryUnmarshaller instance;

        public static MessageAttributesMapEntryUnmarshaller getInstance() {
            if (instance == null)
                instance = new MessageAttributesMapEntryUnmarshaller();
            return instance;
        }

    }

    public SendMessageBatchRequestEntry unmarshall(StaxUnmarshallerContext context) throws Exception {
        SendMessageBatchRequestEntry sendMessageBatchRequestEntry = new SendMessageBatchRequestEntry();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return sendMessageBatchRequestEntry;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Id", targetDepth)) {
                    sendMessageBatchRequestEntry.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MessageBody", targetDepth)) {
                    sendMessageBatchRequestEntry.setMessageBody(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DelaySeconds", targetDepth)) {
                    sendMessageBatchRequestEntry.setDelaySeconds(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MessageAttribute", targetDepth)) {
                    Entry<String, MessageAttributeValue> entry = MessageAttributesMapEntryUnmarshaller.getInstance().unmarshall(context);
                    sendMessageBatchRequestEntry.addMessageAttributesEntry(entry.getKey(), entry.getValue());
                    continue;
                }

                if (context.testExpression("MessageDeduplicationId", targetDepth)) {
                    sendMessageBatchRequestEntry.setMessageDeduplicationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MessageGroupId", targetDepth)) {
                    sendMessageBatchRequestEntry.setMessageGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return sendMessageBatchRequestEntry;
                }
            }
        }
    }

    private static SendMessageBatchRequestEntryStaxUnmarshaller instance;

    public static SendMessageBatchRequestEntryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SendMessageBatchRequestEntryStaxUnmarshaller();
        return instance;
    }
}
