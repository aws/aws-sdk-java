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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Listener StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListenerStaxUnmarshaller implements Unmarshaller<Listener, StaxUnmarshallerContext> {

    public Listener unmarshall(StaxUnmarshallerContext context) throws Exception {
        Listener listener = new Listener();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listener;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ListenerArn", targetDepth)) {
                    listener.setListenerArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LoadBalancerArn", targetDepth)) {
                    listener.setLoadBalancerArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Port", targetDepth)) {
                    listener.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Protocol", targetDepth)) {
                    listener.setProtocol(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Certificates", targetDepth)) {
                    listener.withCertificates(new ArrayList<Certificate>());
                    continue;
                }

                if (context.testExpression("Certificates/member", targetDepth)) {
                    listener.withCertificates(CertificateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SslPolicy", targetDepth)) {
                    listener.setSslPolicy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DefaultActions", targetDepth)) {
                    listener.withDefaultActions(new ArrayList<Action>());
                    continue;
                }

                if (context.testExpression("DefaultActions/member", targetDepth)) {
                    listener.withDefaultActions(ActionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listener;
                }
            }
        }
    }

    private static ListenerStaxUnmarshaller instance;

    public static ListenerStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListenerStaxUnmarshaller();
        return instance;
    }
}
