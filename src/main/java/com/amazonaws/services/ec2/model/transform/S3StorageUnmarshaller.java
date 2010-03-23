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
 * S3 Storage Unmarshaller
 */        
public class S3StorageUnmarshaller implements Unmarshaller<S3Storage, Node> {

    public S3Storage unmarshall(Node node) throws Exception {
        S3Storage s3Storage = new S3Storage();
        
        
        Node bucketNode = XpathUtils.asNode("bucket", node);
        s3Storage.setBucket(new StringUnmarshaller().unmarshall(bucketNode));
    
        Node prefixNode = XpathUtils.asNode("prefix", node);
        s3Storage.setPrefix(new StringUnmarshaller().unmarshall(prefixNode));
    
        Node aWSAccessKeyIdNode = XpathUtils.asNode("awsAccessKeyId", node);
        s3Storage.setAWSAccessKeyId(new StringUnmarshaller().unmarshall(aWSAccessKeyIdNode));
    
        Node uploadPolicyNode = XpathUtils.asNode("uploadPolicy", node);
        s3Storage.setUploadPolicy(new StringUnmarshaller().unmarshall(uploadPolicyNode));
    
        Node uploadPolicySignatureNode = XpathUtils.asNode("uploadPolicySignature", node);
        s3Storage.setUploadPolicySignature(new StringUnmarshaller().unmarshall(uploadPolicySignatureNode));
    

        return s3Storage;
    }  
}
    