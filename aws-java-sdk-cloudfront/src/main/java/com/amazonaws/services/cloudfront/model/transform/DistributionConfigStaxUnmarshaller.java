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
package com.amazonaws.services.cloudfront.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DistributionConfig StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DistributionConfigStaxUnmarshaller implements Unmarshaller<DistributionConfig, StaxUnmarshallerContext> {

    public DistributionConfig unmarshall(StaxUnmarshallerContext context) throws Exception {
        DistributionConfig distributionConfig = new DistributionConfig();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return distributionConfig;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CallerReference", targetDepth)) {
                    distributionConfig.setCallerReference(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Aliases", targetDepth)) {
                    distributionConfig.setAliases(AliasesStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DefaultRootObject", targetDepth)) {
                    distributionConfig.setDefaultRootObject(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Origins", targetDepth)) {
                    distributionConfig.setOrigins(OriginsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OriginGroups", targetDepth)) {
                    distributionConfig.setOriginGroups(OriginGroupsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DefaultCacheBehavior", targetDepth)) {
                    distributionConfig.setDefaultCacheBehavior(DefaultCacheBehaviorStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheBehaviors", targetDepth)) {
                    distributionConfig.setCacheBehaviors(CacheBehaviorsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomErrorResponses", targetDepth)) {
                    distributionConfig.setCustomErrorResponses(CustomErrorResponsesStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Comment", targetDepth)) {
                    distributionConfig.setComment(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Logging", targetDepth)) {
                    distributionConfig.setLogging(LoggingConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PriceClass", targetDepth)) {
                    distributionConfig.setPriceClass(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Enabled", targetDepth)) {
                    distributionConfig.setEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ViewerCertificate", targetDepth)) {
                    distributionConfig.setViewerCertificate(ViewerCertificateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Restrictions", targetDepth)) {
                    distributionConfig.setRestrictions(RestrictionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("WebACLId", targetDepth)) {
                    distributionConfig.setWebACLId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HttpVersion", targetDepth)) {
                    distributionConfig.setHttpVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsIPV6Enabled", targetDepth)) {
                    distributionConfig.setIsIPV6Enabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return distributionConfig;
                }
            }
        }
    }

    private static DistributionConfigStaxUnmarshaller instance;

    public static DistributionConfigStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DistributionConfigStaxUnmarshaller();
        return instance;
    }
}
