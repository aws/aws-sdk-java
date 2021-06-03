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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallConfigs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFirewallConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If objects are still available for retrieval, Resolver returns this token in the response. To retrieve the next
     * batch of objects, provide this token in your next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The configurations for the firewall behavior provided by DNS Firewall for VPCs from Amazon Virtual Private Cloud
     * (Amazon VPC).
     * </p>
     */
    private java.util.List<FirewallConfig> firewallConfigs;

    /**
     * <p>
     * If objects are still available for retrieval, Resolver returns this token in the response. To retrieve the next
     * batch of objects, provide this token in your next request.
     * </p>
     * 
     * @param nextToken
     *        If objects are still available for retrieval, Resolver returns this token in the response. To retrieve the
     *        next batch of objects, provide this token in your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If objects are still available for retrieval, Resolver returns this token in the response. To retrieve the next
     * batch of objects, provide this token in your next request.
     * </p>
     * 
     * @return If objects are still available for retrieval, Resolver returns this token in the response. To retrieve
     *         the next batch of objects, provide this token in your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If objects are still available for retrieval, Resolver returns this token in the response. To retrieve the next
     * batch of objects, provide this token in your next request.
     * </p>
     * 
     * @param nextToken
     *        If objects are still available for retrieval, Resolver returns this token in the response. To retrieve the
     *        next batch of objects, provide this token in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallConfigsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The configurations for the firewall behavior provided by DNS Firewall for VPCs from Amazon Virtual Private Cloud
     * (Amazon VPC).
     * </p>
     * 
     * @return The configurations for the firewall behavior provided by DNS Firewall for VPCs from Amazon Virtual
     *         Private Cloud (Amazon VPC).
     */

    public java.util.List<FirewallConfig> getFirewallConfigs() {
        return firewallConfigs;
    }

    /**
     * <p>
     * The configurations for the firewall behavior provided by DNS Firewall for VPCs from Amazon Virtual Private Cloud
     * (Amazon VPC).
     * </p>
     * 
     * @param firewallConfigs
     *        The configurations for the firewall behavior provided by DNS Firewall for VPCs from Amazon Virtual Private
     *        Cloud (Amazon VPC).
     */

    public void setFirewallConfigs(java.util.Collection<FirewallConfig> firewallConfigs) {
        if (firewallConfigs == null) {
            this.firewallConfigs = null;
            return;
        }

        this.firewallConfigs = new java.util.ArrayList<FirewallConfig>(firewallConfigs);
    }

    /**
     * <p>
     * The configurations for the firewall behavior provided by DNS Firewall for VPCs from Amazon Virtual Private Cloud
     * (Amazon VPC).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFirewallConfigs(java.util.Collection)} or {@link #withFirewallConfigs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param firewallConfigs
     *        The configurations for the firewall behavior provided by DNS Firewall for VPCs from Amazon Virtual Private
     *        Cloud (Amazon VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallConfigsResult withFirewallConfigs(FirewallConfig... firewallConfigs) {
        if (this.firewallConfigs == null) {
            setFirewallConfigs(new java.util.ArrayList<FirewallConfig>(firewallConfigs.length));
        }
        for (FirewallConfig ele : firewallConfigs) {
            this.firewallConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configurations for the firewall behavior provided by DNS Firewall for VPCs from Amazon Virtual Private Cloud
     * (Amazon VPC).
     * </p>
     * 
     * @param firewallConfigs
     *        The configurations for the firewall behavior provided by DNS Firewall for VPCs from Amazon Virtual Private
     *        Cloud (Amazon VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallConfigsResult withFirewallConfigs(java.util.Collection<FirewallConfig> firewallConfigs) {
        setFirewallConfigs(firewallConfigs);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFirewallConfigs() != null)
            sb.append("FirewallConfigs: ").append(getFirewallConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFirewallConfigsResult == false)
            return false;
        ListFirewallConfigsResult other = (ListFirewallConfigsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFirewallConfigs() == null ^ this.getFirewallConfigs() == null)
            return false;
        if (other.getFirewallConfigs() != null && other.getFirewallConfigs().equals(this.getFirewallConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFirewallConfigs() == null) ? 0 : getFirewallConfigs().hashCode());
        return hashCode;
    }

    @Override
    public ListFirewallConfigsResult clone() {
        try {
            return (ListFirewallConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
