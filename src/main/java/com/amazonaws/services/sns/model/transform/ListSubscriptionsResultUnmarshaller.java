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
 * List Subscriptions Result Unmarshaller
 */
public class ListSubscriptionsResultUnmarshaller implements Unmarshaller<ListSubscriptionsResult, Node> {

    public ListSubscriptionsResult unmarshall(Node node) throws Exception {
        if (node == null) return null;

        ListSubscriptionsResult listSubscriptionsResult = new ListSubscriptionsResult();

        
        NodeList subscriptionsNodes = XpathUtils.asNodeList("Subscriptions/member", node);
        for (int subscriptionsIndex = 0; subscriptionsIndex < XpathUtils.nodeLength(subscriptionsNodes); ++subscriptionsIndex) {
            Node subscriptionsNode = subscriptionsNodes.item(subscriptionsIndex);
            listSubscriptionsResult.getSubscriptions().add(new SubscriptionUnmarshaller().unmarshall(subscriptionsNode));
            subscriptionsNode.getParentNode().removeChild(subscriptionsNode);
        }
    
        Node nextTokenNode = XpathUtils.asNode("NextToken", node);
        listSubscriptionsResult.setNextToken(new StringUnmarshaller().unmarshall(nextTokenNode));
    

        return listSubscriptionsResult;
    }
}
    