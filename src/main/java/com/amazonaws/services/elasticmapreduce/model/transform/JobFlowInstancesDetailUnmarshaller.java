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

import org.w3c.dom.*;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Job Flow Instances Detail Unmarshaller
 */        
public class JobFlowInstancesDetailUnmarshaller implements Unmarshaller<JobFlowInstancesDetail, Node> {

    public JobFlowInstancesDetail unmarshall(Node node) throws Exception {
        JobFlowInstancesDetail jobFlowInstancesDetail = new JobFlowInstancesDetail();
        
        
        Node masterInstanceTypeNode = XpathUtils.asNode("MasterInstanceType", node);
        jobFlowInstancesDetail.setMasterInstanceType(new StringUnmarshaller().unmarshall(masterInstanceTypeNode));
    
        Node masterPublicDnsNameNode = XpathUtils.asNode("MasterPublicDnsName", node);
        jobFlowInstancesDetail.setMasterPublicDnsName(new StringUnmarshaller().unmarshall(masterPublicDnsNameNode));
    
        Node masterInstanceIdNode = XpathUtils.asNode("MasterInstanceId", node);
        jobFlowInstancesDetail.setMasterInstanceId(new StringUnmarshaller().unmarshall(masterInstanceIdNode));
    
        Node slaveInstanceTypeNode = XpathUtils.asNode("SlaveInstanceType", node);
        jobFlowInstancesDetail.setSlaveInstanceType(new StringUnmarshaller().unmarshall(slaveInstanceTypeNode));
    
        Node instanceCountNode = XpathUtils.asNode("InstanceCount", node);
        jobFlowInstancesDetail.setInstanceCount(new IntegerUnmarshaller().unmarshall(instanceCountNode));
    
        Node ec2KeyNameNode = XpathUtils.asNode("Ec2KeyName", node);
        jobFlowInstancesDetail.setEc2KeyName(new StringUnmarshaller().unmarshall(ec2KeyNameNode));
    
        Node placementNode = XpathUtils.asNode("Placement", node);
        jobFlowInstancesDetail.setPlacement(new PlacementTypeUnmarshaller().unmarshall(placementNode));
    
        Node keepJobFlowAliveWhenNoStepsNode = XpathUtils.asNode("KeepJobFlowAliveWhenNoSteps", node);
        jobFlowInstancesDetail.setKeepJobFlowAliveWhenNoSteps(new BooleanUnmarshaller().unmarshall(keepJobFlowAliveWhenNoStepsNode));
    

        return jobFlowInstancesDetail;
    }  
}
    