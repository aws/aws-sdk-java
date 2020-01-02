/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ServiceUpdate StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceUpdateStaxUnmarshaller implements Unmarshaller<ServiceUpdate, StaxUnmarshallerContext> {

    public ServiceUpdate unmarshall(StaxUnmarshallerContext context) throws Exception {
        ServiceUpdate serviceUpdate = new ServiceUpdate();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return serviceUpdate;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ServiceUpdateName", targetDepth)) {
                    serviceUpdate.setServiceUpdateName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ServiceUpdateReleaseDate", targetDepth)) {
                    serviceUpdate.setServiceUpdateReleaseDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("ServiceUpdateEndDate", targetDepth)) {
                    serviceUpdate.setServiceUpdateEndDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("ServiceUpdateSeverity", targetDepth)) {
                    serviceUpdate.setServiceUpdateSeverity(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ServiceUpdateRecommendedApplyByDate", targetDepth)) {
                    serviceUpdate.setServiceUpdateRecommendedApplyByDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("ServiceUpdateStatus", targetDepth)) {
                    serviceUpdate.setServiceUpdateStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ServiceUpdateDescription", targetDepth)) {
                    serviceUpdate.setServiceUpdateDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ServiceUpdateType", targetDepth)) {
                    serviceUpdate.setServiceUpdateType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Engine", targetDepth)) {
                    serviceUpdate.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineVersion", targetDepth)) {
                    serviceUpdate.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AutoUpdateAfterRecommendedApplyByDate", targetDepth)) {
                    serviceUpdate.setAutoUpdateAfterRecommendedApplyByDate(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EstimatedUpdateTime", targetDepth)) {
                    serviceUpdate.setEstimatedUpdateTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return serviceUpdate;
                }
            }
        }
    }

    private static ServiceUpdateStaxUnmarshaller instance;

    public static ServiceUpdateStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceUpdateStaxUnmarshaller();
        return instance;
    }
}
