/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ManagedPrefixList StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedPrefixListStaxUnmarshaller implements Unmarshaller<ManagedPrefixList, StaxUnmarshallerContext> {

    public ManagedPrefixList unmarshall(StaxUnmarshallerContext context) throws Exception {
        ManagedPrefixList managedPrefixList = new ManagedPrefixList();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return managedPrefixList;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("prefixListId", targetDepth)) {
                    managedPrefixList.setPrefixListId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("addressFamily", targetDepth)) {
                    managedPrefixList.setAddressFamily(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    managedPrefixList.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("stateMessage", targetDepth)) {
                    managedPrefixList.setStateMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("prefixListArn", targetDepth)) {
                    managedPrefixList.setPrefixListArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("prefixListName", targetDepth)) {
                    managedPrefixList.setPrefixListName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("maxEntries", targetDepth)) {
                    managedPrefixList.setMaxEntries(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("version", targetDepth)) {
                    managedPrefixList.setVersion(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    managedPrefixList.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    managedPrefixList.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ownerId", targetDepth)) {
                    managedPrefixList.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return managedPrefixList;
                }
            }
        }
    }

    private static ManagedPrefixListStaxUnmarshaller instance;

    public static ManagedPrefixListStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ManagedPrefixListStaxUnmarshaller();
        return instance;
    }
}
