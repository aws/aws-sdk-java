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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteKeyPair(DeleteKeyPairRequest) DeleteKeyPair operation}.
 * <p>
 * The DeleteKeyPair operation deletes a key pair.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteKeyPair(DeleteKeyPairRequest)
 */
public class DeleteKeyPairRequest extends AmazonWebServiceRequest {

    /**
     * The name of the Amazon EC2 key pair to delete.
     */
    private String keyName;

    /**
     * The name of the Amazon EC2 key pair to delete.
     *
     * @return The name of the Amazon EC2 key pair to delete.
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * The name of the Amazon EC2 key pair to delete.
     *
     * @param keyName The name of the Amazon EC2 key pair to delete.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * The name of the Amazon EC2 key pair to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyName The name of the Amazon EC2 key pair to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteKeyPairRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("KeyName: " + keyName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    