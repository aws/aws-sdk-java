/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteKeyPairRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteKeyPair(DeleteKeyPairRequest) DeleteKeyPair operation}.
 * <p>
 * Deletes the specified key pair, by removing the public key from Amazon
 * EC2.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteKeyPair(DeleteKeyPairRequest)
 */
public class DeleteKeyPairRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DeleteKeyPairRequest> {

    /**
     * The name of the key pair.
     */
    private String keyName;

    /**
     * Default constructor for a new DeleteKeyPairRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteKeyPairRequest() {}
    
    /**
     * Constructs a new DeleteKeyPairRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param keyName The name of the key pair.
     */
    public DeleteKeyPairRequest(String keyName) {
        setKeyName(keyName);
    }

    /**
     * The name of the key pair.
     *
     * @return The name of the key pair.
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * The name of the key pair.
     *
     * @param keyName The name of the key pair.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * The name of the key pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyName The name of the key pair.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteKeyPairRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DeleteKeyPairRequest> getDryRunRequest() {
        Request<DeleteKeyPairRequest> request = new DeleteKeyPairRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getKeyName() != null) sb.append("KeyName: " + getKeyName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteKeyPairRequest == false) return false;
        DeleteKeyPairRequest other = (DeleteKeyPairRequest)obj;
        
        if (other.getKeyName() == null ^ this.getKeyName() == null) return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false) return false; 
        return true;
    }
    
}
    