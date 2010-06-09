/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ec2.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Run Instances Request StAX Unmarshaller
 */
public class RunInstancesRequestStaxUnmarshaller implements Unmarshaller<RunInstancesRequest, StaxUnmarshallerContext> {

    

    public RunInstancesRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        RunInstancesRequest runInstancesRequest = new RunInstancesRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        
        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            XMLEvent event = context.nextEvent();
            if (event.isEndDocument()) return runInstancesRequest;

            if (event.isAttribute() || event.isStartElement()) {
                if (context.testExpression("ImageId", targetDepth)) {
                    runInstancesRequest.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MinCount", targetDepth)) {
                    runInstancesRequest.setMinCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MaxCount", targetDepth)) {
                    runInstancesRequest.setMaxCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("KeyName", targetDepth)) {
                    runInstancesRequest.setKeyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SecurityGroup/SecurityGroup", targetDepth)) {
                    runInstancesRequest.getSecurityGroups().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("UserData", targetDepth)) {
                    runInstancesRequest.setUserData(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    runInstancesRequest.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Placement", targetDepth)) {
                    runInstancesRequest.setPlacement(PlacementStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("KernelId", targetDepth)) {
                    runInstancesRequest.setKernelId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RamdiskId", targetDepth)) {
                    runInstancesRequest.setRamdiskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BlockDeviceMapping/BlockDeviceMapping", targetDepth)) {
                    runInstancesRequest.getBlockDeviceMappings().add(BlockDeviceMappingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("monitoring/enabled", targetDepth)) {
                    runInstancesRequest.setMonitoring(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    runInstancesRequest.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("disableApiTermination", targetDepth)) {
                    runInstancesRequest.setDisableApiTermination(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("instanceInitiatedShutdownBehavior", targetDepth)) {
                    runInstancesRequest.setInstanceInitiatedShutdownBehavior(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (event.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return runInstancesRequest;
                }
            }
        }
    }

    private static RunInstancesRequestStaxUnmarshaller instance;
    public static RunInstancesRequestStaxUnmarshaller getInstance() {
        if (instance == null) instance = new RunInstancesRequestStaxUnmarshaller();
        return instance;
    }
}
    