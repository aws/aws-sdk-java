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

/**
 * <p>
 * Describes a reservation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Reservation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Reservation implements Serializable, Cloneable {

    /**
     * <p>
     * [EC2-Classic only] The security groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GroupIdentifier> groups;
    /**
     * <p>
     * The instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Instance> instances;
    /**
     * <p>
     * The ID of the AWS account that owns the reservation.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The ID of the requester that launched the instances on your behalf (for example, AWS Management Console or Auto
     * Scaling).
     * </p>
     */
    private String requesterId;
    /**
     * <p>
     * The ID of the reservation.
     * </p>
     */
    private String reservationId;
    /**
     * <p>
     * One or more security group names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groupNames;

    /**
     * <p>
     * [EC2-Classic only] The security groups.
     * </p>
     * 
     * @return [EC2-Classic only] The security groups.
     */

    public java.util.List<GroupIdentifier> getGroups() {
        if (groups == null) {
            groups = new com.amazonaws.internal.SdkInternalList<GroupIdentifier>();
        }
        return groups;
    }

    /**
     * <p>
     * [EC2-Classic only] The security groups.
     * </p>
     * 
     * @param groups
     *        [EC2-Classic only] The security groups.
     */

    public void setGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new com.amazonaws.internal.SdkInternalList<GroupIdentifier>(groups);
    }

    /**
     * <p>
     * [EC2-Classic only] The security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        [EC2-Classic only] The security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withGroups(GroupIdentifier... groups) {
        if (this.groups == null) {
            setGroups(new com.amazonaws.internal.SdkInternalList<GroupIdentifier>(groups.length));
        }
        for (GroupIdentifier ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [EC2-Classic only] The security groups.
     * </p>
     * 
     * @param groups
     *        [EC2-Classic only] The security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withGroups(java.util.Collection<GroupIdentifier> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The instances.
     * </p>
     * 
     * @return The instances.
     */

    public java.util.List<Instance> getInstances() {
        if (instances == null) {
            instances = new com.amazonaws.internal.SdkInternalList<Instance>();
        }
        return instances;
    }

    /**
     * <p>
     * The instances.
     * </p>
     * 
     * @param instances
     *        The instances.
     */

    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new com.amazonaws.internal.SdkInternalList<Instance>(instances);
    }

    /**
     * <p>
     * The instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        The instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withInstances(Instance... instances) {
        if (this.instances == null) {
            setInstances(new com.amazonaws.internal.SdkInternalList<Instance>(instances.length));
        }
        for (Instance ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instances.
     * </p>
     * 
     * @param instances
     *        The instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withInstances(java.util.Collection<Instance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the reservation.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the reservation.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the reservation.
     * </p>
     * 
     * @return The ID of the AWS account that owns the reservation.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the reservation.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The ID of the requester that launched the instances on your behalf (for example, AWS Management Console or Auto
     * Scaling).
     * </p>
     * 
     * @param requesterId
     *        The ID of the requester that launched the instances on your behalf (for example, AWS Management Console or
     *        Auto Scaling).
     */

    public void setRequesterId(String requesterId) {
        this.requesterId = requesterId;
    }

    /**
     * <p>
     * The ID of the requester that launched the instances on your behalf (for example, AWS Management Console or Auto
     * Scaling).
     * </p>
     * 
     * @return The ID of the requester that launched the instances on your behalf (for example, AWS Management Console
     *         or Auto Scaling).
     */

    public String getRequesterId() {
        return this.requesterId;
    }

    /**
     * <p>
     * The ID of the requester that launched the instances on your behalf (for example, AWS Management Console or Auto
     * Scaling).
     * </p>
     * 
     * @param requesterId
     *        The ID of the requester that launched the instances on your behalf (for example, AWS Management Console or
     *        Auto Scaling).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withRequesterId(String requesterId) {
        setRequesterId(requesterId);
        return this;
    }

    /**
     * <p>
     * The ID of the reservation.
     * </p>
     * 
     * @param reservationId
     *        The ID of the reservation.
     */

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * <p>
     * The ID of the reservation.
     * </p>
     * 
     * @return The ID of the reservation.
     */

    public String getReservationId() {
        return this.reservationId;
    }

    /**
     * <p>
     * The ID of the reservation.
     * </p>
     * 
     * @param reservationId
     *        The ID of the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withReservationId(String reservationId) {
        setReservationId(reservationId);
        return this;
    }

    /**
     * <p>
     * One or more security group names.
     * </p>
     * 
     * @return One or more security group names.
     */

    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
            groupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groupNames;
    }

    /**
     * <p>
     * One or more security group names.
     * </p>
     * 
     * @param groupNames
     *        One or more security group names.
     */

    public void setGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
            return;
        }

        this.groupNames = new com.amazonaws.internal.SdkInternalList<String>(groupNames);
    }

    /**
     * <p>
     * One or more security group names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupNames(java.util.Collection)} or {@link #withGroupNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param groupNames
     *        One or more security group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withGroupNames(String... groupNames) {
        if (this.groupNames == null) {
            setGroupNames(new com.amazonaws.internal.SdkInternalList<String>(groupNames.length));
        }
        for (String ele : groupNames) {
            this.groupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more security group names.
     * </p>
     * 
     * @param groupNames
     *        One or more security group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reservation withGroupNames(java.util.Collection<String> groupNames) {
        setGroupNames(groupNames);
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
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getRequesterId() != null)
            sb.append("RequesterId: ").append(getRequesterId()).append(",");
        if (getReservationId() != null)
            sb.append("ReservationId: ").append(getReservationId()).append(",");
        if (getGroupNames() != null)
            sb.append("GroupNames: ").append(getGroupNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Reservation == false)
            return false;
        Reservation other = (Reservation) obj;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getRequesterId() == null ^ this.getRequesterId() == null)
            return false;
        if (other.getRequesterId() != null && other.getRequesterId().equals(this.getRequesterId()) == false)
            return false;
        if (other.getReservationId() == null ^ this.getReservationId() == null)
            return false;
        if (other.getReservationId() != null && other.getReservationId().equals(this.getReservationId()) == false)
            return false;
        if (other.getGroupNames() == null ^ this.getGroupNames() == null)
            return false;
        if (other.getGroupNames() != null && other.getGroupNames().equals(this.getGroupNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getRequesterId() == null) ? 0 : getRequesterId().hashCode());
        hashCode = prime * hashCode + ((getReservationId() == null) ? 0 : getReservationId().hashCode());
        hashCode = prime * hashCode + ((getGroupNames() == null) ? 0 : getGroupNames().hashCode());
        return hashCode;
    }

    @Override
    public Reservation clone() {
        try {
            return (Reservation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
