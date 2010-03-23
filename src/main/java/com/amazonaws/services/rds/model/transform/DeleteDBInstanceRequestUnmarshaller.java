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
 * Delete D B Instance Request Unmarshaller
 */        
public class DeleteDBInstanceRequestUnmarshaller implements Unmarshaller<DeleteDBInstanceRequest, Node> {

    public DeleteDBInstanceRequest unmarshall(Node node) throws Exception {
        DeleteDBInstanceRequest deleteDBInstanceRequest = new DeleteDBInstanceRequest();
        
        
        Node dBInstanceIdentifierNode = XpathUtils.asNode("DBInstanceIdentifier", node);
        deleteDBInstanceRequest.setDBInstanceIdentifier(new StringUnmarshaller().unmarshall(dBInstanceIdentifierNode));
    
        Node skipFinalSnapshotNode = XpathUtils.asNode("SkipFinalSnapshot", node);
        deleteDBInstanceRequest.setSkipFinalSnapshot(new BooleanUnmarshaller().unmarshall(skipFinalSnapshotNode));
    
        Node finalDBSnapshotIdentifierNode = XpathUtils.asNode("FinalDBSnapshotIdentifier", node);
        deleteDBInstanceRequest.setFinalDBSnapshotIdentifier(new StringUnmarshaller().unmarshall(finalDBSnapshotIdentifierNode));
    

        return deleteDBInstanceRequest;
    }  
}
    