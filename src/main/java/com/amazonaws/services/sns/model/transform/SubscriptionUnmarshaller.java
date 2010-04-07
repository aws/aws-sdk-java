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

package com.amazonaws.services.sns.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Subscription Unmarshaller
 */
public class SubscriptionUnmarshaller implements Unmarshaller<Subscription, Node> {

    public Subscription unmarshall(Node node) throws Exception {
        if (node == null) return null;

        Subscription subscription = new Subscription();

        
        Node subscriptionArnNode = XpathUtils.asNode("SubscriptionArn", node);
        subscription.setSubscriptionArn(new StringUnmarshaller().unmarshall(subscriptionArnNode));
    
        Node ownerNode = XpathUtils.asNode("Owner", node);
        subscription.setOwner(new StringUnmarshaller().unmarshall(ownerNode));
    
        Node protocolNode = XpathUtils.asNode("Protocol", node);
        subscription.setProtocol(new StringUnmarshaller().unmarshall(protocolNode));
    
        Node endpointNode = XpathUtils.asNode("Endpoint", node);
        subscription.setEndpoint(new StringUnmarshaller().unmarshall(endpointNode));
    
        Node topicArnNode = XpathUtils.asNode("TopicArn", node);
        subscription.setTopicArn(new StringUnmarshaller().unmarshall(topicArnNode));
    

        return subscription;
    }
}
    