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

/**
 * <p>
 * Describes whether a VPC is enabled for ClassicLink.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpcClassicLink" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcClassicLink implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the VPC is enabled for ClassicLink.
     * </p>
     */
    private Boolean classicLinkEnabled;
    /**
     * <p>
     * Any tags assigned to the VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Indicates whether the VPC is enabled for ClassicLink.
     * </p>
     * 
     * @param classicLinkEnabled
     *        Indicates whether the VPC is enabled for ClassicLink.
     */

    public void setClassicLinkEnabled(Boolean classicLinkEnabled) {
        this.classicLinkEnabled = classicLinkEnabled;
    }

    /**
     * <p>
     * Indicates whether the VPC is enabled for ClassicLink.
     * </p>
     * 
     * @return Indicates whether the VPC is enabled for ClassicLink.
     */

    public Boolean getClassicLinkEnabled() {
        return this.classicLinkEnabled;
    }

    /**
     * <p>
     * Indicates whether the VPC is enabled for ClassicLink.
     * </p>
     * 
     * @param classicLinkEnabled
     *        Indicates whether the VPC is enabled for ClassicLink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcClassicLink withClassicLinkEnabled(Boolean classicLinkEnabled) {
        setClassicLinkEnabled(classicLinkEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the VPC is enabled for ClassicLink.
     * </p>
     * 
     * @return Indicates whether the VPC is enabled for ClassicLink.
     */

    public Boolean isClassicLinkEnabled() {
        return this.classicLinkEnabled;
    }

    /**
     * <p>
     * Any tags assigned to the VPC.
     * </p>
     * 
     * @return Any tags assigned to the VPC.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the VPC.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the VPC.
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
     * Any tags assigned to the VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcClassicLink withTags(Tag... tags) {
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
     * Any tags assigned to the VPC.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcClassicLink withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcClassicLink withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getClassicLinkEnabled() != null)
            sb.append("ClassicLinkEnabled: ").append(getClassicLinkEnabled()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcClassicLink == false)
            return false;
        VpcClassicLink other = (VpcClassicLink) obj;
        if (other.getClassicLinkEnabled() == null ^ this.getClassicLinkEnabled() == null)
            return false;
        if (other.getClassicLinkEnabled() != null && other.getClassicLinkEnabled().equals(this.getClassicLinkEnabled()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClassicLinkEnabled() == null) ? 0 : getClassicLinkEnabled().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public VpcClassicLink clone() {
        try {
            return (VpcClassicLink) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
