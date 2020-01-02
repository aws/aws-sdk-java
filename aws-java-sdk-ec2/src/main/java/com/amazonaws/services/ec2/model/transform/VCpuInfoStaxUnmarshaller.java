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
 * VCpuInfo StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VCpuInfoStaxUnmarshaller implements Unmarshaller<VCpuInfo, StaxUnmarshallerContext> {

    public VCpuInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
        VCpuInfo vCpuInfo = new VCpuInfo();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return vCpuInfo;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("defaultVCpus", targetDepth)) {
                    vCpuInfo.setDefaultVCpus(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("defaultCores", targetDepth)) {
                    vCpuInfo.setDefaultCores(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("defaultThreadsPerCore", targetDepth)) {
                    vCpuInfo.setDefaultThreadsPerCore(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("validCores", targetDepth)) {
                    vCpuInfo.withValidCores(new ArrayList<Integer>());
                    continue;
                }

                if (context.testExpression("validCores/item", targetDepth)) {
                    vCpuInfo.withValidCores(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("validThreadsPerCore", targetDepth)) {
                    vCpuInfo.withValidThreadsPerCore(new ArrayList<Integer>());
                    continue;
                }

                if (context.testExpression("validThreadsPerCore/item", targetDepth)) {
                    vCpuInfo.withValidThreadsPerCore(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return vCpuInfo;
                }
            }
        }
    }

    private static VCpuInfoStaxUnmarshaller instance;

    public static VCpuInfoStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VCpuInfoStaxUnmarshaller();
        return instance;
    }
}
