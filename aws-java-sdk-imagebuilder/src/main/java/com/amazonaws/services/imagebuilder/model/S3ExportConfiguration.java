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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties that configure export from your build instance to a compatible file format for your VM.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/S3ExportConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ExportConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the role that grants VM Import/Export permission to export images to your S3 bucket.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * Export the updated image to one of the following supported disk image formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Virtual Hard Disk (VHD)</b> – Compatible with Citrix Xen and Microsoft Hyper-V virtualization products.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Stream-optimized ESX Virtual Machine Disk (VMDK)</b> – Compatible with VMware ESX and VMware vSphere versions
     * 4, 5, and 6.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Raw</b> – Raw format.
     * </p>
     * </li>
     * </ul>
     */
    private String diskImageFormat;
    /**
     * <p>
     * The S3 bucket in which to store the output disk images for your VM.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The Amazon S3 path for the bucket where the output disk images for your VM are stored.
     * </p>
     */
    private String s3Prefix;

    /**
     * <p>
     * The name of the role that grants VM Import/Export permission to export images to your S3 bucket.
     * </p>
     * 
     * @param roleName
     *        The name of the role that grants VM Import/Export permission to export images to your S3 bucket.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role that grants VM Import/Export permission to export images to your S3 bucket.
     * </p>
     * 
     * @return The name of the role that grants VM Import/Export permission to export images to your S3 bucket.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the role that grants VM Import/Export permission to export images to your S3 bucket.
     * </p>
     * 
     * @param roleName
     *        The name of the role that grants VM Import/Export permission to export images to your S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ExportConfiguration withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * Export the updated image to one of the following supported disk image formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Virtual Hard Disk (VHD)</b> – Compatible with Citrix Xen and Microsoft Hyper-V virtualization products.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Stream-optimized ESX Virtual Machine Disk (VMDK)</b> – Compatible with VMware ESX and VMware vSphere versions
     * 4, 5, and 6.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Raw</b> – Raw format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param diskImageFormat
     *        Export the updated image to one of the following supported disk image formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Virtual Hard Disk (VHD)</b> – Compatible with Citrix Xen and Microsoft Hyper-V virtualization products.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Stream-optimized ESX Virtual Machine Disk (VMDK)</b> – Compatible with VMware ESX and VMware vSphere
     *        versions 4, 5, and 6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Raw</b> – Raw format.
     *        </p>
     *        </li>
     * @see DiskImageFormat
     */

    public void setDiskImageFormat(String diskImageFormat) {
        this.diskImageFormat = diskImageFormat;
    }

    /**
     * <p>
     * Export the updated image to one of the following supported disk image formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Virtual Hard Disk (VHD)</b> – Compatible with Citrix Xen and Microsoft Hyper-V virtualization products.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Stream-optimized ESX Virtual Machine Disk (VMDK)</b> – Compatible with VMware ESX and VMware vSphere versions
     * 4, 5, and 6.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Raw</b> – Raw format.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Export the updated image to one of the following supported disk image formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Virtual Hard Disk (VHD)</b> – Compatible with Citrix Xen and Microsoft Hyper-V virtualization
     *         products.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Stream-optimized ESX Virtual Machine Disk (VMDK)</b> – Compatible with VMware ESX and VMware vSphere
     *         versions 4, 5, and 6.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Raw</b> – Raw format.
     *         </p>
     *         </li>
     * @see DiskImageFormat
     */

    public String getDiskImageFormat() {
        return this.diskImageFormat;
    }

    /**
     * <p>
     * Export the updated image to one of the following supported disk image formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Virtual Hard Disk (VHD)</b> – Compatible with Citrix Xen and Microsoft Hyper-V virtualization products.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Stream-optimized ESX Virtual Machine Disk (VMDK)</b> – Compatible with VMware ESX and VMware vSphere versions
     * 4, 5, and 6.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Raw</b> – Raw format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param diskImageFormat
     *        Export the updated image to one of the following supported disk image formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Virtual Hard Disk (VHD)</b> – Compatible with Citrix Xen and Microsoft Hyper-V virtualization products.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Stream-optimized ESX Virtual Machine Disk (VMDK)</b> – Compatible with VMware ESX and VMware vSphere
     *        versions 4, 5, and 6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Raw</b> – Raw format.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskImageFormat
     */

    public S3ExportConfiguration withDiskImageFormat(String diskImageFormat) {
        setDiskImageFormat(diskImageFormat);
        return this;
    }

    /**
     * <p>
     * Export the updated image to one of the following supported disk image formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Virtual Hard Disk (VHD)</b> – Compatible with Citrix Xen and Microsoft Hyper-V virtualization products.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Stream-optimized ESX Virtual Machine Disk (VMDK)</b> – Compatible with VMware ESX and VMware vSphere versions
     * 4, 5, and 6.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Raw</b> – Raw format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param diskImageFormat
     *        Export the updated image to one of the following supported disk image formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Virtual Hard Disk (VHD)</b> – Compatible with Citrix Xen and Microsoft Hyper-V virtualization products.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Stream-optimized ESX Virtual Machine Disk (VMDK)</b> – Compatible with VMware ESX and VMware vSphere
     *        versions 4, 5, and 6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Raw</b> – Raw format.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskImageFormat
     */

    public S3ExportConfiguration withDiskImageFormat(DiskImageFormat diskImageFormat) {
        this.diskImageFormat = diskImageFormat.toString();
        return this;
    }

    /**
     * <p>
     * The S3 bucket in which to store the output disk images for your VM.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket in which to store the output disk images for your VM.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket in which to store the output disk images for your VM.
     * </p>
     * 
     * @return The S3 bucket in which to store the output disk images for your VM.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket in which to store the output disk images for your VM.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket in which to store the output disk images for your VM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ExportConfiguration withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path for the bucket where the output disk images for your VM are stored.
     * </p>
     * 
     * @param s3Prefix
     *        The Amazon S3 path for the bucket where the output disk images for your VM are stored.
     */

    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 path for the bucket where the output disk images for your VM are stored.
     * </p>
     * 
     * @return The Amazon S3 path for the bucket where the output disk images for your VM are stored.
     */

    public String getS3Prefix() {
        return this.s3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 path for the bucket where the output disk images for your VM are stored.
     * </p>
     * 
     * @param s3Prefix
     *        The Amazon S3 path for the bucket where the output disk images for your VM are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ExportConfiguration withS3Prefix(String s3Prefix) {
        setS3Prefix(s3Prefix);
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
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getDiskImageFormat() != null)
            sb.append("DiskImageFormat: ").append(getDiskImageFormat()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3Prefix() != null)
            sb.append("S3Prefix: ").append(getS3Prefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ExportConfiguration == false)
            return false;
        S3ExportConfiguration other = (S3ExportConfiguration) obj;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getDiskImageFormat() == null ^ this.getDiskImageFormat() == null)
            return false;
        if (other.getDiskImageFormat() != null && other.getDiskImageFormat().equals(this.getDiskImageFormat()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getDiskImageFormat() == null) ? 0 : getDiskImageFormat().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        return hashCode;
    }

    @Override
    public S3ExportConfiguration clone() {
        try {
            return (S3ExportConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.S3ExportConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
