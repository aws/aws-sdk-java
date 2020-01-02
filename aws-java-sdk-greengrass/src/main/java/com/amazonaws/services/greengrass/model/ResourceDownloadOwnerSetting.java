/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The owner setting for downloaded machine learning resources.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ResourceDownloadOwnerSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDownloadOwnerSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * The group owner of the resource. This is the name of an existing Linux OS group on the system or a GID. The
     * group's permissions are added to the Lambda process.
     */
    private String groupOwner;
    /**
     * The permissions that the group owner has to the resource. Valid values are ''rw'' (read/write) or ''ro''
     * (read-only).
     */
    private String groupPermission;

    /**
     * The group owner of the resource. This is the name of an existing Linux OS group on the system or a GID. The
     * group's permissions are added to the Lambda process.
     * 
     * @param groupOwner
     *        The group owner of the resource. This is the name of an existing Linux OS group on the system or a GID.
     *        The group's permissions are added to the Lambda process.
     */

    public void setGroupOwner(String groupOwner) {
        this.groupOwner = groupOwner;
    }

    /**
     * The group owner of the resource. This is the name of an existing Linux OS group on the system or a GID. The
     * group's permissions are added to the Lambda process.
     * 
     * @return The group owner of the resource. This is the name of an existing Linux OS group on the system or a GID.
     *         The group's permissions are added to the Lambda process.
     */

    public String getGroupOwner() {
        return this.groupOwner;
    }

    /**
     * The group owner of the resource. This is the name of an existing Linux OS group on the system or a GID. The
     * group's permissions are added to the Lambda process.
     * 
     * @param groupOwner
     *        The group owner of the resource. This is the name of an existing Linux OS group on the system or a GID.
     *        The group's permissions are added to the Lambda process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDownloadOwnerSetting withGroupOwner(String groupOwner) {
        setGroupOwner(groupOwner);
        return this;
    }

    /**
     * The permissions that the group owner has to the resource. Valid values are ''rw'' (read/write) or ''ro''
     * (read-only).
     * 
     * @param groupPermission
     *        The permissions that the group owner has to the resource. Valid values are ''rw'' (read/write) or ''ro''
     *        (read-only).
     * @see Permission
     */

    public void setGroupPermission(String groupPermission) {
        this.groupPermission = groupPermission;
    }

    /**
     * The permissions that the group owner has to the resource. Valid values are ''rw'' (read/write) or ''ro''
     * (read-only).
     * 
     * @return The permissions that the group owner has to the resource. Valid values are ''rw'' (read/write) or ''ro''
     *         (read-only).
     * @see Permission
     */

    public String getGroupPermission() {
        return this.groupPermission;
    }

    /**
     * The permissions that the group owner has to the resource. Valid values are ''rw'' (read/write) or ''ro''
     * (read-only).
     * 
     * @param groupPermission
     *        The permissions that the group owner has to the resource. Valid values are ''rw'' (read/write) or ''ro''
     *        (read-only).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public ResourceDownloadOwnerSetting withGroupPermission(String groupPermission) {
        setGroupPermission(groupPermission);
        return this;
    }

    /**
     * The permissions that the group owner has to the resource. Valid values are ''rw'' (read/write) or ''ro''
     * (read-only).
     * 
     * @param groupPermission
     *        The permissions that the group owner has to the resource. Valid values are ''rw'' (read/write) or ''ro''
     *        (read-only).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public ResourceDownloadOwnerSetting withGroupPermission(Permission groupPermission) {
        this.groupPermission = groupPermission.toString();
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
        if (getGroupOwner() != null)
            sb.append("GroupOwner: ").append(getGroupOwner()).append(",");
        if (getGroupPermission() != null)
            sb.append("GroupPermission: ").append(getGroupPermission());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDownloadOwnerSetting == false)
            return false;
        ResourceDownloadOwnerSetting other = (ResourceDownloadOwnerSetting) obj;
        if (other.getGroupOwner() == null ^ this.getGroupOwner() == null)
            return false;
        if (other.getGroupOwner() != null && other.getGroupOwner().equals(this.getGroupOwner()) == false)
            return false;
        if (other.getGroupPermission() == null ^ this.getGroupPermission() == null)
            return false;
        if (other.getGroupPermission() != null && other.getGroupPermission().equals(this.getGroupPermission()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupOwner() == null) ? 0 : getGroupOwner().hashCode());
        hashCode = prime * hashCode + ((getGroupPermission() == null) ? 0 : getGroupPermission().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDownloadOwnerSetting clone() {
        try {
            return (ResourceDownloadOwnerSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.ResourceDownloadOwnerSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
