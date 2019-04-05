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
package com.amazonaws.services.cloudformation.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ListStackInstancesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStackInstancesResultStaxUnmarshaller implements Unmarshaller<ListStackInstancesResult, StaxUnmarshallerContext> {

    public ListStackInstancesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListStackInstancesResult listStackInstancesResult = new ListStackInstancesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listStackInstancesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Summaries", targetDepth)) {
                    listStackInstancesResult.withSummaries(new ArrayList<StackInstanceSummary>());
                    continue;
                }

                if (context.testExpression("Summaries/member", targetDepth)) {
                    listStackInstancesResult.withSummaries(StackInstanceSummaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextToken", targetDepth)) {
                    listStackInstancesResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listStackInstancesResult;
                }
            }
        }
    }

    private static ListStackInstancesResultStaxUnmarshaller instance;

    public static ListStackInstancesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListStackInstancesResultStaxUnmarshaller();
        return instance;
    }
}
