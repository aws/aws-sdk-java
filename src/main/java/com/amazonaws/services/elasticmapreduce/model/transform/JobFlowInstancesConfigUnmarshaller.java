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
 * Job Flow Instances Config Unmarshaller
 */
public class JobFlowInstancesConfigUnmarshaller implements Unmarshaller<JobFlowInstancesConfig, Node> {

    public JobFlowInstancesConfig unmarshall(Node node) throws Exception {
        if (node == null) return null;

        JobFlowInstancesConfig jobFlowInstancesConfig = new JobFlowInstancesConfig();

        
        Node masterInstanceTypeNode = XpathUtils.asNode("MasterInstanceType", node);
        jobFlowInstancesConfig.setMasterInstanceType(new StringUnmarshaller().unmarshall(masterInstanceTypeNode));
    
        Node slaveInstanceTypeNode = XpathUtils.asNode("SlaveInstanceType", node);
        jobFlowInstancesConfig.setSlaveInstanceType(new StringUnmarshaller().unmarshall(slaveInstanceTypeNode));
    
        Node instanceCountNode = XpathUtils.asNode("InstanceCount", node);
        jobFlowInstancesConfig.setInstanceCount(new IntegerUnmarshaller().unmarshall(instanceCountNode));
    
        Node ec2KeyNameNode = XpathUtils.asNode("Ec2KeyName", node);
        jobFlowInstancesConfig.setEc2KeyName(new StringUnmarshaller().unmarshall(ec2KeyNameNode));
    
        Node placementNode = XpathUtils.asNode("Placement", node);
        jobFlowInstancesConfig.setPlacement(new PlacementTypeUnmarshaller().unmarshall(placementNode));
    
        Node keepJobFlowAliveWhenNoStepsNode = XpathUtils.asNode("KeepJobFlowAliveWhenNoSteps", node);
        jobFlowInstancesConfig.setKeepJobFlowAliveWhenNoSteps(new BooleanUnmarshaller().unmarshall(keepJobFlowAliveWhenNoStepsNode));
    

        return jobFlowInstancesConfig;
    }
}
    