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
 * Message StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageStaxUnmarshaller implements Unmarshaller<Message, StaxUnmarshallerContext> {

    private static class AttributesMapEntryUnmarshaller implements Unmarshaller<Map.Entry<String, String>, StaxUnmarshallerContext> {

        @Override
        public Entry<String, String> unmarshall(StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<String, String> entry = new MapEntry<String, String>();

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
                        entry.setValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                } else if (xmlEvent.isEndElement()) {
                    if (context.getCurrentDepth() < originalDepth)
                        return entry;
                }
            }
        }

        private static AttributesMapEntryUnmarshaller instance;

        public static AttributesMapEntryUnmarshaller getInstance() {
            if (instance == null)
                instance = new AttributesMapEntryUnmarshaller();
            return instance;
        }

    }

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

    public Message unmarshall(StaxUnmarshallerContext context) throws Exception {
        Message message = new Message();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return message;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MessageId", targetDepth)) {
                    message.setMessageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReceiptHandle", targetDepth)) {
                    message.setReceiptHandle(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MD5OfBody", targetDepth)) {
                    message.setMD5OfBody(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Body", targetDepth)) {
                    message.setBody(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Attribute", targetDepth)) {
                    Entry<String, String> entry = AttributesMapEntryUnmarshaller.getInstance().unmarshall(context);
                    message.addAttributesEntry(entry.getKey(), entry.getValue());
                    continue;
                }

                if (context.testExpression("MD5OfMessageAttributes", targetDepth)) {
                    message.setMD5OfMessageAttributes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MessageAttribute", targetDepth)) {
                    Entry<String, MessageAttributeValue> entry = MessageAttributesMapEntryUnmarshaller.getInstance().unmarshall(context);
                    message.addMessageAttributesEntry(entry.getKey(), entry.getValue());
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return message;
                }
            }
        }
    }

    private static MessageStaxUnmarshaller instance;

    public static MessageStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new MessageStaxUnmarshaller();
        return instance;
    }
}
