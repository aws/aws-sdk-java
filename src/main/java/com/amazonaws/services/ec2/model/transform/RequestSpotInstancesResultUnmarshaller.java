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
 * Request Spot Instances Result Unmarshaller
 */
public class RequestSpotInstancesResultUnmarshaller implements Unmarshaller<RequestSpotInstancesResult, Node> {

    public RequestSpotInstancesResult unmarshall(Node node) throws Exception {
        if (node == null) return null;

        RequestSpotInstancesResult requestSpotInstancesResult = new RequestSpotInstancesResult();

        
        NodeList spotInstanceRequestsNodes = XpathUtils.asNodeList("spotInstanceRequestSet/item", node);
        for (int spotInstanceRequestsIndex = 0; spotInstanceRequestsIndex < XpathUtils.nodeLength(spotInstanceRequestsNodes); ++spotInstanceRequestsIndex) {
            Node spotInstanceRequestsNode = spotInstanceRequestsNodes.item(spotInstanceRequestsIndex);
            requestSpotInstancesResult.getSpotInstanceRequests().add(new SpotInstanceRequestUnmarshaller().unmarshall(spotInstanceRequestsNode));
            spotInstanceRequestsNode.getParentNode().removeChild(spotInstanceRequestsNode);
        }
    

        return requestSpotInstancesResult;
    }
}
    