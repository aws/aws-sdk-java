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
package com.amazonaws.services.simpledb.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDomainsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.simpledb.SimpleDBResponseMetadata> implements Serializable,
        Cloneable {

    /** A list of domain names that match the expression. */
    private com.amazonaws.internal.SdkInternalList<String> domainNames;
    /**
     * An opaque token indicating that there are more domains than the specified <code>MaxNumberOfDomains</code> still
     * available.
     */
    private String nextToken;

    /**
     * A list of domain names that match the expression.
     * 
     * @return A list of domain names that match the expression.
     */

    public java.util.List<String> getDomainNames() {
        if (domainNames == null) {
            domainNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return domainNames;
    }

    /**
     * A list of domain names that match the expression.
     * 
     * @param domainNames
     *        A list of domain names that match the expression.
     */

    public void setDomainNames(java.util.Collection<String> domainNames) {
        if (domainNames == null) {
            this.domainNames = null;
            return;
        }

        this.domainNames = new com.amazonaws.internal.SdkInternalList<String>(domainNames);
    }

    /**
     * A list of domain names that match the expression.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainNames(java.util.Collection)} or {@link #withDomainNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param domainNames
     *        A list of domain names that match the expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainsResult withDomainNames(String... domainNames) {
        if (this.domainNames == null) {
            setDomainNames(new com.amazonaws.internal.SdkInternalList<String>(domainNames.length));
        }
        for (String ele : domainNames) {
            this.domainNames.add(ele);
        }
        return this;
    }

    /**
     * A list of domain names that match the expression.
     * 
     * @param domainNames
     *        A list of domain names that match the expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainsResult withDomainNames(java.util.Collection<String> domainNames) {
        setDomainNames(domainNames);
        return this;
    }

    /**
     * An opaque token indicating that there are more domains than the specified <code>MaxNumberOfDomains</code> still
     * available.
     * 
     * @param nextToken
     *        An opaque token indicating that there are more domains than the specified <code>MaxNumberOfDomains</code>
     *        still available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * An opaque token indicating that there are more domains than the specified <code>MaxNumberOfDomains</code> still
     * available.
     * 
     * @return An opaque token indicating that there are more domains than the specified <code>MaxNumberOfDomains</code>
     *         still available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * An opaque token indicating that there are more domains than the specified <code>MaxNumberOfDomains</code> still
     * available.
     * 
     * @param nextToken
     *        An opaque token indicating that there are more domains than the specified <code>MaxNumberOfDomains</code>
     *        still available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainsResult withNextToken(String nextToken) {
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
        if (getDomainNames() != null)
            sb.append("DomainNames: ").append(getDomainNames()).append(",");
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

        if (obj instanceof ListDomainsResult == false)
            return false;
        ListDomainsResult other = (ListDomainsResult) obj;
        if (other.getDomainNames() == null ^ this.getDomainNames() == null)
            return false;
        if (other.getDomainNames() != null && other.getDomainNames().equals(this.getDomainNames()) == false)
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

        hashCode = prime * hashCode + ((getDomainNames() == null) ? 0 : getDomainNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDomainsResult clone() {
        try {
            return (ListDomainsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
