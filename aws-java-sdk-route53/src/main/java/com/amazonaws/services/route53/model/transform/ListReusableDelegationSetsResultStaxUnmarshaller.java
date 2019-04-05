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
 * ListReusableDelegationSetsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReusableDelegationSetsResultStaxUnmarshaller implements Unmarshaller<ListReusableDelegationSetsResult, StaxUnmarshallerContext> {

    public ListReusableDelegationSetsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListReusableDelegationSetsResult listReusableDelegationSetsResult = new ListReusableDelegationSetsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listReusableDelegationSetsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DelegationSets", targetDepth)) {
                    listReusableDelegationSetsResult.withDelegationSets(new ArrayList<DelegationSet>());
                    continue;
                }

                if (context.testExpression("DelegationSets/DelegationSet", targetDepth)) {
                    listReusableDelegationSetsResult.withDelegationSets(DelegationSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Marker", targetDepth)) {
                    listReusableDelegationSetsResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsTruncated", targetDepth)) {
                    listReusableDelegationSetsResult.setIsTruncated(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextMarker", targetDepth)) {
                    listReusableDelegationSetsResult.setNextMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxItems", targetDepth)) {
                    listReusableDelegationSetsResult.setMaxItems(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listReusableDelegationSetsResult;
                }
            }
        }
    }

    private static ListReusableDelegationSetsResultStaxUnmarshaller instance;

    public static ListReusableDelegationSetsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListReusableDelegationSetsResultStaxUnmarshaller();
        return instance;
    }
}
