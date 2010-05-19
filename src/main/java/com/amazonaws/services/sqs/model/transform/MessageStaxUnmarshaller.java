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

package com.amazonaws.services.sqs.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Message StAX Unmarshaller
 */
public class MessageStaxUnmarshaller implements Unmarshaller<Message, StaxUnmarshallerContext> {

    
    private static class AttributesMapEntryUnmarshaller implements Unmarshaller<Map.Entry<String, String>, StaxUnmarshallerContext> {
        @Override
        public Entry<String, String> unmarshall(StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<String, String> entry
                = new MapEntry<String, String>();

            while (true) {
                XMLEvent event = context.nextEvent();
                if (event.isEndDocument()) return entry;

                if (event.isAttribute() || event.isStartElement()) {
                    if (context.testExpression("Name", targetDepth)) {
                        entry.setKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                    if (context.testExpression("Value", targetDepth)) {
                        entry.setValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                } else if (event.isEndElement()) {
                    if (context.getCurrentDepth() < originalDepth) return entry;
                }
            }
        }

        private static AttributesMapEntryUnmarshaller instance;
        public static AttributesMapEntryUnmarshaller getInstance() {
            if (instance == null) instance = new AttributesMapEntryUnmarshaller();
            return instance;
        }

    }
    

    public Message unmarshall(StaxUnmarshallerContext context) throws Exception {
        Message message = new Message();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        
        if (context.isStartOfDocument()) targetDepth += 2;

        while (true) {
            XMLEvent event = context.nextEvent();
            if (event.isEndDocument()) return message;

            if (event.isAttribute() || event.isStartElement()) {
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
                    message.getAttributes().put(entry.getKey(), entry.getValue());
                    continue;
                }
            } else if (event.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return message;
                }
            }
        }
    }

    private static MessageStaxUnmarshaller instance;
    public static MessageStaxUnmarshaller getInstance() {
        if (instance == null) instance = new MessageStaxUnmarshaller();
        return instance;
    }
}
    