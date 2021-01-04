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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ListFirewalls" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFirewallsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The unique identifiers of the VPCs that you want Network Firewall to retrieve the firewalls for. Leave this blank
     * to retrieve all firewalls that you have defined.
     * </p>
     */
    private java.util.List<String> vpcIds;
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

    public ListFirewallsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the VPCs that you want Network Firewall to retrieve the firewalls for. Leave this blank
     * to retrieve all firewalls that you have defined.
     * </p>
     * 
     * @return The unique identifiers of the VPCs that you want Network Firewall to retrieve the firewalls for. Leave
     *         this blank to retrieve all firewalls that you have defined.
     */

    public java.util.List<String> getVpcIds() {
        return vpcIds;
    }

    /**
     * <p>
     * The unique identifiers of the VPCs that you want Network Firewall to retrieve the firewalls for. Leave this blank
     * to retrieve all firewalls that you have defined.
     * </p>
     * 
     * @param vpcIds
     *        The unique identifiers of the VPCs that you want Network Firewall to retrieve the firewalls for. Leave
     *        this blank to retrieve all firewalls that you have defined.
     */

    public void setVpcIds(java.util.Collection<String> vpcIds) {
        if (vpcIds == null) {
            this.vpcIds = null;
            return;
        }

        this.vpcIds = new java.util.ArrayList<String>(vpcIds);
    }

    /**
     * <p>
     * The unique identifiers of the VPCs that you want Network Firewall to retrieve the firewalls for. Leave this blank
     * to retrieve all firewalls that you have defined.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcIds(java.util.Collection)} or {@link #withVpcIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param vpcIds
     *        The unique identifiers of the VPCs that you want Network Firewall to retrieve the firewalls for. Leave
     *        this blank to retrieve all firewalls that you have defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallsRequest withVpcIds(String... vpcIds) {
        if (this.vpcIds == null) {
            setVpcIds(new java.util.ArrayList<String>(vpcIds.length));
        }
        for (String ele : vpcIds) {
            this.vpcIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the VPCs that you want Network Firewall to retrieve the firewalls for. Leave this blank
     * to retrieve all firewalls that you have defined.
     * </p>
     * 
     * @param vpcIds
     *        The unique identifiers of the VPCs that you want Network Firewall to retrieve the firewalls for. Leave
     *        this blank to retrieve all firewalls that you have defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallsRequest withVpcIds(java.util.Collection<String> vpcIds) {
        setVpcIds(vpcIds);
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

    public ListFirewallsRequest withMaxResults(Integer maxResults) {
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getVpcIds() != null)
            sb.append("VpcIds: ").append(getVpcIds()).append(",");
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

        if (obj instanceof ListFirewallsRequest == false)
            return false;
        ListFirewallsRequest other = (ListFirewallsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVpcIds() == null ^ this.getVpcIds() == null)
            return false;
        if (other.getVpcIds() != null && other.getVpcIds().equals(this.getVpcIds()) == false)
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVpcIds() == null) ? 0 : getVpcIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListFirewallsRequest clone() {
        return (ListFirewallsRequest) super.clone();
    }

}
