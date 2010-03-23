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
 * Add Job Flow Steps Request Unmarshaller
 */        
public class AddJobFlowStepsRequestUnmarshaller implements Unmarshaller<AddJobFlowStepsRequest, Node> {

    public AddJobFlowStepsRequest unmarshall(Node node) throws Exception {
        AddJobFlowStepsRequest addJobFlowStepsRequest = new AddJobFlowStepsRequest();
        
        
        Node jobFlowIdNode = XpathUtils.asNode("JobFlowId", node);
        addJobFlowStepsRequest.setJobFlowId(new StringUnmarshaller().unmarshall(jobFlowIdNode));
    
        NodeList stepsNodes = XpathUtils.asNodeList("Steps/member", node);
        for (int stepsIndex = 0; stepsIndex < XpathUtils.nodeLength(stepsNodes); ++stepsIndex) {
            Node stepsNode = stepsNodes.item(stepsIndex);
            addJobFlowStepsRequest.getSteps().add(new StepConfigUnmarshaller().unmarshall(stepsNode));
            stepsNode.getParentNode().removeChild(stepsNode);
        }
    

        return addJobFlowStepsRequest;
    }  
}
    