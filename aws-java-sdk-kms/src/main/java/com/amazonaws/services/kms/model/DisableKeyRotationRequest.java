/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.kms.AWSKMS#disableKeyRotation(DisableKeyRotationRequest) DisableKeyRotation operation}.
 * <p>
 * Disables rotation of the specified key.
 * </p>
 *
 * @see com.amazonaws.services.kms.AWSKMS#disableKeyRotation(DisableKeyRotationRequest)
 */
public class DisableKeyRotationRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Unique identifier of the customer master key for which rotation is to
     * be disabled. This can be an ARN, an alias, or a globally unique
     * identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * Unique identifier of the customer master key for which rotation is to
     * be disabled. This can be an ARN, an alias, or a globally unique
     * identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Unique identifier of the customer master key for which rotation is to
     *         be disabled. This can be an ARN, an alias, or a globally unique
     *         identifier.
     */
    public String getKeyId() {
        return keyId;
    }
    
    /**
     * Unique identifier of the customer master key for which rotation is to
     * be disabled. This can be an ARN, an alias, or a globally unique
     * identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier of the customer master key for which rotation is to
     *         be disabled. This can be an ARN, an alias, or a globally unique
     *         identifier.
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    
    /**
     * Unique identifier of the customer master key for which rotation is to
     * be disabled. This can be an ARN, an alias, or a globally unique
     * identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier of the customer master key for which rotation is to
     *         be disabled. This can be an ARN, an alias, or a globally unique
     *         identifier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DisableKeyRotationRequest withKeyId(String keyId) {
        this.keyId = keyId;
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
        if (getKeyId() != null) sb.append("KeyId: " + getKeyId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DisableKeyRotationRequest == false) return false;
        DisableKeyRotationRequest other = (DisableKeyRotationRequest)obj;
        
        if (other.getKeyId() == null ^ this.getKeyId() == null) return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false) return false; 
        return true;
    }
    
}
    