/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to the ListIdentities action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/ListIdentities" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIdentitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * The maximum number of identities to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An optional boolean parameter that allows you to hide disabled identities. If omitted, the ListIdentities API
     * will include disabled identities in the response.
     * </p>
     */
    private Boolean hideDisabled;

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @return An identity pool ID in the format REGION:GUID.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
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
     * <p>
     * The maximum number of identities to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of identities to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of identities to return.
     * </p>
     * 
     * @return The maximum number of identities to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of identities to return.
     * </p>
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
     * <p>
     * A pagination token.
     * </p>
     * 
     * @param nextToken
     *        A pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @return A pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
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
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
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
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getHideDisabled() != null)
            sb.append("HideDisabled: ").append(getHideDisabled());
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
