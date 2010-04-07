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
 * Describe Key Pairs Request Unmarshaller
 */
public class DescribeKeyPairsRequestUnmarshaller implements Unmarshaller<DescribeKeyPairsRequest, Node> {

    public DescribeKeyPairsRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        DescribeKeyPairsRequest describeKeyPairsRequest = new DescribeKeyPairsRequest();

        
        NodeList keyNamesNodes = XpathUtils.asNodeList("KeyName/KeyName", node);
        for (int keyNamesIndex = 0; keyNamesIndex < XpathUtils.nodeLength(keyNamesNodes); ++keyNamesIndex) {
            Node keyNamesNode = keyNamesNodes.item(keyNamesIndex);
            describeKeyPairsRequest.getKeyNames().add(new StringUnmarshaller().unmarshall(keyNamesNode));
            keyNamesNode.getParentNode().removeChild(keyNamesNode);
        }
    

        return describeKeyPairsRequest;
    }
}
    