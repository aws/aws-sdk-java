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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result of the lifecycle policy preview.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/LifecyclePolicyPreviewResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicyPreviewResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of tags associated with this image.
     * </p>
     */
    private java.util.List<String> imageTags;
    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     */
    private String imageDigest;
    /**
     * <p>
     * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the
     * repository.
     * </p>
     */
    private java.util.Date imagePushedAt;
    /**
     * <p>
     * The type of action to be taken.
     * </p>
     */
    private LifecyclePolicyRuleAction action;
    /**
     * <p>
     * The priority of the applied rule.
     * </p>
     */
    private Integer appliedRulePriority;

    /**
     * <p>
     * The list of tags associated with this image.
     * </p>
     * 
     * @return The list of tags associated with this image.
     */

    public java.util.List<String> getImageTags() {
        return imageTags;
    }

    /**
     * <p>
     * The list of tags associated with this image.
     * </p>
     * 
     * @param imageTags
     *        The list of tags associated with this image.
     */

    public void setImageTags(java.util.Collection<String> imageTags) {
        if (imageTags == null) {
            this.imageTags = null;
            return;
        }

        this.imageTags = new java.util.ArrayList<String>(imageTags);
    }

    /**
     * <p>
     * The list of tags associated with this image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageTags(java.util.Collection)} or {@link #withImageTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param imageTags
     *        The list of tags associated with this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyPreviewResult withImageTags(String... imageTags) {
        if (this.imageTags == null) {
            setImageTags(new java.util.ArrayList<String>(imageTags.length));
        }
        for (String ele : imageTags) {
            this.imageTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags associated with this image.
     * </p>
     * 
     * @param imageTags
     *        The list of tags associated with this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyPreviewResult withImageTags(java.util.Collection<String> imageTags) {
        setImageTags(imageTags);
        return this;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     * 
     * @param imageDigest
     *        The <code>sha256</code> digest of the image manifest.
     */

    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     * 
     * @return The <code>sha256</code> digest of the image manifest.
     */

    public String getImageDigest() {
        return this.imageDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     * 
     * @param imageDigest
     *        The <code>sha256</code> digest of the image manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyPreviewResult withImageDigest(String imageDigest) {
        setImageDigest(imageDigest);
        return this;
    }

    /**
     * <p>
     * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the
     * repository.
     * </p>
     * 
     * @param imagePushedAt
     *        The date and time, expressed in standard JavaScript date format, at which the current image was pushed to
     *        the repository.
     */

    public void setImagePushedAt(java.util.Date imagePushedAt) {
        this.imagePushedAt = imagePushedAt;
    }

    /**
     * <p>
     * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the
     * repository.
     * </p>
     * 
     * @return The date and time, expressed in standard JavaScript date format, at which the current image was pushed to
     *         the repository.
     */

    public java.util.Date getImagePushedAt() {
        return this.imagePushedAt;
    }

    /**
     * <p>
     * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the
     * repository.
     * </p>
     * 
     * @param imagePushedAt
     *        The date and time, expressed in standard JavaScript date format, at which the current image was pushed to
     *        the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyPreviewResult withImagePushedAt(java.util.Date imagePushedAt) {
        setImagePushedAt(imagePushedAt);
        return this;
    }

    /**
     * <p>
     * The type of action to be taken.
     * </p>
     * 
     * @param action
     *        The type of action to be taken.
     */

    public void setAction(LifecyclePolicyRuleAction action) {
        this.action = action;
    }

    /**
     * <p>
     * The type of action to be taken.
     * </p>
     * 
     * @return The type of action to be taken.
     */

    public LifecyclePolicyRuleAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * The type of action to be taken.
     * </p>
     * 
     * @param action
     *        The type of action to be taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyPreviewResult withAction(LifecyclePolicyRuleAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The priority of the applied rule.
     * </p>
     * 
     * @param appliedRulePriority
     *        The priority of the applied rule.
     */

    public void setAppliedRulePriority(Integer appliedRulePriority) {
        this.appliedRulePriority = appliedRulePriority;
    }

    /**
     * <p>
     * The priority of the applied rule.
     * </p>
     * 
     * @return The priority of the applied rule.
     */

    public Integer getAppliedRulePriority() {
        return this.appliedRulePriority;
    }

    /**
     * <p>
     * The priority of the applied rule.
     * </p>
     * 
     * @param appliedRulePriority
     *        The priority of the applied rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyPreviewResult withAppliedRulePriority(Integer appliedRulePriority) {
        setAppliedRulePriority(appliedRulePriority);
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
        if (getImageTags() != null)
            sb.append("ImageTags: ").append(getImageTags()).append(",");
        if (getImageDigest() != null)
            sb.append("ImageDigest: ").append(getImageDigest()).append(",");
        if (getImagePushedAt() != null)
            sb.append("ImagePushedAt: ").append(getImagePushedAt()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getAppliedRulePriority() != null)
            sb.append("AppliedRulePriority: ").append(getAppliedRulePriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicyPreviewResult == false)
            return false;
        LifecyclePolicyPreviewResult other = (LifecyclePolicyPreviewResult) obj;
        if (other.getImageTags() == null ^ this.getImageTags() == null)
            return false;
        if (other.getImageTags() != null && other.getImageTags().equals(this.getImageTags()) == false)
            return false;
        if (other.getImageDigest() == null ^ this.getImageDigest() == null)
            return false;
        if (other.getImageDigest() != null && other.getImageDigest().equals(this.getImageDigest()) == false)
            return false;
        if (other.getImagePushedAt() == null ^ this.getImagePushedAt() == null)
            return false;
        if (other.getImagePushedAt() != null && other.getImagePushedAt().equals(this.getImagePushedAt()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getAppliedRulePriority() == null ^ this.getAppliedRulePriority() == null)
            return false;
        if (other.getAppliedRulePriority() != null && other.getAppliedRulePriority().equals(this.getAppliedRulePriority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageTags() == null) ? 0 : getImageTags().hashCode());
        hashCode = prime * hashCode + ((getImageDigest() == null) ? 0 : getImageDigest().hashCode());
        hashCode = prime * hashCode + ((getImagePushedAt() == null) ? 0 : getImagePushedAt().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getAppliedRulePriority() == null) ? 0 : getAppliedRulePriority().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicyPreviewResult clone() {
        try {
            return (LifecyclePolicyPreviewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.LifecyclePolicyPreviewResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
