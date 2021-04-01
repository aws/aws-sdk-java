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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallRules" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFirewallRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the firewall rule group that you want to retrieve the rules for.
     * </p>
     */
    private String firewallRuleGroupId;
    /**
     * <p>
     * Optional additional filter for the rules to retrieve.
     * </p>
     * <p>
     * The setting that determines the processing order of the rules in a rule group. DNS Firewall processes the rules
     * in a rule group by order of priority, starting from the lowest setting.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * Optional additional filter for the rules to retrieve.
     * </p>
     * <p>
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain
     * list:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code> - Permit the request to go through.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALERT</code> - Permit the request to go through but send an alert to the logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code> - Disallow the request. If this is specified, additional handling details are provided in the
     * rule's <code>BlockResponse</code> setting.
     * </p>
     * </li>
     * </ul>
     */
    private String action;
    /**
     * <p>
     * The maximum number of objects that you want Resolver to return for this request. If more objects are available,
     * in the response, Resolver provides a <code>NextToken</code> value that you can use in a subsequent call to get
     * the next batch of objects.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 objects.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * For the first call to this list request, omit this value.
     * </p>
     * <p>
     * When you request a list of objects, Resolver returns at most the number of objects specified in
     * <code>MaxResults</code>. If more objects are available for retrieval, Resolver returns a <code>NextToken</code>
     * value in the response. To retrieve the next batch of objects, use the token that was returned for the prior
     * request in your next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier of the firewall rule group that you want to retrieve the rules for.
     * </p>
     * 
     * @param firewallRuleGroupId
     *        The unique identifier of the firewall rule group that you want to retrieve the rules for.
     */

    public void setFirewallRuleGroupId(String firewallRuleGroupId) {
        this.firewallRuleGroupId = firewallRuleGroupId;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group that you want to retrieve the rules for.
     * </p>
     * 
     * @return The unique identifier of the firewall rule group that you want to retrieve the rules for.
     */

    public String getFirewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group that you want to retrieve the rules for.
     * </p>
     * 
     * @param firewallRuleGroupId
     *        The unique identifier of the firewall rule group that you want to retrieve the rules for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallRulesRequest withFirewallRuleGroupId(String firewallRuleGroupId) {
        setFirewallRuleGroupId(firewallRuleGroupId);
        return this;
    }

    /**
     * <p>
     * Optional additional filter for the rules to retrieve.
     * </p>
     * <p>
     * The setting that determines the processing order of the rules in a rule group. DNS Firewall processes the rules
     * in a rule group by order of priority, starting from the lowest setting.
     * </p>
     * 
     * @param priority
     *        Optional additional filter for the rules to retrieve.</p>
     *        <p>
     *        The setting that determines the processing order of the rules in a rule group. DNS Firewall processes the
     *        rules in a rule group by order of priority, starting from the lowest setting.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * Optional additional filter for the rules to retrieve.
     * </p>
     * <p>
     * The setting that determines the processing order of the rules in a rule group. DNS Firewall processes the rules
     * in a rule group by order of priority, starting from the lowest setting.
     * </p>
     * 
     * @return Optional additional filter for the rules to retrieve.</p>
     *         <p>
     *         The setting that determines the processing order of the rules in a rule group. DNS Firewall processes the
     *         rules in a rule group by order of priority, starting from the lowest setting.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * Optional additional filter for the rules to retrieve.
     * </p>
     * <p>
     * The setting that determines the processing order of the rules in a rule group. DNS Firewall processes the rules
     * in a rule group by order of priority, starting from the lowest setting.
     * </p>
     * 
     * @param priority
     *        Optional additional filter for the rules to retrieve.</p>
     *        <p>
     *        The setting that determines the processing order of the rules in a rule group. DNS Firewall processes the
     *        rules in a rule group by order of priority, starting from the lowest setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallRulesRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * Optional additional filter for the rules to retrieve.
     * </p>
     * <p>
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain
     * list:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code> - Permit the request to go through.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALERT</code> - Permit the request to go through but send an alert to the logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code> - Disallow the request. If this is specified, additional handling details are provided in the
     * rule's <code>BlockResponse</code> setting.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        Optional additional filter for the rules to retrieve.</p>
     *        <p>
     *        The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's
     *        domain list:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW</code> - Permit the request to go through.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALERT</code> - Permit the request to go through but send an alert to the logs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BLOCK</code> - Disallow the request. If this is specified, additional handling details are provided
     *        in the rule's <code>BlockResponse</code> setting.
     *        </p>
     *        </li>
     * @see Action
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Optional additional filter for the rules to retrieve.
     * </p>
     * <p>
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain
     * list:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code> - Permit the request to go through.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALERT</code> - Permit the request to go through but send an alert to the logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code> - Disallow the request. If this is specified, additional handling details are provided in the
     * rule's <code>BlockResponse</code> setting.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Optional additional filter for the rules to retrieve.</p>
     *         <p>
     *         The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's
     *         domain list:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALLOW</code> - Permit the request to go through.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALERT</code> - Permit the request to go through but send an alert to the logs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BLOCK</code> - Disallow the request. If this is specified, additional handling details are provided
     *         in the rule's <code>BlockResponse</code> setting.
     *         </p>
     *         </li>
     * @see Action
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Optional additional filter for the rules to retrieve.
     * </p>
     * <p>
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain
     * list:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code> - Permit the request to go through.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALERT</code> - Permit the request to go through but send an alert to the logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code> - Disallow the request. If this is specified, additional handling details are provided in the
     * rule's <code>BlockResponse</code> setting.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        Optional additional filter for the rules to retrieve.</p>
     *        <p>
     *        The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's
     *        domain list:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW</code> - Permit the request to go through.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALERT</code> - Permit the request to go through but send an alert to the logs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BLOCK</code> - Disallow the request. If this is specified, additional handling details are provided
     *        in the rule's <code>BlockResponse</code> setting.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Action
     */

    public ListFirewallRulesRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Optional additional filter for the rules to retrieve.
     * </p>
     * <p>
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain
     * list:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code> - Permit the request to go through.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALERT</code> - Permit the request to go through but send an alert to the logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code> - Disallow the request. If this is specified, additional handling details are provided in the
     * rule's <code>BlockResponse</code> setting.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        Optional additional filter for the rules to retrieve.</p>
     *        <p>
     *        The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's
     *        domain list:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW</code> - Permit the request to go through.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALERT</code> - Permit the request to go through but send an alert to the logs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BLOCK</code> - Disallow the request. If this is specified, additional handling details are provided
     *        in the rule's <code>BlockResponse</code> setting.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Action
     */

    public ListFirewallRulesRequest withAction(Action action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of objects that you want Resolver to return for this request. If more objects are available,
     * in the response, Resolver provides a <code>NextToken</code> value that you can use in a subsequent call to get
     * the next batch of objects.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 objects.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that you want Resolver to return for this request. If more objects are
     *        available, in the response, Resolver provides a <code>NextToken</code> value that you can use in a
     *        subsequent call to get the next batch of objects.</p>
     *        <p>
     *        If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 objects.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that you want Resolver to return for this request. If more objects are available,
     * in the response, Resolver provides a <code>NextToken</code> value that you can use in a subsequent call to get
     * the next batch of objects.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 objects.
     * </p>
     * 
     * @return The maximum number of objects that you want Resolver to return for this request. If more objects are
     *         available, in the response, Resolver provides a <code>NextToken</code> value that you can use in a
     *         subsequent call to get the next batch of objects.</p>
     *         <p>
     *         If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 objects.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that you want Resolver to return for this request. If more objects are available,
     * in the response, Resolver provides a <code>NextToken</code> value that you can use in a subsequent call to get
     * the next batch of objects.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 objects.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that you want Resolver to return for this request. If more objects are
     *        available, in the response, Resolver provides a <code>NextToken</code> value that you can use in a
     *        subsequent call to get the next batch of objects.</p>
     *        <p>
     *        If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallRulesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * For the first call to this list request, omit this value.
     * </p>
     * <p>
     * When you request a list of objects, Resolver returns at most the number of objects specified in
     * <code>MaxResults</code>. If more objects are available for retrieval, Resolver returns a <code>NextToken</code>
     * value in the response. To retrieve the next batch of objects, use the token that was returned for the prior
     * request in your next request.
     * </p>
     * 
     * @param nextToken
     *        For the first call to this list request, omit this value.</p>
     *        <p>
     *        When you request a list of objects, Resolver returns at most the number of objects specified in
     *        <code>MaxResults</code>. If more objects are available for retrieval, Resolver returns a
     *        <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token that
     *        was returned for the prior request in your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For the first call to this list request, omit this value.
     * </p>
     * <p>
     * When you request a list of objects, Resolver returns at most the number of objects specified in
     * <code>MaxResults</code>. If more objects are available for retrieval, Resolver returns a <code>NextToken</code>
     * value in the response. To retrieve the next batch of objects, use the token that was returned for the prior
     * request in your next request.
     * </p>
     * 
     * @return For the first call to this list request, omit this value.</p>
     *         <p>
     *         When you request a list of objects, Resolver returns at most the number of objects specified in
     *         <code>MaxResults</code>. If more objects are available for retrieval, Resolver returns a
     *         <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token that
     *         was returned for the prior request in your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For the first call to this list request, omit this value.
     * </p>
     * <p>
     * When you request a list of objects, Resolver returns at most the number of objects specified in
     * <code>MaxResults</code>. If more objects are available for retrieval, Resolver returns a <code>NextToken</code>
     * value in the response. To retrieve the next batch of objects, use the token that was returned for the prior
     * request in your next request.
     * </p>
     * 
     * @param nextToken
     *        For the first call to this list request, omit this value.</p>
     *        <p>
     *        When you request a list of objects, Resolver returns at most the number of objects specified in
     *        <code>MaxResults</code>. If more objects are available for retrieval, Resolver returns a
     *        <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token that
     *        was returned for the prior request in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallRulesRequest withNextToken(String nextToken) {
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
        if (getFirewallRuleGroupId() != null)
            sb.append("FirewallRuleGroupId: ").append(getFirewallRuleGroupId()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListFirewallRulesRequest == false)
            return false;
        ListFirewallRulesRequest other = (ListFirewallRulesRequest) obj;
        if (other.getFirewallRuleGroupId() == null ^ this.getFirewallRuleGroupId() == null)
            return false;
        if (other.getFirewallRuleGroupId() != null && other.getFirewallRuleGroupId().equals(this.getFirewallRuleGroupId()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getFirewallRuleGroupId() == null) ? 0 : getFirewallRuleGroupId().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFirewallRulesRequest clone() {
        return (ListFirewallRulesRequest) super.clone();
    }

}
