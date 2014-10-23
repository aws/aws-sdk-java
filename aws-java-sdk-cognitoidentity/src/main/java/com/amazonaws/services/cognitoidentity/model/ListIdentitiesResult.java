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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/**
 * <p>
 * The response to a ListIdentities request.
 * </p>
 */
public class ListIdentitiesResult implements Serializable {

    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * An object containing a set of identities and associated mappings.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<IdentityDescription> identities;

    /**
     * A pagination token.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String nextToken;

    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return An identity pool ID in the format REGION:GUID.
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }
    
    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId An identity pool ID in the format REGION:GUID.
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }
    
    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId An identity pool ID in the format REGION:GUID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentitiesResult withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * An object containing a set of identities and associated mappings.
     *
     * @return An object containing a set of identities and associated mappings.
     */
    public java.util.List<IdentityDescription> getIdentities() {
        return identities;
    }
    
    /**
     * An object containing a set of identities and associated mappings.
     *
     * @param identities An object containing a set of identities and associated mappings.
     */
    public void setIdentities(java.util.Collection<IdentityDescription> identities) {
        if (identities == null) {
            this.identities = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<IdentityDescription> identitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IdentityDescription>(identities.size());
        identitiesCopy.addAll(identities);
        this.identities = identitiesCopy;
    }
    
    /**
     * An object containing a set of identities and associated mappings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identities An object containing a set of identities and associated mappings.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentitiesResult withIdentities(IdentityDescription... identities) {
        if (getIdentities() == null) setIdentities(new java.util.ArrayList<IdentityDescription>(identities.length));
        for (IdentityDescription value : identities) {
            getIdentities().add(value);
        }
        return this;
    }
    
    /**
     * An object containing a set of identities and associated mappings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identities An object containing a set of identities and associated mappings.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentitiesResult withIdentities(java.util.Collection<IdentityDescription> identities) {
        if (identities == null) {
            this.identities = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<IdentityDescription> identitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IdentityDescription>(identities.size());
            identitiesCopy.addAll(identities);
            this.identities = identitiesCopy;
        }

        return this;
    }

    /**
     * A pagination token.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return A pagination token.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A pagination token.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken A pagination token.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A pagination token.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken A pagination token.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentitiesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getIdentities() != null) sb.append("Identities: " + getIdentities() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getIdentities() == null) ? 0 : getIdentities().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListIdentitiesResult == false) return false;
        ListIdentitiesResult other = (ListIdentitiesResult)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getIdentities() == null ^ this.getIdentities() == null) return false;
        if (other.getIdentities() != null && other.getIdentities().equals(this.getIdentities()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    