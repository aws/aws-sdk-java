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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Permission group parameters for Dataset permissions.
 * </p>
 * <p>
 * Here is an example of how you could specify the <code>PermissionGroupParams</code>:
 * </p>
 * <p>
 * <code> { "permissionGroupId": "0r6fCRtSTUk4XPfXQe3M0g", "datasetPermissions": [ {"permission": "ViewDatasetDetails"}, {"permission": "AddDatasetData"}, {"permission": "EditDatasetMetadata"}, {"permission": "DeleteDataset"} ] } </code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/PermissionGroupParams" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PermissionGroupParams implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the <code>PermissionGroup</code>.
     * </p>
     */
    private String permissionGroupId;
    /**
     * <p>
     * List of resource permissions.
     * </p>
     */
    private java.util.List<ResourcePermission> datasetPermissions;

    /**
     * <p>
     * The unique identifier for the <code>PermissionGroup</code>.
     * </p>
     * 
     * @param permissionGroupId
     *        The unique identifier for the <code>PermissionGroup</code>.
     */

    public void setPermissionGroupId(String permissionGroupId) {
        this.permissionGroupId = permissionGroupId;
    }

    /**
     * <p>
     * The unique identifier for the <code>PermissionGroup</code>.
     * </p>
     * 
     * @return The unique identifier for the <code>PermissionGroup</code>.
     */

    public String getPermissionGroupId() {
        return this.permissionGroupId;
    }

    /**
     * <p>
     * The unique identifier for the <code>PermissionGroup</code>.
     * </p>
     * 
     * @param permissionGroupId
     *        The unique identifier for the <code>PermissionGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PermissionGroupParams withPermissionGroupId(String permissionGroupId) {
        setPermissionGroupId(permissionGroupId);
        return this;
    }

    /**
     * <p>
     * List of resource permissions.
     * </p>
     * 
     * @return List of resource permissions.
     */

    public java.util.List<ResourcePermission> getDatasetPermissions() {
        return datasetPermissions;
    }

    /**
     * <p>
     * List of resource permissions.
     * </p>
     * 
     * @param datasetPermissions
     *        List of resource permissions.
     */

    public void setDatasetPermissions(java.util.Collection<ResourcePermission> datasetPermissions) {
        if (datasetPermissions == null) {
            this.datasetPermissions = null;
            return;
        }

        this.datasetPermissions = new java.util.ArrayList<ResourcePermission>(datasetPermissions);
    }

    /**
     * <p>
     * List of resource permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasetPermissions(java.util.Collection)} or {@link #withDatasetPermissions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param datasetPermissions
     *        List of resource permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PermissionGroupParams withDatasetPermissions(ResourcePermission... datasetPermissions) {
        if (this.datasetPermissions == null) {
            setDatasetPermissions(new java.util.ArrayList<ResourcePermission>(datasetPermissions.length));
        }
        for (ResourcePermission ele : datasetPermissions) {
            this.datasetPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of resource permissions.
     * </p>
     * 
     * @param datasetPermissions
     *        List of resource permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PermissionGroupParams withDatasetPermissions(java.util.Collection<ResourcePermission> datasetPermissions) {
        setDatasetPermissions(datasetPermissions);
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
        if (getPermissionGroupId() != null)
            sb.append("PermissionGroupId: ").append(getPermissionGroupId()).append(",");
        if (getDatasetPermissions() != null)
            sb.append("DatasetPermissions: ").append(getDatasetPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PermissionGroupParams == false)
            return false;
        PermissionGroupParams other = (PermissionGroupParams) obj;
        if (other.getPermissionGroupId() == null ^ this.getPermissionGroupId() == null)
            return false;
        if (other.getPermissionGroupId() != null && other.getPermissionGroupId().equals(this.getPermissionGroupId()) == false)
            return false;
        if (other.getDatasetPermissions() == null ^ this.getDatasetPermissions() == null)
            return false;
        if (other.getDatasetPermissions() != null && other.getDatasetPermissions().equals(this.getDatasetPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissionGroupId() == null) ? 0 : getPermissionGroupId().hashCode());
        hashCode = prime * hashCode + ((getDatasetPermissions() == null) ? 0 : getDatasetPermissions().hashCode());
        return hashCode;
    }

    @Override
    public PermissionGroupParams clone() {
        try {
            return (PermissionGroupParams) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspacedata.model.transform.PermissionGroupParamsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
