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
 * Define and configure faster launching for output Windows AMIs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/FastLaunchConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FastLaunchConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean that represents the current state of faster launching for the Windows AMI. Set to <code>true</code> to
     * start using Windows faster launching, or <code>false</code> to stop using it.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Configuration settings for managing the number of snapshots that are created from pre-provisioned instances for
     * the Windows AMI when faster launching is enabled.
     * </p>
     */
    private FastLaunchSnapshotConfiguration snapshotConfiguration;
    /**
     * <p>
     * The maximum number of parallel instances that are launched for creating resources.
     * </p>
     */
    private Integer maxParallelLaunches;
    /**
     * <p>
     * The launch template that the fast-launch enabled Windows AMI uses when it launches Windows instances to create
     * pre-provisioned snapshots.
     * </p>
     */
    private FastLaunchLaunchTemplateSpecification launchTemplate;
    /**
     * <p>
     * The owner account ID for the fast-launch enabled Windows AMI.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * A Boolean that represents the current state of faster launching for the Windows AMI. Set to <code>true</code> to
     * start using Windows faster launching, or <code>false</code> to stop using it.
     * </p>
     * 
     * @param enabled
     *        A Boolean that represents the current state of faster launching for the Windows AMI. Set to
     *        <code>true</code> to start using Windows faster launching, or <code>false</code> to stop using it.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * A Boolean that represents the current state of faster launching for the Windows AMI. Set to <code>true</code> to
     * start using Windows faster launching, or <code>false</code> to stop using it.
     * </p>
     * 
     * @return A Boolean that represents the current state of faster launching for the Windows AMI. Set to
     *         <code>true</code> to start using Windows faster launching, or <code>false</code> to stop using it.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A Boolean that represents the current state of faster launching for the Windows AMI. Set to <code>true</code> to
     * start using Windows faster launching, or <code>false</code> to stop using it.
     * </p>
     * 
     * @param enabled
     *        A Boolean that represents the current state of faster launching for the Windows AMI. Set to
     *        <code>true</code> to start using Windows faster launching, or <code>false</code> to stop using it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastLaunchConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * A Boolean that represents the current state of faster launching for the Windows AMI. Set to <code>true</code> to
     * start using Windows faster launching, or <code>false</code> to stop using it.
     * </p>
     * 
     * @return A Boolean that represents the current state of faster launching for the Windows AMI. Set to
     *         <code>true</code> to start using Windows faster launching, or <code>false</code> to stop using it.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Configuration settings for managing the number of snapshots that are created from pre-provisioned instances for
     * the Windows AMI when faster launching is enabled.
     * </p>
     * 
     * @param snapshotConfiguration
     *        Configuration settings for managing the number of snapshots that are created from pre-provisioned
     *        instances for the Windows AMI when faster launching is enabled.
     */

    public void setSnapshotConfiguration(FastLaunchSnapshotConfiguration snapshotConfiguration) {
        this.snapshotConfiguration = snapshotConfiguration;
    }

    /**
     * <p>
     * Configuration settings for managing the number of snapshots that are created from pre-provisioned instances for
     * the Windows AMI when faster launching is enabled.
     * </p>
     * 
     * @return Configuration settings for managing the number of snapshots that are created from pre-provisioned
     *         instances for the Windows AMI when faster launching is enabled.
     */

    public FastLaunchSnapshotConfiguration getSnapshotConfiguration() {
        return this.snapshotConfiguration;
    }

    /**
     * <p>
     * Configuration settings for managing the number of snapshots that are created from pre-provisioned instances for
     * the Windows AMI when faster launching is enabled.
     * </p>
     * 
     * @param snapshotConfiguration
     *        Configuration settings for managing the number of snapshots that are created from pre-provisioned
     *        instances for the Windows AMI when faster launching is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastLaunchConfiguration withSnapshotConfiguration(FastLaunchSnapshotConfiguration snapshotConfiguration) {
        setSnapshotConfiguration(snapshotConfiguration);
        return this;
    }

    /**
     * <p>
     * The maximum number of parallel instances that are launched for creating resources.
     * </p>
     * 
     * @param maxParallelLaunches
     *        The maximum number of parallel instances that are launched for creating resources.
     */

    public void setMaxParallelLaunches(Integer maxParallelLaunches) {
        this.maxParallelLaunches = maxParallelLaunches;
    }

    /**
     * <p>
     * The maximum number of parallel instances that are launched for creating resources.
     * </p>
     * 
     * @return The maximum number of parallel instances that are launched for creating resources.
     */

    public Integer getMaxParallelLaunches() {
        return this.maxParallelLaunches;
    }

    /**
     * <p>
     * The maximum number of parallel instances that are launched for creating resources.
     * </p>
     * 
     * @param maxParallelLaunches
     *        The maximum number of parallel instances that are launched for creating resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastLaunchConfiguration withMaxParallelLaunches(Integer maxParallelLaunches) {
        setMaxParallelLaunches(maxParallelLaunches);
        return this;
    }

    /**
     * <p>
     * The launch template that the fast-launch enabled Windows AMI uses when it launches Windows instances to create
     * pre-provisioned snapshots.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template that the fast-launch enabled Windows AMI uses when it launches Windows instances to
     *        create pre-provisioned snapshots.
     */

    public void setLaunchTemplate(FastLaunchLaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template that the fast-launch enabled Windows AMI uses when it launches Windows instances to create
     * pre-provisioned snapshots.
     * </p>
     * 
     * @return The launch template that the fast-launch enabled Windows AMI uses when it launches Windows instances to
     *         create pre-provisioned snapshots.
     */

    public FastLaunchLaunchTemplateSpecification getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * The launch template that the fast-launch enabled Windows AMI uses when it launches Windows instances to create
     * pre-provisioned snapshots.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template that the fast-launch enabled Windows AMI uses when it launches Windows instances to
     *        create pre-provisioned snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastLaunchConfiguration withLaunchTemplate(FastLaunchLaunchTemplateSpecification launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * The owner account ID for the fast-launch enabled Windows AMI.
     * </p>
     * 
     * @param accountId
     *        The owner account ID for the fast-launch enabled Windows AMI.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The owner account ID for the fast-launch enabled Windows AMI.
     * </p>
     * 
     * @return The owner account ID for the fast-launch enabled Windows AMI.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The owner account ID for the fast-launch enabled Windows AMI.
     * </p>
     * 
     * @param accountId
     *        The owner account ID for the fast-launch enabled Windows AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastLaunchConfiguration withAccountId(String accountId) {
        setAccountId(accountId);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getSnapshotConfiguration() != null)
            sb.append("SnapshotConfiguration: ").append(getSnapshotConfiguration()).append(",");
        if (getMaxParallelLaunches() != null)
            sb.append("MaxParallelLaunches: ").append(getMaxParallelLaunches()).append(",");
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: ").append(getLaunchTemplate()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FastLaunchConfiguration == false)
            return false;
        FastLaunchConfiguration other = (FastLaunchConfiguration) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getSnapshotConfiguration() == null ^ this.getSnapshotConfiguration() == null)
            return false;
        if (other.getSnapshotConfiguration() != null && other.getSnapshotConfiguration().equals(this.getSnapshotConfiguration()) == false)
            return false;
        if (other.getMaxParallelLaunches() == null ^ this.getMaxParallelLaunches() == null)
            return false;
        if (other.getMaxParallelLaunches() != null && other.getMaxParallelLaunches().equals(this.getMaxParallelLaunches()) == false)
            return false;
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getSnapshotConfiguration() == null) ? 0 : getSnapshotConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMaxParallelLaunches() == null) ? 0 : getMaxParallelLaunches().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public FastLaunchConfiguration clone() {
        try {
            return (FastLaunchConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.FastLaunchConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
