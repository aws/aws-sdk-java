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
 * <p>
 * Contains information about each entry in the key list.
 * </p>
 */
public class KeyListEntry implements Serializable {

    /**
     * Unique identifier of the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * ARN of the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String keyArn;

    /**
     * Unique identifier of the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Unique identifier of the key.
     */
    public String getKeyId() {
        return keyId;
    }
    
    /**
     * Unique identifier of the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier of the key.
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    
    /**
     * Unique identifier of the key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier of the key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeyListEntry withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * ARN of the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return ARN of the key.
     */
    public String getKeyArn() {
        return keyArn;
    }
    
    /**
     * ARN of the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param keyArn ARN of the key.
     */
    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }
    
    /**
     * ARN of the key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param keyArn ARN of the key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeyListEntry withKeyArn(String keyArn) {
        this.keyArn = keyArn;
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
        if (getKeyId() != null) sb.append("KeyId: " + getKeyId() + ",");
        if (getKeyArn() != null) sb.append("KeyArn: " + getKeyArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof KeyListEntry == false) return false;
        KeyListEntry other = (KeyListEntry)obj;
        
        if (other.getKeyId() == null ^ this.getKeyId() == null) return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false) return false; 
        if (other.getKeyArn() == null ^ this.getKeyArn() == null) return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false) return false; 
        return true;
    }
    
}
    