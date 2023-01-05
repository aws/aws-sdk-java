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
 * IpamAddressHistoryRecord StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamAddressHistoryRecordStaxUnmarshaller implements Unmarshaller<IpamAddressHistoryRecord, StaxUnmarshallerContext> {

    public IpamAddressHistoryRecord unmarshall(StaxUnmarshallerContext context) throws Exception {
        IpamAddressHistoryRecord ipamAddressHistoryRecord = new IpamAddressHistoryRecord();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ipamAddressHistoryRecord;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("resourceOwnerId", targetDepth)) {
                    ipamAddressHistoryRecord.setResourceOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceRegion", targetDepth)) {
                    ipamAddressHistoryRecord.setResourceRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceType", targetDepth)) {
                    ipamAddressHistoryRecord.setResourceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceId", targetDepth)) {
                    ipamAddressHistoryRecord.setResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceCidr", targetDepth)) {
                    ipamAddressHistoryRecord.setResourceCidr(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceName", targetDepth)) {
                    ipamAddressHistoryRecord.setResourceName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceComplianceStatus", targetDepth)) {
                    ipamAddressHistoryRecord.setResourceComplianceStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceOverlapStatus", targetDepth)) {
                    ipamAddressHistoryRecord.setResourceOverlapStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcId", targetDepth)) {
                    ipamAddressHistoryRecord.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sampledStartTime", targetDepth)) {
                    ipamAddressHistoryRecord.setSampledStartTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("sampledEndTime", targetDepth)) {
                    ipamAddressHistoryRecord.setSampledEndTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ipamAddressHistoryRecord;
                }
            }
        }
    }

    private static IpamAddressHistoryRecordStaxUnmarshaller instance;

    public static IpamAddressHistoryRecordStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new IpamAddressHistoryRecordStaxUnmarshaller();
        return instance;
    }
}
