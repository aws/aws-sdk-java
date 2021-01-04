/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/FileSystemConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileSystemConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path within the image to mount the user's EFS home directory. The directory should be empty. If not
     * specified, defaults to <i>/home/sagemaker-user</i>.
     * </p>
     */
    private String mountPath;
    /**
     * <p>
     * The default POSIX user ID (UID). If not specified, defaults to <code>1000</code>.
     * </p>
     */
    private Integer defaultUid;
    /**
     * <p>
     * The default POSIX group ID (GID). If not specified, defaults to <code>100</code>.
     * </p>
     */
    private Integer defaultGid;

    /**
     * <p>
     * The path within the image to mount the user's EFS home directory. The directory should be empty. If not
     * specified, defaults to <i>/home/sagemaker-user</i>.
     * </p>
     * 
     * @param mountPath
     *        The path within the image to mount the user's EFS home directory. The directory should be empty. If not
     *        specified, defaults to <i>/home/sagemaker-user</i>.
     */

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    /**
     * <p>
     * The path within the image to mount the user's EFS home directory. The directory should be empty. If not
     * specified, defaults to <i>/home/sagemaker-user</i>.
     * </p>
     * 
     * @return The path within the image to mount the user's EFS home directory. The directory should be empty. If not
     *         specified, defaults to <i>/home/sagemaker-user</i>.
     */

    public String getMountPath() {
        return this.mountPath;
    }

    /**
     * <p>
     * The path within the image to mount the user's EFS home directory. The directory should be empty. If not
     * specified, defaults to <i>/home/sagemaker-user</i>.
     * </p>
     * 
     * @param mountPath
     *        The path within the image to mount the user's EFS home directory. The directory should be empty. If not
     *        specified, defaults to <i>/home/sagemaker-user</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemConfig withMountPath(String mountPath) {
        setMountPath(mountPath);
        return this;
    }

    /**
     * <p>
     * The default POSIX user ID (UID). If not specified, defaults to <code>1000</code>.
     * </p>
     * 
     * @param defaultUid
     *        The default POSIX user ID (UID). If not specified, defaults to <code>1000</code>.
     */

    public void setDefaultUid(Integer defaultUid) {
        this.defaultUid = defaultUid;
    }

    /**
     * <p>
     * The default POSIX user ID (UID). If not specified, defaults to <code>1000</code>.
     * </p>
     * 
     * @return The default POSIX user ID (UID). If not specified, defaults to <code>1000</code>.
     */

    public Integer getDefaultUid() {
        return this.defaultUid;
    }

    /**
     * <p>
     * The default POSIX user ID (UID). If not specified, defaults to <code>1000</code>.
     * </p>
     * 
     * @param defaultUid
     *        The default POSIX user ID (UID). If not specified, defaults to <code>1000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemConfig withDefaultUid(Integer defaultUid) {
        setDefaultUid(defaultUid);
        return this;
    }

    /**
     * <p>
     * The default POSIX group ID (GID). If not specified, defaults to <code>100</code>.
     * </p>
     * 
     * @param defaultGid
     *        The default POSIX group ID (GID). If not specified, defaults to <code>100</code>.
     */

    public void setDefaultGid(Integer defaultGid) {
        this.defaultGid = defaultGid;
    }

    /**
     * <p>
     * The default POSIX group ID (GID). If not specified, defaults to <code>100</code>.
     * </p>
     * 
     * @return The default POSIX group ID (GID). If not specified, defaults to <code>100</code>.
     */

    public Integer getDefaultGid() {
        return this.defaultGid;
    }

    /**
     * <p>
     * The default POSIX group ID (GID). If not specified, defaults to <code>100</code>.
     * </p>
     * 
     * @param defaultGid
     *        The default POSIX group ID (GID). If not specified, defaults to <code>100</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemConfig withDefaultGid(Integer defaultGid) {
        setDefaultGid(defaultGid);
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
        if (getMountPath() != null)
            sb.append("MountPath: ").append(getMountPath()).append(",");
        if (getDefaultUid() != null)
            sb.append("DefaultUid: ").append(getDefaultUid()).append(",");
        if (getDefaultGid() != null)
            sb.append("DefaultGid: ").append(getDefaultGid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSystemConfig == false)
            return false;
        FileSystemConfig other = (FileSystemConfig) obj;
        if (other.getMountPath() == null ^ this.getMountPath() == null)
            return false;
        if (other.getMountPath() != null && other.getMountPath().equals(this.getMountPath()) == false)
            return false;
        if (other.getDefaultUid() == null ^ this.getDefaultUid() == null)
            return false;
        if (other.getDefaultUid() != null && other.getDefaultUid().equals(this.getDefaultUid()) == false)
            return false;
        if (other.getDefaultGid() == null ^ this.getDefaultGid() == null)
            return false;
        if (other.getDefaultGid() != null && other.getDefaultGid().equals(this.getDefaultGid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMountPath() == null) ? 0 : getMountPath().hashCode());
        hashCode = prime * hashCode + ((getDefaultUid() == null) ? 0 : getDefaultUid().hashCode());
        hashCode = prime * hashCode + ((getDefaultGid() == null) ? 0 : getDefaultGid().hashCode());
        return hashCode;
    }

    @Override
    public FileSystemConfig clone() {
        try {
            return (FileSystemConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.FileSystemConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
