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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Recommendation StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationStaxUnmarshaller implements Unmarshaller<Recommendation, StaxUnmarshallerContext> {

    public Recommendation unmarshall(StaxUnmarshallerContext context) throws Exception {
        Recommendation recommendation = new Recommendation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return recommendation;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Id", targetDepth)) {
                    recommendation.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    recommendation.setClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NamespaceArn", targetDepth)) {
                    recommendation.setNamespaceArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreatedAt", targetDepth)) {
                    recommendation.setCreatedAt(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("RecommendationType", targetDepth)) {
                    recommendation.setRecommendationType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Title", targetDepth)) {
                    recommendation.setTitle(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    recommendation.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Observation", targetDepth)) {
                    recommendation.setObservation(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ImpactRanking", targetDepth)) {
                    recommendation.setImpactRanking(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RecommendationText", targetDepth)) {
                    recommendation.setRecommendationText(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RecommendedActions", targetDepth)) {
                    recommendation.withRecommendedActions(new ArrayList<RecommendedAction>());
                    continue;
                }

                if (context.testExpression("RecommendedActions/RecommendedAction", targetDepth)) {
                    recommendation.withRecommendedActions(RecommendedActionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReferenceLinks", targetDepth)) {
                    recommendation.withReferenceLinks(new ArrayList<ReferenceLink>());
                    continue;
                }

                if (context.testExpression("ReferenceLinks/ReferenceLink", targetDepth)) {
                    recommendation.withReferenceLinks(ReferenceLinkStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return recommendation;
                }
            }
        }
    }

    private static RecommendationStaxUnmarshaller instance;

    public static RecommendationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationStaxUnmarshaller();
        return instance;
    }
}
