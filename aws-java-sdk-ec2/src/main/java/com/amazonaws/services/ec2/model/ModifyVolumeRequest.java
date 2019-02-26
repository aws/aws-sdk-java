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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyVolumeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVolumeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyVolumeRequest> {

    /**
     * <p>
     * The ID of the volume.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * The target size of the volume, in GiB. The target volume size must be greater than or equal to than the existing
     * size of the volume. For information about available EBS volume sizes, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a>.
     * </p>
     * <p>
     * Default: If no size is specified, the existing size is retained.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * The target IOPS rate of the volume.
     * </p>
     * <p>
     * This is only valid for Provisioned IOPS SSD (<code>io1</code>) volumes. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html#EBSVolumeTypes_piops">Provisioned
     * IOPS SSD (io1) Volumes</a>.
     * </p>
     * <p>
     * Default: If no IOPS value is specified, the existing value is retained.
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @return The ID of the volume.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVolumeRequest withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * The target size of the volume, in GiB. The target volume size must be greater than or equal to than the existing
     * size of the volume. For information about available EBS volume sizes, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a>.
     * </p>
     * <p>
     * Default: If no size is specified, the existing size is retained.
     * </p>
     * 
     * @param size
     *        The target size of the volume, in GiB. The target volume size must be greater than or equal to than the
     *        existing size of the volume. For information about available EBS volume sizes, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume
     *        Types</a>.</p>
     *        <p>
     *        Default: If no size is specified, the existing size is retained.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The target size of the volume, in GiB. The target volume size must be greater than or equal to than the existing
     * size of the volume. For information about available EBS volume sizes, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a>.
     * </p>
     * <p>
     * Default: If no size is specified, the existing size is retained.
     * </p>
     * 
     * @return The target size of the volume, in GiB. The target volume size must be greater than or equal to than the
     *         existing size of the volume. For information about available EBS volume sizes, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume
     *         Types</a>.</p>
     *         <p>
     *         Default: If no size is specified, the existing size is retained.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The target size of the volume, in GiB. The target volume size must be greater than or equal to than the existing
     * size of the volume. For information about available EBS volume sizes, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume Types</a>.
     * </p>
     * <p>
     * Default: If no size is specified, the existing size is retained.
     * </p>
     * 
     * @param size
     *        The target size of the volume, in GiB. The target volume size must be greater than or equal to than the
     *        existing size of the volume. For information about available EBS volume sizes, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS Volume
     *        Types</a>.</p>
     *        <p>
     *        Default: If no size is specified, the existing size is retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVolumeRequest withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * 
     * @param volumeType
     *        The target EBS volume type of the volume.</p>
     *        <p>
     *        Default: If no type is specified, the existing type is retained.
     * @see VolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * 
     * @return The target EBS volume type of the volume.</p>
     *         <p>
     *         Default: If no type is specified, the existing type is retained.
     * @see VolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * 
     * @param volumeType
     *        The target EBS volume type of the volume.</p>
     *        <p>
     *        Default: If no type is specified, the existing type is retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public ModifyVolumeRequest withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * 
     * @param volumeType
     *        The target EBS volume type of the volume.</p>
     *        <p>
     *        Default: If no type is specified, the existing type is retained.
     * @see VolumeType
     */

    public void setVolumeType(VolumeType volumeType) {
        withVolumeType(volumeType);
    }

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * 
     * @param volumeType
     *        The target EBS volume type of the volume.</p>
     *        <p>
     *        Default: If no type is specified, the existing type is retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public ModifyVolumeRequest withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * The target IOPS rate of the volume.
     * </p>
     * <p>
     * This is only valid for Provisioned IOPS SSD (<code>io1</code>) volumes. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html#EBSVolumeTypes_piops">Provisioned
     * IOPS SSD (io1) Volumes</a>.
     * </p>
     * <p>
     * Default: If no IOPS value is specified, the existing value is retained.
     * </p>
     * 
     * @param iops
     *        The target IOPS rate of the volume.</p>
     *        <p>
     *        This is only valid for Provisioned IOPS SSD (<code>io1</code>) volumes. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html#EBSVolumeTypes_piops"
     *        >Provisioned IOPS SSD (io1) Volumes</a>.
     *        </p>
     *        <p>
     *        Default: If no IOPS value is specified, the existing value is retained.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The target IOPS rate of the volume.
     * </p>
     * <p>
     * This is only valid for Provisioned IOPS SSD (<code>io1</code>) volumes. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html#EBSVolumeTypes_piops">Provisioned
     * IOPS SSD (io1) Volumes</a>.
     * </p>
     * <p>
     * Default: If no IOPS value is specified, the existing value is retained.
     * </p>
     * 
     * @return The target IOPS rate of the volume.</p>
     *         <p>
     *         This is only valid for Provisioned IOPS SSD (<code>io1</code>) volumes. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html#EBSVolumeTypes_piops">
     *         Provisioned IOPS SSD (io1) Volumes</a>.
     *         </p>
     *         <p>
     *         Default: If no IOPS value is specified, the existing value is retained.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The target IOPS rate of the volume.
     * </p>
     * <p>
     * This is only valid for Provisioned IOPS SSD (<code>io1</code>) volumes. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html#EBSVolumeTypes_piops">Provisioned
     * IOPS SSD (io1) Volumes</a>.
     * </p>
     * <p>
     * Default: If no IOPS value is specified, the existing value is retained.
     * </p>
     * 
     * @param iops
     *        The target IOPS rate of the volume.</p>
     *        <p>
     *        This is only valid for Provisioned IOPS SSD (<code>io1</code>) volumes. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html#EBSVolumeTypes_piops"
     *        >Provisioned IOPS SSD (io1) Volumes</a>.
     *        </p>
     *        <p>
     *        Default: If no IOPS value is specified, the existing value is retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVolumeRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVolumeRequest> getDryRunRequest() {
        Request<ModifyVolumeRequest> request = new ModifyVolumeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVolumeRequest == false)
            return false;
        ModifyVolumeRequest other = (ModifyVolumeRequest) obj;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVolumeRequest clone() {
        return (ModifyVolumeRequest) super.clone();
    }
}
