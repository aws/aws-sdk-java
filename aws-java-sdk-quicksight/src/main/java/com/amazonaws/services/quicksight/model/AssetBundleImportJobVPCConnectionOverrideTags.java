/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains a list of tags to be assigned to a list of VPC connection IDs.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportJobVPCConnectionOverrideTags"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobVPCConnectionOverrideTags implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of VPC connection IDs that you want to apply overrides to. You can use <code>*</code> to override all VPC
     * connections in this asset bundle.
     * </p>
     */
    private java.util.List<String> vPCConnectionIds;
    /**
     * <p>
     * A list of tags for the VPC connections that you want to apply overrides to.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A list of VPC connection IDs that you want to apply overrides to. You can use <code>*</code> to override all VPC
     * connections in this asset bundle.
     * </p>
     * 
     * @return A list of VPC connection IDs that you want to apply overrides to. You can use <code>*</code> to override
     *         all VPC connections in this asset bundle.
     */

    public java.util.List<String> getVPCConnectionIds() {
        return vPCConnectionIds;
    }

    /**
     * <p>
     * A list of VPC connection IDs that you want to apply overrides to. You can use <code>*</code> to override all VPC
     * connections in this asset bundle.
     * </p>
     * 
     * @param vPCConnectionIds
     *        A list of VPC connection IDs that you want to apply overrides to. You can use <code>*</code> to override
     *        all VPC connections in this asset bundle.
     */

    public void setVPCConnectionIds(java.util.Collection<String> vPCConnectionIds) {
        if (vPCConnectionIds == null) {
            this.vPCConnectionIds = null;
            return;
        }

        this.vPCConnectionIds = new java.util.ArrayList<String>(vPCConnectionIds);
    }

    /**
     * <p>
     * A list of VPC connection IDs that you want to apply overrides to. You can use <code>*</code> to override all VPC
     * connections in this asset bundle.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVPCConnectionIds(java.util.Collection)} or {@link #withVPCConnectionIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param vPCConnectionIds
     *        A list of VPC connection IDs that you want to apply overrides to. You can use <code>*</code> to override
     *        all VPC connections in this asset bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobVPCConnectionOverrideTags withVPCConnectionIds(String... vPCConnectionIds) {
        if (this.vPCConnectionIds == null) {
            setVPCConnectionIds(new java.util.ArrayList<String>(vPCConnectionIds.length));
        }
        for (String ele : vPCConnectionIds) {
            this.vPCConnectionIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC connection IDs that you want to apply overrides to. You can use <code>*</code> to override all VPC
     * connections in this asset bundle.
     * </p>
     * 
     * @param vPCConnectionIds
     *        A list of VPC connection IDs that you want to apply overrides to. You can use <code>*</code> to override
     *        all VPC connections in this asset bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobVPCConnectionOverrideTags withVPCConnectionIds(java.util.Collection<String> vPCConnectionIds) {
        setVPCConnectionIds(vPCConnectionIds);
        return this;
    }

    /**
     * <p>
     * A list of tags for the VPC connections that you want to apply overrides to.
     * </p>
     * 
     * @return A list of tags for the VPC connections that you want to apply overrides to.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags for the VPC connections that you want to apply overrides to.
     * </p>
     * 
     * @param tags
     *        A list of tags for the VPC connections that you want to apply overrides to.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags for the VPC connections that you want to apply overrides to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags for the VPC connections that you want to apply overrides to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobVPCConnectionOverrideTags withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags for the VPC connections that you want to apply overrides to.
     * </p>
     * 
     * @param tags
     *        A list of tags for the VPC connections that you want to apply overrides to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobVPCConnectionOverrideTags withTags(java.util.Collection<Tag> tags) {
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
        if (getVPCConnectionIds() != null)
            sb.append("VPCConnectionIds: ").append(getVPCConnectionIds()).append(",");
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

        if (obj instanceof AssetBundleImportJobVPCConnectionOverrideTags == false)
            return false;
        AssetBundleImportJobVPCConnectionOverrideTags other = (AssetBundleImportJobVPCConnectionOverrideTags) obj;
        if (other.getVPCConnectionIds() == null ^ this.getVPCConnectionIds() == null)
            return false;
        if (other.getVPCConnectionIds() != null && other.getVPCConnectionIds().equals(this.getVPCConnectionIds()) == false)
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

        hashCode = prime * hashCode + ((getVPCConnectionIds() == null) ? 0 : getVPCConnectionIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportJobVPCConnectionOverrideTags clone() {
        try {
            return (AssetBundleImportJobVPCConnectionOverrideTags) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportJobVPCConnectionOverrideTagsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
