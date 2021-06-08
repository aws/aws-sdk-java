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
 * ObjectLambdaTransformationConfiguration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectLambdaTransformationConfigurationStaxUnmarshaller implements Unmarshaller<ObjectLambdaTransformationConfiguration, StaxUnmarshallerContext> {

    public ObjectLambdaTransformationConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        ObjectLambdaTransformationConfiguration objectLambdaTransformationConfiguration = new ObjectLambdaTransformationConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return objectLambdaTransformationConfiguration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Actions", targetDepth)) {
                    objectLambdaTransformationConfiguration.withActions(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Actions/Action", targetDepth)) {
                    objectLambdaTransformationConfiguration.withActions(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ContentTransformation", targetDepth)) {
                    objectLambdaTransformationConfiguration.setContentTransformation(ObjectLambdaContentTransformationStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return objectLambdaTransformationConfiguration;
                }
            }
        }
    }

    private static ObjectLambdaTransformationConfigurationStaxUnmarshaller instance;

    public static ObjectLambdaTransformationConfigurationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ObjectLambdaTransformationConfigurationStaxUnmarshaller();
        return instance;
    }
}
