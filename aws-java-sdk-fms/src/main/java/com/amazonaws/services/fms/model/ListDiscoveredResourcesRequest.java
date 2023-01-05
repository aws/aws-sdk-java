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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListDiscoveredResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDiscoveredResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account IDs to discover resources in. Only one account is supported per request. The
     * account must be a member of your organization.
     * </p>
     */
    private java.util.List<String> memberAccountIds;
    /**
     * <p>
     * The type of resources to discover.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The maximum number of objects that you want Firewall Manager to return for this request. If more objects are
     * available, in the response, Firewall Manager provides a <code>NextToken</code> value that you can use in a
     * subsequent call to get the next batch of objects.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Web Services account IDs to discover resources in. Only one account is supported per request. The
     * account must be a member of your organization.
     * </p>
     * 
     * @return The Amazon Web Services account IDs to discover resources in. Only one account is supported per request.
     *         The account must be a member of your organization.
     */

    public java.util.List<String> getMemberAccountIds() {
        return memberAccountIds;
    }

    /**
     * <p>
     * The Amazon Web Services account IDs to discover resources in. Only one account is supported per request. The
     * account must be a member of your organization.
     * </p>
     * 
     * @param memberAccountIds
     *        The Amazon Web Services account IDs to discover resources in. Only one account is supported per request.
     *        The account must be a member of your organization.
     */

    public void setMemberAccountIds(java.util.Collection<String> memberAccountIds) {
        if (memberAccountIds == null) {
            this.memberAccountIds = null;
            return;
        }

        this.memberAccountIds = new java.util.ArrayList<String>(memberAccountIds);
    }

    /**
     * <p>
     * The Amazon Web Services account IDs to discover resources in. Only one account is supported per request. The
     * account must be a member of your organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberAccountIds(java.util.Collection)} or {@link #withMemberAccountIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param memberAccountIds
     *        The Amazon Web Services account IDs to discover resources in. Only one account is supported per request.
     *        The account must be a member of your organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesRequest withMemberAccountIds(String... memberAccountIds) {
        if (this.memberAccountIds == null) {
            setMemberAccountIds(new java.util.ArrayList<String>(memberAccountIds.length));
        }
        for (String ele : memberAccountIds) {
            this.memberAccountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account IDs to discover resources in. Only one account is supported per request. The
     * account must be a member of your organization.
     * </p>
     * 
     * @param memberAccountIds
     *        The Amazon Web Services account IDs to discover resources in. Only one account is supported per request.
     *        The account must be a member of your organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesRequest withMemberAccountIds(java.util.Collection<String> memberAccountIds) {
        setMemberAccountIds(memberAccountIds);
        return this;
    }

    /**
     * <p>
     * The type of resources to discover.
     * </p>
     * 
     * @param resourceType
     *        The type of resources to discover.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resources to discover.
     * </p>
     * 
     * @return The type of resources to discover.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resources to discover.
     * </p>
     * 
     * @param resourceType
     *        The type of resources to discover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The maximum number of objects that you want Firewall Manager to return for this request. If more objects are
     * available, in the response, Firewall Manager provides a <code>NextToken</code> value that you can use in a
     * subsequent call to get the next batch of objects.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that you want Firewall Manager to return for this request. If more objects
     *        are available, in the response, Firewall Manager provides a <code>NextToken</code> value that you can use
     *        in a subsequent call to get the next batch of objects.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that you want Firewall Manager to return for this request. If more objects are
     * available, in the response, Firewall Manager provides a <code>NextToken</code> value that you can use in a
     * subsequent call to get the next batch of objects.
     * </p>
     * 
     * @return The maximum number of objects that you want Firewall Manager to return for this request. If more objects
     *         are available, in the response, Firewall Manager provides a <code>NextToken</code> value that you can use
     *         in a subsequent call to get the next batch of objects.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that you want Firewall Manager to return for this request. If more objects are
     * available, in the response, Firewall Manager provides a <code>NextToken</code> value that you can use in a
     * subsequent call to get the next batch of objects.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that you want Firewall Manager to return for this request. If more objects
     *        are available, in the response, Firewall Manager provides a <code>NextToken</code> value that you can use
     *        in a subsequent call to get the next batch of objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     * 
     * @param nextToken
     *        When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that
     *        are still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     *        <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token
     *        returned from the prior request in your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     * 
     * @return When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that
     *         are still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     *         <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token
     *         returned from the prior request in your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     * 
     * @param nextToken
     *        When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that
     *        are still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     *        <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token
     *        returned from the prior request in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesRequest withNextToken(String nextToken) {
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
        if (getMemberAccountIds() != null)
            sb.append("MemberAccountIds: ").append(getMemberAccountIds()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
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

        if (obj instanceof ListDiscoveredResourcesRequest == false)
            return false;
        ListDiscoveredResourcesRequest other = (ListDiscoveredResourcesRequest) obj;
        if (other.getMemberAccountIds() == null ^ this.getMemberAccountIds() == null)
            return false;
        if (other.getMemberAccountIds() != null && other.getMemberAccountIds().equals(this.getMemberAccountIds()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
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

        hashCode = prime * hashCode + ((getMemberAccountIds() == null) ? 0 : getMemberAccountIds().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDiscoveredResourcesRequest clone() {
        return (ListDiscoveredResourcesRequest) super.clone();
    }

}
