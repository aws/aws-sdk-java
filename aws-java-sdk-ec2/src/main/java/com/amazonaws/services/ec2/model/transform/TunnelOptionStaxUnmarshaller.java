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
 * TunnelOption StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TunnelOptionStaxUnmarshaller implements Unmarshaller<TunnelOption, StaxUnmarshallerContext> {

    public TunnelOption unmarshall(StaxUnmarshallerContext context) throws Exception {
        TunnelOption tunnelOption = new TunnelOption();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return tunnelOption;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("outsideIpAddress", targetDepth)) {
                    tunnelOption.setOutsideIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tunnelInsideCidr", targetDepth)) {
                    tunnelOption.setTunnelInsideCidr(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("preSharedKey", targetDepth)) {
                    tunnelOption.setPreSharedKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("phase1LifetimeSeconds", targetDepth)) {
                    tunnelOption.setPhase1LifetimeSeconds(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("phase2LifetimeSeconds", targetDepth)) {
                    tunnelOption.setPhase2LifetimeSeconds(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("rekeyMarginTimeSeconds", targetDepth)) {
                    tunnelOption.setRekeyMarginTimeSeconds(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("rekeyFuzzPercentage", targetDepth)) {
                    tunnelOption.setRekeyFuzzPercentage(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("replayWindowSize", targetDepth)) {
                    tunnelOption.setReplayWindowSize(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("dpdTimeoutSeconds", targetDepth)) {
                    tunnelOption.setDpdTimeoutSeconds(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("phase1EncryptionAlgorithmSet", targetDepth)) {
                    tunnelOption.withPhase1EncryptionAlgorithms(new ArrayList<Phase1EncryptionAlgorithmsListValue>());
                    continue;
                }

                if (context.testExpression("phase1EncryptionAlgorithmSet/item", targetDepth)) {
                    tunnelOption.withPhase1EncryptionAlgorithms(Phase1EncryptionAlgorithmsListValueStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("phase2EncryptionAlgorithmSet", targetDepth)) {
                    tunnelOption.withPhase2EncryptionAlgorithms(new ArrayList<Phase2EncryptionAlgorithmsListValue>());
                    continue;
                }

                if (context.testExpression("phase2EncryptionAlgorithmSet/item", targetDepth)) {
                    tunnelOption.withPhase2EncryptionAlgorithms(Phase2EncryptionAlgorithmsListValueStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("phase1IntegrityAlgorithmSet", targetDepth)) {
                    tunnelOption.withPhase1IntegrityAlgorithms(new ArrayList<Phase1IntegrityAlgorithmsListValue>());
                    continue;
                }

                if (context.testExpression("phase1IntegrityAlgorithmSet/item", targetDepth)) {
                    tunnelOption.withPhase1IntegrityAlgorithms(Phase1IntegrityAlgorithmsListValueStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("phase2IntegrityAlgorithmSet", targetDepth)) {
                    tunnelOption.withPhase2IntegrityAlgorithms(new ArrayList<Phase2IntegrityAlgorithmsListValue>());
                    continue;
                }

                if (context.testExpression("phase2IntegrityAlgorithmSet/item", targetDepth)) {
                    tunnelOption.withPhase2IntegrityAlgorithms(Phase2IntegrityAlgorithmsListValueStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("phase1DHGroupNumberSet", targetDepth)) {
                    tunnelOption.withPhase1DHGroupNumbers(new ArrayList<Phase1DHGroupNumbersListValue>());
                    continue;
                }

                if (context.testExpression("phase1DHGroupNumberSet/item", targetDepth)) {
                    tunnelOption.withPhase1DHGroupNumbers(Phase1DHGroupNumbersListValueStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("phase2DHGroupNumberSet", targetDepth)) {
                    tunnelOption.withPhase2DHGroupNumbers(new ArrayList<Phase2DHGroupNumbersListValue>());
                    continue;
                }

                if (context.testExpression("phase2DHGroupNumberSet/item", targetDepth)) {
                    tunnelOption.withPhase2DHGroupNumbers(Phase2DHGroupNumbersListValueStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ikeVersionSet", targetDepth)) {
                    tunnelOption.withIkeVersions(new ArrayList<IKEVersionsListValue>());
                    continue;
                }

                if (context.testExpression("ikeVersionSet/item", targetDepth)) {
                    tunnelOption.withIkeVersions(IKEVersionsListValueStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return tunnelOption;
                }
            }
        }
    }

    private static TunnelOptionStaxUnmarshaller instance;

    public static TunnelOptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TunnelOptionStaxUnmarshaller();
        return instance;
    }
}
