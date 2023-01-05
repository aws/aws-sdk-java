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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the directory on the Amazon EFS file system that the access point exposes as the root
 * directory to NFS clients using the access point.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEfsAccessPointRootDirectoryDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEfsAccessPointRootDirectoryDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the POSIX IDs and permissions to apply to the access point's root directory.
     * </p>
     */
    private AwsEfsAccessPointRootDirectoryCreationInfoDetails creationInfo;
    /**
     * <p>
     * Specifies the path on the Amazon EFS file system to expose as the root directory to NFS clients using the access
     * point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not
     * exist, you are required to provide <code>CreationInfo</code>.
     * </p>
     */
    private String path;

    /**
     * <p>
     * Specifies the POSIX IDs and permissions to apply to the access point's root directory.
     * </p>
     * 
     * @param creationInfo
     *        Specifies the POSIX IDs and permissions to apply to the access point's root directory.
     */

    public void setCreationInfo(AwsEfsAccessPointRootDirectoryCreationInfoDetails creationInfo) {
        this.creationInfo = creationInfo;
    }

    /**
     * <p>
     * Specifies the POSIX IDs and permissions to apply to the access point's root directory.
     * </p>
     * 
     * @return Specifies the POSIX IDs and permissions to apply to the access point's root directory.
     */

    public AwsEfsAccessPointRootDirectoryCreationInfoDetails getCreationInfo() {
        return this.creationInfo;
    }

    /**
     * <p>
     * Specifies the POSIX IDs and permissions to apply to the access point's root directory.
     * </p>
     * 
     * @param creationInfo
     *        Specifies the POSIX IDs and permissions to apply to the access point's root directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEfsAccessPointRootDirectoryDetails withCreationInfo(AwsEfsAccessPointRootDirectoryCreationInfoDetails creationInfo) {
        setCreationInfo(creationInfo);
        return this;
    }

    /**
     * <p>
     * Specifies the path on the Amazon EFS file system to expose as the root directory to NFS clients using the access
     * point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not
     * exist, you are required to provide <code>CreationInfo</code>.
     * </p>
     * 
     * @param path
     *        Specifies the path on the Amazon EFS file system to expose as the root directory to NFS clients using the
     *        access point to access the EFS file system. A path can have up to four subdirectories. If the specified
     *        path does not exist, you are required to provide <code>CreationInfo</code>.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * Specifies the path on the Amazon EFS file system to expose as the root directory to NFS clients using the access
     * point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not
     * exist, you are required to provide <code>CreationInfo</code>.
     * </p>
     * 
     * @return Specifies the path on the Amazon EFS file system to expose as the root directory to NFS clients using the
     *         access point to access the EFS file system. A path can have up to four subdirectories. If the specified
     *         path does not exist, you are required to provide <code>CreationInfo</code>.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * Specifies the path on the Amazon EFS file system to expose as the root directory to NFS clients using the access
     * point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not
     * exist, you are required to provide <code>CreationInfo</code>.
     * </p>
     * 
     * @param path
     *        Specifies the path on the Amazon EFS file system to expose as the root directory to NFS clients using the
     *        access point to access the EFS file system. A path can have up to four subdirectories. If the specified
     *        path does not exist, you are required to provide <code>CreationInfo</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEfsAccessPointRootDirectoryDetails withPath(String path) {
        setPath(path);
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
        if (getCreationInfo() != null)
            sb.append("CreationInfo: ").append(getCreationInfo()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEfsAccessPointRootDirectoryDetails == false)
            return false;
        AwsEfsAccessPointRootDirectoryDetails other = (AwsEfsAccessPointRootDirectoryDetails) obj;
        if (other.getCreationInfo() == null ^ this.getCreationInfo() == null)
            return false;
        if (other.getCreationInfo() != null && other.getCreationInfo().equals(this.getCreationInfo()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationInfo() == null) ? 0 : getCreationInfo().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public AwsEfsAccessPointRootDirectoryDetails clone() {
        try {
            return (AwsEfsAccessPointRootDirectoryDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEfsAccessPointRootDirectoryDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
