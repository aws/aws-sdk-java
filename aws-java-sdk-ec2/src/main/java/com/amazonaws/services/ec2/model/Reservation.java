/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a reservation.
 * </p>
 */
public class Reservation implements Serializable {

    /**
     * The ID of the reservation.
     */
    private String reservationId;

    /**
     * The ID of the AWS account that owns the reservation.
     */
    private String ownerId;

    /**
     * The ID of the requester that launched the instances on your behalf
     * (for example, AWS Management Console or Auto Scaling).
     */
    private String requesterId;

    /**
     * One or more security groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> groups;

    /**
     * One or more security groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNames;

    /**
     * One or more instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instances;

    /**
     * The ID of the reservation.
     *
     * @return The ID of the reservation.
     */
    public String getReservationId() {
        return reservationId;
    }
    
    /**
     * The ID of the reservation.
     *
     * @param reservationId The ID of the reservation.
     */
    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }
    
    /**
     * The ID of the reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservationId The ID of the reservation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Reservation withReservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }

    /**
     * The ID of the AWS account that owns the reservation.
     *
     * @return The ID of the AWS account that owns the reservation.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * The ID of the AWS account that owns the reservation.
     *
     * @param ownerId The ID of the AWS account that owns the reservation.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * The ID of the AWS account that owns the reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId The ID of the AWS account that owns the reservation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Reservation withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * The ID of the requester that launched the instances on your behalf
     * (for example, AWS Management Console or Auto Scaling).
     *
     * @return The ID of the requester that launched the instances on your behalf
     *         (for example, AWS Management Console or Auto Scaling).
     */
    public String getRequesterId() {
        return requesterId;
    }
    
    /**
     * The ID of the requester that launched the instances on your behalf
     * (for example, AWS Management Console or Auto Scaling).
     *
     * @param requesterId The ID of the requester that launched the instances on your behalf
     *         (for example, AWS Management Console or Auto Scaling).
     */
    public void setRequesterId(String requesterId) {
        this.requesterId = requesterId;
    }
    
    /**
     * The ID of the requester that launched the instances on your behalf
     * (for example, AWS Management Console or Auto Scaling).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requesterId The ID of the requester that launched the instances on your behalf
     *         (for example, AWS Management Console or Auto Scaling).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Reservation withRequesterId(String requesterId) {
        this.requesterId = requesterId;
        return this;
    }

    /**
     * One or more security groups.
     *
     * @return One or more security groups.
     */
    public java.util.List<GroupIdentifier> getGroups() {
        if (groups == null) {
              groups = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>();
              groups.setAutoConstruct(true);
        }
        return groups;
    }
    
    /**
     * One or more security groups.
     *
     * @param groups One or more security groups.
     */
    public void setGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>(groups.size());
        groupsCopy.addAll(groups);
        this.groups = groupsCopy;
    }
    
    /**
     * One or more security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups One or more security groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Reservation withGroups(GroupIdentifier... groups) {
        if (getGroups() == null) setGroups(new java.util.ArrayList<GroupIdentifier>(groups.length));
        for (GroupIdentifier value : groups) {
            getGroups().add(value);
        }
        return this;
    }
    
    /**
     * One or more security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups One or more security groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Reservation withGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>(groups.size());
            groupsCopy.addAll(groups);
            this.groups = groupsCopy;
        }

        return this;
    }

    /**
     * One or more security groups.
     *
     * @return One or more security groups.
     */
    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
              groupNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groupNames.setAutoConstruct(true);
        }
        return groupNames;
    }
    
    /**
     * One or more security groups.
     *
     * @param groupNames One or more security groups.
     */
    public void setGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupNames.size());
        groupNamesCopy.addAll(groupNames);
        this.groupNames = groupNamesCopy;
    }
    
    /**
     * One or more security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames One or more security groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Reservation withGroupNames(String... groupNames) {
        if (getGroupNames() == null) setGroupNames(new java.util.ArrayList<String>(groupNames.length));
        for (String value : groupNames) {
            getGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * One or more security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames One or more security groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Reservation withGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupNames.size());
            groupNamesCopy.addAll(groupNames);
            this.groupNames = groupNamesCopy;
        }

        return this;
    }

    /**
     * One or more instances.
     *
     * @return One or more instances.
     */
    public java.util.List<Instance> getInstances() {
        if (instances == null) {
              instances = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>();
              instances.setAutoConstruct(true);
        }
        return instances;
    }
    
    /**
     * One or more instances.
     *
     * @param instances One or more instances.
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>(instances.size());
        instancesCopy.addAll(instances);
        this.instances = instancesCopy;
    }
    
    /**
     * One or more instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances One or more instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Reservation withInstances(Instance... instances) {
        if (getInstances() == null) setInstances(new java.util.ArrayList<Instance>(instances.length));
        for (Instance value : instances) {
            getInstances().add(value);
        }
        return this;
    }
    
    /**
     * One or more instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances One or more instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Reservation withInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>(instances.size());
            instancesCopy.addAll(instances);
            this.instances = instancesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReservationId() != null) sb.append("ReservationId: " + getReservationId() + ",");
        if (getOwnerId() != null) sb.append("OwnerId: " + getOwnerId() + ",");
        if (getRequesterId() != null) sb.append("RequesterId: " + getRequesterId() + ",");
        if (getGroups() != null) sb.append("Groups: " + getGroups() + ",");
        if (getGroupNames() != null) sb.append("GroupNames: " + getGroupNames() + ",");
        if (getInstances() != null) sb.append("Instances: " + getInstances() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservationId() == null) ? 0 : getReservationId().hashCode()); 
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode()); 
        hashCode = prime * hashCode + ((getRequesterId() == null) ? 0 : getRequesterId().hashCode()); 
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode()); 
        hashCode = prime * hashCode + ((getGroupNames() == null) ? 0 : getGroupNames().hashCode()); 
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Reservation == false) return false;
        Reservation other = (Reservation)obj;
        
        if (other.getReservationId() == null ^ this.getReservationId() == null) return false;
        if (other.getReservationId() != null && other.getReservationId().equals(this.getReservationId()) == false) return false; 
        if (other.getOwnerId() == null ^ this.getOwnerId() == null) return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false) return false; 
        if (other.getRequesterId() == null ^ this.getRequesterId() == null) return false;
        if (other.getRequesterId() != null && other.getRequesterId().equals(this.getRequesterId()) == false) return false; 
        if (other.getGroups() == null ^ this.getGroups() == null) return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false) return false; 
        if (other.getGroupNames() == null ^ this.getGroupNames() == null) return false;
        if (other.getGroupNames() != null && other.getGroupNames().equals(this.getGroupNames()) == false) return false; 
        if (other.getInstances() == null ^ this.getInstances() == null) return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false) return false; 
        return true;
    }
    
}
    