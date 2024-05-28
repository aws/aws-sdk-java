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
package com.amazonaws.services.cloudformation.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeGeneratedTemplateResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGeneratedTemplateResultStaxUnmarshaller implements Unmarshaller<DescribeGeneratedTemplateResult, StaxUnmarshallerContext> {

    public DescribeGeneratedTemplateResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeGeneratedTemplateResult describeGeneratedTemplateResult = new DescribeGeneratedTemplateResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeGeneratedTemplateResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("GeneratedTemplateId", targetDepth)) {
                    describeGeneratedTemplateResult.setGeneratedTemplateId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GeneratedTemplateName", targetDepth)) {
                    describeGeneratedTemplateResult.setGeneratedTemplateName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Resources", targetDepth)) {
                    describeGeneratedTemplateResult.withResources(new ArrayList<ResourceDetail>());
                    continue;
                }

                if (context.testExpression("Resources/member", targetDepth)) {
                    describeGeneratedTemplateResult.withResources(ResourceDetailStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    describeGeneratedTemplateResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StatusReason", targetDepth)) {
                    describeGeneratedTemplateResult.setStatusReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreationTime", targetDepth)) {
                    describeGeneratedTemplateResult.setCreationTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    describeGeneratedTemplateResult.setLastUpdatedTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Progress", targetDepth)) {
                    describeGeneratedTemplateResult.setProgress(TemplateProgressStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StackId", targetDepth)) {
                    describeGeneratedTemplateResult.setStackId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TemplateConfiguration", targetDepth)) {
                    describeGeneratedTemplateResult.setTemplateConfiguration(TemplateConfigurationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TotalWarnings", targetDepth)) {
                    describeGeneratedTemplateResult.setTotalWarnings(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeGeneratedTemplateResult;
                }
            }
        }
    }

    private static DescribeGeneratedTemplateResultStaxUnmarshaller instance;

    public static DescribeGeneratedTemplateResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeGeneratedTemplateResultStaxUnmarshaller();
        return instance;
    }
}
