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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * PlatformBranchSummary StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlatformBranchSummaryStaxUnmarshaller implements Unmarshaller<PlatformBranchSummary, StaxUnmarshallerContext> {

    public PlatformBranchSummary unmarshall(StaxUnmarshallerContext context) throws Exception {
        PlatformBranchSummary platformBranchSummary = new PlatformBranchSummary();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return platformBranchSummary;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("PlatformName", targetDepth)) {
                    platformBranchSummary.setPlatformName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BranchName", targetDepth)) {
                    platformBranchSummary.setBranchName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LifecycleState", targetDepth)) {
                    platformBranchSummary.setLifecycleState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BranchOrder", targetDepth)) {
                    platformBranchSummary.setBranchOrder(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedTierList", targetDepth)) {
                    platformBranchSummary.withSupportedTierList(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SupportedTierList/member", targetDepth)) {
                    platformBranchSummary.withSupportedTierList(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return platformBranchSummary;
                }
            }
        }
    }

    private static PlatformBranchSummaryStaxUnmarshaller instance;

    public static PlatformBranchSummaryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PlatformBranchSummaryStaxUnmarshaller();
        return instance;
    }
}
