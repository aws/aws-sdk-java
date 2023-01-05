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
 * Resource permission for a dataset. When you create a dataset, all the other members of the same user group inherit
 * access to the dataset. You can only create a dataset if your user group has application permission for Create
 * Datasets.
 * </p>
 * <p>
 * The following is a list of valid dataset permissions that you can apply:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ViewDatasetDetails</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ReadDatasetDetails</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AddDatasetData</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateDataView</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>EditDatasetMetadata</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteDataset</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information on the dataset permissions, see <a href=
 * "https://docs.aws.amazon.com/finspace/latest/userguide/managing-user-permissions.html#supported-dataset-permissions"
 * >Supported Dataset Permissions</a> in the FinSpace User Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ResourcePermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcePermission implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Permission for a resource.
     * </p>
     */
    private String permission;

    /**
     * <p>
     * Permission for a resource.
     * </p>
     * 
     * @param permission
     *        Permission for a resource.
     */

    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p>
     * Permission for a resource.
     * </p>
     * 
     * @return Permission for a resource.
     */

    public String getPermission() {
        return this.permission;
    }

    /**
     * <p>
     * Permission for a resource.
     * </p>
     * 
     * @param permission
     *        Permission for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePermission withPermission(String permission) {
        setPermission(permission);
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
        if (getPermission() != null)
            sb.append("Permission: ").append(getPermission());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcePermission == false)
            return false;
        ResourcePermission other = (ResourcePermission) obj;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null && other.getPermission().equals(this.getPermission()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        return hashCode;
    }

    @Override
    public ResourcePermission clone() {
        try {
            return (ResourcePermission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspacedata.model.transform.ResourcePermissionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
