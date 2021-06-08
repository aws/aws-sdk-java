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
 * NetworkInsightsAnalysis StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInsightsAnalysisStaxUnmarshaller implements Unmarshaller<NetworkInsightsAnalysis, StaxUnmarshallerContext> {

    public NetworkInsightsAnalysis unmarshall(StaxUnmarshallerContext context) throws Exception {
        NetworkInsightsAnalysis networkInsightsAnalysis = new NetworkInsightsAnalysis();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return networkInsightsAnalysis;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("networkInsightsAnalysisId", targetDepth)) {
                    networkInsightsAnalysis.setNetworkInsightsAnalysisId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInsightsAnalysisArn", targetDepth)) {
                    networkInsightsAnalysis.setNetworkInsightsAnalysisArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInsightsPathId", targetDepth)) {
                    networkInsightsAnalysis.setNetworkInsightsPathId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("filterInArnSet", targetDepth)) {
                    networkInsightsAnalysis.withFilterInArns(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("filterInArnSet/item", targetDepth)) {
                    networkInsightsAnalysis.withFilterInArns(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("startDate", targetDepth)) {
                    networkInsightsAnalysis.setStartDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    networkInsightsAnalysis.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("statusMessage", targetDepth)) {
                    networkInsightsAnalysis.setStatusMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkPathFound", targetDepth)) {
                    networkInsightsAnalysis.setNetworkPathFound(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("forwardPathComponentSet", targetDepth)) {
                    networkInsightsAnalysis.withForwardPathComponents(new ArrayList<PathComponent>());
                    continue;
                }

                if (context.testExpression("forwardPathComponentSet/item", targetDepth)) {
                    networkInsightsAnalysis.withForwardPathComponents(PathComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("returnPathComponentSet", targetDepth)) {
                    networkInsightsAnalysis.withReturnPathComponents(new ArrayList<PathComponent>());
                    continue;
                }

                if (context.testExpression("returnPathComponentSet/item", targetDepth)) {
                    networkInsightsAnalysis.withReturnPathComponents(PathComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("explanationSet", targetDepth)) {
                    networkInsightsAnalysis.withExplanations(new ArrayList<Explanation>());
                    continue;
                }

                if (context.testExpression("explanationSet/item", targetDepth)) {
                    networkInsightsAnalysis.withExplanations(ExplanationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("alternatePathHintSet", targetDepth)) {
                    networkInsightsAnalysis.withAlternatePathHints(new ArrayList<AlternatePathHint>());
                    continue;
                }

                if (context.testExpression("alternatePathHintSet/item", targetDepth)) {
                    networkInsightsAnalysis.withAlternatePathHints(AlternatePathHintStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    networkInsightsAnalysis.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    networkInsightsAnalysis.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return networkInsightsAnalysis;
                }
            }
        }
    }

    private static NetworkInsightsAnalysisStaxUnmarshaller instance;

    public static NetworkInsightsAnalysisStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInsightsAnalysisStaxUnmarshaller();
        return instance;
    }
}
