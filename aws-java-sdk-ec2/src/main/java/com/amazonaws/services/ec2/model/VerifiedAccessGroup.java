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
 * Describes a Verified Access group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VerifiedAccessGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Verified Access group.
     * </p>
     */
    private String verifiedAccessGroupId;
    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     */
    private String verifiedAccessInstanceId;
    /**
     * <p>
     * A description for the Amazon Web Services Verified Access group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Web Services account number that owns the group.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The ARN of the Verified Access group.
     * </p>
     */
    private String verifiedAccessGroupArn;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The last updated time.
     * </p>
     */
    private String lastUpdatedTime;
    /**
     * <p>
     * The deletion time.
     * </p>
     */
    private String deletionTime;
    /**
     * <p>
     * The tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the Verified Access group.
     * </p>
     * 
     * @param verifiedAccessGroupId
     *        The ID of the Verified Access group.
     */

    public void setVerifiedAccessGroupId(String verifiedAccessGroupId) {
        this.verifiedAccessGroupId = verifiedAccessGroupId;
    }

    /**
     * <p>
     * The ID of the Verified Access group.
     * </p>
     * 
     * @return The ID of the Verified Access group.
     */

    public String getVerifiedAccessGroupId() {
        return this.verifiedAccessGroupId;
    }

    /**
     * <p>
     * The ID of the Verified Access group.
     * </p>
     * 
     * @param verifiedAccessGroupId
     *        The ID of the Verified Access group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessGroup withVerifiedAccessGroupId(String verifiedAccessGroupId) {
        setVerifiedAccessGroupId(verifiedAccessGroupId);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param verifiedAccessInstanceId
     *        The ID of the Amazon Web Services Verified Access instance.
     */

    public void setVerifiedAccessInstanceId(String verifiedAccessInstanceId) {
        this.verifiedAccessInstanceId = verifiedAccessInstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access instance.
     */

    public String getVerifiedAccessInstanceId() {
        return this.verifiedAccessInstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param verifiedAccessInstanceId
     *        The ID of the Amazon Web Services Verified Access instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessGroup withVerifiedAccessInstanceId(String verifiedAccessInstanceId) {
        setVerifiedAccessInstanceId(verifiedAccessInstanceId);
        return this;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access group.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Web Services Verified Access group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access group.
     * </p>
     * 
     * @return A description for the Amazon Web Services Verified Access group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access group.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Web Services Verified Access group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account number that owns the group.
     * </p>
     * 
     * @param owner
     *        The Amazon Web Services account number that owns the group.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The Amazon Web Services account number that owns the group.
     * </p>
     * 
     * @return The Amazon Web Services account number that owns the group.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The Amazon Web Services account number that owns the group.
     * </p>
     * 
     * @param owner
     *        The Amazon Web Services account number that owns the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessGroup withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The ARN of the Verified Access group.
     * </p>
     * 
     * @param verifiedAccessGroupArn
     *        The ARN of the Verified Access group.
     */

    public void setVerifiedAccessGroupArn(String verifiedAccessGroupArn) {
        this.verifiedAccessGroupArn = verifiedAccessGroupArn;
    }

    /**
     * <p>
     * The ARN of the Verified Access group.
     * </p>
     * 
     * @return The ARN of the Verified Access group.
     */

    public String getVerifiedAccessGroupArn() {
        return this.verifiedAccessGroupArn;
    }

    /**
     * <p>
     * The ARN of the Verified Access group.
     * </p>
     * 
     * @param verifiedAccessGroupArn
     *        The ARN of the Verified Access group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessGroup withVerifiedAccessGroupArn(String verifiedAccessGroupArn) {
        setVerifiedAccessGroupArn(verifiedAccessGroupArn);
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @return The creation time.
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessGroup withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last updated time.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last updated time.
     */

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last updated time.
     * </p>
     * 
     * @return The last updated time.
     */

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last updated time.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last updated time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessGroup withLastUpdatedTime(String lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The deletion time.
     * </p>
     * 
     * @param deletionTime
     *        The deletion time.
     */

    public void setDeletionTime(String deletionTime) {
        this.deletionTime = deletionTime;
    }

    /**
     * <p>
     * The deletion time.
     * </p>
     * 
     * @return The deletion time.
     */

    public String getDeletionTime() {
        return this.deletionTime;
    }

    /**
     * <p>
     * The deletion time.
     * </p>
     * 
     * @param deletionTime
     *        The deletion time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessGroup withDeletionTime(String deletionTime) {
        setDeletionTime(deletionTime);
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

    public VerifiedAccessGroup withTags(Tag... tags) {
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

    public VerifiedAccessGroup withTags(java.util.Collection<Tag> tags) {
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
        if (getVerifiedAccessGroupId() != null)
            sb.append("VerifiedAccessGroupId: ").append(getVerifiedAccessGroupId()).append(",");
        if (getVerifiedAccessInstanceId() != null)
            sb.append("VerifiedAccessInstanceId: ").append(getVerifiedAccessInstanceId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getVerifiedAccessGroupArn() != null)
            sb.append("VerifiedAccessGroupArn: ").append(getVerifiedAccessGroupArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getDeletionTime() != null)
            sb.append("DeletionTime: ").append(getDeletionTime()).append(",");
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

        if (obj instanceof VerifiedAccessGroup == false)
            return false;
        VerifiedAccessGroup other = (VerifiedAccessGroup) obj;
        if (other.getVerifiedAccessGroupId() == null ^ this.getVerifiedAccessGroupId() == null)
            return false;
        if (other.getVerifiedAccessGroupId() != null && other.getVerifiedAccessGroupId().equals(this.getVerifiedAccessGroupId()) == false)
            return false;
        if (other.getVerifiedAccessInstanceId() == null ^ this.getVerifiedAccessInstanceId() == null)
            return false;
        if (other.getVerifiedAccessInstanceId() != null && other.getVerifiedAccessInstanceId().equals(this.getVerifiedAccessInstanceId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getVerifiedAccessGroupArn() == null ^ this.getVerifiedAccessGroupArn() == null)
            return false;
        if (other.getVerifiedAccessGroupArn() != null && other.getVerifiedAccessGroupArn().equals(this.getVerifiedAccessGroupArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getDeletionTime() == null ^ this.getDeletionTime() == null)
            return false;
        if (other.getDeletionTime() != null && other.getDeletionTime().equals(this.getDeletionTime()) == false)
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

        hashCode = prime * hashCode + ((getVerifiedAccessGroupId() == null) ? 0 : getVerifiedAccessGroupId().hashCode());
        hashCode = prime * hashCode + ((getVerifiedAccessInstanceId() == null) ? 0 : getVerifiedAccessInstanceId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getVerifiedAccessGroupArn() == null) ? 0 : getVerifiedAccessGroupArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getDeletionTime() == null) ? 0 : getDeletionTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public VerifiedAccessGroup clone() {
        try {
            return (VerifiedAccessGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
