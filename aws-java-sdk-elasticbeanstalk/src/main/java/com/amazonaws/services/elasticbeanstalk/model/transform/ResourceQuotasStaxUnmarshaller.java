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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ResourceQuotas StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceQuotasStaxUnmarshaller implements Unmarshaller<ResourceQuotas, StaxUnmarshallerContext> {

    public ResourceQuotas unmarshall(StaxUnmarshallerContext context) throws Exception {
        ResourceQuotas resourceQuotas = new ResourceQuotas();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return resourceQuotas;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ApplicationQuota", targetDepth)) {
                    resourceQuotas.setApplicationQuota(ResourceQuotaStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ApplicationVersionQuota", targetDepth)) {
                    resourceQuotas.setApplicationVersionQuota(ResourceQuotaStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EnvironmentQuota", targetDepth)) {
                    resourceQuotas.setEnvironmentQuota(ResourceQuotaStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ConfigurationTemplateQuota", targetDepth)) {
                    resourceQuotas.setConfigurationTemplateQuota(ResourceQuotaStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomPlatformQuota", targetDepth)) {
                    resourceQuotas.setCustomPlatformQuota(ResourceQuotaStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return resourceQuotas;
                }
            }
        }
    }

    private static ResourceQuotasStaxUnmarshaller instance;

    public static ResourceQuotasStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceQuotasStaxUnmarshaller();
        return instance;
    }
}
