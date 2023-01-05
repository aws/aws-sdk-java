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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableFastLaunchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The image ID that identifies the Windows AMI for which faster launching was enabled.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The type of resource that was defined for pre-provisioning the Windows AMI for faster launching.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The configuration settings that were defined for creating and managing the pre-provisioned snapshots for faster
     * launching of the Windows AMI. This property is returned when the associated <code>resourceType</code> is
     * <code>snapshot</code>.
     * </p>
     */
    private FastLaunchSnapshotConfigurationResponse snapshotConfiguration;
    /**
     * <p>
     * The launch template that is used when launching Windows instances from pre-provisioned snapshots.
     * </p>
     */
    private FastLaunchLaunchTemplateSpecificationResponse launchTemplate;
    /**
     * <p>
     * The maximum number of parallel instances to launch for creating resources.
     * </p>
     */
    private Integer maxParallelLaunches;
    /**
     * <p>
     * The owner ID for the Windows AMI for which faster launching was enabled.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The current state of faster launching for the specified Windows AMI.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason that the state changed for faster launching for the Windows AMI.
     * </p>
     */
    private String stateTransitionReason;
    /**
     * <p>
     * The time that the state changed for faster launching for the Windows AMI.
     * </p>
     */
    private java.util.Date stateTransitionTime;

    /**
     * <p>
     * The image ID that identifies the Windows AMI for which faster launching was enabled.
     * </p>
     * 
     * @param imageId
     *        The image ID that identifies the Windows AMI for which faster launching was enabled.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The image ID that identifies the Windows AMI for which faster launching was enabled.
     * </p>
     * 
     * @return The image ID that identifies the Windows AMI for which faster launching was enabled.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The image ID that identifies the Windows AMI for which faster launching was enabled.
     * </p>
     * 
     * @param imageId
     *        The image ID that identifies the Windows AMI for which faster launching was enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastLaunchResult withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The type of resource that was defined for pre-provisioning the Windows AMI for faster launching.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that was defined for pre-provisioning the Windows AMI for faster launching.
     * @see FastLaunchResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource that was defined for pre-provisioning the Windows AMI for faster launching.
     * </p>
     * 
     * @return The type of resource that was defined for pre-provisioning the Windows AMI for faster launching.
     * @see FastLaunchResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource that was defined for pre-provisioning the Windows AMI for faster launching.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that was defined for pre-provisioning the Windows AMI for faster launching.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FastLaunchResourceType
     */

    public EnableFastLaunchResult withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource that was defined for pre-provisioning the Windows AMI for faster launching.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that was defined for pre-provisioning the Windows AMI for faster launching.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FastLaunchResourceType
     */

    public EnableFastLaunchResult withResourceType(FastLaunchResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The configuration settings that were defined for creating and managing the pre-provisioned snapshots for faster
     * launching of the Windows AMI. This property is returned when the associated <code>resourceType</code> is
     * <code>snapshot</code>.
     * </p>
     * 
     * @param snapshotConfiguration
     *        The configuration settings that were defined for creating and managing the pre-provisioned snapshots for
     *        faster launching of the Windows AMI. This property is returned when the associated
     *        <code>resourceType</code> is <code>snapshot</code>.
     */

    public void setSnapshotConfiguration(FastLaunchSnapshotConfigurationResponse snapshotConfiguration) {
        this.snapshotConfiguration = snapshotConfiguration;
    }

    /**
     * <p>
     * The configuration settings that were defined for creating and managing the pre-provisioned snapshots for faster
     * launching of the Windows AMI. This property is returned when the associated <code>resourceType</code> is
     * <code>snapshot</code>.
     * </p>
     * 
     * @return The configuration settings that were defined for creating and managing the pre-provisioned snapshots for
     *         faster launching of the Windows AMI. This property is returned when the associated
     *         <code>resourceType</code> is <code>snapshot</code>.
     */

    public FastLaunchSnapshotConfigurationResponse getSnapshotConfiguration() {
        return this.snapshotConfiguration;
    }

    /**
     * <p>
     * The configuration settings that were defined for creating and managing the pre-provisioned snapshots for faster
     * launching of the Windows AMI. This property is returned when the associated <code>resourceType</code> is
     * <code>snapshot</code>.
     * </p>
     * 
     * @param snapshotConfiguration
     *        The configuration settings that were defined for creating and managing the pre-provisioned snapshots for
     *        faster launching of the Windows AMI. This property is returned when the associated
     *        <code>resourceType</code> is <code>snapshot</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastLaunchResult withSnapshotConfiguration(FastLaunchSnapshotConfigurationResponse snapshotConfiguration) {
        setSnapshotConfiguration(snapshotConfiguration);
        return this;
    }

    /**
     * <p>
     * The launch template that is used when launching Windows instances from pre-provisioned snapshots.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template that is used when launching Windows instances from pre-provisioned snapshots.
     */

    public void setLaunchTemplate(FastLaunchLaunchTemplateSpecificationResponse launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template that is used when launching Windows instances from pre-provisioned snapshots.
     * </p>
     * 
     * @return The launch template that is used when launching Windows instances from pre-provisioned snapshots.
     */

    public FastLaunchLaunchTemplateSpecificationResponse getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * The launch template that is used when launching Windows instances from pre-provisioned snapshots.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template that is used when launching Windows instances from pre-provisioned snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastLaunchResult withLaunchTemplate(FastLaunchLaunchTemplateSpecificationResponse launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * The maximum number of parallel instances to launch for creating resources.
     * </p>
     * 
     * @param maxParallelLaunches
     *        The maximum number of parallel instances to launch for creating resources.
     */

    public void setMaxParallelLaunches(Integer maxParallelLaunches) {
        this.maxParallelLaunches = maxParallelLaunches;
    }

    /**
     * <p>
     * The maximum number of parallel instances to launch for creating resources.
     * </p>
     * 
     * @return The maximum number of parallel instances to launch for creating resources.
     */

    public Integer getMaxParallelLaunches() {
        return this.maxParallelLaunches;
    }

    /**
     * <p>
     * The maximum number of parallel instances to launch for creating resources.
     * </p>
     * 
     * @param maxParallelLaunches
     *        The maximum number of parallel instances to launch for creating resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastLaunchResult withMaxParallelLaunches(Integer maxParallelLaunches) {
        setMaxParallelLaunches(maxParallelLaunches);
        return this;
    }

    /**
     * <p>
     * The owner ID for the Windows AMI for which faster launching was enabled.
     * </p>
     * 
     * @param ownerId
     *        The owner ID for the Windows AMI for which faster launching was enabled.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The owner ID for the Windows AMI for which faster launching was enabled.
     * </p>
     * 
     * @return The owner ID for the Windows AMI for which faster launching was enabled.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The owner ID for the Windows AMI for which faster launching was enabled.
     * </p>
     * 
     * @param ownerId
     *        The owner ID for the Windows AMI for which faster launching was enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastLaunchResult withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The current state of faster launching for the specified Windows AMI.
     * </p>
     * 
     * @param state
     *        The current state of faster launching for the specified Windows AMI.
     * @see FastLaunchStateCode
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of faster launching for the specified Windows AMI.
     * </p>
     * 
     * @return The current state of faster launching for the specified Windows AMI.
     * @see FastLaunchStateCode
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of faster launching for the specified Windows AMI.
     * </p>
     * 
     * @param state
     *        The current state of faster launching for the specified Windows AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FastLaunchStateCode
     */

    public EnableFastLaunchResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of faster launching for the specified Windows AMI.
     * </p>
     * 
     * @param state
     *        The current state of faster launching for the specified Windows AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FastLaunchStateCode
     */

    public EnableFastLaunchResult withState(FastLaunchStateCode state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason that the state changed for faster launching for the Windows AMI.
     * </p>
     * 
     * @param stateTransitionReason
     *        The reason that the state changed for faster launching for the Windows AMI.
     */

    public void setStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
    }

    /**
     * <p>
     * The reason that the state changed for faster launching for the Windows AMI.
     * </p>
     * 
     * @return The reason that the state changed for faster launching for the Windows AMI.
     */

    public String getStateTransitionReason() {
        return this.stateTransitionReason;
    }

    /**
     * <p>
     * The reason that the state changed for faster launching for the Windows AMI.
     * </p>
     * 
     * @param stateTransitionReason
     *        The reason that the state changed for faster launching for the Windows AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastLaunchResult withStateTransitionReason(String stateTransitionReason) {
        setStateTransitionReason(stateTransitionReason);
        return this;
    }

    /**
     * <p>
     * The time that the state changed for faster launching for the Windows AMI.
     * </p>
     * 
     * @param stateTransitionTime
     *        The time that the state changed for faster launching for the Windows AMI.
     */

    public void setStateTransitionTime(java.util.Date stateTransitionTime) {
        this.stateTransitionTime = stateTransitionTime;
    }

    /**
     * <p>
     * The time that the state changed for faster launching for the Windows AMI.
     * </p>
     * 
     * @return The time that the state changed for faster launching for the Windows AMI.
     */

    public java.util.Date getStateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * <p>
     * The time that the state changed for faster launching for the Windows AMI.
     * </p>
     * 
     * @param stateTransitionTime
     *        The time that the state changed for faster launching for the Windows AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastLaunchResult withStateTransitionTime(java.util.Date stateTransitionTime) {
        setStateTransitionTime(stateTransitionTime);
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
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSnapshotConfiguration() != null)
            sb.append("SnapshotConfiguration: ").append(getSnapshotConfiguration()).append(",");
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: ").append(getLaunchTemplate()).append(",");
        if (getMaxParallelLaunches() != null)
            sb.append("MaxParallelLaunches: ").append(getMaxParallelLaunches()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateTransitionReason() != null)
            sb.append("StateTransitionReason: ").append(getStateTransitionReason()).append(",");
        if (getStateTransitionTime() != null)
            sb.append("StateTransitionTime: ").append(getStateTransitionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableFastLaunchResult == false)
            return false;
        EnableFastLaunchResult other = (EnableFastLaunchResult) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSnapshotConfiguration() == null ^ this.getSnapshotConfiguration() == null)
            return false;
        if (other.getSnapshotConfiguration() != null && other.getSnapshotConfiguration().equals(this.getSnapshotConfiguration()) == false)
            return false;
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
            return false;
        if (other.getMaxParallelLaunches() == null ^ this.getMaxParallelLaunches() == null)
            return false;
        if (other.getMaxParallelLaunches() != null && other.getMaxParallelLaunches().equals(this.getMaxParallelLaunches()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateTransitionReason() == null ^ this.getStateTransitionReason() == null)
            return false;
        if (other.getStateTransitionReason() != null && other.getStateTransitionReason().equals(this.getStateTransitionReason()) == false)
            return false;
        if (other.getStateTransitionTime() == null ^ this.getStateTransitionTime() == null)
            return false;
        if (other.getStateTransitionTime() != null && other.getStateTransitionTime().equals(this.getStateTransitionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSnapshotConfiguration() == null) ? 0 : getSnapshotConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime * hashCode + ((getMaxParallelLaunches() == null) ? 0 : getMaxParallelLaunches().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateTransitionReason() == null) ? 0 : getStateTransitionReason().hashCode());
        hashCode = prime * hashCode + ((getStateTransitionTime() == null) ? 0 : getStateTransitionTime().hashCode());
        return hashCode;
    }

    @Override
    public EnableFastLaunchResult clone() {
        try {
            return (EnableFastLaunchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
