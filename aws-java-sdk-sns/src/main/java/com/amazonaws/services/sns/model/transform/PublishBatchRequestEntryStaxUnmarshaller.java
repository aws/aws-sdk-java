/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model.transform;

import java.util.Map;

import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * PublishBatchRequestEntry StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishBatchRequestEntryStaxUnmarshaller implements Unmarshaller<PublishBatchRequestEntry, StaxUnmarshallerContext> {

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

    public PublishBatchRequestEntry unmarshall(StaxUnmarshallerContext context) throws Exception {
        PublishBatchRequestEntry publishBatchRequestEntry = new PublishBatchRequestEntry();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return publishBatchRequestEntry;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Id", targetDepth)) {
                    publishBatchRequestEntry.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Message", targetDepth)) {
                    publishBatchRequestEntry.setMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Subject", targetDepth)) {
                    publishBatchRequestEntry.setSubject(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MessageStructure", targetDepth)) {
                    publishBatchRequestEntry.setMessageStructure(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MessageAttributes/entry", targetDepth)) {
                    Entry<String, MessageAttributeValue> entry = MessageAttributesMapEntryUnmarshaller.getInstance().unmarshall(context);
                    publishBatchRequestEntry.addMessageAttributesEntry(entry.getKey(), entry.getValue());
                    continue;
                }

                if (context.testExpression("MessageDeduplicationId", targetDepth)) {
                    publishBatchRequestEntry.setMessageDeduplicationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MessageGroupId", targetDepth)) {
                    publishBatchRequestEntry.setMessageGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return publishBatchRequestEntry;
                }
            }
        }
    }

    private static PublishBatchRequestEntryStaxUnmarshaller instance;

    public static PublishBatchRequestEntryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PublishBatchRequestEntryStaxUnmarshaller();
        return instance;
    }
}
