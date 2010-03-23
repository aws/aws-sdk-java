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

import org.w3c.dom.*;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Describe Images Request Unmarshaller
 */        
public class DescribeImagesRequestUnmarshaller implements Unmarshaller<DescribeImagesRequest, Node> {

    public DescribeImagesRequest unmarshall(Node node) throws Exception {
        DescribeImagesRequest describeImagesRequest = new DescribeImagesRequest();
        
        
        NodeList imageIdsNodes = XpathUtils.asNodeList("ImageId/ImageId", node);
        for (int imageIdsIndex = 0; imageIdsIndex < XpathUtils.nodeLength(imageIdsNodes); ++imageIdsIndex) {
            Node imageIdsNode = imageIdsNodes.item(imageIdsIndex);
            describeImagesRequest.getImageIds().add(new StringUnmarshaller().unmarshall(imageIdsNode));
            imageIdsNode.getParentNode().removeChild(imageIdsNode);
        }
    
        NodeList ownersNodes = XpathUtils.asNodeList("Owner/Owner", node);
        for (int ownersIndex = 0; ownersIndex < XpathUtils.nodeLength(ownersNodes); ++ownersIndex) {
            Node ownersNode = ownersNodes.item(ownersIndex);
            describeImagesRequest.getOwners().add(new StringUnmarshaller().unmarshall(ownersNode));
            ownersNode.getParentNode().removeChild(ownersNode);
        }
    
        NodeList executableUsersNodes = XpathUtils.asNodeList("ExecutableBy/ExecutableBy", node);
        for (int executableUsersIndex = 0; executableUsersIndex < XpathUtils.nodeLength(executableUsersNodes); ++executableUsersIndex) {
            Node executableUsersNode = executableUsersNodes.item(executableUsersIndex);
            describeImagesRequest.getExecutableUsers().add(new StringUnmarshaller().unmarshall(executableUsersNode));
            executableUsersNode.getParentNode().removeChild(executableUsersNode);
        }
    

        return describeImagesRequest;
    }  
}
    