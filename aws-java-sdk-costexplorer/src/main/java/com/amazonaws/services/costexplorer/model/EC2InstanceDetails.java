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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the Amazon EC2 instances that AWS recommends that you purchase.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/EC2InstanceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2InstanceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     */
    private String family;
    /**
     * <p>
     * The type of instance that AWS recommends.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The AWS Region of the recommended reservation.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The Availability Zone of the recommended reservation.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The platform of the recommended reservation. The platform is the specific combination of operating system,
     * license model, and software on an instance.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * Whether the recommended reservation is dedicated or shared.
     * </p>
     */
    private String tenancy;
    /**
     * <p>
     * Whether the recommendation is for a current-generation instance.
     * </p>
     */
    private Boolean currentGeneration;
    /**
     * <p>
     * Whether the recommended reservation is size flexible.
     * </p>
     */
    private Boolean sizeFlexEligible;

    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     * 
     * @param family
     *        The instance family of the recommended reservation.
     */

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     * 
     * @return The instance family of the recommended reservation.
     */

    public String getFamily() {
        return this.family;
    }

    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     * 
     * @param family
     *        The instance family of the recommended reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceDetails withFamily(String family) {
        setFamily(family);
        return this;
    }

    /**
     * <p>
     * The type of instance that AWS recommends.
     * </p>
     * 
     * @param instanceType
     *        The type of instance that AWS recommends.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of instance that AWS recommends.
     * </p>
     * 
     * @return The type of instance that AWS recommends.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of instance that AWS recommends.
     * </p>
     * 
     * @param instanceType
     *        The type of instance that AWS recommends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceDetails withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The AWS Region of the recommended reservation.
     * </p>
     * 
     * @param region
     *        The AWS Region of the recommended reservation.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region of the recommended reservation.
     * </p>
     * 
     * @return The AWS Region of the recommended reservation.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region of the recommended reservation.
     * </p>
     * 
     * @param region
     *        The AWS Region of the recommended reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceDetails withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The Availability Zone of the recommended reservation.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the recommended reservation.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the recommended reservation.
     * </p>
     * 
     * @return The Availability Zone of the recommended reservation.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the recommended reservation.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the recommended reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceDetails withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The platform of the recommended reservation. The platform is the specific combination of operating system,
     * license model, and software on an instance.
     * </p>
     * 
     * @param platform
     *        The platform of the recommended reservation. The platform is the specific combination of operating system,
     *        license model, and software on an instance.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the recommended reservation. The platform is the specific combination of operating system,
     * license model, and software on an instance.
     * </p>
     * 
     * @return The platform of the recommended reservation. The platform is the specific combination of operating
     *         system, license model, and software on an instance.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the recommended reservation. The platform is the specific combination of operating system,
     * license model, and software on an instance.
     * </p>
     * 
     * @param platform
     *        The platform of the recommended reservation. The platform is the specific combination of operating system,
     *        license model, and software on an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceDetails withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * Whether the recommended reservation is dedicated or shared.
     * </p>
     * 
     * @param tenancy
     *        Whether the recommended reservation is dedicated or shared.
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * Whether the recommended reservation is dedicated or shared.
     * </p>
     * 
     * @return Whether the recommended reservation is dedicated or shared.
     */

    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * <p>
     * Whether the recommended reservation is dedicated or shared.
     * </p>
     * 
     * @param tenancy
     *        Whether the recommended reservation is dedicated or shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceDetails withTenancy(String tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * Whether the recommendation is for a current-generation instance.
     * </p>
     * 
     * @param currentGeneration
     *        Whether the recommendation is for a current-generation instance.
     */

    public void setCurrentGeneration(Boolean currentGeneration) {
        this.currentGeneration = currentGeneration;
    }

    /**
     * <p>
     * Whether the recommendation is for a current-generation instance.
     * </p>
     * 
     * @return Whether the recommendation is for a current-generation instance.
     */

    public Boolean getCurrentGeneration() {
        return this.currentGeneration;
    }

    /**
     * <p>
     * Whether the recommendation is for a current-generation instance.
     * </p>
     * 
     * @param currentGeneration
     *        Whether the recommendation is for a current-generation instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceDetails withCurrentGeneration(Boolean currentGeneration) {
        setCurrentGeneration(currentGeneration);
        return this;
    }

    /**
     * <p>
     * Whether the recommendation is for a current-generation instance.
     * </p>
     * 
     * @return Whether the recommendation is for a current-generation instance.
     */

    public Boolean isCurrentGeneration() {
        return this.currentGeneration;
    }

    /**
     * <p>
     * Whether the recommended reservation is size flexible.
     * </p>
     * 
     * @param sizeFlexEligible
     *        Whether the recommended reservation is size flexible.
     */

    public void setSizeFlexEligible(Boolean sizeFlexEligible) {
        this.sizeFlexEligible = sizeFlexEligible;
    }

    /**
     * <p>
     * Whether the recommended reservation is size flexible.
     * </p>
     * 
     * @return Whether the recommended reservation is size flexible.
     */

    public Boolean getSizeFlexEligible() {
        return this.sizeFlexEligible;
    }

    /**
     * <p>
     * Whether the recommended reservation is size flexible.
     * </p>
     * 
     * @param sizeFlexEligible
     *        Whether the recommended reservation is size flexible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceDetails withSizeFlexEligible(Boolean sizeFlexEligible) {
        setSizeFlexEligible(sizeFlexEligible);
        return this;
    }

    /**
     * <p>
     * Whether the recommended reservation is size flexible.
     * </p>
     * 
     * @return Whether the recommended reservation is size flexible.
     */

    public Boolean isSizeFlexEligible() {
        return this.sizeFlexEligible;
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
        if (getFamily() != null)
            sb.append("Family: ").append(getFamily()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getTenancy() != null)
            sb.append("Tenancy: ").append(getTenancy()).append(",");
        if (getCurrentGeneration() != null)
            sb.append("CurrentGeneration: ").append(getCurrentGeneration()).append(",");
        if (getSizeFlexEligible() != null)
            sb.append("SizeFlexEligible: ").append(getSizeFlexEligible());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2InstanceDetails == false)
            return false;
        EC2InstanceDetails other = (EC2InstanceDetails) obj;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        if (other.getCurrentGeneration() == null ^ this.getCurrentGeneration() == null)
            return false;
        if (other.getCurrentGeneration() != null && other.getCurrentGeneration().equals(this.getCurrentGeneration()) == false)
            return false;
        if (other.getSizeFlexEligible() == null ^ this.getSizeFlexEligible() == null)
            return false;
        if (other.getSizeFlexEligible() != null && other.getSizeFlexEligible().equals(this.getSizeFlexEligible()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode + ((getCurrentGeneration() == null) ? 0 : getCurrentGeneration().hashCode());
        hashCode = prime * hashCode + ((getSizeFlexEligible() == null) ? 0 : getSizeFlexEligible().hashCode());
        return hashCode;
    }

    @Override
    public EC2InstanceDetails clone() {
        try {
            return (EC2InstanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.EC2InstanceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
