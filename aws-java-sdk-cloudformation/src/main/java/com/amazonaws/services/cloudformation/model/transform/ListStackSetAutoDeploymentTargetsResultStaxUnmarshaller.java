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
 * ListStackSetAutoDeploymentTargetsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStackSetAutoDeploymentTargetsResultStaxUnmarshaller implements Unmarshaller<ListStackSetAutoDeploymentTargetsResult, StaxUnmarshallerContext> {

    public ListStackSetAutoDeploymentTargetsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListStackSetAutoDeploymentTargetsResult listStackSetAutoDeploymentTargetsResult = new ListStackSetAutoDeploymentTargetsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listStackSetAutoDeploymentTargetsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Summaries", targetDepth)) {
                    listStackSetAutoDeploymentTargetsResult.withSummaries(new ArrayList<StackSetAutoDeploymentTargetSummary>());
                    continue;
                }

                if (context.testExpression("Summaries/member", targetDepth)) {
                    listStackSetAutoDeploymentTargetsResult
                            .withSummaries(StackSetAutoDeploymentTargetSummaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextToken", targetDepth)) {
                    listStackSetAutoDeploymentTargetsResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listStackSetAutoDeploymentTargetsResult;
                }
            }
        }
    }

    private static ListStackSetAutoDeploymentTargetsResultStaxUnmarshaller instance;

    public static ListStackSetAutoDeploymentTargetsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListStackSetAutoDeploymentTargetsResultStaxUnmarshaller();
        return instance;
    }
}
