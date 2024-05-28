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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeCustomDomainAssociationsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomDomainAssociationsResultStaxUnmarshaller implements Unmarshaller<DescribeCustomDomainAssociationsResult, StaxUnmarshallerContext> {

    public DescribeCustomDomainAssociationsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeCustomDomainAssociationsResult describeCustomDomainAssociationsResult = new DescribeCustomDomainAssociationsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeCustomDomainAssociationsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Marker", targetDepth)) {
                    describeCustomDomainAssociationsResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Associations", targetDepth)) {
                    describeCustomDomainAssociationsResult.withAssociations(new ArrayList<Association>());
                    continue;
                }

                if (context.testExpression("Associations/Association", targetDepth)) {
                    describeCustomDomainAssociationsResult.withAssociations(AssociationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeCustomDomainAssociationsResult;
                }
            }
        }
    }

    private static DescribeCustomDomainAssociationsResultStaxUnmarshaller instance;

    public static DescribeCustomDomainAssociationsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeCustomDomainAssociationsResultStaxUnmarshaller();
        return instance;
    }
}
