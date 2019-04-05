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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Returned for a successful ListIdentityPoolUsage request.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListIdentityPoolUsage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIdentityPoolUsageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Usage information for the identity pools. */
    private com.amazonaws.internal.SdkInternalList<IdentityPoolUsage> identityPoolUsages;
    /** The maximum number of results to be returned. */
    private Integer maxResults;
    /** Total number of identities for the identity pool. */
    private Integer count;
    /** A pagination token for obtaining the next page of results. */
    private String nextToken;

    /**
     * Usage information for the identity pools.
     * 
     * @return Usage information for the identity pools.
     */

    public java.util.List<IdentityPoolUsage> getIdentityPoolUsages() {
        if (identityPoolUsages == null) {
            identityPoolUsages = new com.amazonaws.internal.SdkInternalList<IdentityPoolUsage>();
        }
        return identityPoolUsages;
    }

    /**
     * Usage information for the identity pools.
     * 
     * @param identityPoolUsages
     *        Usage information for the identity pools.
     */

    public void setIdentityPoolUsages(java.util.Collection<IdentityPoolUsage> identityPoolUsages) {
        if (identityPoolUsages == null) {
            this.identityPoolUsages = null;
            return;
        }

        this.identityPoolUsages = new com.amazonaws.internal.SdkInternalList<IdentityPoolUsage>(identityPoolUsages);
    }

    /**
     * Usage information for the identity pools.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentityPoolUsages(java.util.Collection)} or {@link #withIdentityPoolUsages(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param identityPoolUsages
     *        Usage information for the identity pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityPoolUsageResult withIdentityPoolUsages(IdentityPoolUsage... identityPoolUsages) {
        if (this.identityPoolUsages == null) {
            setIdentityPoolUsages(new com.amazonaws.internal.SdkInternalList<IdentityPoolUsage>(identityPoolUsages.length));
        }
        for (IdentityPoolUsage ele : identityPoolUsages) {
            this.identityPoolUsages.add(ele);
        }
        return this;
    }

    /**
     * Usage information for the identity pools.
     * 
     * @param identityPoolUsages
     *        Usage information for the identity pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityPoolUsageResult withIdentityPoolUsages(java.util.Collection<IdentityPoolUsage> identityPoolUsages) {
        setIdentityPoolUsages(identityPoolUsages);
        return this;
    }

    /**
     * The maximum number of results to be returned.
     * 
     * @param maxResults
     *        The maximum number of results to be returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * The maximum number of results to be returned.
     * 
     * @return The maximum number of results to be returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * The maximum number of results to be returned.
     * 
     * @param maxResults
     *        The maximum number of results to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityPoolUsageResult withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * Total number of identities for the identity pool.
     * 
     * @param count
     *        Total number of identities for the identity pool.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Total number of identities for the identity pool.
     * 
     * @return Total number of identities for the identity pool.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * Total number of identities for the identity pool.
     * 
     * @param count
     *        Total number of identities for the identity pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityPoolUsageResult withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * A pagination token for obtaining the next page of results.
     * 
     * @param nextToken
     *        A pagination token for obtaining the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A pagination token for obtaining the next page of results.
     * 
     * @return A pagination token for obtaining the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A pagination token for obtaining the next page of results.
     * 
     * @param nextToken
     *        A pagination token for obtaining the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityPoolUsageResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
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
        if (getIdentityPoolUsages() != null)
            sb.append("IdentityPoolUsages: ").append(getIdentityPoolUsages()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIdentityPoolUsageResult == false)
            return false;
        ListIdentityPoolUsageResult other = (ListIdentityPoolUsageResult) obj;
        if (other.getIdentityPoolUsages() == null ^ this.getIdentityPoolUsages() == null)
            return false;
        if (other.getIdentityPoolUsages() != null && other.getIdentityPoolUsages().equals(this.getIdentityPoolUsages()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityPoolUsages() == null) ? 0 : getIdentityPoolUsages().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIdentityPoolUsageResult clone() {
        try {
            return (ListIdentityPoolUsageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
