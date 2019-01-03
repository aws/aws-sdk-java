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
package com.amazonaws.services.simpleemail.model.transform;

import java.util.Map;

import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetIdentityDkimAttributesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIdentityDkimAttributesResultStaxUnmarshaller implements Unmarshaller<GetIdentityDkimAttributesResult, StaxUnmarshallerContext> {

    private static class DkimAttributesMapEntryUnmarshaller implements Unmarshaller<Map.Entry<String, IdentityDkimAttributes>, StaxUnmarshallerContext> {

        @Override
        public Entry<String, IdentityDkimAttributes> unmarshall(StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<String, IdentityDkimAttributes> entry = new MapEntry<String, IdentityDkimAttributes>();

            while (true) {
                XMLEvent xmlEvent = context.nextEvent();
                if (xmlEvent.isEndDocument())
                    return entry;

                if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                    if (context.testExpression("key", targetDepth)) {
                        entry.setKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                    if (context.testExpression("value", targetDepth)) {
                        entry.setValue(IdentityDkimAttributesStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                } else if (xmlEvent.isEndElement()) {
                    if (context.getCurrentDepth() < originalDepth)
                        return entry;
                }
            }
        }

        private static DkimAttributesMapEntryUnmarshaller instance;

        public static DkimAttributesMapEntryUnmarshaller getInstance() {
            if (instance == null)
                instance = new DkimAttributesMapEntryUnmarshaller();
            return instance;
        }

    }

    public GetIdentityDkimAttributesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetIdentityDkimAttributesResult getIdentityDkimAttributesResult = new GetIdentityDkimAttributesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getIdentityDkimAttributesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DkimAttributes/entry", targetDepth)) {
                    Entry<String, IdentityDkimAttributes> entry = DkimAttributesMapEntryUnmarshaller.getInstance().unmarshall(context);
                    getIdentityDkimAttributesResult.addDkimAttributesEntry(entry.getKey(), entry.getValue());
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getIdentityDkimAttributesResult;
                }
            }
        }
    }

    private static GetIdentityDkimAttributesResultStaxUnmarshaller instance;

    public static GetIdentityDkimAttributesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetIdentityDkimAttributesResultStaxUnmarshaller();
        return instance;
    }
}
