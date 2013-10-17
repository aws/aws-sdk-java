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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#listIdentities(ListIdentitiesRequest) ListIdentities operation}.
 * <p>
 * Returns a list containing all of the identities (email addresses and domains) for a specific AWS Account, regardless of verification status.
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#listIdentities(ListIdentitiesRequest)
 */
public class ListIdentitiesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The type of the identities to list. Possible values are "EmailAddress"
     * and "Domain". If this parameter is omitted, then all identities will
     * be listed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EmailAddress, Domain
     */
    private String identityType;

    /**
     * The token to use for pagination.
     */
    private String nextToken;

    /**
     * The maximum number of identities per page. Possible values are 1-100
     * inclusive.
     */
    private Integer maxItems;

    /**
     * The type of the identities to list. Possible values are "EmailAddress"
     * and "Domain". If this parameter is omitted, then all identities will
     * be listed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EmailAddress, Domain
     *
     * @return The type of the identities to list. Possible values are "EmailAddress"
     *         and "Domain". If this parameter is omitted, then all identities will
     *         be listed.
     *
     * @see IdentityType
     */
    public String getIdentityType() {
        return identityType;
    }
    
    /**
     * The type of the identities to list. Possible values are "EmailAddress"
     * and "Domain". If this parameter is omitted, then all identities will
     * be listed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EmailAddress, Domain
     *
     * @param identityType The type of the identities to list. Possible values are "EmailAddress"
     *         and "Domain". If this parameter is omitted, then all identities will
     *         be listed.
     *
     * @see IdentityType
     */
    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }
    
    /**
     * The type of the identities to list. Possible values are "EmailAddress"
     * and "Domain". If this parameter is omitted, then all identities will
     * be listed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EmailAddress, Domain
     *
     * @param identityType The type of the identities to list. Possible values are "EmailAddress"
     *         and "Domain". If this parameter is omitted, then all identities will
     *         be listed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see IdentityType
     */
    public ListIdentitiesRequest withIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }

    /**
     * The type of the identities to list. Possible values are "EmailAddress"
     * and "Domain". If this parameter is omitted, then all identities will
     * be listed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EmailAddress, Domain
     *
     * @param identityType The type of the identities to list. Possible values are "EmailAddress"
     *         and "Domain". If this parameter is omitted, then all identities will
     *         be listed.
     *
     * @see IdentityType
     */
    public void setIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
    }
    
    /**
     * The type of the identities to list. Possible values are "EmailAddress"
     * and "Domain". If this parameter is omitted, then all identities will
     * be listed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EmailAddress, Domain
     *
     * @param identityType The type of the identities to list. Possible values are "EmailAddress"
     *         and "Domain". If this parameter is omitted, then all identities will
     *         be listed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see IdentityType
     */
    public ListIdentitiesRequest withIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
        return this;
    }

    /**
     * The token to use for pagination.
     *
     * @return The token to use for pagination.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use for pagination.
     *
     * @param nextToken The token to use for pagination.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use for pagination.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use for pagination.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListIdentitiesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of identities per page. Possible values are 1-100
     * inclusive.
     *
     * @return The maximum number of identities per page. Possible values are 1-100
     *         inclusive.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * The maximum number of identities per page. Possible values are 1-100
     * inclusive.
     *
     * @param maxItems The maximum number of identities per page. Possible values are 1-100
     *         inclusive.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The maximum number of identities per page. Possible values are 1-100
     * inclusive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The maximum number of identities per page. Possible values are 1-100
     *         inclusive.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListIdentitiesRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
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
        if (getIdentityType() != null) sb.append("IdentityType: " + getIdentityType() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListIdentitiesRequest == false) return false;
        ListIdentitiesRequest other = (ListIdentitiesRequest)obj;
        
        if (other.getIdentityType() == null ^ this.getIdentityType() == null) return false;
        if (other.getIdentityType() != null && other.getIdentityType().equals(this.getIdentityType()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
}
    