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
 * Spot Datafeed Subscription Unmarshaller
 */
public class SpotDatafeedSubscriptionUnmarshaller implements Unmarshaller<SpotDatafeedSubscription, Node> {

    public SpotDatafeedSubscription unmarshall(Node node) throws Exception {
        if (node == null) return null;

        SpotDatafeedSubscription spotDatafeedSubscription = new SpotDatafeedSubscription();

        
        Node ownerIdNode = XpathUtils.asNode("ownerId", node);
        spotDatafeedSubscription.setOwnerId(new StringUnmarshaller().unmarshall(ownerIdNode));
    
        Node bucketNode = XpathUtils.asNode("bucket", node);
        spotDatafeedSubscription.setBucket(new StringUnmarshaller().unmarshall(bucketNode));
    
        Node prefixNode = XpathUtils.asNode("prefix", node);
        spotDatafeedSubscription.setPrefix(new StringUnmarshaller().unmarshall(prefixNode));
    
        Node stateNode = XpathUtils.asNode("state", node);
        spotDatafeedSubscription.setState(new StringUnmarshaller().unmarshall(stateNode));
    
        Node faultNode = XpathUtils.asNode("fault", node);
        spotDatafeedSubscription.setFault(new SpotInstanceStateFaultUnmarshaller().unmarshall(faultNode));
    

        return spotDatafeedSubscription;
    }
}
    