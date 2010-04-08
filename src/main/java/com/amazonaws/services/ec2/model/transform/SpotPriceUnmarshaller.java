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
 * Spot Price Unmarshaller
 */
public class SpotPriceUnmarshaller implements Unmarshaller<SpotPrice, Node> {

    public SpotPrice unmarshall(Node node) throws Exception {
        if (node == null) return null;

        SpotPrice spotPrice = new SpotPrice();

        
        Node instanceTypeNode = XpathUtils.asNode("instanceType", node);
        spotPrice.setInstanceType(new StringUnmarshaller().unmarshall(instanceTypeNode));
    
        Node productDescriptionNode = XpathUtils.asNode("productDescription", node);
        spotPrice.setProductDescription(new StringUnmarshaller().unmarshall(productDescriptionNode));
    
        Node spotPriceNode = XpathUtils.asNode("spotPrice", node);
        spotPrice.setSpotPrice(new StringUnmarshaller().unmarshall(spotPriceNode));
    
        Node timestampNode = XpathUtils.asNode("timestamp", node);
        spotPrice.setTimestamp(new DateUnmarshaller().unmarshall(timestampNode));
    

        return spotPrice;
    }
}
    