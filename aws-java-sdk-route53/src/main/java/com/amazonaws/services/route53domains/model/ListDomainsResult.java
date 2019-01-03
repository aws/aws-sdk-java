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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The ListDomains response includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ListDomains" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDomainsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A summary of domains.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DomainSummary> domains;
    /**
     * <p>
     * If there are more domains than you specified for <code>MaxItems</code> in the request, submit another request and
     * include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     */
    private String nextPageMarker;

    /**
     * <p>
     * A summary of domains.
     * </p>
     * 
     * @return A summary of domains.
     */

    public java.util.List<DomainSummary> getDomains() {
        if (domains == null) {
            domains = new com.amazonaws.internal.SdkInternalList<DomainSummary>();
        }
        return domains;
    }

    /**
     * <p>
     * A summary of domains.
     * </p>
     * 
     * @param domains
     *        A summary of domains.
     */

    public void setDomains(java.util.Collection<DomainSummary> domains) {
        if (domains == null) {
            this.domains = null;
            return;
        }

        this.domains = new com.amazonaws.internal.SdkInternalList<DomainSummary>(domains);
    }

    /**
     * <p>
     * A summary of domains.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomains(java.util.Collection)} or {@link #withDomains(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param domains
     *        A summary of domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainsResult withDomains(DomainSummary... domains) {
        if (this.domains == null) {
            setDomains(new com.amazonaws.internal.SdkInternalList<DomainSummary>(domains.length));
        }
        for (DomainSummary ele : domains) {
            this.domains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A summary of domains.
     * </p>
     * 
     * @param domains
     *        A summary of domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainsResult withDomains(java.util.Collection<DomainSummary> domains) {
        setDomains(domains);
        return this;
    }

    /**
     * <p>
     * If there are more domains than you specified for <code>MaxItems</code> in the request, submit another request and
     * include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * 
     * @param nextPageMarker
     *        If there are more domains than you specified for <code>MaxItems</code> in the request, submit another
     *        request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     */

    public void setNextPageMarker(String nextPageMarker) {
        this.nextPageMarker = nextPageMarker;
    }

    /**
     * <p>
     * If there are more domains than you specified for <code>MaxItems</code> in the request, submit another request and
     * include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * 
     * @return If there are more domains than you specified for <code>MaxItems</code> in the request, submit another
     *         request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     */

    public String getNextPageMarker() {
        return this.nextPageMarker;
    }

    /**
     * <p>
     * If there are more domains than you specified for <code>MaxItems</code> in the request, submit another request and
     * include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * 
     * @param nextPageMarker
     *        If there are more domains than you specified for <code>MaxItems</code> in the request, submit another
     *        request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainsResult withNextPageMarker(String nextPageMarker) {
        setNextPageMarker(nextPageMarker);
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
        if (getDomains() != null)
            sb.append("Domains: ").append(getDomains()).append(",");
        if (getNextPageMarker() != null)
            sb.append("NextPageMarker: ").append(getNextPageMarker());
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
        if (other.getDomains() == null ^ this.getDomains() == null)
            return false;
        if (other.getDomains() != null && other.getDomains().equals(this.getDomains()) == false)
            return false;
        if (other.getNextPageMarker() == null ^ this.getNextPageMarker() == null)
            return false;
        if (other.getNextPageMarker() != null && other.getNextPageMarker().equals(this.getNextPageMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomains() == null) ? 0 : getDomains().hashCode());
        hashCode = prime * hashCode + ((getNextPageMarker() == null) ? 0 : getNextPageMarker().hashCode());
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
