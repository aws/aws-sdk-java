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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ModifyCustomDomainAssociationResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCustomDomainAssociationResultStaxUnmarshaller implements Unmarshaller<ModifyCustomDomainAssociationResult, StaxUnmarshallerContext> {

    public ModifyCustomDomainAssociationResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyCustomDomainAssociationResult modifyCustomDomainAssociationResult = new ModifyCustomDomainAssociationResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyCustomDomainAssociationResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CustomDomainName", targetDepth)) {
                    modifyCustomDomainAssociationResult.setCustomDomainName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomDomainCertificateArn", targetDepth)) {
                    modifyCustomDomainAssociationResult.setCustomDomainCertificateArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    modifyCustomDomainAssociationResult.setClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomDomainCertExpiryTime", targetDepth)) {
                    modifyCustomDomainAssociationResult.setCustomDomainCertExpiryTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyCustomDomainAssociationResult;
                }
            }
        }
    }

    private static ModifyCustomDomainAssociationResultStaxUnmarshaller instance;

    public static ModifyCustomDomainAssociationResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyCustomDomainAssociationResultStaxUnmarshaller();
        return instance;
    }
}
