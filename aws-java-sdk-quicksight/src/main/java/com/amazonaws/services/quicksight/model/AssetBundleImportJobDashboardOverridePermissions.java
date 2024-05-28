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
 * An object that contains a list of permissions to be applied to a list of dashboard IDs.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportJobDashboardOverridePermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobDashboardOverridePermissions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of dashboard IDs that you want to apply overrides to. You can use <code>*</code> to override all
     * dashboards in this asset bundle.
     * </p>
     */
    private java.util.List<String> dashboardIds;
    /**
     * <p>
     * A list of permissions for the dashboards that you want to apply overrides to.
     * </p>
     */
    private AssetBundleResourcePermissions permissions;
    /**
     * <p>
     * A structure that contains the link sharing configurations that you want to apply overrides to.
     * </p>
     */
    private AssetBundleResourceLinkSharingConfiguration linkSharingConfiguration;

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

    public AssetBundleImportJobDashboardOverridePermissions withDashboardIds(String... dashboardIds) {
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

    public AssetBundleImportJobDashboardOverridePermissions withDashboardIds(java.util.Collection<String> dashboardIds) {
        setDashboardIds(dashboardIds);
        return this;
    }

    /**
     * <p>
     * A list of permissions for the dashboards that you want to apply overrides to.
     * </p>
     * 
     * @param permissions
     *        A list of permissions for the dashboards that you want to apply overrides to.
     */

    public void setPermissions(AssetBundleResourcePermissions permissions) {
        this.permissions = permissions;
    }

    /**
     * <p>
     * A list of permissions for the dashboards that you want to apply overrides to.
     * </p>
     * 
     * @return A list of permissions for the dashboards that you want to apply overrides to.
     */

    public AssetBundleResourcePermissions getPermissions() {
        return this.permissions;
    }

    /**
     * <p>
     * A list of permissions for the dashboards that you want to apply overrides to.
     * </p>
     * 
     * @param permissions
     *        A list of permissions for the dashboards that you want to apply overrides to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDashboardOverridePermissions withPermissions(AssetBundleResourcePermissions permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * A structure that contains the link sharing configurations that you want to apply overrides to.
     * </p>
     * 
     * @param linkSharingConfiguration
     *        A structure that contains the link sharing configurations that you want to apply overrides to.
     */

    public void setLinkSharingConfiguration(AssetBundleResourceLinkSharingConfiguration linkSharingConfiguration) {
        this.linkSharingConfiguration = linkSharingConfiguration;
    }

    /**
     * <p>
     * A structure that contains the link sharing configurations that you want to apply overrides to.
     * </p>
     * 
     * @return A structure that contains the link sharing configurations that you want to apply overrides to.
     */

    public AssetBundleResourceLinkSharingConfiguration getLinkSharingConfiguration() {
        return this.linkSharingConfiguration;
    }

    /**
     * <p>
     * A structure that contains the link sharing configurations that you want to apply overrides to.
     * </p>
     * 
     * @param linkSharingConfiguration
     *        A structure that contains the link sharing configurations that you want to apply overrides to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDashboardOverridePermissions withLinkSharingConfiguration(AssetBundleResourceLinkSharingConfiguration linkSharingConfiguration) {
        setLinkSharingConfiguration(linkSharingConfiguration);
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
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getLinkSharingConfiguration() != null)
            sb.append("LinkSharingConfiguration: ").append(getLinkSharingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleImportJobDashboardOverridePermissions == false)
            return false;
        AssetBundleImportJobDashboardOverridePermissions other = (AssetBundleImportJobDashboardOverridePermissions) obj;
        if (other.getDashboardIds() == null ^ this.getDashboardIds() == null)
            return false;
        if (other.getDashboardIds() != null && other.getDashboardIds().equals(this.getDashboardIds()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getLinkSharingConfiguration() == null ^ this.getLinkSharingConfiguration() == null)
            return false;
        if (other.getLinkSharingConfiguration() != null && other.getLinkSharingConfiguration().equals(this.getLinkSharingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardIds() == null) ? 0 : getDashboardIds().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getLinkSharingConfiguration() == null) ? 0 : getLinkSharingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportJobDashboardOverridePermissions clone() {
        try {
            return (AssetBundleImportJobDashboardOverridePermissions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportJobDashboardOverridePermissionsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
