/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * An Amazon EC2 reservation of requested EC2 instances.
 * </p>
 */
public class Reservation {

    /**
     * The unique ID of this reservation.
     */
    private String reservationId;

    /**
     * The AWS Access Key ID of the user who owns the reservation.
     */
    private String ownerId;

    /**
     * The unique ID of the user who requested the instances in this
     * reservation.
     */
    private String requesterId;

    /**
     * The list of security groups requested for the instances in this
     * reservation.
     */
    private java.util.List<GroupIdentifier> groups;

    /**
     * The list of security groups requested for the instances in this
     * reservation.
     */
    private java.util.List<String> groupNames;

    /**
     * The list of Amazon EC2 instances included in this reservation.
     */
    private java.util.List<Instance> instances;

    /**
     * The unique ID of this reservation.
     *
     * @return The unique ID of this reservation.
     */
    public String getReservationId() {
        return reservationId;
    }
    
    /**
     * The unique ID of this reservation.
     *
     * @param reservationId The unique ID of this reservation.
     */
    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }
    
    /**
     * The unique ID of this reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservationId The unique ID of this reservation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Reservation withReservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }
    
    
    /**
     * The AWS Access Key ID of the user who owns the reservation.
     *
     * @return The AWS Access Key ID of the user who owns the reservation.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * The AWS Access Key ID of the user who owns the reservation.
     *
     * @param ownerId The AWS Access Key ID of the user who owns the reservation.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * The AWS Access Key ID of the user who owns the reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId The AWS Access Key ID of the user who owns the reservation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Reservation withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    
    
    /**
     * The unique ID of the user who requested the instances in this
     * reservation.
     *
     * @return The unique ID of the user who requested the instances in this
     *         reservation.
     */
    public String getRequesterId() {
        return requesterId;
    }
    
    /**
     * The unique ID of the user who requested the instances in this
     * reservation.
     *
     * @param requesterId The unique ID of the user who requested the instances in this
     *         reservation.
     */
    public void setRequesterId(String requesterId) {
        this.requesterId = requesterId;
    }
    
    /**
     * The unique ID of the user who requested the instances in this
     * reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requesterId The unique ID of the user who requested the instances in this
     *         reservation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Reservation withRequesterId(String requesterId) {
        this.requesterId = requesterId;
        return this;
    }
    
    
    /**
     * The list of security groups requested for the instances in this
     * reservation.
     *
     * @return The list of security groups requested for the instances in this
     *         reservation.
     */
    public java.util.List<GroupIdentifier> getGroups() {
        if (groups == null) {
            groups = new java.util.ArrayList<GroupIdentifier>();
        }
        return groups;
    }
    
    /**
     * The list of security groups requested for the instances in this
     * reservation.
     *
     * @param groups The list of security groups requested for the instances in this
     *         reservation.
     */
    public void setGroups(java.util.Collection<GroupIdentifier> groups) {
        java.util.List<GroupIdentifier> groupsCopy = new java.util.ArrayList<GroupIdentifier>();
        if (groups != null) {
            groupsCopy.addAll(groups);
        }
        this.groups = groupsCopy;
    }
    
    /**
     * The list of security groups requested for the instances in this
     * reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The list of security groups requested for the instances in this
     *         reservation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Reservation withGroups(GroupIdentifier... groups) {
        for (GroupIdentifier value : groups) {
            getGroups().add(value);
        }
        return this;
    }
    
    /**
     * The list of security groups requested for the instances in this
     * reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The list of security groups requested for the instances in this
     *         reservation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Reservation withGroups(java.util.Collection<GroupIdentifier> groups) {
        java.util.List<GroupIdentifier> groupsCopy = new java.util.ArrayList<GroupIdentifier>();
        if (groups != null) {
            groupsCopy.addAll(groups);
        }
        this.groups = groupsCopy;

        return this;
    }
    
    /**
     * The list of security groups requested for the instances in this
     * reservation.
     *
     * @return The list of security groups requested for the instances in this
     *         reservation.
     */
    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
            groupNames = new java.util.ArrayList<String>();
        }
        return groupNames;
    }
    
    /**
     * The list of security groups requested for the instances in this
     * reservation.
     *
     * @param groupNames The list of security groups requested for the instances in this
     *         reservation.
     */
    public void setGroupNames(java.util.Collection<String> groupNames) {
        java.util.List<String> groupNamesCopy = new java.util.ArrayList<String>();
        if (groupNames != null) {
            groupNamesCopy.addAll(groupNames);
        }
        this.groupNames = groupNamesCopy;
    }
    
    /**
     * The list of security groups requested for the instances in this
     * reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames The list of security groups requested for the instances in this
     *         reservation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Reservation withGroupNames(String... groupNames) {
        for (String value : groupNames) {
            getGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * The list of security groups requested for the instances in this
     * reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames The list of security groups requested for the instances in this
     *         reservation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Reservation withGroupNames(java.util.Collection<String> groupNames) {
        java.util.List<String> groupNamesCopy = new java.util.ArrayList<String>();
        if (groupNames != null) {
            groupNamesCopy.addAll(groupNames);
        }
        this.groupNames = groupNamesCopy;

        return this;
    }
    
    /**
     * The list of Amazon EC2 instances included in this reservation.
     *
     * @return The list of Amazon EC2 instances included in this reservation.
     */
    public java.util.List<Instance> getInstances() {
        if (instances == null) {
            instances = new java.util.ArrayList<Instance>();
        }
        return instances;
    }
    
    /**
     * The list of Amazon EC2 instances included in this reservation.
     *
     * @param instances The list of Amazon EC2 instances included in this reservation.
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        java.util.List<Instance> instancesCopy = new java.util.ArrayList<Instance>();
        if (instances != null) {
            instancesCopy.addAll(instances);
        }
        this.instances = instancesCopy;
    }
    
    /**
     * The list of Amazon EC2 instances included in this reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances The list of Amazon EC2 instances included in this reservation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Reservation withInstances(Instance... instances) {
        for (Instance value : instances) {
            getInstances().add(value);
        }
        return this;
    }
    
    /**
     * The list of Amazon EC2 instances included in this reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances The list of Amazon EC2 instances included in this reservation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Reservation withInstances(java.util.Collection<Instance> instances) {
        java.util.List<Instance> instancesCopy = new java.util.ArrayList<Instance>();
        if (instances != null) {
            instancesCopy.addAll(instances);
        }
        this.instances = instancesCopy;

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
        sb.append("ReservationId: " + reservationId + ", ");
        sb.append("OwnerId: " + ownerId + ", ");
        sb.append("RequesterId: " + requesterId + ", ");
        sb.append("Groups: " + groups + ", ");
        sb.append("GroupNames: " + groupNames + ", ");
        sb.append("Instances: " + instances + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    