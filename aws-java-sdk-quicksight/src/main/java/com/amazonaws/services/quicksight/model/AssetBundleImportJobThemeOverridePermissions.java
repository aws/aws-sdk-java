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
 * An object that contains a list of permissions to be applied to a list of theme IDs.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportJobThemeOverridePermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobThemeOverridePermissions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of theme IDs that you want to apply overrides to. You can use <code>*</code> to override all themes in
     * this asset bundle.
     * </p>
     */
    private java.util.List<String> themeIds;
    /**
     * <p>
     * A list of permissions for the themes that you want to apply overrides to.
     * </p>
     */
    private AssetBundleResourcePermissions permissions;

    /**
     * <p>
     * A list of theme IDs that you want to apply overrides to. You can use <code>*</code> to override all themes in
     * this asset bundle.
     * </p>
     * 
     * @return A list of theme IDs that you want to apply overrides to. You can use <code>*</code> to override all
     *         themes in this asset bundle.
     */

    public java.util.List<String> getThemeIds() {
        return themeIds;
    }

    /**
     * <p>
     * A list of theme IDs that you want to apply overrides to. You can use <code>*</code> to override all themes in
     * this asset bundle.
     * </p>
     * 
     * @param themeIds
     *        A list of theme IDs that you want to apply overrides to. You can use <code>*</code> to override all themes
     *        in this asset bundle.
     */

    public void setThemeIds(java.util.Collection<String> themeIds) {
        if (themeIds == null) {
            this.themeIds = null;
            return;
        }

        this.themeIds = new java.util.ArrayList<String>(themeIds);
    }

    /**
     * <p>
     * A list of theme IDs that you want to apply overrides to. You can use <code>*</code> to override all themes in
     * this asset bundle.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThemeIds(java.util.Collection)} or {@link #withThemeIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param themeIds
     *        A list of theme IDs that you want to apply overrides to. You can use <code>*</code> to override all themes
     *        in this asset bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobThemeOverridePermissions withThemeIds(String... themeIds) {
        if (this.themeIds == null) {
            setThemeIds(new java.util.ArrayList<String>(themeIds.length));
        }
        for (String ele : themeIds) {
            this.themeIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of theme IDs that you want to apply overrides to. You can use <code>*</code> to override all themes in
     * this asset bundle.
     * </p>
     * 
     * @param themeIds
     *        A list of theme IDs that you want to apply overrides to. You can use <code>*</code> to override all themes
     *        in this asset bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobThemeOverridePermissions withThemeIds(java.util.Collection<String> themeIds) {
        setThemeIds(themeIds);
        return this;
    }

    /**
     * <p>
     * A list of permissions for the themes that you want to apply overrides to.
     * </p>
     * 
     * @param permissions
     *        A list of permissions for the themes that you want to apply overrides to.
     */

    public void setPermissions(AssetBundleResourcePermissions permissions) {
        this.permissions = permissions;
    }

    /**
     * <p>
     * A list of permissions for the themes that you want to apply overrides to.
     * </p>
     * 
     * @return A list of permissions for the themes that you want to apply overrides to.
     */

    public AssetBundleResourcePermissions getPermissions() {
        return this.permissions;
    }

    /**
     * <p>
     * A list of permissions for the themes that you want to apply overrides to.
     * </p>
     * 
     * @param permissions
     *        A list of permissions for the themes that you want to apply overrides to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobThemeOverridePermissions withPermissions(AssetBundleResourcePermissions permissions) {
        setPermissions(permissions);
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
        if (getThemeIds() != null)
            sb.append("ThemeIds: ").append(getThemeIds()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleImportJobThemeOverridePermissions == false)
            return false;
        AssetBundleImportJobThemeOverridePermissions other = (AssetBundleImportJobThemeOverridePermissions) obj;
        if (other.getThemeIds() == null ^ this.getThemeIds() == null)
            return false;
        if (other.getThemeIds() != null && other.getThemeIds().equals(this.getThemeIds()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThemeIds() == null) ? 0 : getThemeIds().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportJobThemeOverridePermissions clone() {
        try {
            return (AssetBundleImportJobThemeOverridePermissions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportJobThemeOverridePermissionsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
