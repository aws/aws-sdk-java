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
 * ViewerCertificate StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViewerCertificateStaxUnmarshaller implements Unmarshaller<ViewerCertificate, StaxUnmarshallerContext> {

    public ViewerCertificate unmarshall(StaxUnmarshallerContext context) throws Exception {
        ViewerCertificate viewerCertificate = new ViewerCertificate();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return viewerCertificate;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CloudFrontDefaultCertificate", targetDepth)) {
                    viewerCertificate.setCloudFrontDefaultCertificate(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IAMCertificateId", targetDepth)) {
                    viewerCertificate.setIAMCertificateId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ACMCertificateArn", targetDepth)) {
                    viewerCertificate.setACMCertificateArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SSLSupportMethod", targetDepth)) {
                    viewerCertificate.setSSLSupportMethod(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MinimumProtocolVersion", targetDepth)) {
                    viewerCertificate.setMinimumProtocolVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Certificate", targetDepth)) {
                    viewerCertificate.setCertificate(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CertificateSource", targetDepth)) {
                    viewerCertificate.setCertificateSource(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return viewerCertificate;
                }
            }
        }
    }

    private static ViewerCertificateStaxUnmarshaller instance;

    public static ViewerCertificateStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ViewerCertificateStaxUnmarshaller();
        return instance;
    }
}
