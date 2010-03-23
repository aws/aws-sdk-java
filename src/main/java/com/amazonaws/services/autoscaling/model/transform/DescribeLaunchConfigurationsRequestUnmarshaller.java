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

package com.amazonaws.services.autoscaling.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Describe Launch Configurations Request Unmarshaller
 */        
public class DescribeLaunchConfigurationsRequestUnmarshaller implements Unmarshaller<DescribeLaunchConfigurationsRequest, Node> {

    public DescribeLaunchConfigurationsRequest unmarshall(Node node) throws Exception {
        DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest = new DescribeLaunchConfigurationsRequest();
        
        
        NodeList launchConfigurationNamesNodes = XpathUtils.asNodeList("LaunchConfigurationNames/member", node);
        for (int launchConfigurationNamesIndex = 0; launchConfigurationNamesIndex < XpathUtils.nodeLength(launchConfigurationNamesNodes); ++launchConfigurationNamesIndex) {
            Node launchConfigurationNamesNode = launchConfigurationNamesNodes.item(launchConfigurationNamesIndex);
            describeLaunchConfigurationsRequest.getLaunchConfigurationNames().add(new StringUnmarshaller().unmarshall(launchConfigurationNamesNode));
            launchConfigurationNamesNode.getParentNode().removeChild(launchConfigurationNamesNode);
        }
    
        Node nextTokenNode = XpathUtils.asNode("NextToken", node);
        describeLaunchConfigurationsRequest.setNextToken(new StringUnmarshaller().unmarshall(nextTokenNode));
    
        Node maxRecordsNode = XpathUtils.asNode("MaxRecords", node);
        describeLaunchConfigurationsRequest.setMaxRecords(new IntegerUnmarshaller().unmarshall(maxRecordsNode));
    

        return describeLaunchConfigurationsRequest;
    }  
}
    