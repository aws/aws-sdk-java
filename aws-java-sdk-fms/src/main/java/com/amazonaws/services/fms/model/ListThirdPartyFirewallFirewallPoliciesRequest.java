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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListThirdPartyFirewallFirewallPolicies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListThirdPartyFirewallFirewallPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the third-party firewall vendor.
     * </p>
     */
    private String thirdPartyFirewall;
    /**
     * <p>
     * If the previous response included a <code>NextToken</code> element, the specified third-party firewall vendor is
     * associated with more third-party firewall policies. To get more third-party firewall policies, submit another
     * <code>ListThirdPartyFirewallFirewallPoliciesRequest</code> request.
     * </p>
     * <p>
     * For the value of <code>NextToken</code>, specify the value of <code>NextToken</code> from the previous response.
     * If the previous response didn't include a <code>NextToken</code> element, there are no more third-party firewall
     * policies to get.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of third-party firewall policies that you want Firewall Manager to return. If the specified
     * third-party firewall vendor is associated with more than <code>MaxResults</code> firewall policies, the response
     * includes a <code>NextToken</code> element. <code>NextToken</code> contains an encrypted token that identifies the
     * first third-party firewall policies that Firewall Manager will return if you submit another request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the third-party firewall vendor.
     * </p>
     * 
     * @param thirdPartyFirewall
     *        The name of the third-party firewall vendor.
     * @see ThirdPartyFirewall
     */

    public void setThirdPartyFirewall(String thirdPartyFirewall) {
        this.thirdPartyFirewall = thirdPartyFirewall;
    }

    /**
     * <p>
     * The name of the third-party firewall vendor.
     * </p>
     * 
     * @return The name of the third-party firewall vendor.
     * @see ThirdPartyFirewall
     */

    public String getThirdPartyFirewall() {
        return this.thirdPartyFirewall;
    }

    /**
     * <p>
     * The name of the third-party firewall vendor.
     * </p>
     * 
     * @param thirdPartyFirewall
     *        The name of the third-party firewall vendor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyFirewall
     */

    public ListThirdPartyFirewallFirewallPoliciesRequest withThirdPartyFirewall(String thirdPartyFirewall) {
        setThirdPartyFirewall(thirdPartyFirewall);
        return this;
    }

    /**
     * <p>
     * The name of the third-party firewall vendor.
     * </p>
     * 
     * @param thirdPartyFirewall
     *        The name of the third-party firewall vendor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyFirewall
     */

    public ListThirdPartyFirewallFirewallPoliciesRequest withThirdPartyFirewall(ThirdPartyFirewall thirdPartyFirewall) {
        this.thirdPartyFirewall = thirdPartyFirewall.toString();
        return this;
    }

    /**
     * <p>
     * If the previous response included a <code>NextToken</code> element, the specified third-party firewall vendor is
     * associated with more third-party firewall policies. To get more third-party firewall policies, submit another
     * <code>ListThirdPartyFirewallFirewallPoliciesRequest</code> request.
     * </p>
     * <p>
     * For the value of <code>NextToken</code>, specify the value of <code>NextToken</code> from the previous response.
     * If the previous response didn't include a <code>NextToken</code> element, there are no more third-party firewall
     * policies to get.
     * </p>
     * 
     * @param nextToken
     *        If the previous response included a <code>NextToken</code> element, the specified third-party firewall
     *        vendor is associated with more third-party firewall policies. To get more third-party firewall policies,
     *        submit another <code>ListThirdPartyFirewallFirewallPoliciesRequest</code> request.</p>
     *        <p>
     *        For the value of <code>NextToken</code>, specify the value of <code>NextToken</code> from the previous
     *        response. If the previous response didn't include a <code>NextToken</code> element, there are no more
     *        third-party firewall policies to get.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response included a <code>NextToken</code> element, the specified third-party firewall vendor is
     * associated with more third-party firewall policies. To get more third-party firewall policies, submit another
     * <code>ListThirdPartyFirewallFirewallPoliciesRequest</code> request.
     * </p>
     * <p>
     * For the value of <code>NextToken</code>, specify the value of <code>NextToken</code> from the previous response.
     * If the previous response didn't include a <code>NextToken</code> element, there are no more third-party firewall
     * policies to get.
     * </p>
     * 
     * @return If the previous response included a <code>NextToken</code> element, the specified third-party firewall
     *         vendor is associated with more third-party firewall policies. To get more third-party firewall policies,
     *         submit another <code>ListThirdPartyFirewallFirewallPoliciesRequest</code> request.</p>
     *         <p>
     *         For the value of <code>NextToken</code>, specify the value of <code>NextToken</code> from the previous
     *         response. If the previous response didn't include a <code>NextToken</code> element, there are no more
     *         third-party firewall policies to get.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response included a <code>NextToken</code> element, the specified third-party firewall vendor is
     * associated with more third-party firewall policies. To get more third-party firewall policies, submit another
     * <code>ListThirdPartyFirewallFirewallPoliciesRequest</code> request.
     * </p>
     * <p>
     * For the value of <code>NextToken</code>, specify the value of <code>NextToken</code> from the previous response.
     * If the previous response didn't include a <code>NextToken</code> element, there are no more third-party firewall
     * policies to get.
     * </p>
     * 
     * @param nextToken
     *        If the previous response included a <code>NextToken</code> element, the specified third-party firewall
     *        vendor is associated with more third-party firewall policies. To get more third-party firewall policies,
     *        submit another <code>ListThirdPartyFirewallFirewallPoliciesRequest</code> request.</p>
     *        <p>
     *        For the value of <code>NextToken</code>, specify the value of <code>NextToken</code> from the previous
     *        response. If the previous response didn't include a <code>NextToken</code> element, there are no more
     *        third-party firewall policies to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThirdPartyFirewallFirewallPoliciesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of third-party firewall policies that you want Firewall Manager to return. If the specified
     * third-party firewall vendor is associated with more than <code>MaxResults</code> firewall policies, the response
     * includes a <code>NextToken</code> element. <code>NextToken</code> contains an encrypted token that identifies the
     * first third-party firewall policies that Firewall Manager will return if you submit another request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of third-party firewall policies that you want Firewall Manager to return. If the
     *        specified third-party firewall vendor is associated with more than <code>MaxResults</code> firewall
     *        policies, the response includes a <code>NextToken</code> element. <code>NextToken</code> contains an
     *        encrypted token that identifies the first third-party firewall policies that Firewall Manager will return
     *        if you submit another request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of third-party firewall policies that you want Firewall Manager to return. If the specified
     * third-party firewall vendor is associated with more than <code>MaxResults</code> firewall policies, the response
     * includes a <code>NextToken</code> element. <code>NextToken</code> contains an encrypted token that identifies the
     * first third-party firewall policies that Firewall Manager will return if you submit another request.
     * </p>
     * 
     * @return The maximum number of third-party firewall policies that you want Firewall Manager to return. If the
     *         specified third-party firewall vendor is associated with more than <code>MaxResults</code> firewall
     *         policies, the response includes a <code>NextToken</code> element. <code>NextToken</code> contains an
     *         encrypted token that identifies the first third-party firewall policies that Firewall Manager will return
     *         if you submit another request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of third-party firewall policies that you want Firewall Manager to return. If the specified
     * third-party firewall vendor is associated with more than <code>MaxResults</code> firewall policies, the response
     * includes a <code>NextToken</code> element. <code>NextToken</code> contains an encrypted token that identifies the
     * first third-party firewall policies that Firewall Manager will return if you submit another request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of third-party firewall policies that you want Firewall Manager to return. If the
     *        specified third-party firewall vendor is associated with more than <code>MaxResults</code> firewall
     *        policies, the response includes a <code>NextToken</code> element. <code>NextToken</code> contains an
     *        encrypted token that identifies the first third-party firewall policies that Firewall Manager will return
     *        if you submit another request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThirdPartyFirewallFirewallPoliciesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getThirdPartyFirewall() != null)
            sb.append("ThirdPartyFirewall: ").append(getThirdPartyFirewall()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListThirdPartyFirewallFirewallPoliciesRequest == false)
            return false;
        ListThirdPartyFirewallFirewallPoliciesRequest other = (ListThirdPartyFirewallFirewallPoliciesRequest) obj;
        if (other.getThirdPartyFirewall() == null ^ this.getThirdPartyFirewall() == null)
            return false;
        if (other.getThirdPartyFirewall() != null && other.getThirdPartyFirewall().equals(this.getThirdPartyFirewall()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThirdPartyFirewall() == null) ? 0 : getThirdPartyFirewall().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListThirdPartyFirewallFirewallPoliciesRequest clone() {
        return (ListThirdPartyFirewallFirewallPoliciesRequest) super.clone();
    }

}
