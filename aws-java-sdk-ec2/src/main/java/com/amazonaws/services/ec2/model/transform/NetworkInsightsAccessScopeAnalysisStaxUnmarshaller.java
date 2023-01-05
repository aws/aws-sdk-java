/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * NetworkInsightsAccessScopeAnalysis StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInsightsAccessScopeAnalysisStaxUnmarshaller implements Unmarshaller<NetworkInsightsAccessScopeAnalysis, StaxUnmarshallerContext> {

    public NetworkInsightsAccessScopeAnalysis unmarshall(StaxUnmarshallerContext context) throws Exception {
        NetworkInsightsAccessScopeAnalysis networkInsightsAccessScopeAnalysis = new NetworkInsightsAccessScopeAnalysis();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return networkInsightsAccessScopeAnalysis;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("networkInsightsAccessScopeAnalysisId", targetDepth)) {
                    networkInsightsAccessScopeAnalysis.setNetworkInsightsAccessScopeAnalysisId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInsightsAccessScopeAnalysisArn", targetDepth)) {
                    networkInsightsAccessScopeAnalysis.setNetworkInsightsAccessScopeAnalysisArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInsightsAccessScopeId", targetDepth)) {
                    networkInsightsAccessScopeAnalysis.setNetworkInsightsAccessScopeId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    networkInsightsAccessScopeAnalysis.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("statusMessage", targetDepth)) {
                    networkInsightsAccessScopeAnalysis.setStatusMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("warningMessage", targetDepth)) {
                    networkInsightsAccessScopeAnalysis.setWarningMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("startDate", targetDepth)) {
                    networkInsightsAccessScopeAnalysis.setStartDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("endDate", targetDepth)) {
                    networkInsightsAccessScopeAnalysis.setEndDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("findingsFound", targetDepth)) {
                    networkInsightsAccessScopeAnalysis.setFindingsFound(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("analyzedEniCount", targetDepth)) {
                    networkInsightsAccessScopeAnalysis.setAnalyzedEniCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    networkInsightsAccessScopeAnalysis.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    networkInsightsAccessScopeAnalysis.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return networkInsightsAccessScopeAnalysis;
                }
            }
        }
    }

    private static NetworkInsightsAccessScopeAnalysisStaxUnmarshaller instance;

    public static NetworkInsightsAccessScopeAnalysisStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInsightsAccessScopeAnalysisStaxUnmarshaller();
        return instance;
    }
}
