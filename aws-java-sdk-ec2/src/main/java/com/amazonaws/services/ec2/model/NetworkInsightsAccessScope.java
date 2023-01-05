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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a Network Access Scope.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NetworkInsightsAccessScope" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInsightsAccessScope implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     */
    private String networkInsightsAccessScopeId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Access Scope.
     * </p>
     */
    private String networkInsightsAccessScopeArn;
    /**
     * <p>
     * The creation date.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The last updated date.
     * </p>
     */
    private java.util.Date updatedDate;
    /**
     * <p>
     * The tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     * 
     * @param networkInsightsAccessScopeId
     *        The ID of the Network Access Scope.
     */

    public void setNetworkInsightsAccessScopeId(String networkInsightsAccessScopeId) {
        this.networkInsightsAccessScopeId = networkInsightsAccessScopeId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     * 
     * @return The ID of the Network Access Scope.
     */

    public String getNetworkInsightsAccessScopeId() {
        return this.networkInsightsAccessScopeId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     * 
     * @param networkInsightsAccessScopeId
     *        The ID of the Network Access Scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScope withNetworkInsightsAccessScopeId(String networkInsightsAccessScopeId) {
        setNetworkInsightsAccessScopeId(networkInsightsAccessScopeId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Access Scope.
     * </p>
     * 
     * @param networkInsightsAccessScopeArn
     *        The Amazon Resource Name (ARN) of the Network Access Scope.
     */

    public void setNetworkInsightsAccessScopeArn(String networkInsightsAccessScopeArn) {
        this.networkInsightsAccessScopeArn = networkInsightsAccessScopeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Access Scope.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Network Access Scope.
     */

    public String getNetworkInsightsAccessScopeArn() {
        return this.networkInsightsAccessScopeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Access Scope.
     * </p>
     * 
     * @param networkInsightsAccessScopeArn
     *        The Amazon Resource Name (ARN) of the Network Access Scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScope withNetworkInsightsAccessScopeArn(String networkInsightsAccessScopeArn) {
        setNetworkInsightsAccessScopeArn(networkInsightsAccessScopeArn);
        return this;
    }

    /**
     * <p>
     * The creation date.
     * </p>
     * 
     * @param createdDate
     *        The creation date.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The creation date.
     * </p>
     * 
     * @return The creation date.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The creation date.
     * </p>
     * 
     * @param createdDate
     *        The creation date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScope withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The last updated date.
     * </p>
     * 
     * @param updatedDate
     *        The last updated date.
     */

    public void setUpdatedDate(java.util.Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * <p>
     * The last updated date.
     * </p>
     * 
     * @return The last updated date.
     */

    public java.util.Date getUpdatedDate() {
        return this.updatedDate;
    }

    /**
     * <p>
     * The last updated date.
     * </p>
     * 
     * @param updatedDate
     *        The last updated date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScope withUpdatedDate(java.util.Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @return The tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScope withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScope withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getNetworkInsightsAccessScopeId() != null)
            sb.append("NetworkInsightsAccessScopeId: ").append(getNetworkInsightsAccessScopeId()).append(",");
        if (getNetworkInsightsAccessScopeArn() != null)
            sb.append("NetworkInsightsAccessScopeArn: ").append(getNetworkInsightsAccessScopeArn()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getUpdatedDate() != null)
            sb.append("UpdatedDate: ").append(getUpdatedDate()).append(",");
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

        if (obj instanceof NetworkInsightsAccessScope == false)
            return false;
        NetworkInsightsAccessScope other = (NetworkInsightsAccessScope) obj;
        if (other.getNetworkInsightsAccessScopeId() == null ^ this.getNetworkInsightsAccessScopeId() == null)
            return false;
        if (other.getNetworkInsightsAccessScopeId() != null && other.getNetworkInsightsAccessScopeId().equals(this.getNetworkInsightsAccessScopeId()) == false)
            return false;
        if (other.getNetworkInsightsAccessScopeArn() == null ^ this.getNetworkInsightsAccessScopeArn() == null)
            return false;
        if (other.getNetworkInsightsAccessScopeArn() != null
                && other.getNetworkInsightsAccessScopeArn().equals(this.getNetworkInsightsAccessScopeArn()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getUpdatedDate() == null ^ this.getUpdatedDate() == null)
            return false;
        if (other.getUpdatedDate() != null && other.getUpdatedDate().equals(this.getUpdatedDate()) == false)
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

        hashCode = prime * hashCode + ((getNetworkInsightsAccessScopeId() == null) ? 0 : getNetworkInsightsAccessScopeId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInsightsAccessScopeArn() == null) ? 0 : getNetworkInsightsAccessScopeArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getUpdatedDate() == null) ? 0 : getUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public NetworkInsightsAccessScope clone() {
        try {
            return (NetworkInsightsAccessScope) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
