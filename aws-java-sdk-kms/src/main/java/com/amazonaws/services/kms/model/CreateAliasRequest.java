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
 * Container for the parameters to the {@link com.amazonaws.services.kms.AWSKMS#createAlias(CreateAliasRequest) CreateAlias operation}.
 * <p>
 * Creates a display name for a customer master key. An alias can be
 * used to identify a key and should be unique. The console enforces a
 * one-to-one mapping between the alias and a key. An alias name can
 * contain only alphanumeric characters, forward slashes (/), underscores
 * (_), and dashes (-). An alias must start with the word "alias"
 * followed by a forward slash (alias/). An alias that begins with "aws"
 * after the forward slash (alias/aws...) is reserved by Amazon Web
 * Services (AWS).
 * </p>
 *
 * @see com.amazonaws.services.kms.AWSKMS#createAlias(CreateAliasRequest)
 */
public class CreateAliasRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * String that contains the display name. Aliases that begin with AWS are
     * reserved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     */
    private String aliasName;

    /**
     * An identifier of the key for which you are creating the alias. This
     * value cannot be another alias.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String targetKeyId;

    /**
     * String that contains the display name. Aliases that begin with AWS are
     * reserved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @return String that contains the display name. Aliases that begin with AWS are
     *         reserved.
     */
    public String getAliasName() {
        return aliasName;
    }
    
    /**
     * String that contains the display name. Aliases that begin with AWS are
     * reserved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param aliasName String that contains the display name. Aliases that begin with AWS are
     *         reserved.
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }
    
    /**
     * String that contains the display name. Aliases that begin with AWS are
     * reserved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param aliasName String that contains the display name. Aliases that begin with AWS are
     *         reserved.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAliasRequest withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * An identifier of the key for which you are creating the alias. This
     * value cannot be another alias.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return An identifier of the key for which you are creating the alias. This
     *         value cannot be another alias.
     */
    public String getTargetKeyId() {
        return targetKeyId;
    }
    
    /**
     * An identifier of the key for which you are creating the alias. This
     * value cannot be another alias.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param targetKeyId An identifier of the key for which you are creating the alias. This
     *         value cannot be another alias.
     */
    public void setTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
    }
    
    /**
     * An identifier of the key for which you are creating the alias. This
     * value cannot be another alias.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param targetKeyId An identifier of the key for which you are creating the alias. This
     *         value cannot be another alias.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAliasRequest withTargetKeyId(String targetKeyId) {
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
        if (getTargetKeyId() != null) sb.append("TargetKeyId: " + getTargetKeyId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode()); 
        hashCode = prime * hashCode + ((getTargetKeyId() == null) ? 0 : getTargetKeyId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateAliasRequest == false) return false;
        CreateAliasRequest other = (CreateAliasRequest)obj;
        
        if (other.getAliasName() == null ^ this.getAliasName() == null) return false;
        if (other.getAliasName() != null && other.getAliasName().equals(this.getAliasName()) == false) return false; 
        if (other.getTargetKeyId() == null ^ this.getTargetKeyId() == null) return false;
        if (other.getTargetKeyId() != null && other.getTargetKeyId().equals(this.getTargetKeyId()) == false) return false; 
        return true;
    }
    
}
    