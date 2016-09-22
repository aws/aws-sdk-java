/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Input to the ListIdentities action.
 */
public class ListIdentitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** An identity pool ID in the format REGION:GUID. */
    private String identityPoolId;
    /** The maximum number of identities to return. */
    private Integer maxResults;
    /** A pagination token. */
    private String nextToken;
    /**
     * <p>
     * An optional boolean parameter that allows you to hide disabled identities. If omitted, the ListIdentities API
     * will include disabled identities in the response.
     * </p>
     */
    private Boolean hideDisabled;

    /**
     * An identity pool ID in the format REGION:GUID.
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * An identity pool ID in the format REGION:GUID.
     * 
     * @return An identity pool ID in the format REGION:GUID.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * An identity pool ID in the format REGION:GUID.
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentitiesRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * The maximum number of identities to return.
     * 
     * @param maxResults
     *        The maximum number of identities to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * The maximum number of identities to return.
     * 
     * @return The maximum number of identities to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * The maximum number of identities to return.
     * 
     * @param maxResults
     *        The maximum number of identities to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentitiesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * A pagination token.
     * 
     * @param nextToken
     *        A pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A pagination token.
     * 
     * @return A pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A pagination token.
     * 
     * @param nextToken
     *        A pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentitiesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An optional boolean parameter that allows you to hide disabled identities. If omitted, the ListIdentities API
     * will include disabled identities in the response.
     * </p>
     * 
     * @param hideDisabled
     *        An optional boolean parameter that allows you to hide disabled identities. If omitted, the ListIdentities
     *        API will include disabled identities in the response.
     */

    public void setHideDisabled(Boolean hideDisabled) {
        this.hideDisabled = hideDisabled;
    }

    /**
     * <p>
     * An optional boolean parameter that allows you to hide disabled identities. If omitted, the ListIdentities API
     * will include disabled identities in the response.
     * </p>
     * 
     * @return An optional boolean parameter that allows you to hide disabled identities. If omitted, the ListIdentities
     *         API will include disabled identities in the response.
     */

    public Boolean getHideDisabled() {
        return this.hideDisabled;
    }

    /**
     * <p>
     * An optional boolean parameter that allows you to hide disabled identities. If omitted, the ListIdentities API
     * will include disabled identities in the response.
     * </p>
     * 
     * @param hideDisabled
     *        An optional boolean parameter that allows you to hide disabled identities. If omitted, the ListIdentities
     *        API will include disabled identities in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentitiesRequest withHideDisabled(Boolean hideDisabled) {
        setHideDisabled(hideDisabled);
        return this;
    }

    /**
     * <p>
     * An optional boolean parameter that allows you to hide disabled identities. If omitted, the ListIdentities API
     * will include disabled identities in the response.
     * </p>
     * 
     * @return An optional boolean parameter that allows you to hide disabled identities. If omitted, the ListIdentities
     *         API will include disabled identities in the response.
     */

    public Boolean isHideDisabled() {
        return this.hideDisabled;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getHideDisabled() != null)
            sb.append("HideDisabled: " + getHideDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIdentitiesRequest == false)
            return false;
        ListIdentitiesRequest other = (ListIdentitiesRequest) obj;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getHideDisabled() == null ^ this.getHideDisabled() == null)
            return false;
        if (other.getHideDisabled() != null && other.getHideDisabled().equals(this.getHideDisabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getHideDisabled() == null) ? 0 : getHideDisabled().hashCode());
        return hashCode;
    }

    @Override
    public ListIdentitiesRequest clone() {
        return (ListIdentitiesRequest) super.clone();
    }
}
