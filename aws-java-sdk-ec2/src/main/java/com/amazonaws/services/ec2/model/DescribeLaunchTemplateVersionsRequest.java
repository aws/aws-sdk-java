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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeLaunchTemplateVersionsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLaunchTemplateVersionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeLaunchTemplateVersionsRequest> {

    /**
     * <p>
     * The ID of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     */
    private String launchTemplateId;
    /**
     * <p>
     * The name of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     */
    private String launchTemplateName;
    /**
     * <p>
     * One or more versions of the launch template.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> versions;
    /**
     * <p>
     * The version number after which to describe launch template versions.
     * </p>
     */
    private String minVersion;
    /**
     * <p>
     * The version number up to which to describe launch template versions.
     * </p>
     */
    private String maxVersion;
    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 1 and 200.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The time the launch template version was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-optimized</code> - A boolean that indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile</code> - The ARN of the IAM instance profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-default-version</code> - A boolean that indicates whether the launch template version is the default
     * version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ram-disk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * The ID of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template. You must specify either the launch template ID or launch template name in
     *        the request.
     */

    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     * 
     * @return The ID of the launch template. You must specify either the launch template ID or launch template name in
     *         the request.
     */

    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template. You must specify either the launch template ID or launch template name in
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplateVersionsRequest withLaunchTemplateId(String launchTemplateId) {
        setLaunchTemplateId(launchTemplateId);
        return this;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template. You must specify either the launch template ID or launch template name in
     *        the request.
     */

    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     * 
     * @return The name of the launch template. You must specify either the launch template ID or launch template name
     *         in the request.
     */

    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template. You must specify either the launch template ID or launch template name in
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplateVersionsRequest withLaunchTemplateName(String launchTemplateName) {
        setLaunchTemplateName(launchTemplateName);
        return this;
    }

    /**
     * <p>
     * One or more versions of the launch template.
     * </p>
     * 
     * @return One or more versions of the launch template.
     */

    public java.util.List<String> getVersions() {
        if (versions == null) {
            versions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return versions;
    }

    /**
     * <p>
     * One or more versions of the launch template.
     * </p>
     * 
     * @param versions
     *        One or more versions of the launch template.
     */

    public void setVersions(java.util.Collection<String> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new com.amazonaws.internal.SdkInternalList<String>(versions);
    }

    /**
     * <p>
     * One or more versions of the launch template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersions(java.util.Collection)} or {@link #withVersions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param versions
     *        One or more versions of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplateVersionsRequest withVersions(String... versions) {
        if (this.versions == null) {
            setVersions(new com.amazonaws.internal.SdkInternalList<String>(versions.length));
        }
        for (String ele : versions) {
            this.versions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more versions of the launch template.
     * </p>
     * 
     * @param versions
     *        One or more versions of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplateVersionsRequest withVersions(java.util.Collection<String> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p>
     * The version number after which to describe launch template versions.
     * </p>
     * 
     * @param minVersion
     *        The version number after which to describe launch template versions.
     */

    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    /**
     * <p>
     * The version number after which to describe launch template versions.
     * </p>
     * 
     * @return The version number after which to describe launch template versions.
     */

    public String getMinVersion() {
        return this.minVersion;
    }

    /**
     * <p>
     * The version number after which to describe launch template versions.
     * </p>
     * 
     * @param minVersion
     *        The version number after which to describe launch template versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplateVersionsRequest withMinVersion(String minVersion) {
        setMinVersion(minVersion);
        return this;
    }

    /**
     * <p>
     * The version number up to which to describe launch template versions.
     * </p>
     * 
     * @param maxVersion
     *        The version number up to which to describe launch template versions.
     */

    public void setMaxVersion(String maxVersion) {
        this.maxVersion = maxVersion;
    }

    /**
     * <p>
     * The version number up to which to describe launch template versions.
     * </p>
     * 
     * @return The version number up to which to describe launch template versions.
     */

    public String getMaxVersion() {
        return this.maxVersion;
    }

    /**
     * <p>
     * The version number up to which to describe launch template versions.
     * </p>
     * 
     * @param maxVersion
     *        The version number up to which to describe launch template versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplateVersionsRequest withMaxVersion(String maxVersion) {
        setMaxVersion(maxVersion);
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @return The token to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplateVersionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 1 and 200.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>NextToken</code> value. This value can be between 1 and 200.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 1 and 200.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *         call with the returned <code>NextToken</code> value. This value can be between 1 and 200.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 1 and 200.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>NextToken</code> value. This value can be between 1 and 200.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplateVersionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The time the launch template version was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-optimized</code> - A boolean that indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile</code> - The ARN of the IAM instance profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-default-version</code> - A boolean that indicates whether the launch template version is the default
     * version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ram-disk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>create-time</code> - The time the launch template version was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ebs-optimized</code> - A boolean that indicates whether the instance is optimized for Amazon EBS
     *         I/O.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>iam-instance-profile</code> - The ARN of the IAM instance profile.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>image-id</code> - The ID of the AMI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The instance type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>is-default-version</code> - A boolean that indicates whether the launch template version is the
     *         default version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kernel-id</code> - The kernel ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ram-disk-id</code> - The RAM disk ID.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The time the launch template version was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-optimized</code> - A boolean that indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile</code> - The ARN of the IAM instance profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-default-version</code> - A boolean that indicates whether the launch template version is the default
     * version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ram-disk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The time the launch template version was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ebs-optimized</code> - A boolean that indicates whether the instance is optimized for Amazon EBS
     *        I/O.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>iam-instance-profile</code> - The ARN of the IAM instance profile.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>image-id</code> - The ID of the AMI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>is-default-version</code> - A boolean that indicates whether the launch template version is the
     *        default version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kernel-id</code> - The kernel ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ram-disk-id</code> - The RAM disk ID.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The time the launch template version was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-optimized</code> - A boolean that indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile</code> - The ARN of the IAM instance profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-default-version</code> - A boolean that indicates whether the launch template version is the default
     * version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ram-disk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The time the launch template version was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ebs-optimized</code> - A boolean that indicates whether the instance is optimized for Amazon EBS
     *        I/O.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>iam-instance-profile</code> - The ARN of the IAM instance profile.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>image-id</code> - The ID of the AMI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>is-default-version</code> - A boolean that indicates whether the launch template version is the
     *        default version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kernel-id</code> - The kernel ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ram-disk-id</code> - The RAM disk ID.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplateVersionsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The time the launch template version was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-optimized</code> - A boolean that indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile</code> - The ARN of the IAM instance profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-default-version</code> - A boolean that indicates whether the launch template version is the default
     * version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ram-disk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The time the launch template version was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ebs-optimized</code> - A boolean that indicates whether the instance is optimized for Amazon EBS
     *        I/O.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>iam-instance-profile</code> - The ARN of the IAM instance profile.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>image-id</code> - The ID of the AMI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>is-default-version</code> - A boolean that indicates whether the launch template version is the
     *        default version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kernel-id</code> - The kernel ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ram-disk-id</code> - The RAM disk ID.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplateVersionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeLaunchTemplateVersionsRequest> getDryRunRequest() {
        Request<DescribeLaunchTemplateVersionsRequest> request = new DescribeLaunchTemplateVersionsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getLaunchTemplateId() != null)
            sb.append("LaunchTemplateId: ").append(getLaunchTemplateId()).append(",");
        if (getLaunchTemplateName() != null)
            sb.append("LaunchTemplateName: ").append(getLaunchTemplateName()).append(",");
        if (getVersions() != null)
            sb.append("Versions: ").append(getVersions()).append(",");
        if (getMinVersion() != null)
            sb.append("MinVersion: ").append(getMinVersion()).append(",");
        if (getMaxVersion() != null)
            sb.append("MaxVersion: ").append(getMaxVersion()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLaunchTemplateVersionsRequest == false)
            return false;
        DescribeLaunchTemplateVersionsRequest other = (DescribeLaunchTemplateVersionsRequest) obj;
        if (other.getLaunchTemplateId() == null ^ this.getLaunchTemplateId() == null)
            return false;
        if (other.getLaunchTemplateId() != null && other.getLaunchTemplateId().equals(this.getLaunchTemplateId()) == false)
            return false;
        if (other.getLaunchTemplateName() == null ^ this.getLaunchTemplateName() == null)
            return false;
        if (other.getLaunchTemplateName() != null && other.getLaunchTemplateName().equals(this.getLaunchTemplateName()) == false)
            return false;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        if (other.getMinVersion() == null ^ this.getMinVersion() == null)
            return false;
        if (other.getMinVersion() != null && other.getMinVersion().equals(this.getMinVersion()) == false)
            return false;
        if (other.getMaxVersion() == null ^ this.getMaxVersion() == null)
            return false;
        if (other.getMaxVersion() != null && other.getMaxVersion().equals(this.getMaxVersion()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchTemplateId() == null) ? 0 : getLaunchTemplateId().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode + ((getMinVersion() == null) ? 0 : getMinVersion().hashCode());
        hashCode = prime * hashCode + ((getMaxVersion() == null) ? 0 : getMaxVersion().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLaunchTemplateVersionsRequest clone() {
        return (DescribeLaunchTemplateVersionsRequest) super.clone();
    }
}
