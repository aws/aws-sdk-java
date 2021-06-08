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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallRuleGroupAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFirewallRuleGroupAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the firewall rule group that you want to retrieve the associations for. Leave this blank
     * to retrieve associations for any rule group.
     * </p>
     */
    private String firewallRuleGroupId;
    /**
     * <p>
     * The unique identifier of the VPC that you want to retrieve the associations for. Leave this blank to retrieve
     * associations for any VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The setting that determines the processing order of the rule group among the rule groups that are associated with
     * a single VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority
     * setting.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The association <code>Status</code> setting that you want DNS Firewall to filter on for the list. If you don't
     * specify this, then DNS Firewall returns all associations, regardless of status.
     * </p>
     */
    private String status;
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
     * The unique identifier of the firewall rule group that you want to retrieve the associations for. Leave this blank
     * to retrieve associations for any rule group.
     * </p>
     * 
     * @param firewallRuleGroupId
     *        The unique identifier of the firewall rule group that you want to retrieve the associations for. Leave
     *        this blank to retrieve associations for any rule group.
     */

    public void setFirewallRuleGroupId(String firewallRuleGroupId) {
        this.firewallRuleGroupId = firewallRuleGroupId;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group that you want to retrieve the associations for. Leave this blank
     * to retrieve associations for any rule group.
     * </p>
     * 
     * @return The unique identifier of the firewall rule group that you want to retrieve the associations for. Leave
     *         this blank to retrieve associations for any rule group.
     */

    public String getFirewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group that you want to retrieve the associations for. Leave this blank
     * to retrieve associations for any rule group.
     * </p>
     * 
     * @param firewallRuleGroupId
     *        The unique identifier of the firewall rule group that you want to retrieve the associations for. Leave
     *        this blank to retrieve associations for any rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallRuleGroupAssociationsRequest withFirewallRuleGroupId(String firewallRuleGroupId) {
        setFirewallRuleGroupId(firewallRuleGroupId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the VPC that you want to retrieve the associations for. Leave this blank to retrieve
     * associations for any VPC.
     * </p>
     * 
     * @param vpcId
     *        The unique identifier of the VPC that you want to retrieve the associations for. Leave this blank to
     *        retrieve associations for any VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The unique identifier of the VPC that you want to retrieve the associations for. Leave this blank to retrieve
     * associations for any VPC.
     * </p>
     * 
     * @return The unique identifier of the VPC that you want to retrieve the associations for. Leave this blank to
     *         retrieve associations for any VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The unique identifier of the VPC that you want to retrieve the associations for. Leave this blank to retrieve
     * associations for any VPC.
     * </p>
     * 
     * @param vpcId
     *        The unique identifier of the VPC that you want to retrieve the associations for. Leave this blank to
     *        retrieve associations for any VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallRuleGroupAssociationsRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The setting that determines the processing order of the rule group among the rule groups that are associated with
     * a single VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority
     * setting.
     * </p>
     * 
     * @param priority
     *        The setting that determines the processing order of the rule group among the rule groups that are
     *        associated with a single VPC. DNS Firewall filters VPC traffic starting from the rule group with the
     *        lowest numeric priority setting.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The setting that determines the processing order of the rule group among the rule groups that are associated with
     * a single VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority
     * setting.
     * </p>
     * 
     * @return The setting that determines the processing order of the rule group among the rule groups that are
     *         associated with a single VPC. DNS Firewall filters VPC traffic starting from the rule group with the
     *         lowest numeric priority setting.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The setting that determines the processing order of the rule group among the rule groups that are associated with
     * a single VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority
     * setting.
     * </p>
     * 
     * @param priority
     *        The setting that determines the processing order of the rule group among the rule groups that are
     *        associated with a single VPC. DNS Firewall filters VPC traffic starting from the rule group with the
     *        lowest numeric priority setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallRuleGroupAssociationsRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The association <code>Status</code> setting that you want DNS Firewall to filter on for the list. If you don't
     * specify this, then DNS Firewall returns all associations, regardless of status.
     * </p>
     * 
     * @param status
     *        The association <code>Status</code> setting that you want DNS Firewall to filter on for the list. If you
     *        don't specify this, then DNS Firewall returns all associations, regardless of status.
     * @see FirewallRuleGroupAssociationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The association <code>Status</code> setting that you want DNS Firewall to filter on for the list. If you don't
     * specify this, then DNS Firewall returns all associations, regardless of status.
     * </p>
     * 
     * @return The association <code>Status</code> setting that you want DNS Firewall to filter on for the list. If you
     *         don't specify this, then DNS Firewall returns all associations, regardless of status.
     * @see FirewallRuleGroupAssociationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The association <code>Status</code> setting that you want DNS Firewall to filter on for the list. If you don't
     * specify this, then DNS Firewall returns all associations, regardless of status.
     * </p>
     * 
     * @param status
     *        The association <code>Status</code> setting that you want DNS Firewall to filter on for the list. If you
     *        don't specify this, then DNS Firewall returns all associations, regardless of status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallRuleGroupAssociationStatus
     */

    public ListFirewallRuleGroupAssociationsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The association <code>Status</code> setting that you want DNS Firewall to filter on for the list. If you don't
     * specify this, then DNS Firewall returns all associations, regardless of status.
     * </p>
     * 
     * @param status
     *        The association <code>Status</code> setting that you want DNS Firewall to filter on for the list. If you
     *        don't specify this, then DNS Firewall returns all associations, regardless of status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallRuleGroupAssociationStatus
     */

    public ListFirewallRuleGroupAssociationsRequest withStatus(FirewallRuleGroupAssociationStatus status) {
        this.status = status.toString();
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

    public ListFirewallRuleGroupAssociationsRequest withMaxResults(Integer maxResults) {
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

    public ListFirewallRuleGroupAssociationsRequest withNextToken(String nextToken) {
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
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof ListFirewallRuleGroupAssociationsRequest == false)
            return false;
        ListFirewallRuleGroupAssociationsRequest other = (ListFirewallRuleGroupAssociationsRequest) obj;
        if (other.getFirewallRuleGroupId() == null ^ this.getFirewallRuleGroupId() == null)
            return false;
        if (other.getFirewallRuleGroupId() != null && other.getFirewallRuleGroupId().equals(this.getFirewallRuleGroupId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFirewallRuleGroupAssociationsRequest clone() {
        return (ListFirewallRuleGroupAssociationsRequest) super.clone();
    }

}
