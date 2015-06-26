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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#listIdentities(ListIdentitiesRequest) ListIdentities operation}.
 * <p>
 * Lists the identities in a pool.
 * </p>
 * <p>
 * You must use AWS Developer credentials to call this API.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#listIdentities(ListIdentitiesRequest)
 */
public class ListIdentitiesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * The maximum number of identities to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     */
    private Integer maxResults;

    /**
     * A pagination token.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String nextToken;

    /**
     * An optional boolean parameter that allows you to hide disabled
     * identities. If omitted, the ListIdentities API will include disabled
     * identities in the response.
     */
    private Boolean hideDisabled;

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
    public ListIdentitiesRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * The maximum number of identities to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     *
     * @return The maximum number of identities to return.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of identities to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     *
     * @param maxResults The maximum number of identities to return.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of identities to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     *
     * @param maxResults The maximum number of identities to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentitiesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
    public ListIdentitiesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * An optional boolean parameter that allows you to hide disabled
     * identities. If omitted, the ListIdentities API will include disabled
     * identities in the response.
     *
     * @return An optional boolean parameter that allows you to hide disabled
     *         identities. If omitted, the ListIdentities API will include disabled
     *         identities in the response.
     */
    public Boolean isHideDisabled() {
        return hideDisabled;
    }
    
    /**
     * An optional boolean parameter that allows you to hide disabled
     * identities. If omitted, the ListIdentities API will include disabled
     * identities in the response.
     *
     * @param hideDisabled An optional boolean parameter that allows you to hide disabled
     *         identities. If omitted, the ListIdentities API will include disabled
     *         identities in the response.
     */
    public void setHideDisabled(Boolean hideDisabled) {
        this.hideDisabled = hideDisabled;
    }
    
    /**
     * An optional boolean parameter that allows you to hide disabled
     * identities. If omitted, the ListIdentities API will include disabled
     * identities in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hideDisabled An optional boolean parameter that allows you to hide disabled
     *         identities. If omitted, the ListIdentities API will include disabled
     *         identities in the response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentitiesRequest withHideDisabled(Boolean hideDisabled) {
        this.hideDisabled = hideDisabled;
        return this;
    }

    /**
     * An optional boolean parameter that allows you to hide disabled
     * identities. If omitted, the ListIdentities API will include disabled
     * identities in the response.
     *
     * @return An optional boolean parameter that allows you to hide disabled
     *         identities. If omitted, the ListIdentities API will include disabled
     *         identities in the response.
     */
    public Boolean getHideDisabled() {
        return hideDisabled;
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
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (isHideDisabled() != null) sb.append("HideDisabled: " + isHideDisabled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((isHideDisabled() == null) ? 0 : isHideDisabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListIdentitiesRequest == false) return false;
        ListIdentitiesRequest other = (ListIdentitiesRequest)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.isHideDisabled() == null ^ this.isHideDisabled() == null) return false;
        if (other.isHideDisabled() != null && other.isHideDisabled().equals(this.isHideDisabled()) == false) return false; 
        return true;
    }
    
    @Override
    public ListIdentitiesRequest clone() {
        
            return (ListIdentitiesRequest) super.clone();
    }

}
    