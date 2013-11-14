/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteAccountAlias(DeleteAccountAliasRequest) DeleteAccountAlias operation}.
 * <p>
 * Deletes the specified AWS account alias. For information about using an AWS account alias, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html"> Using an Alias for Your AWS Account ID </a> in <i>Using AWS Identity and
 * Access Management</i> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteAccountAlias(DeleteAccountAliasRequest)
 */
public class DeleteAccountAliasRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Name of the account alias to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$<br/>
     */
    private String accountAlias;

    /**
     * Default constructor for a new DeleteAccountAliasRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteAccountAliasRequest() {}
    
    /**
     * Constructs a new DeleteAccountAliasRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountAlias Name of the account alias to delete.
     */
    public DeleteAccountAliasRequest(String accountAlias) {
        setAccountAlias(accountAlias);
    }

    /**
     * Name of the account alias to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$<br/>
     *
     * @return Name of the account alias to delete.
     */
    public String getAccountAlias() {
        return accountAlias;
    }
    
    /**
     * Name of the account alias to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$<br/>
     *
     * @param accountAlias Name of the account alias to delete.
     */
    public void setAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
    }
    
    /**
     * Name of the account alias to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$<br/>
     *
     * @param accountAlias Name of the account alias to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteAccountAliasRequest withAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
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
        if (getAccountAlias() != null) sb.append("AccountAlias: " + getAccountAlias() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountAlias() == null) ? 0 : getAccountAlias().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteAccountAliasRequest == false) return false;
        DeleteAccountAliasRequest other = (DeleteAccountAliasRequest)obj;
        
        if (other.getAccountAlias() == null ^ this.getAccountAlias() == null) return false;
        if (other.getAccountAlias() != null && other.getAccountAlias().equals(this.getAccountAlias()) == false) return false; 
        return true;
    }
    
}
    