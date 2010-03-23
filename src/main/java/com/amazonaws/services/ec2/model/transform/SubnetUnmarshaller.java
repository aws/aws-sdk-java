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
 * Subnet Unmarshaller
 */        
public class SubnetUnmarshaller implements Unmarshaller<Subnet, Node> {

    public Subnet unmarshall(Node node) throws Exception {
        Subnet subnet = new Subnet();
        
        
        Node subnetIdNode = XpathUtils.asNode("subnetId", node);
        subnet.setSubnetId(new StringUnmarshaller().unmarshall(subnetIdNode));
    
        Node stateNode = XpathUtils.asNode("state", node);
        subnet.setState(new StringUnmarshaller().unmarshall(stateNode));
    
        Node vpcIdNode = XpathUtils.asNode("vpcId", node);
        subnet.setVpcId(new StringUnmarshaller().unmarshall(vpcIdNode));
    
        Node cidrBlockNode = XpathUtils.asNode("cidrBlock", node);
        subnet.setCidrBlock(new StringUnmarshaller().unmarshall(cidrBlockNode));
    
        Node availableIpAddressCountNode = XpathUtils.asNode("availableIpAddressCount", node);
        subnet.setAvailableIpAddressCount(new IntegerUnmarshaller().unmarshall(availableIpAddressCountNode));
    
        Node availabilityZoneNode = XpathUtils.asNode("availabilityZone", node);
        subnet.setAvailabilityZone(new StringUnmarshaller().unmarshall(availabilityZoneNode));
    

        return subnet;
    }  
}
    