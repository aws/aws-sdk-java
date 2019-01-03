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
 * Describes Spot Instance placement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SpotPlacement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpotPlacement implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * [Spot Fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     * "us-west-2a, us-west-2b".
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The name of the placement group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for Spot
     * Instances.
     * </p>
     */
    private String tenancy;

    /**
     * Default constructor for SpotPlacement object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public SpotPlacement() {
    }

    /**
     * Constructs a new SpotPlacement object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param availabilityZone
     *        The Availability Zone.</p>
     *        <p>
     *        [Spot Fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     *        "us-west-2a, us-west-2b".
     */
    public SpotPlacement(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * [Spot Fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     * "us-west-2a, us-west-2b".
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone.</p>
     *        <p>
     *        [Spot Fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     *        "us-west-2a, us-west-2b".
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * [Spot Fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     * "us-west-2a, us-west-2b".
     * </p>
     * 
     * @return The Availability Zone.</p>
     *         <p>
     *         [Spot Fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     *         "us-west-2a, us-west-2b".
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * [Spot Fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     * "us-west-2a, us-west-2b".
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone.</p>
     *        <p>
     *        [Spot Fleet only] To specify multiple Availability Zones, separate them using commas; for example,
     *        "us-west-2a, us-west-2b".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotPlacement withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The name of the placement group.
     * </p>
     * 
     * @param groupName
     *        The name of the placement group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the placement group.
     * </p>
     * 
     * @return The name of the placement group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the placement group.
     * </p>
     * 
     * @param groupName
     *        The name of the placement group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotPlacement withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for Spot
     * Instances.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     *        <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for
     *        Spot Instances.
     * @see Tenancy
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for Spot
     * Instances.
     * </p>
     * 
     * @return The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     *         <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for
     *         Spot Instances.
     * @see Tenancy
     */

    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for Spot
     * Instances.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     *        <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for
     *        Spot Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public SpotPlacement withTenancy(String tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for Spot
     * Instances.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     *        <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for
     *        Spot Instances.
     * @see Tenancy
     */

    public void setTenancy(Tenancy tenancy) {
        withTenancy(tenancy);
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for Spot
     * Instances.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     *        <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for
     *        Spot Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public SpotPlacement withTenancy(Tenancy tenancy) {
        this.tenancy = tenancy.toString();
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getTenancy() != null)
            sb.append("Tenancy: ").append(getTenancy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotPlacement == false)
            return false;
        SpotPlacement other = (SpotPlacement) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        return hashCode;
    }

    @Override
    public SpotPlacement clone() {
        try {
            return (SpotPlacement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
