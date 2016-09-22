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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;

/**
 * <p>
 * The ListDomains response includes the following elements.
 * </p>
 */
public class ListDomainsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A summary of domains.
     * </p>
     * <p>
     * Type: Complex type containing a list of domain summaries.
     * </p>
     * <p>
     * Children: <code>AutoRenew</code>, <code>DomainName</code>, <code>Expiry</code>, <code>TransferLock</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DomainSummary> domains;
    /**
     * <p>
     * If there are more domains than you specified for <code>MaxItems</code> in the request, submit another request and
     * include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Parent: <code>Operations</code>
     * </p>
     */
    private String nextPageMarker;

    /**
     * <p>
     * A summary of domains.
     * </p>
     * <p>
     * Type: Complex type containing a list of domain summaries.
     * </p>
     * <p>
     * Children: <code>AutoRenew</code>, <code>DomainName</code>, <code>Expiry</code>, <code>TransferLock</code>
     * </p>
     * 
     * @return A summary of domains.</p>
     *         <p>
     *         Type: Complex type containing a list of domain summaries.
     *         </p>
     *         <p>
     *         Children: <code>AutoRenew</code>, <code>DomainName</code>, <code>Expiry</code>, <code>TransferLock</code>
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
     * <p>
     * Type: Complex type containing a list of domain summaries.
     * </p>
     * <p>
     * Children: <code>AutoRenew</code>, <code>DomainName</code>, <code>Expiry</code>, <code>TransferLock</code>
     * </p>
     * 
     * @param domains
     *        A summary of domains.</p>
     *        <p>
     *        Type: Complex type containing a list of domain summaries.
     *        </p>
     *        <p>
     *        Children: <code>AutoRenew</code>, <code>DomainName</code>, <code>Expiry</code>, <code>TransferLock</code>
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
     * Type: Complex type containing a list of domain summaries.
     * </p>
     * <p>
     * Children: <code>AutoRenew</code>, <code>DomainName</code>, <code>Expiry</code>, <code>TransferLock</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomains(java.util.Collection)} or {@link #withDomains(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param domains
     *        A summary of domains.</p>
     *        <p>
     *        Type: Complex type containing a list of domain summaries.
     *        </p>
     *        <p>
     *        Children: <code>AutoRenew</code>, <code>DomainName</code>, <code>Expiry</code>, <code>TransferLock</code>
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
     * <p>
     * Type: Complex type containing a list of domain summaries.
     * </p>
     * <p>
     * Children: <code>AutoRenew</code>, <code>DomainName</code>, <code>Expiry</code>, <code>TransferLock</code>
     * </p>
     * 
     * @param domains
     *        A summary of domains.</p>
     *        <p>
     *        Type: Complex type containing a list of domain summaries.
     *        </p>
     *        <p>
     *        Children: <code>AutoRenew</code>, <code>DomainName</code>, <code>Expiry</code>, <code>TransferLock</code>
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
     * <p>
     * Type: String
     * </p>
     * <p>
     * Parent: <code>Operations</code>
     * </p>
     * 
     * @param nextPageMarker
     *        If there are more domains than you specified for <code>MaxItems</code> in the request, submit another
     *        request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Parent: <code>Operations</code>
     */

    public void setNextPageMarker(String nextPageMarker) {
        this.nextPageMarker = nextPageMarker;
    }

    /**
     * <p>
     * If there are more domains than you specified for <code>MaxItems</code> in the request, submit another request and
     * include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Parent: <code>Operations</code>
     * </p>
     * 
     * @return If there are more domains than you specified for <code>MaxItems</code> in the request, submit another
     *         request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Parent: <code>Operations</code>
     */

    public String getNextPageMarker() {
        return this.nextPageMarker;
    }

    /**
     * <p>
     * If there are more domains than you specified for <code>MaxItems</code> in the request, submit another request and
     * include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Parent: <code>Operations</code>
     * </p>
     * 
     * @param nextPageMarker
     *        If there are more domains than you specified for <code>MaxItems</code> in the request, submit another
     *        request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Parent: <code>Operations</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainsResult withNextPageMarker(String nextPageMarker) {
        setNextPageMarker(nextPageMarker);
        return this;
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
        if (getDomains() != null)
            sb.append("Domains: " + getDomains() + ",");
        if (getNextPageMarker() != null)
            sb.append("NextPageMarker: " + getNextPageMarker());
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
