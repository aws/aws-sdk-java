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

/**
 * 
 */
public class GetKeyRotationStatusResult implements Serializable {

    /**
     * A Boolean value that specifies whether key rotation is enabled.
     */
    private Boolean keyRotationEnabled;

    /**
     * A Boolean value that specifies whether key rotation is enabled.
     *
     * @return A Boolean value that specifies whether key rotation is enabled.
     */
    public Boolean isKeyRotationEnabled() {
        return keyRotationEnabled;
    }
    
    /**
     * A Boolean value that specifies whether key rotation is enabled.
     *
     * @param keyRotationEnabled A Boolean value that specifies whether key rotation is enabled.
     */
    public void setKeyRotationEnabled(Boolean keyRotationEnabled) {
        this.keyRotationEnabled = keyRotationEnabled;
    }
    
    /**
     * A Boolean value that specifies whether key rotation is enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyRotationEnabled A Boolean value that specifies whether key rotation is enabled.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetKeyRotationStatusResult withKeyRotationEnabled(Boolean keyRotationEnabled) {
        this.keyRotationEnabled = keyRotationEnabled;
        return this;
    }

    /**
     * A Boolean value that specifies whether key rotation is enabled.
     *
     * @return A Boolean value that specifies whether key rotation is enabled.
     */
    public Boolean getKeyRotationEnabled() {
        return keyRotationEnabled;
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
        if (isKeyRotationEnabled() != null) sb.append("KeyRotationEnabled: " + isKeyRotationEnabled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isKeyRotationEnabled() == null) ? 0 : isKeyRotationEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetKeyRotationStatusResult == false) return false;
        GetKeyRotationStatusResult other = (GetKeyRotationStatusResult)obj;
        
        if (other.isKeyRotationEnabled() == null ^ this.isKeyRotationEnabled() == null) return false;
        if (other.isKeyRotationEnabled() != null && other.isKeyRotationEnabled().equals(this.isKeyRotationEnabled()) == false) return false; 
        return true;
    }
    
}
    