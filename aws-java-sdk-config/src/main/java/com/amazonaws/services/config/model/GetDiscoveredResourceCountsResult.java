/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetDiscoveredResourceCounts" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDiscoveredResourceCountsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The total number of resources that AWS Config is recording in the region for your account. If you specify
     * resource types in the request, AWS Config returns only the total number of resources for those resource types.
     * </p>
     * <p class="title">
     * <b>Example</b>
     * </p>
     * <ol>
     * <li>
     * <p>
     * AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20
     * IAM users, and 15 S3 buckets, for a total of 60 resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * You make a call to the <code>GetDiscoveredResourceCounts</code> action and specify the resource type,
     * <code>"AWS::EC2::Instances"</code>, in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Config returns 25 for <code>totalDiscoveredResources</code>.
     * </p>
     * </li>
     * </ol>
     */
    private Long totalDiscoveredResources;
    /**
     * <p>
     * The list of <code>ResourceCount</code> objects. Each object is listed in descending order by the number of
     * resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceCount> resourceCounts;
    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The total number of resources that AWS Config is recording in the region for your account. If you specify
     * resource types in the request, AWS Config returns only the total number of resources for those resource types.
     * </p>
     * <p class="title">
     * <b>Example</b>
     * </p>
     * <ol>
     * <li>
     * <p>
     * AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20
     * IAM users, and 15 S3 buckets, for a total of 60 resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * You make a call to the <code>GetDiscoveredResourceCounts</code> action and specify the resource type,
     * <code>"AWS::EC2::Instances"</code>, in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Config returns 25 for <code>totalDiscoveredResources</code>.
     * </p>
     * </li>
     * </ol>
     * 
     * @param totalDiscoveredResources
     *        The total number of resources that AWS Config is recording in the region for your account. If you specify
     *        resource types in the request, AWS Config returns only the total number of resources for those resource
     *        types.</p>
     *        <p class="title">
     *        <b>Example</b>
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2
     *        instances, 20 IAM users, and 15 S3 buckets, for a total of 60 resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You make a call to the <code>GetDiscoveredResourceCounts</code> action and specify the resource type,
     *        <code>"AWS::EC2::Instances"</code>, in the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS Config returns 25 for <code>totalDiscoveredResources</code>.
     *        </p>
     *        </li>
     */

    public void setTotalDiscoveredResources(Long totalDiscoveredResources) {
        this.totalDiscoveredResources = totalDiscoveredResources;
    }

    /**
     * <p>
     * The total number of resources that AWS Config is recording in the region for your account. If you specify
     * resource types in the request, AWS Config returns only the total number of resources for those resource types.
     * </p>
     * <p class="title">
     * <b>Example</b>
     * </p>
     * <ol>
     * <li>
     * <p>
     * AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20
     * IAM users, and 15 S3 buckets, for a total of 60 resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * You make a call to the <code>GetDiscoveredResourceCounts</code> action and specify the resource type,
     * <code>"AWS::EC2::Instances"</code>, in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Config returns 25 for <code>totalDiscoveredResources</code>.
     * </p>
     * </li>
     * </ol>
     * 
     * @return The total number of resources that AWS Config is recording in the region for your account. If you specify
     *         resource types in the request, AWS Config returns only the total number of resources for those resource
     *         types.</p>
     *         <p class="title">
     *         <b>Example</b>
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2
     *         instances, 20 IAM users, and 15 S3 buckets, for a total of 60 resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You make a call to the <code>GetDiscoveredResourceCounts</code> action and specify the resource type,
     *         <code>"AWS::EC2::Instances"</code>, in the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS Config returns 25 for <code>totalDiscoveredResources</code>.
     *         </p>
     *         </li>
     */

    public Long getTotalDiscoveredResources() {
        return this.totalDiscoveredResources;
    }

    /**
     * <p>
     * The total number of resources that AWS Config is recording in the region for your account. If you specify
     * resource types in the request, AWS Config returns only the total number of resources for those resource types.
     * </p>
     * <p class="title">
     * <b>Example</b>
     * </p>
     * <ol>
     * <li>
     * <p>
     * AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20
     * IAM users, and 15 S3 buckets, for a total of 60 resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * You make a call to the <code>GetDiscoveredResourceCounts</code> action and specify the resource type,
     * <code>"AWS::EC2::Instances"</code>, in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Config returns 25 for <code>totalDiscoveredResources</code>.
     * </p>
     * </li>
     * </ol>
     * 
     * @param totalDiscoveredResources
     *        The total number of resources that AWS Config is recording in the region for your account. If you specify
     *        resource types in the request, AWS Config returns only the total number of resources for those resource
     *        types.</p>
     *        <p class="title">
     *        <b>Example</b>
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2
     *        instances, 20 IAM users, and 15 S3 buckets, for a total of 60 resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You make a call to the <code>GetDiscoveredResourceCounts</code> action and specify the resource type,
     *        <code>"AWS::EC2::Instances"</code>, in the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS Config returns 25 for <code>totalDiscoveredResources</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiscoveredResourceCountsResult withTotalDiscoveredResources(Long totalDiscoveredResources) {
        setTotalDiscoveredResources(totalDiscoveredResources);
        return this;
    }

    /**
     * <p>
     * The list of <code>ResourceCount</code> objects. Each object is listed in descending order by the number of
     * resources.
     * </p>
     * 
     * @return The list of <code>ResourceCount</code> objects. Each object is listed in descending order by the number
     *         of resources.
     */

    public java.util.List<ResourceCount> getResourceCounts() {
        if (resourceCounts == null) {
            resourceCounts = new com.amazonaws.internal.SdkInternalList<ResourceCount>();
        }
        return resourceCounts;
    }

    /**
     * <p>
     * The list of <code>ResourceCount</code> objects. Each object is listed in descending order by the number of
     * resources.
     * </p>
     * 
     * @param resourceCounts
     *        The list of <code>ResourceCount</code> objects. Each object is listed in descending order by the number of
     *        resources.
     */

    public void setResourceCounts(java.util.Collection<ResourceCount> resourceCounts) {
        if (resourceCounts == null) {
            this.resourceCounts = null;
            return;
        }

        this.resourceCounts = new com.amazonaws.internal.SdkInternalList<ResourceCount>(resourceCounts);
    }

    /**
     * <p>
     * The list of <code>ResourceCount</code> objects. Each object is listed in descending order by the number of
     * resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceCounts(java.util.Collection)} or {@link #withResourceCounts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceCounts
     *        The list of <code>ResourceCount</code> objects. Each object is listed in descending order by the number of
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiscoveredResourceCountsResult withResourceCounts(ResourceCount... resourceCounts) {
        if (this.resourceCounts == null) {
            setResourceCounts(new com.amazonaws.internal.SdkInternalList<ResourceCount>(resourceCounts.length));
        }
        for (ResourceCount ele : resourceCounts) {
            this.resourceCounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>ResourceCount</code> objects. Each object is listed in descending order by the number of
     * resources.
     * </p>
     * 
     * @param resourceCounts
     *        The list of <code>ResourceCount</code> objects. Each object is listed in descending order by the number of
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiscoveredResourceCountsResult withResourceCounts(java.util.Collection<ResourceCount> resourceCounts) {
        setResourceCounts(resourceCounts);
        return this;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next page of results in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     * 
     * @return The string that you use in a subsequent request to get the next page of results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next page of results in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiscoveredResourceCountsResult withNextToken(String nextToken) {
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
        if (getTotalDiscoveredResources() != null)
            sb.append("TotalDiscoveredResources: ").append(getTotalDiscoveredResources()).append(",");
        if (getResourceCounts() != null)
            sb.append("ResourceCounts: ").append(getResourceCounts()).append(",");
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

        if (obj instanceof GetDiscoveredResourceCountsResult == false)
            return false;
        GetDiscoveredResourceCountsResult other = (GetDiscoveredResourceCountsResult) obj;
        if (other.getTotalDiscoveredResources() == null ^ this.getTotalDiscoveredResources() == null)
            return false;
        if (other.getTotalDiscoveredResources() != null && other.getTotalDiscoveredResources().equals(this.getTotalDiscoveredResources()) == false)
            return false;
        if (other.getResourceCounts() == null ^ this.getResourceCounts() == null)
            return false;
        if (other.getResourceCounts() != null && other.getResourceCounts().equals(this.getResourceCounts()) == false)
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

        hashCode = prime * hashCode + ((getTotalDiscoveredResources() == null) ? 0 : getTotalDiscoveredResources().hashCode());
        hashCode = prime * hashCode + ((getResourceCounts() == null) ? 0 : getResourceCounts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDiscoveredResourceCountsResult clone() {
        try {
            return (GetDiscoveredResourceCountsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
