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
package com.amazonaws.services.mediapackagevod.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DescribePackagingGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePackagingGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The ARN of the PackagingGroup. */
    private String arn;

    private Authorization authorization;
    /** The fully qualified domain name for Assets in the PackagingGroup. */
    private String domainName;

    private EgressAccessLogs egressAccessLogs;
    /** The ID of the PackagingGroup. */
    private String id;

    private java.util.Map<String, String> tags;

    /**
     * The ARN of the PackagingGroup.
     * 
     * @param arn
     *        The ARN of the PackagingGroup.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The ARN of the PackagingGroup.
     * 
     * @return The ARN of the PackagingGroup.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The ARN of the PackagingGroup.
     * 
     * @param arn
     *        The ARN of the PackagingGroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagingGroupResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * @param authorization
     */

    public void setAuthorization(Authorization authorization) {
        this.authorization = authorization;
    }

    /**
     * @return
     */

    public Authorization getAuthorization() {
        return this.authorization;
    }

    /**
     * @param authorization
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagingGroupResult withAuthorization(Authorization authorization) {
        setAuthorization(authorization);
        return this;
    }

    /**
     * The fully qualified domain name for Assets in the PackagingGroup.
     * 
     * @param domainName
     *        The fully qualified domain name for Assets in the PackagingGroup.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * The fully qualified domain name for Assets in the PackagingGroup.
     * 
     * @return The fully qualified domain name for Assets in the PackagingGroup.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * The fully qualified domain name for Assets in the PackagingGroup.
     * 
     * @param domainName
     *        The fully qualified domain name for Assets in the PackagingGroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagingGroupResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * @param egressAccessLogs
     */

    public void setEgressAccessLogs(EgressAccessLogs egressAccessLogs) {
        this.egressAccessLogs = egressAccessLogs;
    }

    /**
     * @return
     */

    public EgressAccessLogs getEgressAccessLogs() {
        return this.egressAccessLogs;
    }

    /**
     * @param egressAccessLogs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagingGroupResult withEgressAccessLogs(EgressAccessLogs egressAccessLogs) {
        setEgressAccessLogs(egressAccessLogs);
        return this;
    }

    /**
     * The ID of the PackagingGroup.
     * 
     * @param id
     *        The ID of the PackagingGroup.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the PackagingGroup.
     * 
     * @return The ID of the PackagingGroup.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The ID of the PackagingGroup.
     * 
     * @param id
     *        The ID of the PackagingGroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagingGroupResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagingGroupResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribePackagingGroupResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagingGroupResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagingGroupResult clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAuthorization() != null)
            sb.append("Authorization: ").append(getAuthorization()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getEgressAccessLogs() != null)
            sb.append("EgressAccessLogs: ").append(getEgressAccessLogs()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePackagingGroupResult == false)
            return false;
        DescribePackagingGroupResult other = (DescribePackagingGroupResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAuthorization() == null ^ this.getAuthorization() == null)
            return false;
        if (other.getAuthorization() != null && other.getAuthorization().equals(this.getAuthorization()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEgressAccessLogs() == null ^ this.getEgressAccessLogs() == null)
            return false;
        if (other.getEgressAccessLogs() != null && other.getEgressAccessLogs().equals(this.getEgressAccessLogs()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAuthorization() == null) ? 0 : getAuthorization().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getEgressAccessLogs() == null) ? 0 : getEgressAccessLogs().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribePackagingGroupResult clone() {
        try {
            return (DescribePackagingGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
