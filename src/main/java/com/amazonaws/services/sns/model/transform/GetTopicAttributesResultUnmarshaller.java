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
 * Get Topic Attributes Result Unmarshaller
 */
public class GetTopicAttributesResultUnmarshaller implements Unmarshaller<GetTopicAttributesResult, Node> {

    public GetTopicAttributesResult unmarshall(Node node) throws Exception {
        if (node == null) return null;

        GetTopicAttributesResult getTopicAttributesResult = new GetTopicAttributesResult();

        
        NodeList attributesNodes = XpathUtils.asNodeList("Attributes/entry", node);
        for (int attributesIndex = 0; attributesIndex < XpathUtils.nodeLength(attributesNodes); ++attributesIndex) {
            String attributesMapKey = new StringUnmarshaller().unmarshall(XpathUtils.asNode("key", attributesNodes.item(attributesIndex)));
            String attributesMapValue = new StringUnmarshaller().unmarshall(XpathUtils.asNode("value", attributesNodes.item(attributesIndex)));
            getTopicAttributesResult.getAttributes().put(attributesMapKey, attributesMapValue);
        }
    

        return getTopicAttributesResult;
    }
}
    