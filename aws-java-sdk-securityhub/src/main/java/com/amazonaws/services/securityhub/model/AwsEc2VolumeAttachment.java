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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An attachment to an AWS EC2 volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2VolumeAttachment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2VolumeAttachment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The datetime when the attachment initiated.
     * </p>
     */
    private String attachTime;
    /**
     * <p>
     * Whether the EBS volume is deleted when the EC2 instance is terminated.
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * The identifier of the EC2 instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The datetime when the attachment initiated.
     * </p>
     * 
     * @param attachTime
     *        The datetime when the attachment initiated.
     */

    public void setAttachTime(String attachTime) {
        this.attachTime = attachTime;
    }

    /**
     * <p>
     * The datetime when the attachment initiated.
     * </p>
     * 
     * @return The datetime when the attachment initiated.
     */

    public String getAttachTime() {
        return this.attachTime;
    }

    /**
     * <p>
     * The datetime when the attachment initiated.
     * </p>
     * 
     * @param attachTime
     *        The datetime when the attachment initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VolumeAttachment withAttachTime(String attachTime) {
        setAttachTime(attachTime);
        return this;
    }

    /**
     * <p>
     * Whether the EBS volume is deleted when the EC2 instance is terminated.
     * </p>
     * 
     * @param deleteOnTermination
     *        Whether the EBS volume is deleted when the EC2 instance is terminated.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Whether the EBS volume is deleted when the EC2 instance is terminated.
     * </p>
     * 
     * @return Whether the EBS volume is deleted when the EC2 instance is terminated.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Whether the EBS volume is deleted when the EC2 instance is terminated.
     * </p>
     * 
     * @param deleteOnTermination
     *        Whether the EBS volume is deleted when the EC2 instance is terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VolumeAttachment withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Whether the EBS volume is deleted when the EC2 instance is terminated.
     * </p>
     * 
     * @return Whether the EBS volume is deleted when the EC2 instance is terminated.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * The identifier of the EC2 instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the EC2 instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the EC2 instance.
     * </p>
     * 
     * @return The identifier of the EC2 instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the EC2 instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VolumeAttachment withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * 
     * @param status
     *        The attachment state of the volume.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * 
     * @return The attachment state of the volume.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * 
     * @param status
     *        The attachment state of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VolumeAttachment withStatus(String status) {
        setStatus(status);
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
        if (getAttachTime() != null)
            sb.append("AttachTime: ").append(getAttachTime()).append(",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: ").append(getDeleteOnTermination()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2VolumeAttachment == false)
            return false;
        AwsEc2VolumeAttachment other = (AwsEc2VolumeAttachment) obj;
        if (other.getAttachTime() == null ^ this.getAttachTime() == null)
            return false;
        if (other.getAttachTime() != null && other.getAttachTime().equals(this.getAttachTime()) == false)
            return false;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachTime() == null) ? 0 : getAttachTime().hashCode());
        hashCode = prime * hashCode + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2VolumeAttachment clone() {
        try {
            return (AwsEc2VolumeAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2VolumeAttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
