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
package com.amazonaws.services.rds.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * RecommendedAction StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendedActionStaxUnmarshaller implements Unmarshaller<RecommendedAction, StaxUnmarshallerContext> {

    public RecommendedAction unmarshall(StaxUnmarshallerContext context) throws Exception {
        RecommendedAction recommendedAction = new RecommendedAction();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return recommendedAction;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ActionId", targetDepth)) {
                    recommendedAction.setActionId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Title", targetDepth)) {
                    recommendedAction.setTitle(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    recommendedAction.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Operation", targetDepth)) {
                    recommendedAction.setOperation(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Parameters", targetDepth)) {
                    recommendedAction.withParameters(new ArrayList<RecommendedActionParameter>());
                    continue;
                }

                if (context.testExpression("Parameters/member", targetDepth)) {
                    recommendedAction.withParameters(RecommendedActionParameterStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ApplyModes", targetDepth)) {
                    recommendedAction.withApplyModes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ApplyModes/member", targetDepth)) {
                    recommendedAction.withApplyModes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    recommendedAction.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IssueDetails", targetDepth)) {
                    recommendedAction.setIssueDetails(IssueDetailsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ContextAttributes", targetDepth)) {
                    recommendedAction.withContextAttributes(new ArrayList<ContextAttribute>());
                    continue;
                }

                if (context.testExpression("ContextAttributes/member", targetDepth)) {
                    recommendedAction.withContextAttributes(ContextAttributeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return recommendedAction;
                }
            }
        }
    }

    private static RecommendedActionStaxUnmarshaller instance;

    public static RecommendedActionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommendedActionStaxUnmarshaller();
        return instance;
    }
}
