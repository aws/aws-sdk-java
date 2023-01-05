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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ListRuleGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRuleGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Network Firewall returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of objects that you want Network Firewall to return for this request. If more objects are
     * available, in the response, Network Firewall provides a <code>NextToken</code> value that you can use in a
     * subsequent call to get the next batch of objects.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The scope of the request. The default setting of <code>ACCOUNT</code> or a setting of <code>NULL</code> returns
     * all of the rule groups in your account. A setting of <code>MANAGED</code> returns all available managed rule
     * groups.
     * </p>
     */
    private String scope;
    /**
     * <p>
     * Indicates the general category of the Amazon Web Services managed rule group.
     * </p>
     */
    private String managedType;
    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     */
    private String type;

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Network Firewall returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     * 
     * @param nextToken
     *        When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that
     *        are still available for retrieval exceeds the maximum you requested, Network Firewall returns a
     *        <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token
     *        returned from the prior request in your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Network Firewall returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     * 
     * @return When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that
     *         are still available for retrieval exceeds the maximum you requested, Network Firewall returns a
     *         <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token
     *         returned from the prior request in your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Network Firewall returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     * 
     * @param nextToken
     *        When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that
     *        are still available for retrieval exceeds the maximum you requested, Network Firewall returns a
     *        <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token
     *        returned from the prior request in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleGroupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of objects that you want Network Firewall to return for this request. If more objects are
     * available, in the response, Network Firewall provides a <code>NextToken</code> value that you can use in a
     * subsequent call to get the next batch of objects.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that you want Network Firewall to return for this request. If more objects
     *        are available, in the response, Network Firewall provides a <code>NextToken</code> value that you can use
     *        in a subsequent call to get the next batch of objects.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that you want Network Firewall to return for this request. If more objects are
     * available, in the response, Network Firewall provides a <code>NextToken</code> value that you can use in a
     * subsequent call to get the next batch of objects.
     * </p>
     * 
     * @return The maximum number of objects that you want Network Firewall to return for this request. If more objects
     *         are available, in the response, Network Firewall provides a <code>NextToken</code> value that you can use
     *         in a subsequent call to get the next batch of objects.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that you want Network Firewall to return for this request. If more objects are
     * available, in the response, Network Firewall provides a <code>NextToken</code> value that you can use in a
     * subsequent call to get the next batch of objects.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that you want Network Firewall to return for this request. If more objects
     *        are available, in the response, Network Firewall provides a <code>NextToken</code> value that you can use
     *        in a subsequent call to get the next batch of objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The scope of the request. The default setting of <code>ACCOUNT</code> or a setting of <code>NULL</code> returns
     * all of the rule groups in your account. A setting of <code>MANAGED</code> returns all available managed rule
     * groups.
     * </p>
     * 
     * @param scope
     *        The scope of the request. The default setting of <code>ACCOUNT</code> or a setting of <code>NULL</code>
     *        returns all of the rule groups in your account. A setting of <code>MANAGED</code> returns all available
     *        managed rule groups.
     * @see ResourceManagedStatus
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The scope of the request. The default setting of <code>ACCOUNT</code> or a setting of <code>NULL</code> returns
     * all of the rule groups in your account. A setting of <code>MANAGED</code> returns all available managed rule
     * groups.
     * </p>
     * 
     * @return The scope of the request. The default setting of <code>ACCOUNT</code> or a setting of <code>NULL</code>
     *         returns all of the rule groups in your account. A setting of <code>MANAGED</code> returns all available
     *         managed rule groups.
     * @see ResourceManagedStatus
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The scope of the request. The default setting of <code>ACCOUNT</code> or a setting of <code>NULL</code> returns
     * all of the rule groups in your account. A setting of <code>MANAGED</code> returns all available managed rule
     * groups.
     * </p>
     * 
     * @param scope
     *        The scope of the request. The default setting of <code>ACCOUNT</code> or a setting of <code>NULL</code>
     *        returns all of the rule groups in your account. A setting of <code>MANAGED</code> returns all available
     *        managed rule groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceManagedStatus
     */

    public ListRuleGroupsRequest withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The scope of the request. The default setting of <code>ACCOUNT</code> or a setting of <code>NULL</code> returns
     * all of the rule groups in your account. A setting of <code>MANAGED</code> returns all available managed rule
     * groups.
     * </p>
     * 
     * @param scope
     *        The scope of the request. The default setting of <code>ACCOUNT</code> or a setting of <code>NULL</code>
     *        returns all of the rule groups in your account. A setting of <code>MANAGED</code> returns all available
     *        managed rule groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceManagedStatus
     */

    public ListRuleGroupsRequest withScope(ResourceManagedStatus scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the general category of the Amazon Web Services managed rule group.
     * </p>
     * 
     * @param managedType
     *        Indicates the general category of the Amazon Web Services managed rule group.
     * @see ResourceManagedType
     */

    public void setManagedType(String managedType) {
        this.managedType = managedType;
    }

    /**
     * <p>
     * Indicates the general category of the Amazon Web Services managed rule group.
     * </p>
     * 
     * @return Indicates the general category of the Amazon Web Services managed rule group.
     * @see ResourceManagedType
     */

    public String getManagedType() {
        return this.managedType;
    }

    /**
     * <p>
     * Indicates the general category of the Amazon Web Services managed rule group.
     * </p>
     * 
     * @param managedType
     *        Indicates the general category of the Amazon Web Services managed rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceManagedType
     */

    public ListRuleGroupsRequest withManagedType(String managedType) {
        setManagedType(managedType);
        return this;
    }

    /**
     * <p>
     * Indicates the general category of the Amazon Web Services managed rule group.
     * </p>
     * 
     * @param managedType
     *        Indicates the general category of the Amazon Web Services managed rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceManagedType
     */

    public ListRuleGroupsRequest withManagedType(ResourceManagedType managedType) {
        this.managedType = managedType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * 
     * @param type
     *        Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *        stateless rules. If it is stateful, it contains stateful rules.
     * @see RuleGroupType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * 
     * @return Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *         stateless rules. If it is stateful, it contains stateful rules.
     * @see RuleGroupType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * 
     * @param type
     *        Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *        stateless rules. If it is stateful, it contains stateful rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleGroupType
     */

    public ListRuleGroupsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless
     * rules. If it is stateful, it contains stateful rules.
     * </p>
     * 
     * @param type
     *        Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains
     *        stateless rules. If it is stateful, it contains stateful rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleGroupType
     */

    public ListRuleGroupsRequest withType(RuleGroupType type) {
        this.type = type.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getManagedType() != null)
            sb.append("ManagedType: ").append(getManagedType()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRuleGroupsRequest == false)
            return false;
        ListRuleGroupsRequest other = (ListRuleGroupsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getManagedType() == null ^ this.getManagedType() == null)
            return false;
        if (other.getManagedType() != null && other.getManagedType().equals(this.getManagedType()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getManagedType() == null) ? 0 : getManagedType().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ListRuleGroupsRequest clone() {
        return (ListRuleGroupsRequest) super.clone();
    }

}
