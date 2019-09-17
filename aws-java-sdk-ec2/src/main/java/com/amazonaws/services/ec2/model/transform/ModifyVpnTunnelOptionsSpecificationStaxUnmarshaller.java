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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ModifyVpnTunnelOptionsSpecification StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpnTunnelOptionsSpecificationStaxUnmarshaller implements Unmarshaller<ModifyVpnTunnelOptionsSpecification, StaxUnmarshallerContext> {

    public ModifyVpnTunnelOptionsSpecification unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyVpnTunnelOptionsSpecification modifyVpnTunnelOptionsSpecification = new ModifyVpnTunnelOptionsSpecification();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyVpnTunnelOptionsSpecification;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("TunnelInsideCidr", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.setTunnelInsideCidr(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PreSharedKey", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.setPreSharedKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Phase1LifetimeSeconds", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.setPhase1LifetimeSeconds(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Phase2LifetimeSeconds", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.setPhase2LifetimeSeconds(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RekeyMarginTimeSeconds", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.setRekeyMarginTimeSeconds(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RekeyFuzzPercentage", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.setRekeyFuzzPercentage(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReplayWindowSize", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.setReplayWindowSize(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DPDTimeoutSeconds", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.setDPDTimeoutSeconds(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Phase1EncryptionAlgorithm", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.withPhase1EncryptionAlgorithms(new ArrayList<Phase1EncryptionAlgorithmsRequestListValue>());
                    continue;
                }

                if (context.testExpression("Phase1EncryptionAlgorithm/item", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.withPhase1EncryptionAlgorithms(Phase1EncryptionAlgorithmsRequestListValueStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("Phase2EncryptionAlgorithm", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.withPhase2EncryptionAlgorithms(new ArrayList<Phase2EncryptionAlgorithmsRequestListValue>());
                    continue;
                }

                if (context.testExpression("Phase2EncryptionAlgorithm/item", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.withPhase2EncryptionAlgorithms(Phase2EncryptionAlgorithmsRequestListValueStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("Phase1IntegrityAlgorithm", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.withPhase1IntegrityAlgorithms(new ArrayList<Phase1IntegrityAlgorithmsRequestListValue>());
                    continue;
                }

                if (context.testExpression("Phase1IntegrityAlgorithm/item", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.withPhase1IntegrityAlgorithms(Phase1IntegrityAlgorithmsRequestListValueStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("Phase2IntegrityAlgorithm", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.withPhase2IntegrityAlgorithms(new ArrayList<Phase2IntegrityAlgorithmsRequestListValue>());
                    continue;
                }

                if (context.testExpression("Phase2IntegrityAlgorithm/item", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.withPhase2IntegrityAlgorithms(Phase2IntegrityAlgorithmsRequestListValueStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("Phase1DHGroupNumber", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.withPhase1DHGroupNumbers(new ArrayList<Phase1DHGroupNumbersRequestListValue>());
                    continue;
                }

                if (context.testExpression("Phase1DHGroupNumber/item", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.withPhase1DHGroupNumbers(Phase1DHGroupNumbersRequestListValueStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("Phase2DHGroupNumber", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.withPhase2DHGroupNumbers(new ArrayList<Phase2DHGroupNumbersRequestListValue>());
                    continue;
                }

                if (context.testExpression("Phase2DHGroupNumber/item", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.withPhase2DHGroupNumbers(Phase2DHGroupNumbersRequestListValueStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("IKEVersion", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.withIKEVersions(new ArrayList<IKEVersionsRequestListValue>());
                    continue;
                }

                if (context.testExpression("IKEVersion/item", targetDepth)) {
                    modifyVpnTunnelOptionsSpecification.withIKEVersions(IKEVersionsRequestListValueStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyVpnTunnelOptionsSpecification;
                }
            }
        }
    }

    private static ModifyVpnTunnelOptionsSpecificationStaxUnmarshaller instance;

    public static ModifyVpnTunnelOptionsSpecificationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyVpnTunnelOptionsSpecificationStaxUnmarshaller();
        return instance;
    }
}
