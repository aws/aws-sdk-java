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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * LaunchTemplatePrivateDnsNameOptions StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplatePrivateDnsNameOptionsStaxUnmarshaller implements Unmarshaller<LaunchTemplatePrivateDnsNameOptions, StaxUnmarshallerContext> {

    public LaunchTemplatePrivateDnsNameOptions unmarshall(StaxUnmarshallerContext context) throws Exception {
        LaunchTemplatePrivateDnsNameOptions launchTemplatePrivateDnsNameOptions = new LaunchTemplatePrivateDnsNameOptions();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return launchTemplatePrivateDnsNameOptions;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("hostnameType", targetDepth)) {
                    launchTemplatePrivateDnsNameOptions.setHostnameType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("enableResourceNameDnsARecord", targetDepth)) {
                    launchTemplatePrivateDnsNameOptions.setEnableResourceNameDnsARecord(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("enableResourceNameDnsAAAARecord", targetDepth)) {
                    launchTemplatePrivateDnsNameOptions.setEnableResourceNameDnsAAAARecord(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return launchTemplatePrivateDnsNameOptions;
                }
            }
        }
    }

    private static LaunchTemplatePrivateDnsNameOptionsStaxUnmarshaller instance;

    public static LaunchTemplatePrivateDnsNameOptionsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplatePrivateDnsNameOptionsStaxUnmarshaller();
        return instance;
    }
}
