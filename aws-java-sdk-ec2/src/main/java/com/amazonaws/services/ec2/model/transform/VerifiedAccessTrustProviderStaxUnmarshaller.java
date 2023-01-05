/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * VerifiedAccessTrustProvider StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessTrustProviderStaxUnmarshaller implements Unmarshaller<VerifiedAccessTrustProvider, StaxUnmarshallerContext> {

    public VerifiedAccessTrustProvider unmarshall(StaxUnmarshallerContext context) throws Exception {
        VerifiedAccessTrustProvider verifiedAccessTrustProvider = new VerifiedAccessTrustProvider();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return verifiedAccessTrustProvider;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("verifiedAccessTrustProviderId", targetDepth)) {
                    verifiedAccessTrustProvider.setVerifiedAccessTrustProviderId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    verifiedAccessTrustProvider.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("trustProviderType", targetDepth)) {
                    verifiedAccessTrustProvider.setTrustProviderType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("userTrustProviderType", targetDepth)) {
                    verifiedAccessTrustProvider.setUserTrustProviderType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("deviceTrustProviderType", targetDepth)) {
                    verifiedAccessTrustProvider.setDeviceTrustProviderType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("oidcOptions", targetDepth)) {
                    verifiedAccessTrustProvider.setOidcOptions(OidcOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("deviceOptions", targetDepth)) {
                    verifiedAccessTrustProvider.setDeviceOptions(DeviceOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("policyReferenceName", targetDepth)) {
                    verifiedAccessTrustProvider.setPolicyReferenceName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("creationTime", targetDepth)) {
                    verifiedAccessTrustProvider.setCreationTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    verifiedAccessTrustProvider.setLastUpdatedTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    verifiedAccessTrustProvider.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    verifiedAccessTrustProvider.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return verifiedAccessTrustProvider;
                }
            }
        }
    }

    private static VerifiedAccessTrustProviderStaxUnmarshaller instance;

    public static VerifiedAccessTrustProviderStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VerifiedAccessTrustProviderStaxUnmarshaller();
        return instance;
    }
}
