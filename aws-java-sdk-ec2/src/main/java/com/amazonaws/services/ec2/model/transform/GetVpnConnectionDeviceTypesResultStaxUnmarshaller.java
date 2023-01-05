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
 * GetVpnConnectionDeviceTypesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVpnConnectionDeviceTypesResultStaxUnmarshaller implements Unmarshaller<GetVpnConnectionDeviceTypesResult, StaxUnmarshallerContext> {

    public GetVpnConnectionDeviceTypesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetVpnConnectionDeviceTypesResult getVpnConnectionDeviceTypesResult = new GetVpnConnectionDeviceTypesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getVpnConnectionDeviceTypesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("vpnConnectionDeviceTypeSet", targetDepth)) {
                    getVpnConnectionDeviceTypesResult.withVpnConnectionDeviceTypes(new ArrayList<VpnConnectionDeviceType>());
                    continue;
                }

                if (context.testExpression("vpnConnectionDeviceTypeSet/item", targetDepth)) {
                    getVpnConnectionDeviceTypesResult.withVpnConnectionDeviceTypes(VpnConnectionDeviceTypeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("nextToken", targetDepth)) {
                    getVpnConnectionDeviceTypesResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getVpnConnectionDeviceTypesResult;
                }
            }
        }
    }

    private static GetVpnConnectionDeviceTypesResultStaxUnmarshaller instance;

    public static GetVpnConnectionDeviceTypesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetVpnConnectionDeviceTypesResultStaxUnmarshaller();
        return instance;
    }
}
