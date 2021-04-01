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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallRuleGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFirewallRuleGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If objects are still available for retrieval, Resolver returns this token in the response. To retrieve the next
     * batch of objects, provide this token in your next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of your firewall rule groups.
     * </p>
     * <p>
     * This might be a partial list of the rule groups that you have defined. For information, see
     * <code>MaxResults</code>.
     * </p>
     */
    private java.util.List<FirewallRuleGroupMetadata> firewallRuleGroups;

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

    public ListFirewallRuleGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of your firewall rule groups.
     * </p>
     * <p>
     * This might be a partial list of the rule groups that you have defined. For information, see
     * <code>MaxResults</code>.
     * </p>
     * 
     * @return A list of your firewall rule groups.</p>
     *         <p>
     *         This might be a partial list of the rule groups that you have defined. For information, see
     *         <code>MaxResults</code>.
     */

    public java.util.List<FirewallRuleGroupMetadata> getFirewallRuleGroups() {
        return firewallRuleGroups;
    }

    /**
     * <p>
     * A list of your firewall rule groups.
     * </p>
     * <p>
     * This might be a partial list of the rule groups that you have defined. For information, see
     * <code>MaxResults</code>.
     * </p>
     * 
     * @param firewallRuleGroups
     *        A list of your firewall rule groups.</p>
     *        <p>
     *        This might be a partial list of the rule groups that you have defined. For information, see
     *        <code>MaxResults</code>.
     */

    public void setFirewallRuleGroups(java.util.Collection<FirewallRuleGroupMetadata> firewallRuleGroups) {
        if (firewallRuleGroups == null) {
            this.firewallRuleGroups = null;
            return;
        }

        this.firewallRuleGroups = new java.util.ArrayList<FirewallRuleGroupMetadata>(firewallRuleGroups);
    }

    /**
     * <p>
     * A list of your firewall rule groups.
     * </p>
     * <p>
     * This might be a partial list of the rule groups that you have defined. For information, see
     * <code>MaxResults</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFirewallRuleGroups(java.util.Collection)} or {@link #withFirewallRuleGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param firewallRuleGroups
     *        A list of your firewall rule groups.</p>
     *        <p>
     *        This might be a partial list of the rule groups that you have defined. For information, see
     *        <code>MaxResults</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallRuleGroupsResult withFirewallRuleGroups(FirewallRuleGroupMetadata... firewallRuleGroups) {
        if (this.firewallRuleGroups == null) {
            setFirewallRuleGroups(new java.util.ArrayList<FirewallRuleGroupMetadata>(firewallRuleGroups.length));
        }
        for (FirewallRuleGroupMetadata ele : firewallRuleGroups) {
            this.firewallRuleGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of your firewall rule groups.
     * </p>
     * <p>
     * This might be a partial list of the rule groups that you have defined. For information, see
     * <code>MaxResults</code>.
     * </p>
     * 
     * @param firewallRuleGroups
     *        A list of your firewall rule groups.</p>
     *        <p>
     *        This might be a partial list of the rule groups that you have defined. For information, see
     *        <code>MaxResults</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallRuleGroupsResult withFirewallRuleGroups(java.util.Collection<FirewallRuleGroupMetadata> firewallRuleGroups) {
        setFirewallRuleGroups(firewallRuleGroups);
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
        if (getFirewallRuleGroups() != null)
            sb.append("FirewallRuleGroups: ").append(getFirewallRuleGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFirewallRuleGroupsResult == false)
            return false;
        ListFirewallRuleGroupsResult other = (ListFirewallRuleGroupsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFirewallRuleGroups() == null ^ this.getFirewallRuleGroups() == null)
            return false;
        if (other.getFirewallRuleGroups() != null && other.getFirewallRuleGroups().equals(this.getFirewallRuleGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFirewallRuleGroups() == null) ? 0 : getFirewallRuleGroups().hashCode());
        return hashCode;
    }

    @Override
    public ListFirewallRuleGroupsResult clone() {
        try {
            return (ListFirewallRuleGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
