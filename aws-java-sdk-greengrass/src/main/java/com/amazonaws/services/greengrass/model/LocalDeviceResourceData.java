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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Attributes that define a local device resource.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/LocalDeviceResourceData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocalDeviceResourceData implements Serializable, Cloneable, StructuredPojo {

    /** Group/owner related settings for local resources. */
    private GroupOwnerSetting groupOwnerSetting;
    /**
     * The local absolute path of the device resource. The source path for a device resource can refer only to a
     * character device or block device under ''/dev''.
     */
    private String sourcePath;

    /**
     * Group/owner related settings for local resources.
     * 
     * @param groupOwnerSetting
     *        Group/owner related settings for local resources.
     */

    public void setGroupOwnerSetting(GroupOwnerSetting groupOwnerSetting) {
        this.groupOwnerSetting = groupOwnerSetting;
    }

    /**
     * Group/owner related settings for local resources.
     * 
     * @return Group/owner related settings for local resources.
     */

    public GroupOwnerSetting getGroupOwnerSetting() {
        return this.groupOwnerSetting;
    }

    /**
     * Group/owner related settings for local resources.
     * 
     * @param groupOwnerSetting
     *        Group/owner related settings for local resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalDeviceResourceData withGroupOwnerSetting(GroupOwnerSetting groupOwnerSetting) {
        setGroupOwnerSetting(groupOwnerSetting);
        return this;
    }

    /**
     * The local absolute path of the device resource. The source path for a device resource can refer only to a
     * character device or block device under ''/dev''.
     * 
     * @param sourcePath
     *        The local absolute path of the device resource. The source path for a device resource can refer only to a
     *        character device or block device under ''/dev''.
     */

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    /**
     * The local absolute path of the device resource. The source path for a device resource can refer only to a
     * character device or block device under ''/dev''.
     * 
     * @return The local absolute path of the device resource. The source path for a device resource can refer only to a
     *         character device or block device under ''/dev''.
     */

    public String getSourcePath() {
        return this.sourcePath;
    }

    /**
     * The local absolute path of the device resource. The source path for a device resource can refer only to a
     * character device or block device under ''/dev''.
     * 
     * @param sourcePath
     *        The local absolute path of the device resource. The source path for a device resource can refer only to a
     *        character device or block device under ''/dev''.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalDeviceResourceData withSourcePath(String sourcePath) {
        setSourcePath(sourcePath);
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
        if (getGroupOwnerSetting() != null)
            sb.append("GroupOwnerSetting: ").append(getGroupOwnerSetting()).append(",");
        if (getSourcePath() != null)
            sb.append("SourcePath: ").append(getSourcePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalDeviceResourceData == false)
            return false;
        LocalDeviceResourceData other = (LocalDeviceResourceData) obj;
        if (other.getGroupOwnerSetting() == null ^ this.getGroupOwnerSetting() == null)
            return false;
        if (other.getGroupOwnerSetting() != null && other.getGroupOwnerSetting().equals(this.getGroupOwnerSetting()) == false)
            return false;
        if (other.getSourcePath() == null ^ this.getSourcePath() == null)
            return false;
        if (other.getSourcePath() != null && other.getSourcePath().equals(this.getSourcePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupOwnerSetting() == null) ? 0 : getGroupOwnerSetting().hashCode());
        hashCode = prime * hashCode + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode());
        return hashCode;
    }

    @Override
    public LocalDeviceResourceData clone() {
        try {
            return (LocalDeviceResourceData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.LocalDeviceResourceDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
