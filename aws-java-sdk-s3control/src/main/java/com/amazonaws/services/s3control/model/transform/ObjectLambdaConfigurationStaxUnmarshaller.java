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
package com.amazonaws.services.s3control.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ObjectLambdaConfiguration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectLambdaConfigurationStaxUnmarshaller implements Unmarshaller<ObjectLambdaConfiguration, StaxUnmarshallerContext> {

    public ObjectLambdaConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        ObjectLambdaConfiguration objectLambdaConfiguration = new ObjectLambdaConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return objectLambdaConfiguration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("SupportingAccessPoint", targetDepth)) {
                    objectLambdaConfiguration.setSupportingAccessPoint(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CloudWatchMetricsEnabled", targetDepth)) {
                    objectLambdaConfiguration.setCloudWatchMetricsEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowedFeatures", targetDepth)) {
                    objectLambdaConfiguration.withAllowedFeatures(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AllowedFeatures/AllowedFeature", targetDepth)) {
                    objectLambdaConfiguration.withAllowedFeatures(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TransformationConfigurations", targetDepth)) {
                    objectLambdaConfiguration.withTransformationConfigurations(new ArrayList<ObjectLambdaTransformationConfiguration>());
                    continue;
                }

                if (context.testExpression("TransformationConfigurations/TransformationConfiguration", targetDepth)) {
                    objectLambdaConfiguration.withTransformationConfigurations(ObjectLambdaTransformationConfigurationStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return objectLambdaConfiguration;
                }
            }
        }
    }

    private static ObjectLambdaConfigurationStaxUnmarshaller instance;

    public static ObjectLambdaConfigurationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ObjectLambdaConfigurationStaxUnmarshaller();
        return instance;
    }
}
