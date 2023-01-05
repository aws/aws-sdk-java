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
package com.amazonaws.services.recyclebin.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/ListRules" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The resource type retained by the retention rule. Only retention rules that retain the specified resource type
     * are listed. Currently, only Amazon EBS snapshots and EBS-backed AMIs are supported. To list retention rules that
     * retain snapshots, specify <code>EBS_SNAPSHOT</code>. To list retention rules that retain EBS-backed AMIs, specify
     * <code>EC2_IMAGE</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Information about the resource tags used to identify resources that are retained by the retention rule.
     * </p>
     */
    private java.util.List<ResourceTag> resourceTags;
    /**
     * <p>
     * The lock state of the retention rules to list. Only retention rules with the specified lock state are returned.
     * </p>
     */
    private String lockState;

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The resource type retained by the retention rule. Only retention rules that retain the specified resource type
     * are listed. Currently, only Amazon EBS snapshots and EBS-backed AMIs are supported. To list retention rules that
     * retain snapshots, specify <code>EBS_SNAPSHOT</code>. To list retention rules that retain EBS-backed AMIs, specify
     * <code>EC2_IMAGE</code>.
     * </p>
     * 
     * @param resourceType
     *        The resource type retained by the retention rule. Only retention rules that retain the specified resource
     *        type are listed. Currently, only Amazon EBS snapshots and EBS-backed AMIs are supported. To list retention
     *        rules that retain snapshots, specify <code>EBS_SNAPSHOT</code>. To list retention rules that retain
     *        EBS-backed AMIs, specify <code>EC2_IMAGE</code>.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type retained by the retention rule. Only retention rules that retain the specified resource type
     * are listed. Currently, only Amazon EBS snapshots and EBS-backed AMIs are supported. To list retention rules that
     * retain snapshots, specify <code>EBS_SNAPSHOT</code>. To list retention rules that retain EBS-backed AMIs, specify
     * <code>EC2_IMAGE</code>.
     * </p>
     * 
     * @return The resource type retained by the retention rule. Only retention rules that retain the specified resource
     *         type are listed. Currently, only Amazon EBS snapshots and EBS-backed AMIs are supported. To list
     *         retention rules that retain snapshots, specify <code>EBS_SNAPSHOT</code>. To list retention rules that
     *         retain EBS-backed AMIs, specify <code>EC2_IMAGE</code>.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type retained by the retention rule. Only retention rules that retain the specified resource type
     * are listed. Currently, only Amazon EBS snapshots and EBS-backed AMIs are supported. To list retention rules that
     * retain snapshots, specify <code>EBS_SNAPSHOT</code>. To list retention rules that retain EBS-backed AMIs, specify
     * <code>EC2_IMAGE</code>.
     * </p>
     * 
     * @param resourceType
     *        The resource type retained by the retention rule. Only retention rules that retain the specified resource
     *        type are listed. Currently, only Amazon EBS snapshots and EBS-backed AMIs are supported. To list retention
     *        rules that retain snapshots, specify <code>EBS_SNAPSHOT</code>. To list retention rules that retain
     *        EBS-backed AMIs, specify <code>EC2_IMAGE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ListRulesRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type retained by the retention rule. Only retention rules that retain the specified resource type
     * are listed. Currently, only Amazon EBS snapshots and EBS-backed AMIs are supported. To list retention rules that
     * retain snapshots, specify <code>EBS_SNAPSHOT</code>. To list retention rules that retain EBS-backed AMIs, specify
     * <code>EC2_IMAGE</code>.
     * </p>
     * 
     * @param resourceType
     *        The resource type retained by the retention rule. Only retention rules that retain the specified resource
     *        type are listed. Currently, only Amazon EBS snapshots and EBS-backed AMIs are supported. To list retention
     *        rules that retain snapshots, specify <code>EBS_SNAPSHOT</code>. To list retention rules that retain
     *        EBS-backed AMIs, specify <code>EC2_IMAGE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ListRulesRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Information about the resource tags used to identify resources that are retained by the retention rule.
     * </p>
     * 
     * @return Information about the resource tags used to identify resources that are retained by the retention rule.
     */

    public java.util.List<ResourceTag> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * Information about the resource tags used to identify resources that are retained by the retention rule.
     * </p>
     * 
     * @param resourceTags
     *        Information about the resource tags used to identify resources that are retained by the retention rule.
     */

    public void setResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        if (resourceTags == null) {
            this.resourceTags = null;
            return;
        }

        this.resourceTags = new java.util.ArrayList<ResourceTag>(resourceTags);
    }

    /**
     * <p>
     * Information about the resource tags used to identify resources that are retained by the retention rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        Information about the resource tags used to identify resources that are retained by the retention rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesRequest withResourceTags(ResourceTag... resourceTags) {
        if (this.resourceTags == null) {
            setResourceTags(new java.util.ArrayList<ResourceTag>(resourceTags.length));
        }
        for (ResourceTag ele : resourceTags) {
            this.resourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resource tags used to identify resources that are retained by the retention rule.
     * </p>
     * 
     * @param resourceTags
     *        Information about the resource tags used to identify resources that are retained by the retention rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesRequest withResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        setResourceTags(resourceTags);
        return this;
    }

    /**
     * <p>
     * The lock state of the retention rules to list. Only retention rules with the specified lock state are returned.
     * </p>
     * 
     * @param lockState
     *        The lock state of the retention rules to list. Only retention rules with the specified lock state are
     *        returned.
     * @see LockState
     */

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

    /**
     * <p>
     * The lock state of the retention rules to list. Only retention rules with the specified lock state are returned.
     * </p>
     * 
     * @return The lock state of the retention rules to list. Only retention rules with the specified lock state are
     *         returned.
     * @see LockState
     */

    public String getLockState() {
        return this.lockState;
    }

    /**
     * <p>
     * The lock state of the retention rules to list. Only retention rules with the specified lock state are returned.
     * </p>
     * 
     * @param lockState
     *        The lock state of the retention rules to list. Only retention rules with the specified lock state are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LockState
     */

    public ListRulesRequest withLockState(String lockState) {
        setLockState(lockState);
        return this;
    }

    /**
     * <p>
     * The lock state of the retention rules to list. Only retention rules with the specified lock state are returned.
     * </p>
     * 
     * @param lockState
     *        The lock state of the retention rules to list. Only retention rules with the specified lock state are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LockState
     */

    public ListRulesRequest withLockState(LockState lockState) {
        this.lockState = lockState.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags()).append(",");
        if (getLockState() != null)
            sb.append("LockState: ").append(getLockState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRulesRequest == false)
            return false;
        ListRulesRequest other = (ListRulesRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        if (other.getLockState() == null ^ this.getLockState() == null)
            return false;
        if (other.getLockState() != null && other.getLockState().equals(this.getLockState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode + ((getLockState() == null) ? 0 : getLockState().hashCode());
        return hashCode;
    }

    @Override
    public ListRulesRequest clone() {
        return (ListRulesRequest) super.clone();
    }

}
