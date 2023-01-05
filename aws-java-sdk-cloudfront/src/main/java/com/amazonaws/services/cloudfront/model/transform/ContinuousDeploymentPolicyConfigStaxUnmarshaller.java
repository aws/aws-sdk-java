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
package com.amazonaws.services.cloudfront.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ContinuousDeploymentPolicyConfig StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContinuousDeploymentPolicyConfigStaxUnmarshaller implements Unmarshaller<ContinuousDeploymentPolicyConfig, StaxUnmarshallerContext> {

    public ContinuousDeploymentPolicyConfig unmarshall(StaxUnmarshallerContext context) throws Exception {
        ContinuousDeploymentPolicyConfig continuousDeploymentPolicyConfig = new ContinuousDeploymentPolicyConfig();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return continuousDeploymentPolicyConfig;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("StagingDistributionDnsNames", targetDepth)) {
                    continuousDeploymentPolicyConfig.setStagingDistributionDnsNames(StagingDistributionDnsNamesStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("Enabled", targetDepth)) {
                    continuousDeploymentPolicyConfig.setEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TrafficConfig", targetDepth)) {
                    continuousDeploymentPolicyConfig.setTrafficConfig(TrafficConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return continuousDeploymentPolicyConfig;
                }
            }
        }
    }

    private static ContinuousDeploymentPolicyConfigStaxUnmarshaller instance;

    public static ContinuousDeploymentPolicyConfigStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContinuousDeploymentPolicyConfigStaxUnmarshaller();
        return instance;
    }
}
