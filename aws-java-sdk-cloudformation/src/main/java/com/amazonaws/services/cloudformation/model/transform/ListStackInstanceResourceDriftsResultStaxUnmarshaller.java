/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ListStackInstanceResourceDriftsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStackInstanceResourceDriftsResultStaxUnmarshaller implements Unmarshaller<ListStackInstanceResourceDriftsResult, StaxUnmarshallerContext> {

    public ListStackInstanceResourceDriftsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListStackInstanceResourceDriftsResult listStackInstanceResourceDriftsResult = new ListStackInstanceResourceDriftsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listStackInstanceResourceDriftsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Summaries", targetDepth)) {
                    listStackInstanceResourceDriftsResult.withSummaries(new ArrayList<StackInstanceResourceDriftsSummary>());
                    continue;
                }

                if (context.testExpression("Summaries/member", targetDepth)) {
                    listStackInstanceResourceDriftsResult.withSummaries(StackInstanceResourceDriftsSummaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextToken", targetDepth)) {
                    listStackInstanceResourceDriftsResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listStackInstanceResourceDriftsResult;
                }
            }
        }
    }

    private static ListStackInstanceResourceDriftsResultStaxUnmarshaller instance;

    public static ListStackInstanceResourceDriftsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListStackInstanceResourceDriftsResultStaxUnmarshaller();
        return instance;
    }
}
