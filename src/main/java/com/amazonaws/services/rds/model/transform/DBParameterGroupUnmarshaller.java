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

package com.amazonaws.services.rds.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * D B Parameter Group Unmarshaller
 */
public class DBParameterGroupUnmarshaller implements Unmarshaller<DBParameterGroup, Node> {

    public DBParameterGroup unmarshall(Node node) throws Exception {
        if (node == null) return null;

        DBParameterGroup dBParameterGroup = new DBParameterGroup();

        
        Node dBParameterGroupNameNode = XpathUtils.asNode("DBParameterGroupName", node);
        dBParameterGroup.setDBParameterGroupName(new StringUnmarshaller().unmarshall(dBParameterGroupNameNode));
    
        Node engineNode = XpathUtils.asNode("Engine", node);
        dBParameterGroup.setEngine(new StringUnmarshaller().unmarshall(engineNode));
    
        Node descriptionNode = XpathUtils.asNode("Description", node);
        dBParameterGroup.setDescription(new StringUnmarshaller().unmarshall(descriptionNode));
    

        return dBParameterGroup;
    }
}
    