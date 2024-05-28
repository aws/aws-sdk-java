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
 * An object that contains a list of tags to be assigned to a list of dashboard IDs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportJobDashboardOverrideTags"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobDashboardOverrideTags implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of dashboard IDs that you want to apply overrides to. You can use <code>*</code> to override all
     * dashboards in this asset bundle.
     * </p>
     */
    private java.util.List<String> dashboardIds;
    /**
     * <p>
     * A list of tags for the dashboards that you want to apply overrides to.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A list of dashboard IDs that you want to apply overrides to. You can use <code>*</code> to override all
     * dashboards in this asset bundle.
     * </p>
     * 
     * @return A list of dashboard IDs that you want to apply overrides to. You can use <code>*</code> to override all
     *         dashboards in this asset bundle.
     */

    public java.util.List<String> getDashboardIds() {
        return dashboardIds;
    }

    /**
     * <p>
     * A list of dashboard IDs that you want to apply overrides to. You can use <code>*</code> to override all
     * dashboards in this asset bundle.
     * </p>
     * 
     * @param dashboardIds
     *        A list of dashboard IDs that you want to apply overrides to. You can use <code>*</code> to override all
     *        dashboards in this asset bundle.
     */

    public void setDashboardIds(java.util.Collection<String> dashboardIds) {
        if (dashboardIds == null) {
            this.dashboardIds = null;
            return;
        }

        this.dashboardIds = new java.util.ArrayList<String>(dashboardIds);
    }

    /**
     * <p>
     * A list of dashboard IDs that you want to apply overrides to. You can use <code>*</code> to override all
     * dashboards in this asset bundle.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDashboardIds(java.util.Collection)} or {@link #withDashboardIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dashboardIds
     *        A list of dashboard IDs that you want to apply overrides to. You can use <code>*</code> to override all
     *        dashboards in this asset bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDashboardOverrideTags withDashboardIds(String... dashboardIds) {
        if (this.dashboardIds == null) {
            setDashboardIds(new java.util.ArrayList<String>(dashboardIds.length));
        }
        for (String ele : dashboardIds) {
            this.dashboardIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of dashboard IDs that you want to apply overrides to. You can use <code>*</code> to override all
     * dashboards in this asset bundle.
     * </p>
     * 
     * @param dashboardIds
     *        A list of dashboard IDs that you want to apply overrides to. You can use <code>*</code> to override all
     *        dashboards in this asset bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDashboardOverrideTags withDashboardIds(java.util.Collection<String> dashboardIds) {
        setDashboardIds(dashboardIds);
        return this;
    }

    /**
     * <p>
     * A list of tags for the dashboards that you want to apply overrides to.
     * </p>
     * 
     * @return A list of tags for the dashboards that you want to apply overrides to.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags for the dashboards that you want to apply overrides to.
     * </p>
     * 
     * @param tags
     *        A list of tags for the dashboards that you want to apply overrides to.
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
     * A list of tags for the dashboards that you want to apply overrides to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags for the dashboards that you want to apply overrides to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDashboardOverrideTags withTags(Tag... tags) {
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
     * A list of tags for the dashboards that you want to apply overrides to.
     * </p>
     * 
     * @param tags
     *        A list of tags for the dashboards that you want to apply overrides to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDashboardOverrideTags withTags(java.util.Collection<Tag> tags) {
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
        if (getDashboardIds() != null)
            sb.append("DashboardIds: ").append(getDashboardIds()).append(",");
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

        if (obj instanceof AssetBundleImportJobDashboardOverrideTags == false)
            return false;
        AssetBundleImportJobDashboardOverrideTags other = (AssetBundleImportJobDashboardOverrideTags) obj;
        if (other.getDashboardIds() == null ^ this.getDashboardIds() == null)
            return false;
        if (other.getDashboardIds() != null && other.getDashboardIds().equals(this.getDashboardIds()) == false)
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

        hashCode = prime * hashCode + ((getDashboardIds() == null) ? 0 : getDashboardIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportJobDashboardOverrideTags clone() {
        try {
            return (AssetBundleImportJobDashboardOverrideTags) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportJobDashboardOverrideTagsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
