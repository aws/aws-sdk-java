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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKxVolumeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type. When you select
     * <code>NAS_1</code> volume type, you must also provide <code>nas1Configuration</code>.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * A unique identifier for the volume.
     * </p>
     */
    private String volumeName;
    /**
     * <p>
     * A description of the volume.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies the configuration for the Network attached storage (NAS_1) file system volume. This parameter is
     * required when you choose <code>volumeType</code> as <i>NAS_1</i>.
     * </p>
     */
    private KxNAS1Configuration nas1Configuration;
    /**
     * <p>
     * The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     * <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * </p>
     */
    private String azMode;
    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     */
    private java.util.List<String> availabilityZoneIds;
    /**
     * <p>
     * A list of key-value pairs to label the volume. You can add up to 50 tags to a volume.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @return A token that ensures idempotency. This token expires in 10 minutes.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, whose clusters can attach to the volume.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     * 
     * @return A unique identifier for the kdb environment, whose clusters can attach to the volume.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type. When you select
     * <code>NAS_1</code> volume type, you must also provide <code>nas1Configuration</code>.
     * </p>
     * 
     * @param volumeType
     *        The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type. When you
     *        select <code>NAS_1</code> volume type, you must also provide <code>nas1Configuration</code>.
     * @see KxVolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type. When you select
     * <code>NAS_1</code> volume type, you must also provide <code>nas1Configuration</code>.
     * </p>
     * 
     * @return The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type. When
     *         you select <code>NAS_1</code> volume type, you must also provide <code>nas1Configuration</code>.
     * @see KxVolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type. When you select
     * <code>NAS_1</code> volume type, you must also provide <code>nas1Configuration</code>.
     * </p>
     * 
     * @param volumeType
     *        The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type. When you
     *        select <code>NAS_1</code> volume type, you must also provide <code>nas1Configuration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxVolumeType
     */

    public CreateKxVolumeRequest withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type. When you select
     * <code>NAS_1</code> volume type, you must also provide <code>nas1Configuration</code>.
     * </p>
     * 
     * @param volumeType
     *        The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type. When you
     *        select <code>NAS_1</code> volume type, you must also provide <code>nas1Configuration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxVolumeType
     */

    public CreateKxVolumeRequest withVolumeType(KxVolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for the volume.
     * </p>
     * 
     * @param volumeName
     *        A unique identifier for the volume.
     */

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    /**
     * <p>
     * A unique identifier for the volume.
     * </p>
     * 
     * @return A unique identifier for the volume.
     */

    public String getVolumeName() {
        return this.volumeName;
    }

    /**
     * <p>
     * A unique identifier for the volume.
     * </p>
     * 
     * @param volumeName
     *        A unique identifier for the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeRequest withVolumeName(String volumeName) {
        setVolumeName(volumeName);
        return this;
    }

    /**
     * <p>
     * A description of the volume.
     * </p>
     * 
     * @param description
     *        A description of the volume.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the volume.
     * </p>
     * 
     * @return A description of the volume.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the volume.
     * </p>
     * 
     * @param description
     *        A description of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies the configuration for the Network attached storage (NAS_1) file system volume. This parameter is
     * required when you choose <code>volumeType</code> as <i>NAS_1</i>.
     * </p>
     * 
     * @param nas1Configuration
     *        Specifies the configuration for the Network attached storage (NAS_1) file system volume. This parameter is
     *        required when you choose <code>volumeType</code> as <i>NAS_1</i>.
     */

    public void setNas1Configuration(KxNAS1Configuration nas1Configuration) {
        this.nas1Configuration = nas1Configuration;
    }

    /**
     * <p>
     * Specifies the configuration for the Network attached storage (NAS_1) file system volume. This parameter is
     * required when you choose <code>volumeType</code> as <i>NAS_1</i>.
     * </p>
     * 
     * @return Specifies the configuration for the Network attached storage (NAS_1) file system volume. This parameter
     *         is required when you choose <code>volumeType</code> as <i>NAS_1</i>.
     */

    public KxNAS1Configuration getNas1Configuration() {
        return this.nas1Configuration;
    }

    /**
     * <p>
     * Specifies the configuration for the Network attached storage (NAS_1) file system volume. This parameter is
     * required when you choose <code>volumeType</code> as <i>NAS_1</i>.
     * </p>
     * 
     * @param nas1Configuration
     *        Specifies the configuration for the Network attached storage (NAS_1) file system volume. This parameter is
     *        required when you choose <code>volumeType</code> as <i>NAS_1</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeRequest withNas1Configuration(KxNAS1Configuration nas1Configuration) {
        setNas1Configuration(nas1Configuration);
        return this;
    }

    /**
     * <p>
     * The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     * <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * </p>
     * 
     * @param azMode
     *        The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     *        <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * @see KxAzMode
     */

    public void setAzMode(String azMode) {
        this.azMode = azMode;
    }

    /**
     * <p>
     * The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     * <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * </p>
     * 
     * @return The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     *         <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * @see KxAzMode
     */

    public String getAzMode() {
        return this.azMode;
    }

    /**
     * <p>
     * The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     * <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * </p>
     * 
     * @param azMode
     *        The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     *        <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxAzMode
     */

    public CreateKxVolumeRequest withAzMode(String azMode) {
        setAzMode(azMode);
        return this;
    }

    /**
     * <p>
     * The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     * <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * </p>
     * 
     * @param azMode
     *        The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     *        <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxAzMode
     */

    public CreateKxVolumeRequest withAzMode(KxAzMode azMode) {
        this.azMode = azMode.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @return The identifier of the availability zones.
     */

    public java.util.List<String> getAvailabilityZoneIds() {
        return availabilityZoneIds;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @param availabilityZoneIds
     *        The identifier of the availability zones.
     */

    public void setAvailabilityZoneIds(java.util.Collection<String> availabilityZoneIds) {
        if (availabilityZoneIds == null) {
            this.availabilityZoneIds = null;
            return;
        }

        this.availabilityZoneIds = new java.util.ArrayList<String>(availabilityZoneIds);
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZoneIds(java.util.Collection)} or {@link #withAvailabilityZoneIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param availabilityZoneIds
     *        The identifier of the availability zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeRequest withAvailabilityZoneIds(String... availabilityZoneIds) {
        if (this.availabilityZoneIds == null) {
            setAvailabilityZoneIds(new java.util.ArrayList<String>(availabilityZoneIds.length));
        }
        for (String ele : availabilityZoneIds) {
            this.availabilityZoneIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @param availabilityZoneIds
     *        The identifier of the availability zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeRequest withAvailabilityZoneIds(java.util.Collection<String> availabilityZoneIds) {
        setAvailabilityZoneIds(availabilityZoneIds);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to label the volume. You can add up to 50 tags to a volume.
     * </p>
     * 
     * @return A list of key-value pairs to label the volume. You can add up to 50 tags to a volume.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to label the volume. You can add up to 50 tags to a volume.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the volume. You can add up to 50 tags to a volume.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs to label the volume. You can add up to 50 tags to a volume.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the volume. You can add up to 50 tags to a volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateKxVolumeRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeRequest addTagsEntry(String key, String value) {
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

    public CreateKxVolumeRequest clearTagsEntries() {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getVolumeName() != null)
            sb.append("VolumeName: ").append(getVolumeName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNas1Configuration() != null)
            sb.append("Nas1Configuration: ").append(getNas1Configuration()).append(",");
        if (getAzMode() != null)
            sb.append("AzMode: ").append(getAzMode()).append(",");
        if (getAvailabilityZoneIds() != null)
            sb.append("AvailabilityZoneIds: ").append(getAvailabilityZoneIds()).append(",");
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

        if (obj instanceof CreateKxVolumeRequest == false)
            return false;
        CreateKxVolumeRequest other = (CreateKxVolumeRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getVolumeName() == null ^ this.getVolumeName() == null)
            return false;
        if (other.getVolumeName() != null && other.getVolumeName().equals(this.getVolumeName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNas1Configuration() == null ^ this.getNas1Configuration() == null)
            return false;
        if (other.getNas1Configuration() != null && other.getNas1Configuration().equals(this.getNas1Configuration()) == false)
            return false;
        if (other.getAzMode() == null ^ this.getAzMode() == null)
            return false;
        if (other.getAzMode() != null && other.getAzMode().equals(this.getAzMode()) == false)
            return false;
        if (other.getAvailabilityZoneIds() == null ^ this.getAvailabilityZoneIds() == null)
            return false;
        if (other.getAvailabilityZoneIds() != null && other.getAvailabilityZoneIds().equals(this.getAvailabilityZoneIds()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getVolumeName() == null) ? 0 : getVolumeName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNas1Configuration() == null) ? 0 : getNas1Configuration().hashCode());
        hashCode = prime * hashCode + ((getAzMode() == null) ? 0 : getAzMode().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneIds() == null) ? 0 : getAvailabilityZoneIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateKxVolumeRequest clone() {
        return (CreateKxVolumeRequest) super.clone();
    }

}
