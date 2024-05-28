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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxScalingGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKxScalingGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the kdb environment, where you create the scaling group.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     */
    private String scalingGroupName;
    /**
     * <p>
     * The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
     * </p>
     */
    private String hostType;
    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     */
    private String availabilityZoneId;
    /**
     * <p>
     * The status of scaling group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The scaling group creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED – The scaling group creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE – The scaling group is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The scaling group is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATE_FAILED – The update action failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The scaling group is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The system failed to delete the scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The scaling group is successfully deleted.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The last time that the scaling group was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date lastModifiedTimestamp;
    /**
     * <p>
     * The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * A unique identifier for the kdb environment, where you create the scaling group.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, where you create the scaling group.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, where you create the scaling group.
     * </p>
     * 
     * @return A unique identifier for the kdb environment, where you create the scaling group.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, where you create the scaling group.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, where you create the scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxScalingGroupResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     * 
     * @param scalingGroupName
     *        A unique identifier for the kdb scaling group.
     */

    public void setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
    }

    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     * 
     * @return A unique identifier for the kdb scaling group.
     */

    public String getScalingGroupName() {
        return this.scalingGroupName;
    }

    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     * 
     * @param scalingGroupName
     *        A unique identifier for the kdb scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxScalingGroupResult withScalingGroupName(String scalingGroupName) {
        setScalingGroupName(scalingGroupName);
        return this;
    }

    /**
     * <p>
     * The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
     * </p>
     * 
     * @param hostType
     *        The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be
     *        placed.
     */

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    /**
     * <p>
     * The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
     * </p>
     * 
     * @return The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be
     *         placed.
     */

    public String getHostType() {
        return this.hostType;
    }

    /**
     * <p>
     * The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
     * </p>
     * 
     * @param hostType
     *        The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be
     *        placed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxScalingGroupResult withHostType(String hostType) {
        setHostType(hostType);
        return this;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @param availabilityZoneId
     *        The identifier of the availability zones.
     */

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @return The identifier of the availability zones.
     */

    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @param availabilityZoneId
     *        The identifier of the availability zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxScalingGroupResult withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * <p>
     * The status of scaling group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The scaling group creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED – The scaling group creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE – The scaling group is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The scaling group is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATE_FAILED – The update action failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The scaling group is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The system failed to delete the scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The scaling group is successfully deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of scaling group.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING – The scaling group creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED – The scaling group creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE – The scaling group is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The scaling group is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATE_FAILED – The update action failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The scaling group is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED – The system failed to delete the scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETED – The scaling group is successfully deleted.
     *        </p>
     *        </li>
     * @see KxScalingGroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of scaling group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The scaling group creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED – The scaling group creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE – The scaling group is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The scaling group is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATE_FAILED – The update action failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The scaling group is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The system failed to delete the scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The scaling group is successfully deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of scaling group.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATING – The scaling group creation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_FAILED – The scaling group creation has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE – The scaling group is active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UPDATING – The scaling group is in the process of being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UPDATE_FAILED – The update action failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETING – The scaling group is in the process of being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE_FAILED – The system failed to delete the scaling group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETED – The scaling group is successfully deleted.
     *         </p>
     *         </li>
     * @see KxScalingGroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of scaling group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The scaling group creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED – The scaling group creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE – The scaling group is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The scaling group is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATE_FAILED – The update action failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The scaling group is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The system failed to delete the scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The scaling group is successfully deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of scaling group.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING – The scaling group creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED – The scaling group creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE – The scaling group is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The scaling group is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATE_FAILED – The update action failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The scaling group is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED – The system failed to delete the scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETED – The scaling group is successfully deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxScalingGroupStatus
     */

    public CreateKxScalingGroupResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of scaling group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The scaling group creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED – The scaling group creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE – The scaling group is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The scaling group is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATE_FAILED – The update action failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The scaling group is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The system failed to delete the scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The scaling group is successfully deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of scaling group.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING – The scaling group creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED – The scaling group creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE – The scaling group is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The scaling group is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATE_FAILED – The update action failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The scaling group is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED – The system failed to delete the scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETED – The scaling group is successfully deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxScalingGroupStatus
     */

    public CreateKxScalingGroupResult withStatus(KxScalingGroupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The last time that the scaling group was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The last time that the scaling group was updated in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The last time that the scaling group was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The last time that the scaling group was updated in FinSpace. The value is determined as epoch time in
     *         milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public java.util.Date getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /**
     * <p>
     * The last time that the scaling group was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The last time that the scaling group was updated in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxScalingGroupResult withLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        setLastModifiedTimestamp(lastModifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time
     *         in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxScalingGroupResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getScalingGroupName() != null)
            sb.append("ScalingGroupName: ").append(getScalingGroupName()).append(",");
        if (getHostType() != null)
            sb.append("HostType: ").append(getHostType()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastModifiedTimestamp() != null)
            sb.append("LastModifiedTimestamp: ").append(getLastModifiedTimestamp()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKxScalingGroupResult == false)
            return false;
        CreateKxScalingGroupResult other = (CreateKxScalingGroupResult) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getScalingGroupName() == null ^ this.getScalingGroupName() == null)
            return false;
        if (other.getScalingGroupName() != null && other.getScalingGroupName().equals(this.getScalingGroupName()) == false)
            return false;
        if (other.getHostType() == null ^ this.getHostType() == null)
            return false;
        if (other.getHostType() != null && other.getHostType().equals(this.getHostType()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null)
            return false;
        if (other.getLastModifiedTimestamp() != null && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getScalingGroupName() == null) ? 0 : getScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getHostType() == null) ? 0 : getHostType().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public CreateKxScalingGroupResult clone() {
        try {
            return (CreateKxScalingGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
