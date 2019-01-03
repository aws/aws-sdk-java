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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachDisk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachDiskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     */
    private String diskName;
    /**
     * <p>
     * The name of the Lightsail instance where you want to utilize the storage disk.
     * </p>
     */
    private String instanceName;
    /**
     * <p>
     * The disk path to expose to the instance (e.g., <code>/dev/xvdf</code>).
     * </p>
     */
    private String diskPath;

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * 
     * @param diskName
     *        The unique Lightsail disk name (e.g., <code>my-disk</code>).
     */

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * 
     * @return The unique Lightsail disk name (e.g., <code>my-disk</code>).
     */

    public String getDiskName() {
        return this.diskName;
    }

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * 
     * @param diskName
     *        The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachDiskRequest withDiskName(String diskName) {
        setDiskName(diskName);
        return this;
    }

    /**
     * <p>
     * The name of the Lightsail instance where you want to utilize the storage disk.
     * </p>
     * 
     * @param instanceName
     *        The name of the Lightsail instance where you want to utilize the storage disk.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the Lightsail instance where you want to utilize the storage disk.
     * </p>
     * 
     * @return The name of the Lightsail instance where you want to utilize the storage disk.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The name of the Lightsail instance where you want to utilize the storage disk.
     * </p>
     * 
     * @param instanceName
     *        The name of the Lightsail instance where you want to utilize the storage disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachDiskRequest withInstanceName(String instanceName) {
        setInstanceName(instanceName);
        return this;
    }

    /**
     * <p>
     * The disk path to expose to the instance (e.g., <code>/dev/xvdf</code>).
     * </p>
     * 
     * @param diskPath
     *        The disk path to expose to the instance (e.g., <code>/dev/xvdf</code>).
     */

    public void setDiskPath(String diskPath) {
        this.diskPath = diskPath;
    }

    /**
     * <p>
     * The disk path to expose to the instance (e.g., <code>/dev/xvdf</code>).
     * </p>
     * 
     * @return The disk path to expose to the instance (e.g., <code>/dev/xvdf</code>).
     */

    public String getDiskPath() {
        return this.diskPath;
    }

    /**
     * <p>
     * The disk path to expose to the instance (e.g., <code>/dev/xvdf</code>).
     * </p>
     * 
     * @param diskPath
     *        The disk path to expose to the instance (e.g., <code>/dev/xvdf</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachDiskRequest withDiskPath(String diskPath) {
        setDiskPath(diskPath);
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
        if (getDiskName() != null)
            sb.append("DiskName: ").append(getDiskName()).append(",");
        if (getInstanceName() != null)
            sb.append("InstanceName: ").append(getInstanceName()).append(",");
        if (getDiskPath() != null)
            sb.append("DiskPath: ").append(getDiskPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachDiskRequest == false)
            return false;
        AttachDiskRequest other = (AttachDiskRequest) obj;
        if (other.getDiskName() == null ^ this.getDiskName() == null)
            return false;
        if (other.getDiskName() != null && other.getDiskName().equals(this.getDiskName()) == false)
            return false;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getDiskPath() == null ^ this.getDiskPath() == null)
            return false;
        if (other.getDiskPath() != null && other.getDiskPath().equals(this.getDiskPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiskName() == null) ? 0 : getDiskName().hashCode());
        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getDiskPath() == null) ? 0 : getDiskPath().hashCode());
        return hashCode;
    }

    @Override
    public AttachDiskRequest clone() {
        return (AttachDiskRequest) super.clone();
    }

}
