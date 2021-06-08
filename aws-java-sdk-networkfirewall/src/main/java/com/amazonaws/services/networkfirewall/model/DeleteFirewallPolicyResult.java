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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DeleteFirewallPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFirewallPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The object containing the definition of the <a>FirewallPolicyResponse</a> that you asked to delete.
     * </p>
     */
    private FirewallPolicyResponse firewallPolicyResponse;

    /**
     * <p>
     * The object containing the definition of the <a>FirewallPolicyResponse</a> that you asked to delete.
     * </p>
     * 
     * @param firewallPolicyResponse
     *        The object containing the definition of the <a>FirewallPolicyResponse</a> that you asked to delete.
     */

    public void setFirewallPolicyResponse(FirewallPolicyResponse firewallPolicyResponse) {
        this.firewallPolicyResponse = firewallPolicyResponse;
    }

    /**
     * <p>
     * The object containing the definition of the <a>FirewallPolicyResponse</a> that you asked to delete.
     * </p>
     * 
     * @return The object containing the definition of the <a>FirewallPolicyResponse</a> that you asked to delete.
     */

    public FirewallPolicyResponse getFirewallPolicyResponse() {
        return this.firewallPolicyResponse;
    }

    /**
     * <p>
     * The object containing the definition of the <a>FirewallPolicyResponse</a> that you asked to delete.
     * </p>
     * 
     * @param firewallPolicyResponse
     *        The object containing the definition of the <a>FirewallPolicyResponse</a> that you asked to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFirewallPolicyResult withFirewallPolicyResponse(FirewallPolicyResponse firewallPolicyResponse) {
        setFirewallPolicyResponse(firewallPolicyResponse);
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
        if (getFirewallPolicyResponse() != null)
            sb.append("FirewallPolicyResponse: ").append(getFirewallPolicyResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFirewallPolicyResult == false)
            return false;
        DeleteFirewallPolicyResult other = (DeleteFirewallPolicyResult) obj;
        if (other.getFirewallPolicyResponse() == null ^ this.getFirewallPolicyResponse() == null)
            return false;
        if (other.getFirewallPolicyResponse() != null && other.getFirewallPolicyResponse().equals(this.getFirewallPolicyResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallPolicyResponse() == null) ? 0 : getFirewallPolicyResponse().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFirewallPolicyResult clone() {
        try {
            return (DeleteFirewallPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
