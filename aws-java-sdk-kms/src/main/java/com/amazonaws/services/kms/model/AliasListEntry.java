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
 * Contains information about an alias.
 * </p>
 */
public class AliasListEntry implements Serializable {

    /**
     * String that contains the alias.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     */
    private String aliasName;

    /**
     * String that contains the key ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String aliasArn;

    /**
     * String that contains the key identifier pointed to by the alias.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String targetKeyId;

    /**
     * String that contains the alias.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @return String that contains the alias.
     */
    public String getAliasName() {
        return aliasName;
    }
    
    /**
     * String that contains the alias.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param aliasName String that contains the alias.
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }
    
    /**
     * String that contains the alias.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param aliasName String that contains the alias.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AliasListEntry withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * String that contains the key ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return String that contains the key ARN.
     */
    public String getAliasArn() {
        return aliasArn;
    }
    
    /**
     * String that contains the key ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aliasArn String that contains the key ARN.
     */
    public void setAliasArn(String aliasArn) {
        this.aliasArn = aliasArn;
    }
    
    /**
     * String that contains the key ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aliasArn String that contains the key ARN.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AliasListEntry withAliasArn(String aliasArn) {
        this.aliasArn = aliasArn;
        return this;
    }

    /**
     * String that contains the key identifier pointed to by the alias.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return String that contains the key identifier pointed to by the alias.
     */
    public String getTargetKeyId() {
        return targetKeyId;
    }
    
    /**
     * String that contains the key identifier pointed to by the alias.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param targetKeyId String that contains the key identifier pointed to by the alias.
     */
    public void setTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
    }
    
    /**
     * String that contains the key identifier pointed to by the alias.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param targetKeyId String that contains the key identifier pointed to by the alias.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AliasListEntry withTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
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
        if (getAliasName() != null) sb.append("AliasName: " + getAliasName() + ",");
        if (getAliasArn() != null) sb.append("AliasArn: " + getAliasArn() + ",");
        if (getTargetKeyId() != null) sb.append("TargetKeyId: " + getTargetKeyId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode()); 
        hashCode = prime * hashCode + ((getAliasArn() == null) ? 0 : getAliasArn().hashCode()); 
        hashCode = prime * hashCode + ((getTargetKeyId() == null) ? 0 : getTargetKeyId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AliasListEntry == false) return false;
        AliasListEntry other = (AliasListEntry)obj;
        
        if (other.getAliasName() == null ^ this.getAliasName() == null) return false;
        if (other.getAliasName() != null && other.getAliasName().equals(this.getAliasName()) == false) return false; 
        if (other.getAliasArn() == null ^ this.getAliasArn() == null) return false;
        if (other.getAliasArn() != null && other.getAliasArn().equals(this.getAliasArn()) == false) return false; 
        if (other.getTargetKeyId() == null ^ this.getTargetKeyId() == null) return false;
        if (other.getTargetKeyId() != null && other.getTargetKeyId().equals(this.getTargetKeyId()) == false) return false; 
        return true;
    }
    
}
    