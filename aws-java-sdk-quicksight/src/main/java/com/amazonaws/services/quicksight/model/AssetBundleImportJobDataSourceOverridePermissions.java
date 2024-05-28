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
 * An object that contains a list of permissions to be applied to a list of data source IDs.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportJobDataSourceOverridePermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobDataSourceOverridePermissions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of data source IDs that you want to apply overrides to. You can use <code>*</code> to override all data
     * sources in this asset bundle.
     * </p>
     */
    private java.util.List<String> dataSourceIds;
    /**
     * <p>
     * A list of permissions for the data source that you want to apply overrides to.
     * </p>
     */
    private AssetBundleResourcePermissions permissions;

    /**
     * <p>
     * A list of data source IDs that you want to apply overrides to. You can use <code>*</code> to override all data
     * sources in this asset bundle.
     * </p>
     * 
     * @return A list of data source IDs that you want to apply overrides to. You can use <code>*</code> to override all
     *         data sources in this asset bundle.
     */

    public java.util.List<String> getDataSourceIds() {
        return dataSourceIds;
    }

    /**
     * <p>
     * A list of data source IDs that you want to apply overrides to. You can use <code>*</code> to override all data
     * sources in this asset bundle.
     * </p>
     * 
     * @param dataSourceIds
     *        A list of data source IDs that you want to apply overrides to. You can use <code>*</code> to override all
     *        data sources in this asset bundle.
     */

    public void setDataSourceIds(java.util.Collection<String> dataSourceIds) {
        if (dataSourceIds == null) {
            this.dataSourceIds = null;
            return;
        }

        this.dataSourceIds = new java.util.ArrayList<String>(dataSourceIds);
    }

    /**
     * <p>
     * A list of data source IDs that you want to apply overrides to. You can use <code>*</code> to override all data
     * sources in this asset bundle.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSourceIds(java.util.Collection)} or {@link #withDataSourceIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dataSourceIds
     *        A list of data source IDs that you want to apply overrides to. You can use <code>*</code> to override all
     *        data sources in this asset bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDataSourceOverridePermissions withDataSourceIds(String... dataSourceIds) {
        if (this.dataSourceIds == null) {
            setDataSourceIds(new java.util.ArrayList<String>(dataSourceIds.length));
        }
        for (String ele : dataSourceIds) {
            this.dataSourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of data source IDs that you want to apply overrides to. You can use <code>*</code> to override all data
     * sources in this asset bundle.
     * </p>
     * 
     * @param dataSourceIds
     *        A list of data source IDs that you want to apply overrides to. You can use <code>*</code> to override all
     *        data sources in this asset bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDataSourceOverridePermissions withDataSourceIds(java.util.Collection<String> dataSourceIds) {
        setDataSourceIds(dataSourceIds);
        return this;
    }

    /**
     * <p>
     * A list of permissions for the data source that you want to apply overrides to.
     * </p>
     * 
     * @param permissions
     *        A list of permissions for the data source that you want to apply overrides to.
     */

    public void setPermissions(AssetBundleResourcePermissions permissions) {
        this.permissions = permissions;
    }

    /**
     * <p>
     * A list of permissions for the data source that you want to apply overrides to.
     * </p>
     * 
     * @return A list of permissions for the data source that you want to apply overrides to.
     */

    public AssetBundleResourcePermissions getPermissions() {
        return this.permissions;
    }

    /**
     * <p>
     * A list of permissions for the data source that you want to apply overrides to.
     * </p>
     * 
     * @param permissions
     *        A list of permissions for the data source that you want to apply overrides to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDataSourceOverridePermissions withPermissions(AssetBundleResourcePermissions permissions) {
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
        if (getDataSourceIds() != null)
            sb.append("DataSourceIds: ").append(getDataSourceIds()).append(",");
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

        if (obj instanceof AssetBundleImportJobDataSourceOverridePermissions == false)
            return false;
        AssetBundleImportJobDataSourceOverridePermissions other = (AssetBundleImportJobDataSourceOverridePermissions) obj;
        if (other.getDataSourceIds() == null ^ this.getDataSourceIds() == null)
            return false;
        if (other.getDataSourceIds() != null && other.getDataSourceIds().equals(this.getDataSourceIds()) == false)
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

        hashCode = prime * hashCode + ((getDataSourceIds() == null) ? 0 : getDataSourceIds().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportJobDataSourceOverridePermissions clone() {
        try {
            return (AssetBundleImportJobDataSourceOverridePermissions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportJobDataSourceOverridePermissionsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
