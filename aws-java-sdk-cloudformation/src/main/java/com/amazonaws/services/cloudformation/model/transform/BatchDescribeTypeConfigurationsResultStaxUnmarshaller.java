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
package com.amazonaws.services.cloudformation.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * BatchDescribeTypeConfigurationsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDescribeTypeConfigurationsResultStaxUnmarshaller implements Unmarshaller<BatchDescribeTypeConfigurationsResult, StaxUnmarshallerContext> {

    public BatchDescribeTypeConfigurationsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        BatchDescribeTypeConfigurationsResult batchDescribeTypeConfigurationsResult = new BatchDescribeTypeConfigurationsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return batchDescribeTypeConfigurationsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Errors", targetDepth)) {
                    batchDescribeTypeConfigurationsResult.withErrors(new ArrayList<BatchDescribeTypeConfigurationsError>());
                    continue;
                }

                if (context.testExpression("Errors/member", targetDepth)) {
                    batchDescribeTypeConfigurationsResult.withErrors(BatchDescribeTypeConfigurationsErrorStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UnprocessedTypeConfigurations", targetDepth)) {
                    batchDescribeTypeConfigurationsResult.withUnprocessedTypeConfigurations(new ArrayList<TypeConfigurationIdentifier>());
                    continue;
                }

                if (context.testExpression("UnprocessedTypeConfigurations/member", targetDepth)) {
                    batchDescribeTypeConfigurationsResult.withUnprocessedTypeConfigurations(TypeConfigurationIdentifierStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("TypeConfigurations", targetDepth)) {
                    batchDescribeTypeConfigurationsResult.withTypeConfigurations(new ArrayList<TypeConfigurationDetails>());
                    continue;
                }

                if (context.testExpression("TypeConfigurations/member", targetDepth)) {
                    batchDescribeTypeConfigurationsResult.withTypeConfigurations(TypeConfigurationDetailsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return batchDescribeTypeConfigurationsResult;
                }
            }
        }
    }

    private static BatchDescribeTypeConfigurationsResultStaxUnmarshaller instance;

    public static BatchDescribeTypeConfigurationsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchDescribeTypeConfigurationsResultStaxUnmarshaller();
        return instance;
    }
}
