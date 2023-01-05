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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <b>[Snapshot and AMI policies only]</b> Specifies optional parameters for snapshot and AMI policies. The set of valid
 * parameters depends on the combination of policy type and target resource type.
 * </p>
 * <p>
 * If you choose to exclude boot volumes and you specify tags that consequently exclude all of the additional data
 * volumes attached to an instance, then Amazon Data Lifecycle Manager will not create any snapshots for the affected
 * instance, and it will emit a <code>SnapshotsCreateFailed</code> Amazon CloudWatch metric. For more information, see
 * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitor-dlm-cw-metrics.html">Monitor your policies using
 * Amazon CloudWatch</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/Parameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Parameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * <b>[Snapshot policies that target instances only]</b> Indicates whether to exclude the root volume from
     * multi-volume snapshot sets. The default is <code>false</code>. If you specify <code>true</code>, then the root
     * volumes attached to targeted instances will be excluded from the multi-volume snapshot sets created by the
     * policy.
     * </p>
     */
    private Boolean excludeBootVolume;
    /**
     * <p>
     * <b>[AMI policies only]</b> Indicates whether targeted instances are rebooted when the lifecycle policy runs.
     * <code>true</code> indicates that targeted instances are not rebooted when the policy runs. <code>false</code>
     * indicates that target instances are rebooted when the policy runs. The default is <code>true</code> (instances
     * are not rebooted).
     * </p>
     */
    private Boolean noReboot;
    /**
     * <p>
     * <b>[Snapshot policies that target instances only]</b> The tags used to identify data (non-root) volumes to
     * exclude from multi-volume snapshot sets.
     * </p>
     * <p>
     * If you create a snapshot lifecycle policy that targets instances and you specify tags for this parameter, then
     * data volumes with the specified tags that are attached to targeted instances will be excluded from the
     * multi-volume snapshot sets created by the policy.
     * </p>
     */
    private java.util.List<Tag> excludeDataVolumeTags;

    /**
     * <p>
     * <b>[Snapshot policies that target instances only]</b> Indicates whether to exclude the root volume from
     * multi-volume snapshot sets. The default is <code>false</code>. If you specify <code>true</code>, then the root
     * volumes attached to targeted instances will be excluded from the multi-volume snapshot sets created by the
     * policy.
     * </p>
     * 
     * @param excludeBootVolume
     *        <b>[Snapshot policies that target instances only]</b> Indicates whether to exclude the root volume from
     *        multi-volume snapshot sets. The default is <code>false</code>. If you specify <code>true</code>, then the
     *        root volumes attached to targeted instances will be excluded from the multi-volume snapshot sets created
     *        by the policy.
     */

    public void setExcludeBootVolume(Boolean excludeBootVolume) {
        this.excludeBootVolume = excludeBootVolume;
    }

    /**
     * <p>
     * <b>[Snapshot policies that target instances only]</b> Indicates whether to exclude the root volume from
     * multi-volume snapshot sets. The default is <code>false</code>. If you specify <code>true</code>, then the root
     * volumes attached to targeted instances will be excluded from the multi-volume snapshot sets created by the
     * policy.
     * </p>
     * 
     * @return <b>[Snapshot policies that target instances only]</b> Indicates whether to exclude the root volume from
     *         multi-volume snapshot sets. The default is <code>false</code>. If you specify <code>true</code>, then the
     *         root volumes attached to targeted instances will be excluded from the multi-volume snapshot sets created
     *         by the policy.
     */

    public Boolean getExcludeBootVolume() {
        return this.excludeBootVolume;
    }

    /**
     * <p>
     * <b>[Snapshot policies that target instances only]</b> Indicates whether to exclude the root volume from
     * multi-volume snapshot sets. The default is <code>false</code>. If you specify <code>true</code>, then the root
     * volumes attached to targeted instances will be excluded from the multi-volume snapshot sets created by the
     * policy.
     * </p>
     * 
     * @param excludeBootVolume
     *        <b>[Snapshot policies that target instances only]</b> Indicates whether to exclude the root volume from
     *        multi-volume snapshot sets. The default is <code>false</code>. If you specify <code>true</code>, then the
     *        root volumes attached to targeted instances will be excluded from the multi-volume snapshot sets created
     *        by the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameters withExcludeBootVolume(Boolean excludeBootVolume) {
        setExcludeBootVolume(excludeBootVolume);
        return this;
    }

    /**
     * <p>
     * <b>[Snapshot policies that target instances only]</b> Indicates whether to exclude the root volume from
     * multi-volume snapshot sets. The default is <code>false</code>. If you specify <code>true</code>, then the root
     * volumes attached to targeted instances will be excluded from the multi-volume snapshot sets created by the
     * policy.
     * </p>
     * 
     * @return <b>[Snapshot policies that target instances only]</b> Indicates whether to exclude the root volume from
     *         multi-volume snapshot sets. The default is <code>false</code>. If you specify <code>true</code>, then the
     *         root volumes attached to targeted instances will be excluded from the multi-volume snapshot sets created
     *         by the policy.
     */

    public Boolean isExcludeBootVolume() {
        return this.excludeBootVolume;
    }

    /**
     * <p>
     * <b>[AMI policies only]</b> Indicates whether targeted instances are rebooted when the lifecycle policy runs.
     * <code>true</code> indicates that targeted instances are not rebooted when the policy runs. <code>false</code>
     * indicates that target instances are rebooted when the policy runs. The default is <code>true</code> (instances
     * are not rebooted).
     * </p>
     * 
     * @param noReboot
     *        <b>[AMI policies only]</b> Indicates whether targeted instances are rebooted when the lifecycle policy
     *        runs. <code>true</code> indicates that targeted instances are not rebooted when the policy runs.
     *        <code>false</code> indicates that target instances are rebooted when the policy runs. The default is
     *        <code>true</code> (instances are not rebooted).
     */

    public void setNoReboot(Boolean noReboot) {
        this.noReboot = noReboot;
    }

    /**
     * <p>
     * <b>[AMI policies only]</b> Indicates whether targeted instances are rebooted when the lifecycle policy runs.
     * <code>true</code> indicates that targeted instances are not rebooted when the policy runs. <code>false</code>
     * indicates that target instances are rebooted when the policy runs. The default is <code>true</code> (instances
     * are not rebooted).
     * </p>
     * 
     * @return <b>[AMI policies only]</b> Indicates whether targeted instances are rebooted when the lifecycle policy
     *         runs. <code>true</code> indicates that targeted instances are not rebooted when the policy runs.
     *         <code>false</code> indicates that target instances are rebooted when the policy runs. The default is
     *         <code>true</code> (instances are not rebooted).
     */

    public Boolean getNoReboot() {
        return this.noReboot;
    }

    /**
     * <p>
     * <b>[AMI policies only]</b> Indicates whether targeted instances are rebooted when the lifecycle policy runs.
     * <code>true</code> indicates that targeted instances are not rebooted when the policy runs. <code>false</code>
     * indicates that target instances are rebooted when the policy runs. The default is <code>true</code> (instances
     * are not rebooted).
     * </p>
     * 
     * @param noReboot
     *        <b>[AMI policies only]</b> Indicates whether targeted instances are rebooted when the lifecycle policy
     *        runs. <code>true</code> indicates that targeted instances are not rebooted when the policy runs.
     *        <code>false</code> indicates that target instances are rebooted when the policy runs. The default is
     *        <code>true</code> (instances are not rebooted).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameters withNoReboot(Boolean noReboot) {
        setNoReboot(noReboot);
        return this;
    }

    /**
     * <p>
     * <b>[AMI policies only]</b> Indicates whether targeted instances are rebooted when the lifecycle policy runs.
     * <code>true</code> indicates that targeted instances are not rebooted when the policy runs. <code>false</code>
     * indicates that target instances are rebooted when the policy runs. The default is <code>true</code> (instances
     * are not rebooted).
     * </p>
     * 
     * @return <b>[AMI policies only]</b> Indicates whether targeted instances are rebooted when the lifecycle policy
     *         runs. <code>true</code> indicates that targeted instances are not rebooted when the policy runs.
     *         <code>false</code> indicates that target instances are rebooted when the policy runs. The default is
     *         <code>true</code> (instances are not rebooted).
     */

    public Boolean isNoReboot() {
        return this.noReboot;
    }

    /**
     * <p>
     * <b>[Snapshot policies that target instances only]</b> The tags used to identify data (non-root) volumes to
     * exclude from multi-volume snapshot sets.
     * </p>
     * <p>
     * If you create a snapshot lifecycle policy that targets instances and you specify tags for this parameter, then
     * data volumes with the specified tags that are attached to targeted instances will be excluded from the
     * multi-volume snapshot sets created by the policy.
     * </p>
     * 
     * @return <b>[Snapshot policies that target instances only]</b> The tags used to identify data (non-root) volumes
     *         to exclude from multi-volume snapshot sets.</p>
     *         <p>
     *         If you create a snapshot lifecycle policy that targets instances and you specify tags for this parameter,
     *         then data volumes with the specified tags that are attached to targeted instances will be excluded from
     *         the multi-volume snapshot sets created by the policy.
     */

    public java.util.List<Tag> getExcludeDataVolumeTags() {
        return excludeDataVolumeTags;
    }

    /**
     * <p>
     * <b>[Snapshot policies that target instances only]</b> The tags used to identify data (non-root) volumes to
     * exclude from multi-volume snapshot sets.
     * </p>
     * <p>
     * If you create a snapshot lifecycle policy that targets instances and you specify tags for this parameter, then
     * data volumes with the specified tags that are attached to targeted instances will be excluded from the
     * multi-volume snapshot sets created by the policy.
     * </p>
     * 
     * @param excludeDataVolumeTags
     *        <b>[Snapshot policies that target instances only]</b> The tags used to identify data (non-root) volumes to
     *        exclude from multi-volume snapshot sets.</p>
     *        <p>
     *        If you create a snapshot lifecycle policy that targets instances and you specify tags for this parameter,
     *        then data volumes with the specified tags that are attached to targeted instances will be excluded from
     *        the multi-volume snapshot sets created by the policy.
     */

    public void setExcludeDataVolumeTags(java.util.Collection<Tag> excludeDataVolumeTags) {
        if (excludeDataVolumeTags == null) {
            this.excludeDataVolumeTags = null;
            return;
        }

        this.excludeDataVolumeTags = new java.util.ArrayList<Tag>(excludeDataVolumeTags);
    }

    /**
     * <p>
     * <b>[Snapshot policies that target instances only]</b> The tags used to identify data (non-root) volumes to
     * exclude from multi-volume snapshot sets.
     * </p>
     * <p>
     * If you create a snapshot lifecycle policy that targets instances and you specify tags for this parameter, then
     * data volumes with the specified tags that are attached to targeted instances will be excluded from the
     * multi-volume snapshot sets created by the policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeDataVolumeTags(java.util.Collection)} or
     * {@link #withExcludeDataVolumeTags(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param excludeDataVolumeTags
     *        <b>[Snapshot policies that target instances only]</b> The tags used to identify data (non-root) volumes to
     *        exclude from multi-volume snapshot sets.</p>
     *        <p>
     *        If you create a snapshot lifecycle policy that targets instances and you specify tags for this parameter,
     *        then data volumes with the specified tags that are attached to targeted instances will be excluded from
     *        the multi-volume snapshot sets created by the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameters withExcludeDataVolumeTags(Tag... excludeDataVolumeTags) {
        if (this.excludeDataVolumeTags == null) {
            setExcludeDataVolumeTags(new java.util.ArrayList<Tag>(excludeDataVolumeTags.length));
        }
        for (Tag ele : excludeDataVolumeTags) {
            this.excludeDataVolumeTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * <b>[Snapshot policies that target instances only]</b> The tags used to identify data (non-root) volumes to
     * exclude from multi-volume snapshot sets.
     * </p>
     * <p>
     * If you create a snapshot lifecycle policy that targets instances and you specify tags for this parameter, then
     * data volumes with the specified tags that are attached to targeted instances will be excluded from the
     * multi-volume snapshot sets created by the policy.
     * </p>
     * 
     * @param excludeDataVolumeTags
     *        <b>[Snapshot policies that target instances only]</b> The tags used to identify data (non-root) volumes to
     *        exclude from multi-volume snapshot sets.</p>
     *        <p>
     *        If you create a snapshot lifecycle policy that targets instances and you specify tags for this parameter,
     *        then data volumes with the specified tags that are attached to targeted instances will be excluded from
     *        the multi-volume snapshot sets created by the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameters withExcludeDataVolumeTags(java.util.Collection<Tag> excludeDataVolumeTags) {
        setExcludeDataVolumeTags(excludeDataVolumeTags);
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
        if (getExcludeBootVolume() != null)
            sb.append("ExcludeBootVolume: ").append(getExcludeBootVolume()).append(",");
        if (getNoReboot() != null)
            sb.append("NoReboot: ").append(getNoReboot()).append(",");
        if (getExcludeDataVolumeTags() != null)
            sb.append("ExcludeDataVolumeTags: ").append(getExcludeDataVolumeTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parameters == false)
            return false;
        Parameters other = (Parameters) obj;
        if (other.getExcludeBootVolume() == null ^ this.getExcludeBootVolume() == null)
            return false;
        if (other.getExcludeBootVolume() != null && other.getExcludeBootVolume().equals(this.getExcludeBootVolume()) == false)
            return false;
        if (other.getNoReboot() == null ^ this.getNoReboot() == null)
            return false;
        if (other.getNoReboot() != null && other.getNoReboot().equals(this.getNoReboot()) == false)
            return false;
        if (other.getExcludeDataVolumeTags() == null ^ this.getExcludeDataVolumeTags() == null)
            return false;
        if (other.getExcludeDataVolumeTags() != null && other.getExcludeDataVolumeTags().equals(this.getExcludeDataVolumeTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExcludeBootVolume() == null) ? 0 : getExcludeBootVolume().hashCode());
        hashCode = prime * hashCode + ((getNoReboot() == null) ? 0 : getNoReboot().hashCode());
        hashCode = prime * hashCode + ((getExcludeDataVolumeTags() == null) ? 0 : getExcludeDataVolumeTags().hashCode());
        return hashCode;
    }

    @Override
    public Parameters clone() {
        try {
            return (Parameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.ParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
