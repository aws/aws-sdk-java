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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallDomainList"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFirewallDomainListRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the domain list.
     * </p>
     */
    private String firewallDomainListId;

    /**
     * <p>
     * The ID of the domain list.
     * </p>
     * 
     * @param firewallDomainListId
     *        The ID of the domain list.
     */

    public void setFirewallDomainListId(String firewallDomainListId) {
        this.firewallDomainListId = firewallDomainListId;
    }

    /**
     * <p>
     * The ID of the domain list.
     * </p>
     * 
     * @return The ID of the domain list.
     */

    public String getFirewallDomainListId() {
        return this.firewallDomainListId;
    }

    /**
     * <p>
     * The ID of the domain list.
     * </p>
     * 
     * @param firewallDomainListId
     *        The ID of the domain list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFirewallDomainListRequest withFirewallDomainListId(String firewallDomainListId) {
        setFirewallDomainListId(firewallDomainListId);
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
            sb.append("FirewallDomainListId: ").append(getFirewallDomainListId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFirewallDomainListRequest == false)
            return false;
        GetFirewallDomainListRequest other = (GetFirewallDomainListRequest) obj;
        if (other.getFirewallDomainListId() == null ^ this.getFirewallDomainListId() == null)
            return false;
        if (other.getFirewallDomainListId() != null && other.getFirewallDomainListId().equals(this.getFirewallDomainListId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallDomainListId() == null) ? 0 : getFirewallDomainListId().hashCode());
        return hashCode;
    }

    @Override
    public GetFirewallDomainListRequest clone() {
        return (GetFirewallDomainListRequest) super.clone();
    }

}
