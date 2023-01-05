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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListThirdPartyFirewallFirewallPolicies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListThirdPartyFirewallFirewallPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list that contains one <code>ThirdPartyFirewallFirewallPolicies</code> element for each third-party firewall
     * policies that the specified third-party firewall vendor is associated with. Each
     * <code>ThirdPartyFirewallFirewallPolicies</code> element contains the firewall policy name and ID.
     * </p>
     */
    private java.util.List<ThirdPartyFirewallFirewallPolicy> thirdPartyFirewallFirewallPolicies;
    /**
     * <p>
     * The value that you will use for <code>NextToken</code> in the next
     * <code>ListThirdPartyFirewallFirewallPolicies</code> request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that contains one <code>ThirdPartyFirewallFirewallPolicies</code> element for each third-party firewall
     * policies that the specified third-party firewall vendor is associated with. Each
     * <code>ThirdPartyFirewallFirewallPolicies</code> element contains the firewall policy name and ID.
     * </p>
     * 
     * @return A list that contains one <code>ThirdPartyFirewallFirewallPolicies</code> element for each third-party
     *         firewall policies that the specified third-party firewall vendor is associated with. Each
     *         <code>ThirdPartyFirewallFirewallPolicies</code> element contains the firewall policy name and ID.
     */

    public java.util.List<ThirdPartyFirewallFirewallPolicy> getThirdPartyFirewallFirewallPolicies() {
        return thirdPartyFirewallFirewallPolicies;
    }

    /**
     * <p>
     * A list that contains one <code>ThirdPartyFirewallFirewallPolicies</code> element for each third-party firewall
     * policies that the specified third-party firewall vendor is associated with. Each
     * <code>ThirdPartyFirewallFirewallPolicies</code> element contains the firewall policy name and ID.
     * </p>
     * 
     * @param thirdPartyFirewallFirewallPolicies
     *        A list that contains one <code>ThirdPartyFirewallFirewallPolicies</code> element for each third-party
     *        firewall policies that the specified third-party firewall vendor is associated with. Each
     *        <code>ThirdPartyFirewallFirewallPolicies</code> element contains the firewall policy name and ID.
     */

    public void setThirdPartyFirewallFirewallPolicies(java.util.Collection<ThirdPartyFirewallFirewallPolicy> thirdPartyFirewallFirewallPolicies) {
        if (thirdPartyFirewallFirewallPolicies == null) {
            this.thirdPartyFirewallFirewallPolicies = null;
            return;
        }

        this.thirdPartyFirewallFirewallPolicies = new java.util.ArrayList<ThirdPartyFirewallFirewallPolicy>(thirdPartyFirewallFirewallPolicies);
    }

    /**
     * <p>
     * A list that contains one <code>ThirdPartyFirewallFirewallPolicies</code> element for each third-party firewall
     * policies that the specified third-party firewall vendor is associated with. Each
     * <code>ThirdPartyFirewallFirewallPolicies</code> element contains the firewall policy name and ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThirdPartyFirewallFirewallPolicies(java.util.Collection)} or
     * {@link #withThirdPartyFirewallFirewallPolicies(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param thirdPartyFirewallFirewallPolicies
     *        A list that contains one <code>ThirdPartyFirewallFirewallPolicies</code> element for each third-party
     *        firewall policies that the specified third-party firewall vendor is associated with. Each
     *        <code>ThirdPartyFirewallFirewallPolicies</code> element contains the firewall policy name and ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThirdPartyFirewallFirewallPoliciesResult withThirdPartyFirewallFirewallPolicies(
            ThirdPartyFirewallFirewallPolicy... thirdPartyFirewallFirewallPolicies) {
        if (this.thirdPartyFirewallFirewallPolicies == null) {
            setThirdPartyFirewallFirewallPolicies(new java.util.ArrayList<ThirdPartyFirewallFirewallPolicy>(thirdPartyFirewallFirewallPolicies.length));
        }
        for (ThirdPartyFirewallFirewallPolicy ele : thirdPartyFirewallFirewallPolicies) {
            this.thirdPartyFirewallFirewallPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>ThirdPartyFirewallFirewallPolicies</code> element for each third-party firewall
     * policies that the specified third-party firewall vendor is associated with. Each
     * <code>ThirdPartyFirewallFirewallPolicies</code> element contains the firewall policy name and ID.
     * </p>
     * 
     * @param thirdPartyFirewallFirewallPolicies
     *        A list that contains one <code>ThirdPartyFirewallFirewallPolicies</code> element for each third-party
     *        firewall policies that the specified third-party firewall vendor is associated with. Each
     *        <code>ThirdPartyFirewallFirewallPolicies</code> element contains the firewall policy name and ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThirdPartyFirewallFirewallPoliciesResult withThirdPartyFirewallFirewallPolicies(
            java.util.Collection<ThirdPartyFirewallFirewallPolicy> thirdPartyFirewallFirewallPolicies) {
        setThirdPartyFirewallFirewallPolicies(thirdPartyFirewallFirewallPolicies);
        return this;
    }

    /**
     * <p>
     * The value that you will use for <code>NextToken</code> in the next
     * <code>ListThirdPartyFirewallFirewallPolicies</code> request.
     * </p>
     * 
     * @param nextToken
     *        The value that you will use for <code>NextToken</code> in the next
     *        <code>ListThirdPartyFirewallFirewallPolicies</code> request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The value that you will use for <code>NextToken</code> in the next
     * <code>ListThirdPartyFirewallFirewallPolicies</code> request.
     * </p>
     * 
     * @return The value that you will use for <code>NextToken</code> in the next
     *         <code>ListThirdPartyFirewallFirewallPolicies</code> request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The value that you will use for <code>NextToken</code> in the next
     * <code>ListThirdPartyFirewallFirewallPolicies</code> request.
     * </p>
     * 
     * @param nextToken
     *        The value that you will use for <code>NextToken</code> in the next
     *        <code>ListThirdPartyFirewallFirewallPolicies</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThirdPartyFirewallFirewallPoliciesResult withNextToken(String nextToken) {
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
        if (getThirdPartyFirewallFirewallPolicies() != null)
            sb.append("ThirdPartyFirewallFirewallPolicies: ").append(getThirdPartyFirewallFirewallPolicies()).append(",");
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

        if (obj instanceof ListThirdPartyFirewallFirewallPoliciesResult == false)
            return false;
        ListThirdPartyFirewallFirewallPoliciesResult other = (ListThirdPartyFirewallFirewallPoliciesResult) obj;
        if (other.getThirdPartyFirewallFirewallPolicies() == null ^ this.getThirdPartyFirewallFirewallPolicies() == null)
            return false;
        if (other.getThirdPartyFirewallFirewallPolicies() != null
                && other.getThirdPartyFirewallFirewallPolicies().equals(this.getThirdPartyFirewallFirewallPolicies()) == false)
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

        hashCode = prime * hashCode + ((getThirdPartyFirewallFirewallPolicies() == null) ? 0 : getThirdPartyFirewallFirewallPolicies().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListThirdPartyFirewallFirewallPoliciesResult clone() {
        try {
            return (ListThirdPartyFirewallFirewallPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
