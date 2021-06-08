/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAuditSuppressionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String checkName;

    private ResourceIdentifier resourceIdentifier;
    /**
     * <p>
     * Determines whether suppressions are listed in ascending order by expiration date or not. If parameter isn't
     * provided, <code>ascendingOrder=true</code>.
     * </p>
     */
    private Boolean ascendingOrder;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     */
    private Integer maxResults;

    /**
     * @param checkName
     */

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    /**
     * @return
     */

    public String getCheckName() {
        return this.checkName;
    }

    /**
     * @param checkName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditSuppressionsRequest withCheckName(String checkName) {
        setCheckName(checkName);
        return this;
    }

    /**
     * @param resourceIdentifier
     */

    public void setResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * @return
     */

    public ResourceIdentifier getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * @param resourceIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditSuppressionsRequest withResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * Determines whether suppressions are listed in ascending order by expiration date or not. If parameter isn't
     * provided, <code>ascendingOrder=true</code>.
     * </p>
     * 
     * @param ascendingOrder
     *        Determines whether suppressions are listed in ascending order by expiration date or not. If parameter
     *        isn't provided, <code>ascendingOrder=true</code>.
     */

    public void setAscendingOrder(Boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
    }

    /**
     * <p>
     * Determines whether suppressions are listed in ascending order by expiration date or not. If parameter isn't
     * provided, <code>ascendingOrder=true</code>.
     * </p>
     * 
     * @return Determines whether suppressions are listed in ascending order by expiration date or not. If parameter
     *         isn't provided, <code>ascendingOrder=true</code>.
     */

    public Boolean getAscendingOrder() {
        return this.ascendingOrder;
    }

    /**
     * <p>
     * Determines whether suppressions are listed in ascending order by expiration date or not. If parameter isn't
     * provided, <code>ascendingOrder=true</code>.
     * </p>
     * 
     * @param ascendingOrder
     *        Determines whether suppressions are listed in ascending order by expiration date or not. If parameter
     *        isn't provided, <code>ascendingOrder=true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditSuppressionsRequest withAscendingOrder(Boolean ascendingOrder) {
        setAscendingOrder(ascendingOrder);
        return this;
    }

    /**
     * <p>
     * Determines whether suppressions are listed in ascending order by expiration date or not. If parameter isn't
     * provided, <code>ascendingOrder=true</code>.
     * </p>
     * 
     * @return Determines whether suppressions are listed in ascending order by expiration date or not. If parameter
     *         isn't provided, <code>ascendingOrder=true</code>.
     */

    public Boolean isAscendingOrder() {
        return this.ascendingOrder;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditSuppressionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time. The default is 25.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * 
     * @return The maximum number of results to return at one time. The default is 25.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time. The default is 25.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditSuppressionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getCheckName() != null)
            sb.append("CheckName: ").append(getCheckName()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getAscendingOrder() != null)
            sb.append("AscendingOrder: ").append(getAscendingOrder()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAuditSuppressionsRequest == false)
            return false;
        ListAuditSuppressionsRequest other = (ListAuditSuppressionsRequest) obj;
        if (other.getCheckName() == null ^ this.getCheckName() == null)
            return false;
        if (other.getCheckName() != null && other.getCheckName().equals(this.getCheckName()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getAscendingOrder() == null ^ this.getAscendingOrder() == null)
            return false;
        if (other.getAscendingOrder() != null && other.getAscendingOrder().equals(this.getAscendingOrder()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckName() == null) ? 0 : getCheckName().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAscendingOrder() == null) ? 0 : getAscendingOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAuditSuppressionsRequest clone() {
        return (ListAuditSuppressionsRequest) super.clone();
    }

}
