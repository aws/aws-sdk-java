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
 * Job Flow Detail Unmarshaller
 */
public class JobFlowDetailUnmarshaller implements Unmarshaller<JobFlowDetail, Node> {

    public JobFlowDetail unmarshall(Node node) throws Exception {
        if (node == null) return null;

        JobFlowDetail jobFlowDetail = new JobFlowDetail();

        
        Node jobFlowIdNode = XpathUtils.asNode("JobFlowId", node);
        jobFlowDetail.setJobFlowId(new StringUnmarshaller().unmarshall(jobFlowIdNode));
    
        Node nameNode = XpathUtils.asNode("Name", node);
        jobFlowDetail.setName(new StringUnmarshaller().unmarshall(nameNode));
    
        Node logUriNode = XpathUtils.asNode("LogUri", node);
        jobFlowDetail.setLogUri(new StringUnmarshaller().unmarshall(logUriNode));
    
        Node executionStatusDetailNode = XpathUtils.asNode("ExecutionStatusDetail", node);
        jobFlowDetail.setExecutionStatusDetail(new JobFlowExecutionStatusDetailUnmarshaller().unmarshall(executionStatusDetailNode));
    
        Node instancesNode = XpathUtils.asNode("Instances", node);
        jobFlowDetail.setInstances(new JobFlowInstancesDetailUnmarshaller().unmarshall(instancesNode));
    
        NodeList stepsNodes = XpathUtils.asNodeList("Steps/member", node);
        for (int stepsIndex = 0; stepsIndex < XpathUtils.nodeLength(stepsNodes); ++stepsIndex) {
            Node stepsNode = stepsNodes.item(stepsIndex);
            jobFlowDetail.getSteps().add(new StepDetailUnmarshaller().unmarshall(stepsNode));
            stepsNode.getParentNode().removeChild(stepsNode);
        }
    
        NodeList bootstrapActionsNodes = XpathUtils.asNodeList("BootstrapActions/member", node);
        for (int bootstrapActionsIndex = 0; bootstrapActionsIndex < XpathUtils.nodeLength(bootstrapActionsNodes); ++bootstrapActionsIndex) {
            Node bootstrapActionsNode = bootstrapActionsNodes.item(bootstrapActionsIndex);
            jobFlowDetail.getBootstrapActions().add(new BootstrapActionDetailUnmarshaller().unmarshall(bootstrapActionsNode));
            bootstrapActionsNode.getParentNode().removeChild(bootstrapActionsNode);
        }
    

        return jobFlowDetail;
    }
}
    