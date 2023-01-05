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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifying information about the device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DeviceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the job used to order the device.
     * </p>
     */
    private String associatedWithJob;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     */
    private String managedDeviceArn;
    /**
     * <p>
     * The ID of the device.
     * </p>
     */
    private String managedDeviceId;
    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the job used to order the device.
     * </p>
     * 
     * @param associatedWithJob
     *        The ID of the job used to order the device.
     */

    public void setAssociatedWithJob(String associatedWithJob) {
        this.associatedWithJob = associatedWithJob;
    }

    /**
     * <p>
     * The ID of the job used to order the device.
     * </p>
     * 
     * @return The ID of the job used to order the device.
     */

    public String getAssociatedWithJob() {
        return this.associatedWithJob;
    }

    /**
     * <p>
     * The ID of the job used to order the device.
     * </p>
     * 
     * @param associatedWithJob
     *        The ID of the job used to order the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withAssociatedWithJob(String associatedWithJob) {
        setAssociatedWithJob(associatedWithJob);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param managedDeviceArn
     *        The Amazon Resource Name (ARN) of the device.
     */

    public void setManagedDeviceArn(String managedDeviceArn) {
        this.managedDeviceArn = managedDeviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device.
     */

    public String getManagedDeviceArn() {
        return this.managedDeviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param managedDeviceArn
     *        The Amazon Resource Name (ARN) of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withManagedDeviceArn(String managedDeviceArn) {
        setManagedDeviceArn(managedDeviceArn);
        return this;
    }

    /**
     * <p>
     * The ID of the device.
     * </p>
     * 
     * @param managedDeviceId
     *        The ID of the device.
     */

    public void setManagedDeviceId(String managedDeviceId) {
        this.managedDeviceId = managedDeviceId;
    }

    /**
     * <p>
     * The ID of the device.
     * </p>
     * 
     * @return The ID of the device.
     */

    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }

    /**
     * <p>
     * The ID of the device.
     * </p>
     * 
     * @param managedDeviceId
     *        The ID of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withManagedDeviceId(String managedDeviceId) {
        setManagedDeviceId(managedDeviceId);
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     * 
     * @return Optional metadata that you assign to a resource. You can use tags to categorize a resource in different
     *         ways, such as by purpose, owner, or environment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can use tags to categorize a resource in different
     *        ways, such as by purpose, owner, or environment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can use tags to categorize a resource in different
     *        ways, such as by purpose, owner, or environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DeviceSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary clearTagsEntries() {
        this.tags = null;
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
        if (getAssociatedWithJob() != null)
            sb.append("AssociatedWithJob: ").append(getAssociatedWithJob()).append(",");
        if (getManagedDeviceArn() != null)
            sb.append("ManagedDeviceArn: ").append(getManagedDeviceArn()).append(",");
        if (getManagedDeviceId() != null)
            sb.append("ManagedDeviceId: ").append(getManagedDeviceId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceSummary == false)
            return false;
        DeviceSummary other = (DeviceSummary) obj;
        if (other.getAssociatedWithJob() == null ^ this.getAssociatedWithJob() == null)
            return false;
        if (other.getAssociatedWithJob() != null && other.getAssociatedWithJob().equals(this.getAssociatedWithJob()) == false)
            return false;
        if (other.getManagedDeviceArn() == null ^ this.getManagedDeviceArn() == null)
            return false;
        if (other.getManagedDeviceArn() != null && other.getManagedDeviceArn().equals(this.getManagedDeviceArn()) == false)
            return false;
        if (other.getManagedDeviceId() == null ^ this.getManagedDeviceId() == null)
            return false;
        if (other.getManagedDeviceId() != null && other.getManagedDeviceId().equals(this.getManagedDeviceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociatedWithJob() == null) ? 0 : getAssociatedWithJob().hashCode());
        hashCode = prime * hashCode + ((getManagedDeviceArn() == null) ? 0 : getManagedDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getManagedDeviceId() == null) ? 0 : getManagedDeviceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DeviceSummary clone() {
        try {
            return (DeviceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowdevicemanagement.model.transform.DeviceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
