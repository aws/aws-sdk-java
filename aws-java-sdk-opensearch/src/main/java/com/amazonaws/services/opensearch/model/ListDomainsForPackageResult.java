/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for the response parameters to the <code>ListDomainsForPackage</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDomainsForPackageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about all domains associated with a package.
     * </p>
     */
    private java.util.List<DomainPackageDetails> domainPackageDetailsList;
    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about all domains associated with a package.
     * </p>
     * 
     * @return Information about all domains associated with a package.
     */

    public java.util.List<DomainPackageDetails> getDomainPackageDetailsList() {
        return domainPackageDetailsList;
    }

    /**
     * <p>
     * Information about all domains associated with a package.
     * </p>
     * 
     * @param domainPackageDetailsList
     *        Information about all domains associated with a package.
     */

    public void setDomainPackageDetailsList(java.util.Collection<DomainPackageDetails> domainPackageDetailsList) {
        if (domainPackageDetailsList == null) {
            this.domainPackageDetailsList = null;
            return;
        }

        this.domainPackageDetailsList = new java.util.ArrayList<DomainPackageDetails>(domainPackageDetailsList);
    }

    /**
     * <p>
     * Information about all domains associated with a package.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainPackageDetailsList(java.util.Collection)} or
     * {@link #withDomainPackageDetailsList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param domainPackageDetailsList
     *        Information about all domains associated with a package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainsForPackageResult withDomainPackageDetailsList(DomainPackageDetails... domainPackageDetailsList) {
        if (this.domainPackageDetailsList == null) {
            setDomainPackageDetailsList(new java.util.ArrayList<DomainPackageDetails>(domainPackageDetailsList.length));
        }
        for (DomainPackageDetails ele : domainPackageDetailsList) {
            this.domainPackageDetailsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about all domains associated with a package.
     * </p>
     * 
     * @param domainPackageDetailsList
     *        Information about all domains associated with a package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainsForPackageResult withDomainPackageDetailsList(java.util.Collection<DomainPackageDetails> domainPackageDetailsList) {
        setDomainPackageDetailsList(domainPackageDetailsList);
        return this;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return When <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainsForPackageResult withNextToken(String nextToken) {
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
        if (getDomainPackageDetailsList() != null)
            sb.append("DomainPackageDetailsList: ").append(getDomainPackageDetailsList()).append(",");
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

        if (obj instanceof ListDomainsForPackageResult == false)
            return false;
        ListDomainsForPackageResult other = (ListDomainsForPackageResult) obj;
        if (other.getDomainPackageDetailsList() == null ^ this.getDomainPackageDetailsList() == null)
            return false;
        if (other.getDomainPackageDetailsList() != null && other.getDomainPackageDetailsList().equals(this.getDomainPackageDetailsList()) == false)
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

        hashCode = prime * hashCode + ((getDomainPackageDetailsList() == null) ? 0 : getDomainPackageDetailsList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDomainsForPackageResult clone() {
        try {
            return (ListDomainsForPackageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
