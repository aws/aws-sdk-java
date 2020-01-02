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
 * FpgaInfo StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FpgaInfoStaxUnmarshaller implements Unmarshaller<FpgaInfo, StaxUnmarshallerContext> {

    public FpgaInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
        FpgaInfo fpgaInfo = new FpgaInfo();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return fpgaInfo;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("fpgas", targetDepth)) {
                    fpgaInfo.withFpgas(new ArrayList<FpgaDeviceInfo>());
                    continue;
                }

                if (context.testExpression("fpgas/item", targetDepth)) {
                    fpgaInfo.withFpgas(FpgaDeviceInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("totalFpgaMemoryInMiB", targetDepth)) {
                    fpgaInfo.setTotalFpgaMemoryInMiB(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return fpgaInfo;
                }
            }
        }
    }

    private static FpgaInfoStaxUnmarshaller instance;

    public static FpgaInfoStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new FpgaInfoStaxUnmarshaller();
        return instance;
    }
}
