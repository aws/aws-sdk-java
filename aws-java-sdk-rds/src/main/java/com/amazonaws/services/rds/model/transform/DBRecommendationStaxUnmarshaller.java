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
 * DBRecommendation StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBRecommendationStaxUnmarshaller implements Unmarshaller<DBRecommendation, StaxUnmarshallerContext> {

    public DBRecommendation unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBRecommendation dBRecommendation = new DBRecommendation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dBRecommendation;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("RecommendationId", targetDepth)) {
                    dBRecommendation.setRecommendationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TypeId", targetDepth)) {
                    dBRecommendation.setTypeId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Severity", targetDepth)) {
                    dBRecommendation.setSeverity(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResourceArn", targetDepth)) {
                    dBRecommendation.setResourceArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    dBRecommendation.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreatedTime", targetDepth)) {
                    dBRecommendation.setCreatedTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("UpdatedTime", targetDepth)) {
                    dBRecommendation.setUpdatedTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Detection", targetDepth)) {
                    dBRecommendation.setDetection(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Recommendation", targetDepth)) {
                    dBRecommendation.setRecommendation(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    dBRecommendation.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Reason", targetDepth)) {
                    dBRecommendation.setReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RecommendedActions", targetDepth)) {
                    dBRecommendation.withRecommendedActions(new ArrayList<RecommendedAction>());
                    continue;
                }

                if (context.testExpression("RecommendedActions/member", targetDepth)) {
                    dBRecommendation.withRecommendedActions(RecommendedActionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Category", targetDepth)) {
                    dBRecommendation.setCategory(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Source", targetDepth)) {
                    dBRecommendation.setSource(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TypeDetection", targetDepth)) {
                    dBRecommendation.setTypeDetection(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TypeRecommendation", targetDepth)) {
                    dBRecommendation.setTypeRecommendation(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Impact", targetDepth)) {
                    dBRecommendation.setImpact(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AdditionalInfo", targetDepth)) {
                    dBRecommendation.setAdditionalInfo(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Links", targetDepth)) {
                    dBRecommendation.withLinks(new ArrayList<DocLink>());
                    continue;
                }

                if (context.testExpression("Links/member", targetDepth)) {
                    dBRecommendation.withLinks(DocLinkStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IssueDetails", targetDepth)) {
                    dBRecommendation.setIssueDetails(IssueDetailsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBRecommendation;
                }
            }
        }
    }

    private static DBRecommendationStaxUnmarshaller instance;

    public static DBRecommendationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBRecommendationStaxUnmarshaller();
        return instance;
    }
}
