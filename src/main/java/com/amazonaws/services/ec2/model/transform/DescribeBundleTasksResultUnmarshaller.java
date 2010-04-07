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
 * Describe Bundle Tasks Result Unmarshaller
 */
public class DescribeBundleTasksResultUnmarshaller implements Unmarshaller<DescribeBundleTasksResult, Node> {

    public DescribeBundleTasksResult unmarshall(Node node) throws Exception {
        if (node == null) return null;

        DescribeBundleTasksResult describeBundleTasksResult = new DescribeBundleTasksResult();

        
        NodeList bundleTasksNodes = XpathUtils.asNodeList("bundleInstanceTasksSet/item", node);
        for (int bundleTasksIndex = 0; bundleTasksIndex < XpathUtils.nodeLength(bundleTasksNodes); ++bundleTasksIndex) {
            Node bundleTasksNode = bundleTasksNodes.item(bundleTasksIndex);
            describeBundleTasksResult.getBundleTasks().add(new BundleTaskUnmarshaller().unmarshall(bundleTasksNode));
            bundleTasksNode.getParentNode().removeChild(bundleTasksNode);
        }
    

        return describeBundleTasksResult;
    }
}
    