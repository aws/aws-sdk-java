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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <b>[Default policies only]</b> Specifies exclusion parameters for volumes or instances for which you do not want to
 * create snapshots or AMIs. The policy will not create snapshots or AMIs for target resources that match any of the
 * specified exclusion parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/Exclusions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Exclusions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * <b>[Default policies for EBS snapshots only]</b> Indicates whether to exclude volumes that are attached to
     * instances as the boot volume. If you exclude boot volumes, only volumes attached as data (non-boot) volumes will
     * be backed up by the policy. To exclude boot volumes, specify <code>true</code>.
     * </p>
     */
    private Boolean excludeBootVolumes;
    /**
     * <p>
     * <b>[Default policies for EBS snapshots only]</b> Specifies the volume types to exclude. Volumes of the specified
     * types will not be targeted by the policy.
     * </p>
     */
    private java.util.List<String> excludeVolumeTypes;
    /**
     * <p>
     * <b>[Default policies for EBS-backed AMIs only]</b> Specifies whether to exclude volumes that have specific tags.
     * </p>
     */
    private java.util.List<Tag> excludeTags;

    /**
     * <p>
     * <b>[Default policies for EBS snapshots only]</b> Indicates whether to exclude volumes that are attached to
     * instances as the boot volume. If you exclude boot volumes, only volumes attached as data (non-boot) volumes will
     * be backed up by the policy. To exclude boot volumes, specify <code>true</code>.
     * </p>
     * 
     * @param excludeBootVolumes
     *        <b>[Default policies for EBS snapshots only]</b> Indicates whether to exclude volumes that are attached to
     *        instances as the boot volume. If you exclude boot volumes, only volumes attached as data (non-boot)
     *        volumes will be backed up by the policy. To exclude boot volumes, specify <code>true</code>.
     */

    public void setExcludeBootVolumes(Boolean excludeBootVolumes) {
        this.excludeBootVolumes = excludeBootVolumes;
    }

    /**
     * <p>
     * <b>[Default policies for EBS snapshots only]</b> Indicates whether to exclude volumes that are attached to
     * instances as the boot volume. If you exclude boot volumes, only volumes attached as data (non-boot) volumes will
     * be backed up by the policy. To exclude boot volumes, specify <code>true</code>.
     * </p>
     * 
     * @return <b>[Default policies for EBS snapshots only]</b> Indicates whether to exclude volumes that are attached
     *         to instances as the boot volume. If you exclude boot volumes, only volumes attached as data (non-boot)
     *         volumes will be backed up by the policy. To exclude boot volumes, specify <code>true</code>.
     */

    public Boolean getExcludeBootVolumes() {
        return this.excludeBootVolumes;
    }

    /**
     * <p>
     * <b>[Default policies for EBS snapshots only]</b> Indicates whether to exclude volumes that are attached to
     * instances as the boot volume. If you exclude boot volumes, only volumes attached as data (non-boot) volumes will
     * be backed up by the policy. To exclude boot volumes, specify <code>true</code>.
     * </p>
     * 
     * @param excludeBootVolumes
     *        <b>[Default policies for EBS snapshots only]</b> Indicates whether to exclude volumes that are attached to
     *        instances as the boot volume. If you exclude boot volumes, only volumes attached as data (non-boot)
     *        volumes will be backed up by the policy. To exclude boot volumes, specify <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclusions withExcludeBootVolumes(Boolean excludeBootVolumes) {
        setExcludeBootVolumes(excludeBootVolumes);
        return this;
    }

    /**
     * <p>
     * <b>[Default policies for EBS snapshots only]</b> Indicates whether to exclude volumes that are attached to
     * instances as the boot volume. If you exclude boot volumes, only volumes attached as data (non-boot) volumes will
     * be backed up by the policy. To exclude boot volumes, specify <code>true</code>.
     * </p>
     * 
     * @return <b>[Default policies for EBS snapshots only]</b> Indicates whether to exclude volumes that are attached
     *         to instances as the boot volume. If you exclude boot volumes, only volumes attached as data (non-boot)
     *         volumes will be backed up by the policy. To exclude boot volumes, specify <code>true</code>.
     */

    public Boolean isExcludeBootVolumes() {
        return this.excludeBootVolumes;
    }

    /**
     * <p>
     * <b>[Default policies for EBS snapshots only]</b> Specifies the volume types to exclude. Volumes of the specified
     * types will not be targeted by the policy.
     * </p>
     * 
     * @return <b>[Default policies for EBS snapshots only]</b> Specifies the volume types to exclude. Volumes of the
     *         specified types will not be targeted by the policy.
     */

    public java.util.List<String> getExcludeVolumeTypes() {
        return excludeVolumeTypes;
    }

    /**
     * <p>
     * <b>[Default policies for EBS snapshots only]</b> Specifies the volume types to exclude. Volumes of the specified
     * types will not be targeted by the policy.
     * </p>
     * 
     * @param excludeVolumeTypes
     *        <b>[Default policies for EBS snapshots only]</b> Specifies the volume types to exclude. Volumes of the
     *        specified types will not be targeted by the policy.
     */

    public void setExcludeVolumeTypes(java.util.Collection<String> excludeVolumeTypes) {
        if (excludeVolumeTypes == null) {
            this.excludeVolumeTypes = null;
            return;
        }

        this.excludeVolumeTypes = new java.util.ArrayList<String>(excludeVolumeTypes);
    }

    /**
     * <p>
     * <b>[Default policies for EBS snapshots only]</b> Specifies the volume types to exclude. Volumes of the specified
     * types will not be targeted by the policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeVolumeTypes(java.util.Collection)} or {@link #withExcludeVolumeTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param excludeVolumeTypes
     *        <b>[Default policies for EBS snapshots only]</b> Specifies the volume types to exclude. Volumes of the
     *        specified types will not be targeted by the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclusions withExcludeVolumeTypes(String... excludeVolumeTypes) {
        if (this.excludeVolumeTypes == null) {
            setExcludeVolumeTypes(new java.util.ArrayList<String>(excludeVolumeTypes.length));
        }
        for (String ele : excludeVolumeTypes) {
            this.excludeVolumeTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * <b>[Default policies for EBS snapshots only]</b> Specifies the volume types to exclude. Volumes of the specified
     * types will not be targeted by the policy.
     * </p>
     * 
     * @param excludeVolumeTypes
     *        <b>[Default policies for EBS snapshots only]</b> Specifies the volume types to exclude. Volumes of the
     *        specified types will not be targeted by the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclusions withExcludeVolumeTypes(java.util.Collection<String> excludeVolumeTypes) {
        setExcludeVolumeTypes(excludeVolumeTypes);
        return this;
    }

    /**
     * <p>
     * <b>[Default policies for EBS-backed AMIs only]</b> Specifies whether to exclude volumes that have specific tags.
     * </p>
     * 
     * @return <b>[Default policies for EBS-backed AMIs only]</b> Specifies whether to exclude volumes that have
     *         specific tags.
     */

    public java.util.List<Tag> getExcludeTags() {
        return excludeTags;
    }

    /**
     * <p>
     * <b>[Default policies for EBS-backed AMIs only]</b> Specifies whether to exclude volumes that have specific tags.
     * </p>
     * 
     * @param excludeTags
     *        <b>[Default policies for EBS-backed AMIs only]</b> Specifies whether to exclude volumes that have specific
     *        tags.
     */

    public void setExcludeTags(java.util.Collection<Tag> excludeTags) {
        if (excludeTags == null) {
            this.excludeTags = null;
            return;
        }

        this.excludeTags = new java.util.ArrayList<Tag>(excludeTags);
    }

    /**
     * <p>
     * <b>[Default policies for EBS-backed AMIs only]</b> Specifies whether to exclude volumes that have specific tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeTags(java.util.Collection)} or {@link #withExcludeTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param excludeTags
     *        <b>[Default policies for EBS-backed AMIs only]</b> Specifies whether to exclude volumes that have specific
     *        tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclusions withExcludeTags(Tag... excludeTags) {
        if (this.excludeTags == null) {
            setExcludeTags(new java.util.ArrayList<Tag>(excludeTags.length));
        }
        for (Tag ele : excludeTags) {
            this.excludeTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * <b>[Default policies for EBS-backed AMIs only]</b> Specifies whether to exclude volumes that have specific tags.
     * </p>
     * 
     * @param excludeTags
     *        <b>[Default policies for EBS-backed AMIs only]</b> Specifies whether to exclude volumes that have specific
     *        tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclusions withExcludeTags(java.util.Collection<Tag> excludeTags) {
        setExcludeTags(excludeTags);
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
        if (getExcludeBootVolumes() != null)
            sb.append("ExcludeBootVolumes: ").append(getExcludeBootVolumes()).append(",");
        if (getExcludeVolumeTypes() != null)
            sb.append("ExcludeVolumeTypes: ").append(getExcludeVolumeTypes()).append(",");
        if (getExcludeTags() != null)
            sb.append("ExcludeTags: ").append(getExcludeTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Exclusions == false)
            return false;
        Exclusions other = (Exclusions) obj;
        if (other.getExcludeBootVolumes() == null ^ this.getExcludeBootVolumes() == null)
            return false;
        if (other.getExcludeBootVolumes() != null && other.getExcludeBootVolumes().equals(this.getExcludeBootVolumes()) == false)
            return false;
        if (other.getExcludeVolumeTypes() == null ^ this.getExcludeVolumeTypes() == null)
            return false;
        if (other.getExcludeVolumeTypes() != null && other.getExcludeVolumeTypes().equals(this.getExcludeVolumeTypes()) == false)
            return false;
        if (other.getExcludeTags() == null ^ this.getExcludeTags() == null)
            return false;
        if (other.getExcludeTags() != null && other.getExcludeTags().equals(this.getExcludeTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExcludeBootVolumes() == null) ? 0 : getExcludeBootVolumes().hashCode());
        hashCode = prime * hashCode + ((getExcludeVolumeTypes() == null) ? 0 : getExcludeVolumeTypes().hashCode());
        hashCode = prime * hashCode + ((getExcludeTags() == null) ? 0 : getExcludeTags().hashCode());
        return hashCode;
    }

    @Override
    public Exclusions clone() {
        try {
            return (Exclusions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.ExclusionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
