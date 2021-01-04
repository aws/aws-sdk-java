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
 * ListPlatformBranchesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPlatformBranchesResultStaxUnmarshaller implements Unmarshaller<ListPlatformBranchesResult, StaxUnmarshallerContext> {

    public ListPlatformBranchesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListPlatformBranchesResult listPlatformBranchesResult = new ListPlatformBranchesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listPlatformBranchesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("PlatformBranchSummaryList", targetDepth)) {
                    listPlatformBranchesResult.withPlatformBranchSummaryList(new ArrayList<PlatformBranchSummary>());
                    continue;
                }

                if (context.testExpression("PlatformBranchSummaryList/member", targetDepth)) {
                    listPlatformBranchesResult.withPlatformBranchSummaryList(PlatformBranchSummaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextToken", targetDepth)) {
                    listPlatformBranchesResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listPlatformBranchesResult;
                }
            }
        }
    }

    private static ListPlatformBranchesResultStaxUnmarshaller instance;

    public static ListPlatformBranchesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListPlatformBranchesResultStaxUnmarshaller();
        return instance;
    }
}
