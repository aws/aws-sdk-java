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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationNfs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLocationNfsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the NFS transfer location that you want to update.
     * </p>
     */
    private String locationArn;
    /**
     * <p>
     * Specifies the export path in your NFS file server that you want DataSync to mount.
     * </p>
     * <p>
     * This path (or a subdirectory of the path) is where DataSync transfers data to or from. For information on
     * configuring an export for DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs">Accessing NFS
     * file servers</a>.
     * </p>
     */
    private String subdirectory;

    private OnPremConfig onPremConfig;

    private NfsMountOptions mountOptions;

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the NFS transfer location that you want to update.
     * </p>
     * 
     * @param locationArn
     *        Specifies the Amazon Resource Name (ARN) of the NFS transfer location that you want to update.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the NFS transfer location that you want to update.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the NFS transfer location that you want to update.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the NFS transfer location that you want to update.
     * </p>
     * 
     * @param locationArn
     *        Specifies the Amazon Resource Name (ARN) of the NFS transfer location that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationNfsRequest withLocationArn(String locationArn) {
        setLocationArn(locationArn);
        return this;
    }

    /**
     * <p>
     * Specifies the export path in your NFS file server that you want DataSync to mount.
     * </p>
     * <p>
     * This path (or a subdirectory of the path) is where DataSync transfers data to or from. For information on
     * configuring an export for DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs">Accessing NFS
     * file servers</a>.
     * </p>
     * 
     * @param subdirectory
     *        Specifies the export path in your NFS file server that you want DataSync to mount.</p>
     *        <p>
     *        This path (or a subdirectory of the path) is where DataSync transfers data to or from. For information on
     *        configuring an export for DataSync, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs"
     *        >Accessing NFS file servers</a>.
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * Specifies the export path in your NFS file server that you want DataSync to mount.
     * </p>
     * <p>
     * This path (or a subdirectory of the path) is where DataSync transfers data to or from. For information on
     * configuring an export for DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs">Accessing NFS
     * file servers</a>.
     * </p>
     * 
     * @return Specifies the export path in your NFS file server that you want DataSync to mount.</p>
     *         <p>
     *         This path (or a subdirectory of the path) is where DataSync transfers data to or from. For information on
     *         configuring an export for DataSync, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs"
     *         >Accessing NFS file servers</a>.
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * Specifies the export path in your NFS file server that you want DataSync to mount.
     * </p>
     * <p>
     * This path (or a subdirectory of the path) is where DataSync transfers data to or from. For information on
     * configuring an export for DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs">Accessing NFS
     * file servers</a>.
     * </p>
     * 
     * @param subdirectory
     *        Specifies the export path in your NFS file server that you want DataSync to mount.</p>
     *        <p>
     *        This path (or a subdirectory of the path) is where DataSync transfers data to or from. For information on
     *        configuring an export for DataSync, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs"
     *        >Accessing NFS file servers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationNfsRequest withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * @param onPremConfig
     */

    public void setOnPremConfig(OnPremConfig onPremConfig) {
        this.onPremConfig = onPremConfig;
    }

    /**
     * @return
     */

    public OnPremConfig getOnPremConfig() {
        return this.onPremConfig;
    }

    /**
     * @param onPremConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationNfsRequest withOnPremConfig(OnPremConfig onPremConfig) {
        setOnPremConfig(onPremConfig);
        return this;
    }

    /**
     * @param mountOptions
     */

    public void setMountOptions(NfsMountOptions mountOptions) {
        this.mountOptions = mountOptions;
    }

    /**
     * @return
     */

    public NfsMountOptions getMountOptions() {
        return this.mountOptions;
    }

    /**
     * @param mountOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationNfsRequest withMountOptions(NfsMountOptions mountOptions) {
        setMountOptions(mountOptions);
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
        if (getLocationArn() != null)
            sb.append("LocationArn: ").append(getLocationArn()).append(",");
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
        if (getOnPremConfig() != null)
            sb.append("OnPremConfig: ").append(getOnPremConfig()).append(",");
        if (getMountOptions() != null)
            sb.append("MountOptions: ").append(getMountOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLocationNfsRequest == false)
            return false;
        UpdateLocationNfsRequest other = (UpdateLocationNfsRequest) obj;
        if (other.getLocationArn() == null ^ this.getLocationArn() == null)
            return false;
        if (other.getLocationArn() != null && other.getLocationArn().equals(this.getLocationArn()) == false)
            return false;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
            return false;
        if (other.getOnPremConfig() == null ^ this.getOnPremConfig() == null)
            return false;
        if (other.getOnPremConfig() != null && other.getOnPremConfig().equals(this.getOnPremConfig()) == false)
            return false;
        if (other.getMountOptions() == null ^ this.getMountOptions() == null)
            return false;
        if (other.getMountOptions() != null && other.getMountOptions().equals(this.getMountOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationArn() == null) ? 0 : getLocationArn().hashCode());
        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getOnPremConfig() == null) ? 0 : getOnPremConfig().hashCode());
        hashCode = prime * hashCode + ((getMountOptions() == null) ? 0 : getMountOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLocationNfsRequest clone() {
        return (UpdateLocationNfsRequest) super.clone();
    }

}
