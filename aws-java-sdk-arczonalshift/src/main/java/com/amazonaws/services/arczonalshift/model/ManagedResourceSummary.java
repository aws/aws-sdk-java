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
package com.amazonaws.services.arczonalshift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex structure for a managed resource in an Amazon Web Services account with information about zonal shifts and
 * autoshifts.
 * </p>
 * <p>
 * A managed resource is a load balancer that has been registered with Route 53 ARC by Elastic Load Balancing. You can
 * start a zonal shift in Route 53 ARC for a managed resource to temporarily move traffic for the resource away from an
 * Availability Zone in an Amazon Web Services Region. You can also configure zonal autoshift for a managed resource.
 * </p>
 * <note>
 * <p>
 * At this time, managed resources are Network Load Balancers and Application Load Balancers with cross-zone load
 * balancing turned off.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ManagedResourceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedResourceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A collection of key-value pairs that indicate whether resources are active in Availability Zones or not. The key
     * name is the Availability Zone where the resource is deployed. The value is 1 or 0.
     * </p>
     */
    private java.util.Map<String, Float> appliedWeights;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the managed resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * An array of the autoshifts that have been completed for a resource.
     * </p>
     */
    private java.util.List<AutoshiftInResource> autoshifts;
    /**
     * <p>
     * The Availability Zones that a resource is deployed in.
     * </p>
     */
    private java.util.List<String> availabilityZones;
    /**
     * <p>
     * The name of the managed resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * This status tracks whether a practice run configuration exists for a resource. When you configure a practice run
     * for a resource so that a practice run configuration exists, Route 53 ARC sets this value to <code>ENABLED</code>.
     * If a you have not configured a practice run for the resource, or delete a practice run configuration, Route 53
     * ARC sets the value to <code>DISABLED</code>.
     * </p>
     * <p>
     * Route 53 ARC updates this status; you can't set a practice run status to <code>ENABLED</code> or
     * <code>DISABLED</code>.
     * </p>
     */
    private String practiceRunStatus;
    /**
     * <p>
     * The status of autoshift for a resource. When you configure zonal autoshift for a resource, you can set the value
     * of the status to <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     */
    private String zonalAutoshiftStatus;
    /**
     * <p>
     * An array of the zonal shifts for a resource.
     * </p>
     */
    private java.util.List<ZonalShiftInResource> zonalShifts;

    /**
     * <p>
     * A collection of key-value pairs that indicate whether resources are active in Availability Zones or not. The key
     * name is the Availability Zone where the resource is deployed. The value is 1 or 0.
     * </p>
     * 
     * @return A collection of key-value pairs that indicate whether resources are active in Availability Zones or not.
     *         The key name is the Availability Zone where the resource is deployed. The value is 1 or 0.
     */

    public java.util.Map<String, Float> getAppliedWeights() {
        return appliedWeights;
    }

    /**
     * <p>
     * A collection of key-value pairs that indicate whether resources are active in Availability Zones or not. The key
     * name is the Availability Zone where the resource is deployed. The value is 1 or 0.
     * </p>
     * 
     * @param appliedWeights
     *        A collection of key-value pairs that indicate whether resources are active in Availability Zones or not.
     *        The key name is the Availability Zone where the resource is deployed. The value is 1 or 0.
     */

    public void setAppliedWeights(java.util.Map<String, Float> appliedWeights) {
        this.appliedWeights = appliedWeights;
    }

    /**
     * <p>
     * A collection of key-value pairs that indicate whether resources are active in Availability Zones or not. The key
     * name is the Availability Zone where the resource is deployed. The value is 1 or 0.
     * </p>
     * 
     * @param appliedWeights
     *        A collection of key-value pairs that indicate whether resources are active in Availability Zones or not.
     *        The key name is the Availability Zone where the resource is deployed. The value is 1 or 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary withAppliedWeights(java.util.Map<String, Float> appliedWeights) {
        setAppliedWeights(appliedWeights);
        return this;
    }

    /**
     * Add a single AppliedWeights entry
     *
     * @see ManagedResourceSummary#withAppliedWeights
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary addAppliedWeightsEntry(String key, Float value) {
        if (null == this.appliedWeights) {
            this.appliedWeights = new java.util.HashMap<String, Float>();
        }
        if (this.appliedWeights.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.appliedWeights.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AppliedWeights.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary clearAppliedWeightsEntries() {
        this.appliedWeights = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the managed resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the managed resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the managed resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the managed resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the managed resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the managed resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * An array of the autoshifts that have been completed for a resource.
     * </p>
     * 
     * @return An array of the autoshifts that have been completed for a resource.
     */

    public java.util.List<AutoshiftInResource> getAutoshifts() {
        return autoshifts;
    }

    /**
     * <p>
     * An array of the autoshifts that have been completed for a resource.
     * </p>
     * 
     * @param autoshifts
     *        An array of the autoshifts that have been completed for a resource.
     */

    public void setAutoshifts(java.util.Collection<AutoshiftInResource> autoshifts) {
        if (autoshifts == null) {
            this.autoshifts = null;
            return;
        }

        this.autoshifts = new java.util.ArrayList<AutoshiftInResource>(autoshifts);
    }

    /**
     * <p>
     * An array of the autoshifts that have been completed for a resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoshifts(java.util.Collection)} or {@link #withAutoshifts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param autoshifts
     *        An array of the autoshifts that have been completed for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary withAutoshifts(AutoshiftInResource... autoshifts) {
        if (this.autoshifts == null) {
            setAutoshifts(new java.util.ArrayList<AutoshiftInResource>(autoshifts.length));
        }
        for (AutoshiftInResource ele : autoshifts) {
            this.autoshifts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the autoshifts that have been completed for a resource.
     * </p>
     * 
     * @param autoshifts
     *        An array of the autoshifts that have been completed for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary withAutoshifts(java.util.Collection<AutoshiftInResource> autoshifts) {
        setAutoshifts(autoshifts);
        return this;
    }

    /**
     * <p>
     * The Availability Zones that a resource is deployed in.
     * </p>
     * 
     * @return The Availability Zones that a resource is deployed in.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones that a resource is deployed in.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones that a resource is deployed in.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zones that a resource is deployed in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones that a resource is deployed in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones that a resource is deployed in.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones that a resource is deployed in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The name of the managed resource.
     * </p>
     * 
     * @param name
     *        The name of the managed resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the managed resource.
     * </p>
     * 
     * @return The name of the managed resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the managed resource.
     * </p>
     * 
     * @param name
     *        The name of the managed resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * This status tracks whether a practice run configuration exists for a resource. When you configure a practice run
     * for a resource so that a practice run configuration exists, Route 53 ARC sets this value to <code>ENABLED</code>.
     * If a you have not configured a practice run for the resource, or delete a practice run configuration, Route 53
     * ARC sets the value to <code>DISABLED</code>.
     * </p>
     * <p>
     * Route 53 ARC updates this status; you can't set a practice run status to <code>ENABLED</code> or
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param practiceRunStatus
     *        This status tracks whether a practice run configuration exists for a resource. When you configure a
     *        practice run for a resource so that a practice run configuration exists, Route 53 ARC sets this value to
     *        <code>ENABLED</code>. If a you have not configured a practice run for the resource, or delete a practice
     *        run configuration, Route 53 ARC sets the value to <code>DISABLED</code>.</p>
     *        <p>
     *        Route 53 ARC updates this status; you can't set a practice run status to <code>ENABLED</code> or
     *        <code>DISABLED</code>.
     * @see ZonalAutoshiftStatus
     */

    public void setPracticeRunStatus(String practiceRunStatus) {
        this.practiceRunStatus = practiceRunStatus;
    }

    /**
     * <p>
     * This status tracks whether a practice run configuration exists for a resource. When you configure a practice run
     * for a resource so that a practice run configuration exists, Route 53 ARC sets this value to <code>ENABLED</code>.
     * If a you have not configured a practice run for the resource, or delete a practice run configuration, Route 53
     * ARC sets the value to <code>DISABLED</code>.
     * </p>
     * <p>
     * Route 53 ARC updates this status; you can't set a practice run status to <code>ENABLED</code> or
     * <code>DISABLED</code>.
     * </p>
     * 
     * @return This status tracks whether a practice run configuration exists for a resource. When you configure a
     *         practice run for a resource so that a practice run configuration exists, Route 53 ARC sets this value to
     *         <code>ENABLED</code>. If a you have not configured a practice run for the resource, or delete a practice
     *         run configuration, Route 53 ARC sets the value to <code>DISABLED</code>.</p>
     *         <p>
     *         Route 53 ARC updates this status; you can't set a practice run status to <code>ENABLED</code> or
     *         <code>DISABLED</code>.
     * @see ZonalAutoshiftStatus
     */

    public String getPracticeRunStatus() {
        return this.practiceRunStatus;
    }

    /**
     * <p>
     * This status tracks whether a practice run configuration exists for a resource. When you configure a practice run
     * for a resource so that a practice run configuration exists, Route 53 ARC sets this value to <code>ENABLED</code>.
     * If a you have not configured a practice run for the resource, or delete a practice run configuration, Route 53
     * ARC sets the value to <code>DISABLED</code>.
     * </p>
     * <p>
     * Route 53 ARC updates this status; you can't set a practice run status to <code>ENABLED</code> or
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param practiceRunStatus
     *        This status tracks whether a practice run configuration exists for a resource. When you configure a
     *        practice run for a resource so that a practice run configuration exists, Route 53 ARC sets this value to
     *        <code>ENABLED</code>. If a you have not configured a practice run for the resource, or delete a practice
     *        run configuration, Route 53 ARC sets the value to <code>DISABLED</code>.</p>
     *        <p>
     *        Route 53 ARC updates this status; you can't set a practice run status to <code>ENABLED</code> or
     *        <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalAutoshiftStatus
     */

    public ManagedResourceSummary withPracticeRunStatus(String practiceRunStatus) {
        setPracticeRunStatus(practiceRunStatus);
        return this;
    }

    /**
     * <p>
     * This status tracks whether a practice run configuration exists for a resource. When you configure a practice run
     * for a resource so that a practice run configuration exists, Route 53 ARC sets this value to <code>ENABLED</code>.
     * If a you have not configured a practice run for the resource, or delete a practice run configuration, Route 53
     * ARC sets the value to <code>DISABLED</code>.
     * </p>
     * <p>
     * Route 53 ARC updates this status; you can't set a practice run status to <code>ENABLED</code> or
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param practiceRunStatus
     *        This status tracks whether a practice run configuration exists for a resource. When you configure a
     *        practice run for a resource so that a practice run configuration exists, Route 53 ARC sets this value to
     *        <code>ENABLED</code>. If a you have not configured a practice run for the resource, or delete a practice
     *        run configuration, Route 53 ARC sets the value to <code>DISABLED</code>.</p>
     *        <p>
     *        Route 53 ARC updates this status; you can't set a practice run status to <code>ENABLED</code> or
     *        <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalAutoshiftStatus
     */

    public ManagedResourceSummary withPracticeRunStatus(ZonalAutoshiftStatus practiceRunStatus) {
        this.practiceRunStatus = practiceRunStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status of autoshift for a resource. When you configure zonal autoshift for a resource, you can set the value
     * of the status to <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * 
     * @param zonalAutoshiftStatus
     *        The status of autoshift for a resource. When you configure zonal autoshift for a resource, you can set the
     *        value of the status to <code>ENABLED</code> or <code>DISABLED</code>.
     * @see ZonalAutoshiftStatus
     */

    public void setZonalAutoshiftStatus(String zonalAutoshiftStatus) {
        this.zonalAutoshiftStatus = zonalAutoshiftStatus;
    }

    /**
     * <p>
     * The status of autoshift for a resource. When you configure zonal autoshift for a resource, you can set the value
     * of the status to <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * 
     * @return The status of autoshift for a resource. When you configure zonal autoshift for a resource, you can set
     *         the value of the status to <code>ENABLED</code> or <code>DISABLED</code>.
     * @see ZonalAutoshiftStatus
     */

    public String getZonalAutoshiftStatus() {
        return this.zonalAutoshiftStatus;
    }

    /**
     * <p>
     * The status of autoshift for a resource. When you configure zonal autoshift for a resource, you can set the value
     * of the status to <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * 
     * @param zonalAutoshiftStatus
     *        The status of autoshift for a resource. When you configure zonal autoshift for a resource, you can set the
     *        value of the status to <code>ENABLED</code> or <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalAutoshiftStatus
     */

    public ManagedResourceSummary withZonalAutoshiftStatus(String zonalAutoshiftStatus) {
        setZonalAutoshiftStatus(zonalAutoshiftStatus);
        return this;
    }

    /**
     * <p>
     * The status of autoshift for a resource. When you configure zonal autoshift for a resource, you can set the value
     * of the status to <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * 
     * @param zonalAutoshiftStatus
     *        The status of autoshift for a resource. When you configure zonal autoshift for a resource, you can set the
     *        value of the status to <code>ENABLED</code> or <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalAutoshiftStatus
     */

    public ManagedResourceSummary withZonalAutoshiftStatus(ZonalAutoshiftStatus zonalAutoshiftStatus) {
        this.zonalAutoshiftStatus = zonalAutoshiftStatus.toString();
        return this;
    }

    /**
     * <p>
     * An array of the zonal shifts for a resource.
     * </p>
     * 
     * @return An array of the zonal shifts for a resource.
     */

    public java.util.List<ZonalShiftInResource> getZonalShifts() {
        return zonalShifts;
    }

    /**
     * <p>
     * An array of the zonal shifts for a resource.
     * </p>
     * 
     * @param zonalShifts
     *        An array of the zonal shifts for a resource.
     */

    public void setZonalShifts(java.util.Collection<ZonalShiftInResource> zonalShifts) {
        if (zonalShifts == null) {
            this.zonalShifts = null;
            return;
        }

        this.zonalShifts = new java.util.ArrayList<ZonalShiftInResource>(zonalShifts);
    }

    /**
     * <p>
     * An array of the zonal shifts for a resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setZonalShifts(java.util.Collection)} or {@link #withZonalShifts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param zonalShifts
     *        An array of the zonal shifts for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary withZonalShifts(ZonalShiftInResource... zonalShifts) {
        if (this.zonalShifts == null) {
            setZonalShifts(new java.util.ArrayList<ZonalShiftInResource>(zonalShifts.length));
        }
        for (ZonalShiftInResource ele : zonalShifts) {
            this.zonalShifts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the zonal shifts for a resource.
     * </p>
     * 
     * @param zonalShifts
     *        An array of the zonal shifts for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary withZonalShifts(java.util.Collection<ZonalShiftInResource> zonalShifts) {
        setZonalShifts(zonalShifts);
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
        if (getAppliedWeights() != null)
            sb.append("AppliedWeights: ").append(getAppliedWeights()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAutoshifts() != null)
            sb.append("Autoshifts: ").append(getAutoshifts()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPracticeRunStatus() != null)
            sb.append("PracticeRunStatus: ").append(getPracticeRunStatus()).append(",");
        if (getZonalAutoshiftStatus() != null)
            sb.append("ZonalAutoshiftStatus: ").append(getZonalAutoshiftStatus()).append(",");
        if (getZonalShifts() != null)
            sb.append("ZonalShifts: ").append(getZonalShifts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedResourceSummary == false)
            return false;
        ManagedResourceSummary other = (ManagedResourceSummary) obj;
        if (other.getAppliedWeights() == null ^ this.getAppliedWeights() == null)
            return false;
        if (other.getAppliedWeights() != null && other.getAppliedWeights().equals(this.getAppliedWeights()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAutoshifts() == null ^ this.getAutoshifts() == null)
            return false;
        if (other.getAutoshifts() != null && other.getAutoshifts().equals(this.getAutoshifts()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPracticeRunStatus() == null ^ this.getPracticeRunStatus() == null)
            return false;
        if (other.getPracticeRunStatus() != null && other.getPracticeRunStatus().equals(this.getPracticeRunStatus()) == false)
            return false;
        if (other.getZonalAutoshiftStatus() == null ^ this.getZonalAutoshiftStatus() == null)
            return false;
        if (other.getZonalAutoshiftStatus() != null && other.getZonalAutoshiftStatus().equals(this.getZonalAutoshiftStatus()) == false)
            return false;
        if (other.getZonalShifts() == null ^ this.getZonalShifts() == null)
            return false;
        if (other.getZonalShifts() != null && other.getZonalShifts().equals(this.getZonalShifts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppliedWeights() == null) ? 0 : getAppliedWeights().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAutoshifts() == null) ? 0 : getAutoshifts().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPracticeRunStatus() == null) ? 0 : getPracticeRunStatus().hashCode());
        hashCode = prime * hashCode + ((getZonalAutoshiftStatus() == null) ? 0 : getZonalAutoshiftStatus().hashCode());
        hashCode = prime * hashCode + ((getZonalShifts() == null) ? 0 : getZonalShifts().hashCode());
        return hashCode;
    }

    @Override
    public ManagedResourceSummary clone() {
        try {
            return (ManagedResourceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.arczonalshift.model.transform.ManagedResourceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
