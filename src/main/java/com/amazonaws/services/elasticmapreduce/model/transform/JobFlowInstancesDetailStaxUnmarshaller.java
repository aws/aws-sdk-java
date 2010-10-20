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

package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Job Flow Instances Detail StAX Unmarshaller
 */
public class JobFlowInstancesDetailStaxUnmarshaller implements Unmarshaller<JobFlowInstancesDetail, StaxUnmarshallerContext> {

    

    public JobFlowInstancesDetail unmarshall(StaxUnmarshallerContext context) throws Exception {
        JobFlowInstancesDetail jobFlowInstancesDetail = new JobFlowInstancesDetail();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return jobFlowInstancesDetail;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("MasterInstanceType", targetDepth)) {
                    jobFlowInstancesDetail.setMasterInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MasterPublicDnsName", targetDepth)) {
                    jobFlowInstancesDetail.setMasterPublicDnsName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MasterInstanceId", targetDepth)) {
                    jobFlowInstancesDetail.setMasterInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SlaveInstanceType", targetDepth)) {
                    jobFlowInstancesDetail.setSlaveInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("InstanceCount", targetDepth)) {
                    jobFlowInstancesDetail.setInstanceCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("InstanceGroups/member", targetDepth)) {
                    jobFlowInstancesDetail.getInstanceGroups().add(InstanceGroupDetailStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NormalizedInstanceHours", targetDepth)) {
                    jobFlowInstancesDetail.setNormalizedInstanceHours(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Ec2KeyName", targetDepth)) {
                    jobFlowInstancesDetail.setEc2KeyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Placement", targetDepth)) {
                    jobFlowInstancesDetail.setPlacement(PlacementTypeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("KeepJobFlowAliveWhenNoSteps", targetDepth)) {
                    jobFlowInstancesDetail.setKeepJobFlowAliveWhenNoSteps(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HadoopVersion", targetDepth)) {
                    jobFlowInstancesDetail.setHadoopVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return jobFlowInstancesDetail;
                }
            }
        }
    }

    private static JobFlowInstancesDetailStaxUnmarshaller instance;
    public static JobFlowInstancesDetailStaxUnmarshaller getInstance() {
        if (instance == null) instance = new JobFlowInstancesDetailStaxUnmarshaller();
        return instance;
    }
}
    