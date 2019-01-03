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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeHsmClientCertificatesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHsmClientCertificatesResultStaxUnmarshaller implements Unmarshaller<DescribeHsmClientCertificatesResult, StaxUnmarshallerContext> {

    public DescribeHsmClientCertificatesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeHsmClientCertificatesResult describeHsmClientCertificatesResult = new DescribeHsmClientCertificatesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeHsmClientCertificatesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Marker", targetDepth)) {
                    describeHsmClientCertificatesResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HsmClientCertificates", targetDepth)) {
                    describeHsmClientCertificatesResult.withHsmClientCertificates(new ArrayList<HsmClientCertificate>());
                    continue;
                }

                if (context.testExpression("HsmClientCertificates/HsmClientCertificate", targetDepth)) {
                    describeHsmClientCertificatesResult.withHsmClientCertificates(HsmClientCertificateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeHsmClientCertificatesResult;
                }
            }
        }
    }

    private static DescribeHsmClientCertificatesResultStaxUnmarshaller instance;

    public static DescribeHsmClientCertificatesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeHsmClientCertificatesResultStaxUnmarshaller();
        return instance;
    }
}
