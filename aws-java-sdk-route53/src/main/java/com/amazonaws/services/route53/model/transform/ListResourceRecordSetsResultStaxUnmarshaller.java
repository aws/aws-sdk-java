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
package com.amazonaws.services.route53.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ListResourceRecordSetsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceRecordSetsResultStaxUnmarshaller implements Unmarshaller<ListResourceRecordSetsResult, StaxUnmarshallerContext> {

    public ListResourceRecordSetsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListResourceRecordSetsResult listResourceRecordSetsResult = new ListResourceRecordSetsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listResourceRecordSetsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ResourceRecordSets", targetDepth)) {
                    listResourceRecordSetsResult.withResourceRecordSets(new ArrayList<ResourceRecordSet>());
                    continue;
                }

                if (context.testExpression("ResourceRecordSets/ResourceRecordSet", targetDepth)) {
                    listResourceRecordSetsResult.withResourceRecordSets(ResourceRecordSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsTruncated", targetDepth)) {
                    listResourceRecordSetsResult.setIsTruncated(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextRecordName", targetDepth)) {
                    listResourceRecordSetsResult.setNextRecordName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextRecordType", targetDepth)) {
                    listResourceRecordSetsResult.setNextRecordType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextRecordIdentifier", targetDepth)) {
                    listResourceRecordSetsResult.setNextRecordIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxItems", targetDepth)) {
                    listResourceRecordSetsResult.setMaxItems(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listResourceRecordSetsResult;
                }
            }
        }
    }

    private static ListResourceRecordSetsResultStaxUnmarshaller instance;

    public static ListResourceRecordSetsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListResourceRecordSetsResultStaxUnmarshaller();
        return instance;
    }
}
