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
 * Describes the placement of an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchTemplatePlacement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplatePlacement implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The affinity setting for the instance on the Dedicated Host.
     * </p>
     */
    private String affinity;
    /**
     * <p>
     * The name of the placement group for the instance.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The ID of the Dedicated Host for the instance.
     * </p>
     */
    private String hostId;
    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware.
     * </p>
     */
    private String tenancy;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String spreadDomain;

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the instance.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     * 
     * @return The Availability Zone of the instance.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplatePlacement withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The affinity setting for the instance on the Dedicated Host.
     * </p>
     * 
     * @param affinity
     *        The affinity setting for the instance on the Dedicated Host.
     */

    public void setAffinity(String affinity) {
        this.affinity = affinity;
    }

    /**
     * <p>
     * The affinity setting for the instance on the Dedicated Host.
     * </p>
     * 
     * @return The affinity setting for the instance on the Dedicated Host.
     */

    public String getAffinity() {
        return this.affinity;
    }

    /**
     * <p>
     * The affinity setting for the instance on the Dedicated Host.
     * </p>
     * 
     * @param affinity
     *        The affinity setting for the instance on the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplatePlacement withAffinity(String affinity) {
        setAffinity(affinity);
        return this;
    }

    /**
     * <p>
     * The name of the placement group for the instance.
     * </p>
     * 
     * @param groupName
     *        The name of the placement group for the instance.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the placement group for the instance.
     * </p>
     * 
     * @return The name of the placement group for the instance.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the placement group for the instance.
     * </p>
     * 
     * @param groupName
     *        The name of the placement group for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplatePlacement withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The ID of the Dedicated Host for the instance.
     * </p>
     * 
     * @param hostId
     *        The ID of the Dedicated Host for the instance.
     */

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host for the instance.
     * </p>
     * 
     * @return The ID of the Dedicated Host for the instance.
     */

    public String getHostId() {
        return this.hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host for the instance.
     * </p>
     * 
     * @param hostId
     *        The ID of the Dedicated Host for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplatePlacement withHostId(String hostId) {
        setHostId(hostId);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     *        <code>dedicated</code> runs on single-tenant hardware.
     * @see Tenancy
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware.
     * </p>
     * 
     * @return The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     *         <code>dedicated</code> runs on single-tenant hardware.
     * @see Tenancy
     */

    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     *        <code>dedicated</code> runs on single-tenant hardware.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public LaunchTemplatePlacement withTenancy(String tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     *        <code>dedicated</code> runs on single-tenant hardware.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public LaunchTemplatePlacement withTenancy(Tenancy tenancy) {
        this.tenancy = tenancy.toString();
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param spreadDomain
     *        Reserved for future use.
     */

    public void setSpreadDomain(String spreadDomain) {
        this.spreadDomain = spreadDomain;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getSpreadDomain() {
        return this.spreadDomain;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param spreadDomain
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplatePlacement withSpreadDomain(String spreadDomain) {
        setSpreadDomain(spreadDomain);
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
        if (getAffinity() != null)
            sb.append("Affinity: ").append(getAffinity()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getHostId() != null)
            sb.append("HostId: ").append(getHostId()).append(",");
        if (getTenancy() != null)
            sb.append("Tenancy: ").append(getTenancy()).append(",");
        if (getSpreadDomain() != null)
            sb.append("SpreadDomain: ").append(getSpreadDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplatePlacement == false)
            return false;
        LaunchTemplatePlacement other = (LaunchTemplatePlacement) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAffinity() == null ^ this.getAffinity() == null)
            return false;
        if (other.getAffinity() != null && other.getAffinity().equals(this.getAffinity()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getHostId() == null ^ this.getHostId() == null)
            return false;
        if (other.getHostId() != null && other.getHostId().equals(this.getHostId()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        if (other.getSpreadDomain() == null ^ this.getSpreadDomain() == null)
            return false;
        if (other.getSpreadDomain() != null && other.getSpreadDomain().equals(this.getSpreadDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getAffinity() == null) ? 0 : getAffinity().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getHostId() == null) ? 0 : getHostId().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode + ((getSpreadDomain() == null) ? 0 : getSpreadDomain().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplatePlacement clone() {
        try {
            return (LaunchTemplatePlacement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
