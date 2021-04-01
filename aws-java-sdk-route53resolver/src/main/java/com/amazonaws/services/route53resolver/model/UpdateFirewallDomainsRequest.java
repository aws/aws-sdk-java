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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallDomains"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFirewallDomainsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the domain list whose domains you want to update.
     * </p>
     */
    private String firewallDomainListId;
    /**
     * <p>
     * What you want DNS Firewall to do with the domains that you are providing:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code> - Add the domains to the ones that are already in the domain list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - Search the domain list for the domains and remove them from the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLACE</code> - Update the domain list to exactly match the list that you are providing.
     * </p>
     * </li>
     * </ul>
     */
    private String operation;
    /**
     * <p>
     * A list of domains to use in the update operation.
     * </p>
     * <p>
     * Each domain specification in your domain list must satisfy the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It can optionally start with <code>*</code> (asterisk).
     * </p>
     * </li>
     * <li>
     * <p>
     * With the exception of the optional starting asterisk, it must only contain the following characters:
     * <code>A-Z</code>, <code>a-z</code>, <code>0-9</code>, <code>-</code> (hyphen).
     * </p>
     * </li>
     * <li>
     * <p>
     * It must be from 1-255 characters in length.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> domains;

    /**
     * <p>
     * The ID of the domain list whose domains you want to update.
     * </p>
     * 
     * @param firewallDomainListId
     *        The ID of the domain list whose domains you want to update.
     */

    public void setFirewallDomainListId(String firewallDomainListId) {
        this.firewallDomainListId = firewallDomainListId;
    }

    /**
     * <p>
     * The ID of the domain list whose domains you want to update.
     * </p>
     * 
     * @return The ID of the domain list whose domains you want to update.
     */

    public String getFirewallDomainListId() {
        return this.firewallDomainListId;
    }

    /**
     * <p>
     * The ID of the domain list whose domains you want to update.
     * </p>
     * 
     * @param firewallDomainListId
     *        The ID of the domain list whose domains you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFirewallDomainsRequest withFirewallDomainListId(String firewallDomainListId) {
        setFirewallDomainListId(firewallDomainListId);
        return this;
    }

    /**
     * <p>
     * What you want DNS Firewall to do with the domains that you are providing:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code> - Add the domains to the ones that are already in the domain list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - Search the domain list for the domains and remove them from the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLACE</code> - Update the domain list to exactly match the list that you are providing.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operation
     *        What you want DNS Firewall to do with the domains that you are providing: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ADD</code> - Add the domains to the ones that are already in the domain list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVE</code> - Search the domain list for the domains and remove them from the list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> - Update the domain list to exactly match the list that you are providing.
     *        </p>
     *        </li>
     * @see FirewallDomainUpdateOperation
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * What you want DNS Firewall to do with the domains that you are providing:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code> - Add the domains to the ones that are already in the domain list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - Search the domain list for the domains and remove them from the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLACE</code> - Update the domain list to exactly match the list that you are providing.
     * </p>
     * </li>
     * </ul>
     * 
     * @return What you want DNS Firewall to do with the domains that you are providing: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ADD</code> - Add the domains to the ones that are already in the domain list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REMOVE</code> - Search the domain list for the domains and remove them from the list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REPLACE</code> - Update the domain list to exactly match the list that you are providing.
     *         </p>
     *         </li>
     * @see FirewallDomainUpdateOperation
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * What you want DNS Firewall to do with the domains that you are providing:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code> - Add the domains to the ones that are already in the domain list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - Search the domain list for the domains and remove them from the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLACE</code> - Update the domain list to exactly match the list that you are providing.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operation
     *        What you want DNS Firewall to do with the domains that you are providing: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ADD</code> - Add the domains to the ones that are already in the domain list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVE</code> - Search the domain list for the domains and remove them from the list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> - Update the domain list to exactly match the list that you are providing.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallDomainUpdateOperation
     */

    public UpdateFirewallDomainsRequest withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * What you want DNS Firewall to do with the domains that you are providing:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code> - Add the domains to the ones that are already in the domain list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - Search the domain list for the domains and remove them from the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLACE</code> - Update the domain list to exactly match the list that you are providing.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operation
     *        What you want DNS Firewall to do with the domains that you are providing: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ADD</code> - Add the domains to the ones that are already in the domain list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVE</code> - Search the domain list for the domains and remove them from the list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> - Update the domain list to exactly match the list that you are providing.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallDomainUpdateOperation
     */

    public UpdateFirewallDomainsRequest withOperation(FirewallDomainUpdateOperation operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>
     * A list of domains to use in the update operation.
     * </p>
     * <p>
     * Each domain specification in your domain list must satisfy the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It can optionally start with <code>*</code> (asterisk).
     * </p>
     * </li>
     * <li>
     * <p>
     * With the exception of the optional starting asterisk, it must only contain the following characters:
     * <code>A-Z</code>, <code>a-z</code>, <code>0-9</code>, <code>-</code> (hyphen).
     * </p>
     * </li>
     * <li>
     * <p>
     * It must be from 1-255 characters in length.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of domains to use in the update operation.</p>
     *         <p>
     *         Each domain specification in your domain list must satisfy the following requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         It can optionally start with <code>*</code> (asterisk).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         With the exception of the optional starting asterisk, it must only contain the following characters:
     *         <code>A-Z</code>, <code>a-z</code>, <code>0-9</code>, <code>-</code> (hyphen).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It must be from 1-255 characters in length.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getDomains() {
        return domains;
    }

    /**
     * <p>
     * A list of domains to use in the update operation.
     * </p>
     * <p>
     * Each domain specification in your domain list must satisfy the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It can optionally start with <code>*</code> (asterisk).
     * </p>
     * </li>
     * <li>
     * <p>
     * With the exception of the optional starting asterisk, it must only contain the following characters:
     * <code>A-Z</code>, <code>a-z</code>, <code>0-9</code>, <code>-</code> (hyphen).
     * </p>
     * </li>
     * <li>
     * <p>
     * It must be from 1-255 characters in length.
     * </p>
     * </li>
     * </ul>
     * 
     * @param domains
     *        A list of domains to use in the update operation.</p>
     *        <p>
     *        Each domain specification in your domain list must satisfy the following requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        It can optionally start with <code>*</code> (asterisk).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        With the exception of the optional starting asterisk, it must only contain the following characters:
     *        <code>A-Z</code>, <code>a-z</code>, <code>0-9</code>, <code>-</code> (hyphen).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must be from 1-255 characters in length.
     *        </p>
     *        </li>
     */

    public void setDomains(java.util.Collection<String> domains) {
        if (domains == null) {
            this.domains = null;
            return;
        }

        this.domains = new java.util.ArrayList<String>(domains);
    }

    /**
     * <p>
     * A list of domains to use in the update operation.
     * </p>
     * <p>
     * Each domain specification in your domain list must satisfy the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It can optionally start with <code>*</code> (asterisk).
     * </p>
     * </li>
     * <li>
     * <p>
     * With the exception of the optional starting asterisk, it must only contain the following characters:
     * <code>A-Z</code>, <code>a-z</code>, <code>0-9</code>, <code>-</code> (hyphen).
     * </p>
     * </li>
     * <li>
     * <p>
     * It must be from 1-255 characters in length.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomains(java.util.Collection)} or {@link #withDomains(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param domains
     *        A list of domains to use in the update operation.</p>
     *        <p>
     *        Each domain specification in your domain list must satisfy the following requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        It can optionally start with <code>*</code> (asterisk).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        With the exception of the optional starting asterisk, it must only contain the following characters:
     *        <code>A-Z</code>, <code>a-z</code>, <code>0-9</code>, <code>-</code> (hyphen).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must be from 1-255 characters in length.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFirewallDomainsRequest withDomains(String... domains) {
        if (this.domains == null) {
            setDomains(new java.util.ArrayList<String>(domains.length));
        }
        for (String ele : domains) {
            this.domains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of domains to use in the update operation.
     * </p>
     * <p>
     * Each domain specification in your domain list must satisfy the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It can optionally start with <code>*</code> (asterisk).
     * </p>
     * </li>
     * <li>
     * <p>
     * With the exception of the optional starting asterisk, it must only contain the following characters:
     * <code>A-Z</code>, <code>a-z</code>, <code>0-9</code>, <code>-</code> (hyphen).
     * </p>
     * </li>
     * <li>
     * <p>
     * It must be from 1-255 characters in length.
     * </p>
     * </li>
     * </ul>
     * 
     * @param domains
     *        A list of domains to use in the update operation.</p>
     *        <p>
     *        Each domain specification in your domain list must satisfy the following requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        It can optionally start with <code>*</code> (asterisk).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        With the exception of the optional starting asterisk, it must only contain the following characters:
     *        <code>A-Z</code>, <code>a-z</code>, <code>0-9</code>, <code>-</code> (hyphen).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must be from 1-255 characters in length.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFirewallDomainsRequest withDomains(java.util.Collection<String> domains) {
        setDomains(domains);
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
        if (getFirewallDomainListId() != null)
            sb.append("FirewallDomainListId: ").append(getFirewallDomainListId()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getDomains() != null)
            sb.append("Domains: ").append(getDomains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFirewallDomainsRequest == false)
            return false;
        UpdateFirewallDomainsRequest other = (UpdateFirewallDomainsRequest) obj;
        if (other.getFirewallDomainListId() == null ^ this.getFirewallDomainListId() == null)
            return false;
        if (other.getFirewallDomainListId() != null && other.getFirewallDomainListId().equals(this.getFirewallDomainListId()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getDomains() == null ^ this.getDomains() == null)
            return false;
        if (other.getDomains() != null && other.getDomains().equals(this.getDomains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallDomainListId() == null) ? 0 : getFirewallDomainListId().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getDomains() == null) ? 0 : getDomains().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFirewallDomainsRequest clone() {
        return (UpdateFirewallDomainsRequest) super.clone();
    }

}
