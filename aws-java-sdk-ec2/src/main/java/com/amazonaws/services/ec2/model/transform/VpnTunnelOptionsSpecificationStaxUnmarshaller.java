/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * VpnTunnelOptionsSpecification StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpnTunnelOptionsSpecificationStaxUnmarshaller implements Unmarshaller<VpnTunnelOptionsSpecification, StaxUnmarshallerContext> {

    public VpnTunnelOptionsSpecification unmarshall(StaxUnmarshallerContext context) throws Exception {
        VpnTunnelOptionsSpecification vpnTunnelOptionsSpecification = new VpnTunnelOptionsSpecification();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return vpnTunnelOptionsSpecification;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("TunnelInsideCidr", targetDepth)) {
                    vpnTunnelOptionsSpecification.setTunnelInsideCidr(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PreSharedKey", targetDepth)) {
                    vpnTunnelOptionsSpecification.setPreSharedKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Phase1LifetimeSeconds", targetDepth)) {
                    vpnTunnelOptionsSpecification.setPhase1LifetimeSeconds(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Phase2LifetimeSeconds", targetDepth)) {
                    vpnTunnelOptionsSpecification.setPhase2LifetimeSeconds(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RekeyMarginTimeSeconds", targetDepth)) {
                    vpnTunnelOptionsSpecification.setRekeyMarginTimeSeconds(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RekeyFuzzPercentage", targetDepth)) {
                    vpnTunnelOptionsSpecification.setRekeyFuzzPercentage(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReplayWindowSize", targetDepth)) {
                    vpnTunnelOptionsSpecification.setReplayWindowSize(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DPDTimeoutSeconds", targetDepth)) {
                    vpnTunnelOptionsSpecification.setDPDTimeoutSeconds(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Phase1EncryptionAlgorithm", targetDepth)) {
                    vpnTunnelOptionsSpecification.withPhase1EncryptionAlgorithms(new ArrayList<Phase1EncryptionAlgorithmsRequestListValue>());
                    continue;
                }

                if (context.testExpression("Phase1EncryptionAlgorithm/item", targetDepth)) {
                    vpnTunnelOptionsSpecification.withPhase1EncryptionAlgorithms(Phase1EncryptionAlgorithmsRequestListValueStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("Phase2EncryptionAlgorithm", targetDepth)) {
                    vpnTunnelOptionsSpecification.withPhase2EncryptionAlgorithms(new ArrayList<Phase2EncryptionAlgorithmsRequestListValue>());
                    continue;
                }

                if (context.testExpression("Phase2EncryptionAlgorithm/item", targetDepth)) {
                    vpnTunnelOptionsSpecification.withPhase2EncryptionAlgorithms(Phase2EncryptionAlgorithmsRequestListValueStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("Phase1IntegrityAlgorithm", targetDepth)) {
                    vpnTunnelOptionsSpecification.withPhase1IntegrityAlgorithms(new ArrayList<Phase1IntegrityAlgorithmsRequestListValue>());
                    continue;
                }

                if (context.testExpression("Phase1IntegrityAlgorithm/item", targetDepth)) {
                    vpnTunnelOptionsSpecification.withPhase1IntegrityAlgorithms(Phase1IntegrityAlgorithmsRequestListValueStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("Phase2IntegrityAlgorithm", targetDepth)) {
                    vpnTunnelOptionsSpecification.withPhase2IntegrityAlgorithms(new ArrayList<Phase2IntegrityAlgorithmsRequestListValue>());
                    continue;
                }

                if (context.testExpression("Phase2IntegrityAlgorithm/item", targetDepth)) {
                    vpnTunnelOptionsSpecification.withPhase2IntegrityAlgorithms(Phase2IntegrityAlgorithmsRequestListValueStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("Phase1DHGroupNumber", targetDepth)) {
                    vpnTunnelOptionsSpecification.withPhase1DHGroupNumbers(new ArrayList<Phase1DHGroupNumbersRequestListValue>());
                    continue;
                }

                if (context.testExpression("Phase1DHGroupNumber/item", targetDepth)) {
                    vpnTunnelOptionsSpecification.withPhase1DHGroupNumbers(Phase1DHGroupNumbersRequestListValueStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("Phase2DHGroupNumber", targetDepth)) {
                    vpnTunnelOptionsSpecification.withPhase2DHGroupNumbers(new ArrayList<Phase2DHGroupNumbersRequestListValue>());
                    continue;
                }

                if (context.testExpression("Phase2DHGroupNumber/item", targetDepth)) {
                    vpnTunnelOptionsSpecification.withPhase2DHGroupNumbers(Phase2DHGroupNumbersRequestListValueStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("IKEVersion", targetDepth)) {
                    vpnTunnelOptionsSpecification.withIKEVersions(new ArrayList<IKEVersionsRequestListValue>());
                    continue;
                }

                if (context.testExpression("IKEVersion/item", targetDepth)) {
                    vpnTunnelOptionsSpecification.withIKEVersions(IKEVersionsRequestListValueStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return vpnTunnelOptionsSpecification;
                }
            }
        }
    }

    private static VpnTunnelOptionsSpecificationStaxUnmarshaller instance;

    public static VpnTunnelOptionsSpecificationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpnTunnelOptionsSpecificationStaxUnmarshaller();
        return instance;
    }
}
