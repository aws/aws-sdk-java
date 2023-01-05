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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The instance details to specify which volumes should be snapshotted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The instance to specify which volumes should be snapshotted.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Excludes the root volume from being snapshotted.
     * </p>
     */
    private Boolean excludeBootVolume;
    /**
     * <p>
     * The IDs of the data (non-root) volumes to exclude from the multi-volume snapshot set. If you specify the ID of
     * the root volume, the request fails. To exclude the root volume, use <b>ExcludeBootVolume</b>.
     * </p>
     * <p>
     * You can specify up to 40 volume IDs per request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> excludeDataVolumeIds;

    /**
     * <p>
     * The instance to specify which volumes should be snapshotted.
     * </p>
     * 
     * @param instanceId
     *        The instance to specify which volumes should be snapshotted.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance to specify which volumes should be snapshotted.
     * </p>
     * 
     * @return The instance to specify which volumes should be snapshotted.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance to specify which volumes should be snapshotted.
     * </p>
     * 
     * @param instanceId
     *        The instance to specify which volumes should be snapshotted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSpecification withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Excludes the root volume from being snapshotted.
     * </p>
     * 
     * @param excludeBootVolume
     *        Excludes the root volume from being snapshotted.
     */

    public void setExcludeBootVolume(Boolean excludeBootVolume) {
        this.excludeBootVolume = excludeBootVolume;
    }

    /**
     * <p>
     * Excludes the root volume from being snapshotted.
     * </p>
     * 
     * @return Excludes the root volume from being snapshotted.
     */

    public Boolean getExcludeBootVolume() {
        return this.excludeBootVolume;
    }

    /**
     * <p>
     * Excludes the root volume from being snapshotted.
     * </p>
     * 
     * @param excludeBootVolume
     *        Excludes the root volume from being snapshotted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSpecification withExcludeBootVolume(Boolean excludeBootVolume) {
        setExcludeBootVolume(excludeBootVolume);
        return this;
    }

    /**
     * <p>
     * Excludes the root volume from being snapshotted.
     * </p>
     * 
     * @return Excludes the root volume from being snapshotted.
     */

    public Boolean isExcludeBootVolume() {
        return this.excludeBootVolume;
    }

    /**
     * <p>
     * The IDs of the data (non-root) volumes to exclude from the multi-volume snapshot set. If you specify the ID of
     * the root volume, the request fails. To exclude the root volume, use <b>ExcludeBootVolume</b>.
     * </p>
     * <p>
     * You can specify up to 40 volume IDs per request.
     * </p>
     * 
     * @return The IDs of the data (non-root) volumes to exclude from the multi-volume snapshot set. If you specify the
     *         ID of the root volume, the request fails. To exclude the root volume, use <b>ExcludeBootVolume</b>.</p>
     *         <p>
     *         You can specify up to 40 volume IDs per request.
     */

    public java.util.List<String> getExcludeDataVolumeIds() {
        if (excludeDataVolumeIds == null) {
            excludeDataVolumeIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return excludeDataVolumeIds;
    }

    /**
     * <p>
     * The IDs of the data (non-root) volumes to exclude from the multi-volume snapshot set. If you specify the ID of
     * the root volume, the request fails. To exclude the root volume, use <b>ExcludeBootVolume</b>.
     * </p>
     * <p>
     * You can specify up to 40 volume IDs per request.
     * </p>
     * 
     * @param excludeDataVolumeIds
     *        The IDs of the data (non-root) volumes to exclude from the multi-volume snapshot set. If you specify the
     *        ID of the root volume, the request fails. To exclude the root volume, use <b>ExcludeBootVolume</b>.</p>
     *        <p>
     *        You can specify up to 40 volume IDs per request.
     */

    public void setExcludeDataVolumeIds(java.util.Collection<String> excludeDataVolumeIds) {
        if (excludeDataVolumeIds == null) {
            this.excludeDataVolumeIds = null;
            return;
        }

        this.excludeDataVolumeIds = new com.amazonaws.internal.SdkInternalList<String>(excludeDataVolumeIds);
    }

    /**
     * <p>
     * The IDs of the data (non-root) volumes to exclude from the multi-volume snapshot set. If you specify the ID of
     * the root volume, the request fails. To exclude the root volume, use <b>ExcludeBootVolume</b>.
     * </p>
     * <p>
     * You can specify up to 40 volume IDs per request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeDataVolumeIds(java.util.Collection)} or {@link #withExcludeDataVolumeIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param excludeDataVolumeIds
     *        The IDs of the data (non-root) volumes to exclude from the multi-volume snapshot set. If you specify the
     *        ID of the root volume, the request fails. To exclude the root volume, use <b>ExcludeBootVolume</b>.</p>
     *        <p>
     *        You can specify up to 40 volume IDs per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSpecification withExcludeDataVolumeIds(String... excludeDataVolumeIds) {
        if (this.excludeDataVolumeIds == null) {
            setExcludeDataVolumeIds(new com.amazonaws.internal.SdkInternalList<String>(excludeDataVolumeIds.length));
        }
        for (String ele : excludeDataVolumeIds) {
            this.excludeDataVolumeIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the data (non-root) volumes to exclude from the multi-volume snapshot set. If you specify the ID of
     * the root volume, the request fails. To exclude the root volume, use <b>ExcludeBootVolume</b>.
     * </p>
     * <p>
     * You can specify up to 40 volume IDs per request.
     * </p>
     * 
     * @param excludeDataVolumeIds
     *        The IDs of the data (non-root) volumes to exclude from the multi-volume snapshot set. If you specify the
     *        ID of the root volume, the request fails. To exclude the root volume, use <b>ExcludeBootVolume</b>.</p>
     *        <p>
     *        You can specify up to 40 volume IDs per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSpecification withExcludeDataVolumeIds(java.util.Collection<String> excludeDataVolumeIds) {
        setExcludeDataVolumeIds(excludeDataVolumeIds);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getExcludeBootVolume() != null)
            sb.append("ExcludeBootVolume: ").append(getExcludeBootVolume()).append(",");
        if (getExcludeDataVolumeIds() != null)
            sb.append("ExcludeDataVolumeIds: ").append(getExcludeDataVolumeIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceSpecification == false)
            return false;
        InstanceSpecification other = (InstanceSpecification) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getExcludeBootVolume() == null ^ this.getExcludeBootVolume() == null)
            return false;
        if (other.getExcludeBootVolume() != null && other.getExcludeBootVolume().equals(this.getExcludeBootVolume()) == false)
            return false;
        if (other.getExcludeDataVolumeIds() == null ^ this.getExcludeDataVolumeIds() == null)
            return false;
        if (other.getExcludeDataVolumeIds() != null && other.getExcludeDataVolumeIds().equals(this.getExcludeDataVolumeIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getExcludeBootVolume() == null) ? 0 : getExcludeBootVolume().hashCode());
        hashCode = prime * hashCode + ((getExcludeDataVolumeIds() == null) ? 0 : getExcludeDataVolumeIds().hashCode());
        return hashCode;
    }

    @Override
    public InstanceSpecification clone() {
        try {
            return (InstanceSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
